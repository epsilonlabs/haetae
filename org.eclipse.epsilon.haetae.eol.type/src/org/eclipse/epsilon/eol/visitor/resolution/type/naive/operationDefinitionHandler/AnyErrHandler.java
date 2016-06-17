package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
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

public class AnyErrHandler extends AnyOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if ((name.equals("err")  && argTypes.size() == 0) ||
				(name.equals("err")  && argTypes.size() == 1) ||
				(name.equals("print")  && argTypes.size() == 0) ||
				(name.equals("print")  && argTypes.size() == 1) ||
				(name.equals("errln")  && argTypes.size() == 0) ||
				(name.equals("errln")  && argTypes.size() == 1) ||
				(name.equals("println")  && argTypes.size() == 0) ||
				(name.equals("println")  && argTypes.size() == 1)) {
			if (contextType instanceof AnyType) {
				return true;
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
		
		if (result != null) {
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			Expression target = featureCallExpression.getTarget();
			
			if (target == null) {
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
			
			if (argTypes.size() == 1) {
				AnyType argType = (AnyType) argTypes.get(0);
				if (argType instanceof StringType) {
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
					if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getStringType())) {
					}
					else {
						LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_STRING);
					}
				}
				else {
					LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_STRING);
				}
			}
			
			result.setReturnType(targetType);
			return result;
		}
		return result;
	}

}
