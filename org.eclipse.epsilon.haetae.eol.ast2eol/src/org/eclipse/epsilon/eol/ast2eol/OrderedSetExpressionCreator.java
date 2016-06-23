package org.eclipse.epsilon.eol.ast2eol;


import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class OrderedSetExpressionCreator extends CollectionExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.COLLECTION && ast.getText().equals("OrderedSet"))
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

		OrderedSetExpression expression = context.getEolFactory().createOrderedSetExpression();
		this.buildCollection(ast, expression, container, context);
		
		expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, OrderedSetTypeCreator.class));
		
		return expression;
	}

}
