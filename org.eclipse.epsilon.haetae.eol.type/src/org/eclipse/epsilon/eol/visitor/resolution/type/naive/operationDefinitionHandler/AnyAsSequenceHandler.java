package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.SequenceType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class AnyAsSequenceHandler extends AnyOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("asSequence")  && argTypes.size() == 0) {
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
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				SequenceType returnType = EolFactory.eINSTANCE.createSequenceType();
				AnyType contentType = EolFactory.eINSTANCE.createAnyType();
				returnType.setContentType(contentType);
				result.setReturnType(returnType);
				return result;
			}
			
			AnyType targetType = (AnyType) EcoreUtil.copy(target.getResolvedType());
			
			if (targetType == null) {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				SequenceType returnType = EolFactory.eINSTANCE.createSequenceType();
				AnyType contentType = EolFactory.eINSTANCE.createAnyType();
				returnType.setContentType(contentType);
				result.setReturnType(returnType);
				return result;
			}
			
			SequenceType returnType = EolFactory.eINSTANCE.createSequenceType();
			//AnyType contentType = EolFactory.eINSTANCE.createAnyType();
			if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				AnyType contentType = EolFactory.eINSTANCE.createAnyType();
				returnType.setContentType(contentType);
				TypeResolutionContext.getInstance().setAssets(contentType, returnType);
				//contentType.getDynamicTypes().addAll(targetType.getDynamicTypes());
			}
			else {
				Type contentType = null;
				if (targetType instanceof CollectionType) {
					Type _contentType = ((CollectionType) targetType).getContentType();
					if (_contentType != null) {
						contentType = (AnyType) EcoreUtil.copy(_contentType);
					}
				}
				else {
					contentType = EcoreUtil.copy(targetType);	
				}
				Type _targetType = EcoreUtil.copy(targetType);
				returnType.setContentType(contentType);
				TypeResolutionContext.getInstance().setAssets(contentType, returnType);
				//contentType.getDynamicTypes().add(targetType);
			}
			//returnType.setContentType(contentType);
			result.setReturnType(returnType);
			return result;
		}
		return result;
	}

}
