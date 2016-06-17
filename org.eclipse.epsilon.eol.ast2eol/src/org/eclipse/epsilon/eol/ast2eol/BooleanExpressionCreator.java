package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class BooleanExpressionCreator extends PrimitiveExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.BOOLEAN)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		BooleanExpression expression = (BooleanExpression) context.getEolFactory().createBooleanExpression(); //create a BooleanExpression
		this.setAssets(ast, expression, container);		
		
		boolean value = false;
		
		if(ast.getText().equalsIgnoreCase("true"))
		{
			value = true;
		}
		else
		{
			value = false;
		}
		
		expression.setValue(value);
		
		expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, BooleanTypeCreator.class));
		
		return expression;
	}

}
