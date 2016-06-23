package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class ExpressionStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) { //always returns false because not tested
		return false;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		ExpressionStatement statement = context.getEolFactory().createExpressionStatement();
		this.setAssets(ast, statement, container);
		
		statement.setExpression((Expression) context.getEolElementCreatorFactory().createEOLElement(ast, statement, context)); //set expression
		
		return statement;
	}
}
