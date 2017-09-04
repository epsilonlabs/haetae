package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MethodCallExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class MethodCallExpressionTypeResolver extends MethodCallExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(MethodCallExpression methodCallExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//prepare target type
		Type targetType = null;
		
		//prepare arrow
		boolean arrow = false;
		
		//prepare argTypes
		ArrayList<Type> argTypes = new ArrayList<Type>();
		
		//get method name
		String methodName = methodCallExpression.getMethod().getName();
		
		//get target
 		Expression target = methodCallExpression.getTarget();
		
		for(Expression argument: methodCallExpression.getArguments()) //process arguments
		{
			controller.visit(argument, context); //resolve the type of the argument first
			//check if type is null (should not happen)
			if (argument.getResolvedType() == null) {
				LogBook.getInstance().addError(argument, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				//return null;
			}
			argTypes.add(EcoreUtil.copy(argument.getResolvedType())); //if is not any type, add to the argument list immediately
		}


		if (target == null) { //if the target is null
			targetType = EolFactory.eINSTANCE.createAnyType(); //since the target is null, we create an AnyType
		}
		else { //if the target is not null
			controller.visit(target, context); //visit content first
			
			targetType = EcoreUtil.copy(target.getResolvedType()); //get target type
			
			if (targetType == null) { //if target type is null
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				targetType = EolFactory.eINSTANCE.createAnyType();
				context.setAssets(targetType, target);
			}
			arrow = methodCallExpression.isArrow();
		}
		
		OperationDefinition operationDefinition = null;
		//fetch operation definition using name, context type and arg types from the standard library and user defined operations
		try {
			operationDefinition = context.getOperationDefinitionManager().getOperation(methodCallExpression, methodName, targetType, argTypes, arrow);
		} catch (AnalysisInterruptException e) {
			return null;
		} 
		
		//if an operation is found
		if (operationDefinition != null) {
			
			//get the context type of the operation
			Type opContextType = operationDefinition.getContextType();
			
			//if target type and context type is generic
			if (context.getTypeUtil().isTypeEqualOrGeneric(targetType,opContextType)) {
				
				
				//if handled
				if (OperationDefinitionManager.getInstance().handled(operationDefinition)) {
					//make a copy of the return type
					Type returnType = EcoreUtil.copy(operationDefinition.getReturnType());
					//set the resolved type
					methodCallExpression.setResolvedType(returnType);
					//set assets
					context.setAssets(returnType, methodCallExpression);
					//set the resolved type of the method
					methodCallExpression.getMethod().setResolvedType(EcoreUtil.copy(returnType));
					//set resolved content
					methodCallExpression.getMethod().setResolvedContent(operationDefinition); 
				}
				//if there is no handler
				else {
					
//					AnyType returnType = (AnyType) operationDefinition.getReturnType();
//					if (returnType.isDeclared()) {
//						
//					}
//					else {
//						controller.visit(operationDefinition.getBody(), context);
//					}
					
//					System.err.println("NO_HANDLER: " + methodName);

					Type returnTypeCopy = EcoreUtil.copy(operationDefinition.getReturnType());
					
					methodCallExpression.setResolvedType(returnTypeCopy); //set the type of the method call
					context.setAssets(returnTypeCopy, methodCallExpression);
					methodCallExpression.getMethod().setResolvedType(EcoreUtil.copy(returnTypeCopy)); //set resolved type
					methodCallExpression.getMethod().setResolvedContent(operationDefinition); //set resolved content
				}
				
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					if (!TypeInferenceManager.getInstance().containsDynamicType((AnyType) targetType, opContextType.eClass())) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_TYPE, TypeUtil.getInstance().getTypeName(opContextType)));
					}
					methodCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType()); //set the type of the method call
					methodCallExpression.getMethod().setResolvedType(EolFactory.eINSTANCE.createAnyType()); //set resolved type
					methodCallExpression.getMethod().setResolvedContent(operationDefinition); //set resolved conten
			}
			else {
				//handle type incompatible
				String expectedType = "";
				String actualType = "";
				if (opContextType instanceof ModelElementType) {
					expectedType = ((ModelElementType)opContextType).getModelName() + "!" + ((ModelElementType)opContextType).getElementName();
				}
				
				else {
					expectedType = opContextType.getClass().toString();
				}
				if (targetType instanceof ModelElementType) {
					actualType = ((ModelElementType)targetType).getModelName() + "!" + ((ModelElementType)targetType).getElementName();
				}
				else {
					actualType = targetType.getClass().toString();
				}
				LogBook.getInstance().addError(target, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.OPERATION_CONTEXT_TYPE_MISMATCH, methodName, expectedType, actualType));
			}
		}
		else {
			String argString = "";
			for(int i = 0; i < argTypes.size(); i++)
			{
				argString += argTypes.get(i).eClass().getName();
				if (i == argTypes.size() - 1) {
					
				}
				else {
					argString.concat(", ");
				}
			}
			AnyType returnType = EolFactory.eINSTANCE.createAnyType();
			
			methodCallExpression.setResolvedType(returnType); //set the type of the method call
			context.setAssets(returnType, methodCallExpression);
			LogBook.getInstance().addError(methodCallExpression, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.OPERATION_NOT_FOUND, methodName, argString));
		}
		return null;
	}

}
