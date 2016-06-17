package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ThrowStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.THROW)
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
		
		ThrowStatement statement = context.getEolFactory().createThrowStatement();
		this.setAssets(ast, statement, container);
		
		AST thrownAst = ast.getFirstChild();
		if(thrownAst != null)
		{
			statement.setExpression((Expression) context.getEolElementCreatorFactory().createEOLElement(thrownAst, statement, context));
		}
		
		return statement;
	}
 
}
