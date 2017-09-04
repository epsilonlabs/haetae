package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.SelfContentType;
import org.eclipse.epsilon.eol.metamodel.SelfType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.FOLMethodCallExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class FOLMethodCallExpressionTypeResolver extends FOLMethodCallExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(FOLMethodCallExpression fOLMethodCallExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		context.getTypeRegistry().pushScope(fOLMethodCallExpression);
		//prepare target type
		Expression target = fOLMethodCallExpression.getTarget();
		
		if (target == null) {
			LogBook.getInstance().addError(fOLMethodCallExpression, IMessage_TypeResolution.FOL_MUST_HAVE_TARGET);
		}

		Type targetType = null;
		//prepare arrow
		
		boolean arrow = false;
		//prepare argTypes
		
		ArrayList<Type> argTypes = new ArrayList<Type>(); 
		//get method name
		
//		String methodName = fOLMethodCallExpression.getMethod().getName();  

		//visit target first
		controller.visit(fOLMethodCallExpression.getTarget(), context);
		
		//get target type
		targetType = fOLMethodCallExpression.getTarget().getResolvedType();
		
		//prepare content type
		Type contentType = null;
		
		//get method name
		String name = fOLMethodCallExpression.getMethod().getName();
		
		//if target type is not null
		if (targetType != null) {
			//if target type is not collection type, set resolved type to any and return
			if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				LogBook.getInstance().addWarning(target, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.FOL_TARGET_MUST_BE_COLLECTION, name));
				fOLMethodCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
				return null;
			}
			else if (!(targetType instanceof CollectionType)) {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.FOL_TARGET_MUST_BE_COLLECTION, name));
				fOLMethodCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
				return null;
			}
			else {
				//get the content type of the target
				contentType = EcoreUtil.copy(((CollectionType)targetType).getContentType());
				
				//if contentType is null, set it to Any
				if (contentType == null) {
					contentType = EolFactory.eINSTANCE.createAnyType();
				}
				
				//get the iterator
				FormalParameterExpression iterator = fOLMethodCallExpression.getIterator();
				
				//visit the iterator
				controller.visit(iterator, context);
				
				//if iterator type is null or any, copy the content type of the target
				if (iterator.getResolvedType() == null || TypeUtil.getInstance().isInstanceofAnyType(iterator.getResolvedType())) {
					iterator.setResolvedType(EcoreUtil.copy(contentType));
					context.getTypeRegistry().assignType(iterator, contentType);
				}
				
				if (!(TypeUtil.getInstance().isInstanceofAnyType(iterator.getResolvedType()))) {
					context.getTypeRegistry().assignType(iterator, iterator.getResolvedType());
				}
				else {
					context.getTypeRegistry().assignType(iterator, contentType);
				}
				
				//visit the condition
				for(Expression condition: fOLMethodCallExpression.getConditions())
				{
					controller.visit(condition, context);
				}
				
				
				//controller.visit(fOLMethodCallExpression.getCondition(), context);
				
				//put Any for now for the sake of searching
				argTypes.add(EolFactory.eINSTANCE.createAnyType()); 

				//get isArrow
				arrow = fOLMethodCallExpression.isArrow();
				
				//prepare operation definition
				OperationDefinition operationDefinition = null;
				
				//fetch operation definition using name, context type and arg types from the built in library
				try {
					operationDefinition = context.getOperationDefinitionManager().getOperation(fOLMethodCallExpression, name, targetType, argTypes, arrow);
				} catch (AnalysisInterruptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				//if there is an operation
				if (operationDefinition != null) {
					
					//get the context type of the operation
					Type contextType = operationDefinition.getContextType();
					
					//if target type and context type is generic
					if (context.getTypeUtil().isTypeEqualOrGeneric(targetType,contextType)) {
						
						//if is self type
						if (operationDefinition.getReturnType() instanceof SelfType) { 
							
							//just copy the target type because the target type has been resolved
							fOLMethodCallExpression.setResolvedType(EcoreUtil.copy(targetType)); 
							
							//set the resolved type of the method
							fOLMethodCallExpression.getMethod().setResolvedType(EcoreUtil.copy(targetType));
							
							//set resolved content
							fOLMethodCallExpression.getMethod().setResolvedContent(operationDefinition); 
						}
						//if is selfContentType
						else if (operationDefinition.getReturnType() instanceof SelfContentType) {
							
							//if target type is of collection type
							if (targetType instanceof CollectionType) {
								if (contentType != null) {
									//set resolved type
									fOLMethodCallExpression.setResolvedType(EcoreUtil.copy(contentType));
									
									//set method type
									fOLMethodCallExpression.getMethod().setResolvedType(EcoreUtil.copy(contentType));
									
									//set resolved content
									fOLMethodCallExpression.getMethod().setResolvedContent(operationDefinition); 
								}
								else {
									//this should be Any i guess?
									//handle content type null
								}
								
							}
							else {
								//handle this
							}
						}
						else {
							fOLMethodCallExpression.setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType())); //set the type of the method call
							fOLMethodCallExpression.getMethod().setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType())); //set resolved type
							fOLMethodCallExpression.getMethod().setResolvedContent(operationDefinition); //set resolved content
						}
					}
					else {
						//handle type incompatible
						String expectedType = "";
						String actualType = "";
						if (contextType instanceof ModelElementType) {
							expectedType = ((ModelElementType)contextType).getModelName() + "!" + ((ModelElementType)contextType).getElementName();
						}
						
						else {
							expectedType = contextType.getClass().toString();
						}
						if (targetType instanceof ModelElementType) {
							actualType = ((ModelElementType)targetType).getModelName() + "!" + ((ModelElementType)targetType).getElementName();
						}
						else {
							actualType = targetType.getClass().toString();
						}
						LogBook.getInstance().addError(fOLMethodCallExpression.getTarget(), "Type mismatch for Operation: " + 
						operationDefinition.getName().getName() + "()" + "; Expected type: " + expectedType + 
						" , actual type: " + actualType);
						
					}
				}
				else {
					String argString = "";
					for(int i = 0; i < argTypes.size(); i++)
					{
						argString.concat(argTypes.get(i).getClass().toString());
						if (i == argTypes.size() - 1) {
							
						}
						else {
							argString.concat(", ");
						}
					}
					LogBook.getInstance().addError(fOLMethodCallExpression, "OperationDefinition: " + name + "("+ argString +")" + "cannot be found");
				}
			}
		}
		else {
			LogBook.getInstance().addError(targetType, "Target does not have a type");
		}
		context.getTypeRegistry().popScope();
		return null;
	}

}
