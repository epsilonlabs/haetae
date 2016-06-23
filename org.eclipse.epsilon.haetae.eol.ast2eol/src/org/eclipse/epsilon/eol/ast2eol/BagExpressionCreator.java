package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class BagExpressionCreator extends CollectionExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.COLLECTION && ast.getText().equalsIgnoreCase("Bag"))
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
		
		BagExpression expression = context.getEolFactory().createBagExpression();
		this.buildCollection(ast, expression, container, context);
		
		expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, BagTypeCreator.class));

		return expression;
	}

}
