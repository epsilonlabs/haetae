package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.VariableDeclarationExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class VariableDeclarationExpressionTypeResolver extends VariableDeclarationExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(
			VariableDeclarationExpression variableDeclarationExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//visit contents first
		controller.visit(variableDeclarationExpression.getResolvedType(), context);
		
		//get the value of the create
		boolean newExpression = variableDeclarationExpression.isCreate();
		
		//if it is a new variable
		if (newExpression) {
			
			//get resolved type
			Type rawType = variableDeclarationExpression.getResolvedType();
			
			//we are interested in the model element types
			if (rawType instanceof ModelElementType) {
				
				//get the type
				ModelElementType modelElementType = (ModelElementType) rawType;
				
				//if the model element type is a EClass in the meta model
				if (modelElementType.getModelElementType() instanceof EClass) {
					
					//get the EClass
					EClass eClass = (EClass) modelElementType.getModelElementType();
					
					//check if the class is an interface or abstract
					if (eClass.isAbstract() || eClass.isInterface()) {
						
						LogBook.getInstance().addError(modelElementType,
								IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_NOT_INSTANTIABLE, eClass.getName())); //throw error
					}
				}
			}
		}
		
		if (isContainedInExpressionStatement(variableDeclarationExpression)) {
			context.getTypeRegistry().assignType(variableDeclarationExpression, variableDeclarationExpression.getResolvedType());	
		}
		
		return null;
	}
	
	public boolean isContainedInExpressionStatement(VariableDeclarationExpression vde)
	{
		EOLElement container = vde.getContainer();
		while(container != null)
		{
			if (container instanceof ExpressionStatement) {
				return true;
			}
			container = container.getContainer();
		}
		return false;
	}

}
