package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class IntegerExpressionCreator extends PrimitiveExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.INT)
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
		
		IntegerExpression expression = (IntegerExpression) context.getEolFactory().createIntegerExpression(); //create an IntegerExpression
		this.setAssets(ast, expression, container);
		
		int val = 0;
		val = Integer.parseInt(ast.getText()); //parse value
		expression.setValue(val); //set value
		
		expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, IntegerTypeCreator.class));
		
		return expression;
	}


}
