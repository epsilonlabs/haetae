package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class WhileStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.WHILE)
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
		
		WhileStatement statement = (WhileStatement) context.getEolFactory().createWhileStatement(); //create a WhileStatement
		this.setAssets(ast, statement, container);
		
		statement.setCondition((Expression) context.getEolElementCreatorFactory().createEOLElement(ast.getFirstChild(), statement, context)); //set the condition
		
		AST bodyAST = ast.getChild(1); //fetch the body ast
		if (bodyAST != null) {
			statement.setBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(bodyAST, statement, context, ExpressionOrStatementBlockCreator.class));
		}
		return statement;
	}
}
