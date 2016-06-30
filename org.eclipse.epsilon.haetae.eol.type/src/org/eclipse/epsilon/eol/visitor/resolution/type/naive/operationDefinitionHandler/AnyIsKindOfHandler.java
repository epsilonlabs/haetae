package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class AnyIsKindOfHandler extends AnyOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if ((name.equals("isKindOf") || name.equals("isTypeOf")) && argTypes.size() == 1) {
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
				return result;
			}
			
			AnyType targetType = (AnyType) EcoreUtil.copy(target.getResolvedType());
			if (targetType == null) {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return result;
			}
			
			Type argType = argTypes.get(0);
			
			if (argType == null) {
				LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return result;
			}
			
			Expression argument = ((MethodCallExpression)featureCallExpression).getArguments().get(0);
			if (argument instanceof NameExpression) {
				NameExpression _argument = (NameExpression) argument;
				String typeName = _argument.getName();
				if (!TypeUtil.getInstance().isTypeKeyWord(typeName)) {
					LogBook.getInstance().addError(argument, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, typeName));
					return result;
				}
				else {
					if (target instanceof NameExpression) {
						NameExpression _target = (NameExpression) target;
						if (_target.getResolvedContent() != null && _target.getResolvedContent() instanceof VariableDeclarationExpression) {
							VariableDeclarationExpression vde = (VariableDeclarationExpression) _target.getResolvedContent();
							Type argumentType = argument.getResolvedType();
							if (argumentType != null) {
								TypeResolutionContext.getInstance().getTypeRegistry().assignType(vde, argumentType);
							}
						}
					}
				}
			}
			
//			
//			if (argType instanceof ModelElementType) {
//				if (TypeResolutionContext.getInstanace().isHandlingBranchCondition()) {
//					if (target instanceof NameExpression) {
//						NameExpression _target = (NameExpression) target;
//						if (_target.getResolvedContent() != null) {
//							if (_target.getResolvedContent() instanceof VariableDeclarationExpression) {
//								VariableDeclarationExpression content = (VariableDeclarationExpression) _target.getResolvedContent();
//								TypeResolutionContext.getInstanace().getTypeRegistry().insertType(content, argType);
//								return result;
//							}
//						}
//					}	
//				}
//			}
//			else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
//				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getModelElementType())) {
//					return result;
//				}
//				else {
//					LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MODEL_ELEMENT);
//					return null;
//				}
//			}
		
		}
				
		return result;
	}



}
