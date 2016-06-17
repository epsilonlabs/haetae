package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class CollectionConcatHandler extends CollectionOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("concat") && argTypes.size() <= 1) {
			if (contextType instanceof CollectionType) {
				return true;
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getCollectionType())) {
					return true;
				}
			}
			else {
				return false;
			}
		}
		return false;
	}


	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) throws AnalysisInterruptException {
		
		//get the manager
		StandardLibraryOperationDefinitionContainer manager = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		OperationDefinition result = null;
		
		if (contextType instanceof CollectionType) {
			result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), contextType, argTypes);

		}
		else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
			if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getCollectionType())) {
				ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) contextType, EolPackage.eINSTANCE.getCollectionType());
				result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), dyntypes.get(0), argTypes);
			}
		}
		//if result is not null
		if (result != null) {
			
			//register the result as it has been handled
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			//get the target
			Expression target = featureCallExpression.getTarget();
			if (argTypes.size() == 1) {
				Type argType = argTypes.get(0);
				if (argType instanceof StringType) {
					
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
					if (!TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getStringType())) {
						LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_STRING);
					}
				}
				else {
					LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_STRING);
				}
			}
			
			//if target is null, report and return
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				return result;
			}
			else {
				//get the target type copy
				Type targetType = EcoreUtil.copy(target.getResolvedType());
				
				//if target type is null, report and return (this will not happend)
				if (targetType == null) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
					return result;
				}
				//if target type is collection type
				if (targetType instanceof CollectionType) {
					return result;
				}
				//else if target type is an instance of any
				else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					
					//get dynamic types that are of type collection
					ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getCollectionType());
					//if size is 0, no collection type is found, report and return
					if (dyntypes.size() == 0) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
						return result;
					}
					else {
						return result;
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
					return result;
				}
			}
		}
		return result;
	}



}
