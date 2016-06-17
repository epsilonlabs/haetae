package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class IntegerIotaHandler extends IntegerOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("iota")  && argTypes.size() == 2)
		{
			if (contextType instanceof IntegerType) {
				return true;
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getIntegerType())) {
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
		OperationDefinition result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		
		//if result is not null
		if (result != null) {
			
			//register the result as it has been handled
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			//get the target
			Expression target = featureCallExpression.getTarget();
			
			//if target is null, report and return
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				return result;
			}
			
			//get the target type copy
			Type targetType = EcoreUtil.copy(target.getResolvedType());

			//if target type is null, report and return (this will not happend)
			if (targetType == null) {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return result;
			}
			
			if (argTypes.size() == 2) {
				Type argType = argTypes.get(0);
				Type argType1 = argTypes.get(1);
				if (argType instanceof IntegerType) {
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
					if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getIntegerType())) {
					}
					else {
						LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_INTEGER);
					}
				}
				else {
					LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_INTEGER);
				}
				
				if (argType1 instanceof IntegerType) {
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
					if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType1, EolPackage.eINSTANCE.getIntegerType())) {
					}
					else {
						LogBook.getInstance().addError(argType1, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_INTEGER);
					}
				}
				else {
					LogBook.getInstance().addError(argType1, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_INTEGER);
				}
			}
			
			//if target type is collection type
			if (targetType instanceof IntegerType) {
				return result;
			}
			//else if target type is an instance of any
			else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				//get dynamic types that are of type collection
				ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getIntegerType());
				//if size is 0, no collection type is found, report and return
				if (dyntypes.size() == 0) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_INTEGER);
					return result;
				}
				else {
					return result;
				}
			}
			else {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_INTEGER);
				return result;
			}
		}
		return result;
	}

}
