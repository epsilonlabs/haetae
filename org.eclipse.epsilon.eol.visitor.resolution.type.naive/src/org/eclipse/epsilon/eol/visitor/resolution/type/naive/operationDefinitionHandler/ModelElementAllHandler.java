package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.SequenceType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class ModelElementAllHandler extends ModelElementOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if ((name.equals("all") || 
				name.equals("allInstances") ||
				name.equals("allOfKind") ||
				name.equals("allOfType") )  && argTypes.size() == 0) {
			if (contextType instanceof ModelElementType) {
				return true;
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getModelElementType())) {
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
		
		//get the result
		OperationDefinition result = null; 
		if (featureCallExpression instanceof MethodCallExpression) {
			result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		}
		else if (featureCallExpression instanceof PropertyCallExpression) {
			result = manager.getOperation(((PropertyCallExpression) featureCallExpression).getProperty().getName(), argTypes);
		}
		
		//if result is not null
		if (result != null) {
			
			//register the result as it has been handled
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			//get the target
			Expression target = featureCallExpression.getTarget();
			
			//if target is null, report and return
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				SequenceType returnType = EolFactory.eINSTANCE.createSequenceType();
				AnyType contentType = EolFactory.eINSTANCE.createAnyType();
				returnType.setContentType(contentType);
				result.setReturnType(returnType);
				return result;
			}
			else {
				//get the target type copy
				Type targetType = EcoreUtil.copy(target.getResolvedType());
				
				//if target type is null, report and return (this will not happend)
				if (targetType == null) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
					SequenceType returnType = EolFactory.eINSTANCE.createSequenceType();
					AnyType contentType = EolFactory.eINSTANCE.createAnyType();
					returnType.setContentType(contentType);
					result.setReturnType(returnType);
					return result;
				}
				//if target type is collection type
				if (targetType instanceof ModelElementType) {
					ModelElementType met = (ModelElementType) EcoreUtil.copy(targetType);
					SequenceType returnType = EolFactory.eINSTANCE.createSequenceType();
					returnType.setContentType(met);
					result.setReturnType(returnType);
					return result;
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_MODELELEMENT_TYPE);
					SequenceType returnType = EolFactory.eINSTANCE.createSequenceType();
					AnyType contentType = EolFactory.eINSTANCE.createAnyType();
					returnType.setContentType(contentType);
					result.setReturnType(returnType);
					return result;
				}
			}
		}
		return result;
	}

}
