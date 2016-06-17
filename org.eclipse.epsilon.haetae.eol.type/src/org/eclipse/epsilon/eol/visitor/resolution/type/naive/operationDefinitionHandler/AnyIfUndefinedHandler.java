package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class AnyIfUndefinedHandler extends AnyOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("ifUndefined")  && argTypes.size() == 1) {
			if (contextType instanceof AnyType) {
				return true;
			}
		}
		return false;
	}


	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) {
		
		//get the manager
		StandardLibraryOperationDefinitionContainer manager = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
				
		//get the result
		OperationDefinition result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		
		if (result != null) {
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			Expression target = featureCallExpression.getTarget();
			
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				AnyType returnType = EolFactory.eINSTANCE.createAnyType();
				result.setReturnType(returnType);
				return result;
			}
			
			AnyType targetType = (AnyType) EcoreUtil.copy(target.getResolvedType());
			
			if (targetType == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				AnyType returnType = EolFactory.eINSTANCE.createAnyType();
				result.setReturnType(returnType);
				return result;
			}
			
			AnyType _returnType = EolFactory.eINSTANCE.createAnyType();
			if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				_returnType.getDynamicTypes().addAll(targetType.getDynamicTypes());
			}
			else {
				_returnType.getDynamicTypes().add(targetType);
			}
			
			
			AnyType argType = (AnyType) argTypes.get(0);
			if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
				_returnType.getDynamicTypes().addAll(argType.getDynamicTypes());
			}
			else {
				_returnType.getDynamicTypes().add(argType);
			}
			
			result.setReturnType(_returnType);
			return result;
		}
		return null;
	}






}
