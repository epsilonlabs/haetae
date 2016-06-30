package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class StringExpressionCreator extends PrimitiveExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.STRING)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		StringExpression expression = (StringExpression) context.getEolFactory().createStringExpression(); //create a StringExpression
		this.setAssets(ast, expression, container);
		
		String val = "";
		val = ast.getText();
		expression.setValue(val); //set value

		expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, StringTypeCreator.class));
		
		return expression;
	}


}
