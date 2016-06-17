package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class RealExpressionCreator extends PrimitiveExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.FLOAT)
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
		
		RealExpression expression = (RealExpression) context.getEolFactory().createRealExpression(); //create a RealExpression
		this.setAssets(ast, expression, container);
		
		float val = 0;
		val = Float.parseFloat(ast.getText());
		expression.setValue(val); //set Value
				
		expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, RealTypeCreator.class));
		
		return expression;
	}

}
