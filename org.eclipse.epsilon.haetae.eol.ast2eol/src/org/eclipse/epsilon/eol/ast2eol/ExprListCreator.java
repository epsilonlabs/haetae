package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ExprListCreator extends CollectionInitValueExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if (ast.getType() == EolParser.EXPRLIST) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		ExpressionList list = context.getEolFactory().createExpressionList();
		this.setAssets(ast, list, container);
	
		for(AST child: ast.getChildren()) //ast MUST have at least one children
		{
			list.getExpressions().add((Expression) context.getEolElementCreatorFactory().createEOLElement(child, list, context));
		}
		
		return list;
	}
}
