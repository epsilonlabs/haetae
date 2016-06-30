package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class IfStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.IF)
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
		
		IfStatement statement = (IfStatement) context.getEolFactory().createIfStatement(); //create an IfStatement
		this.setAssets(ast, statement, container);
		
		AST conditionAst = ast.getFirstChild(); //fetch the condition ast
		AST ifBodyAst = conditionAst.getNextSibling(); //fetch the body ast
		AST elseBodyAst = ifBodyAst.getNextSibling(); //fetch the else body ast
		
		statement.setCondition((Expression) context.getEolElementCreatorFactory().createEOLElement(conditionAst, statement, context)); //process condition
		
		if (ifBodyAst != null) {
			statement.setIfBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(ifBodyAst, statement, context, ExpressionOrStatementBlockCreator.class));		
		}
		
		if (elseBodyAst != null) {
			if (elseBodyAst.getType() == EolParser.BLOCK) {
				statement.setElseBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(elseBodyAst, statement, context, ExpressionOrStatementBlockCreator.class));
			}
			else {
				while (elseBodyAst != null && elseBodyAst.getType() == EolParser.IF) {
					AST elseIfConditionAst = elseBodyAst.getFirstChild();
					AST elseIfBody = elseIfConditionAst.getNextSibling();
					ExpressionOrStatementBlock block = (ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(elseIfBody, statement, context, ExpressionOrStatementBlockCreator.class);
					block.setCondition((Expression) context.getEolElementCreatorFactory().createEOLElement(elseIfConditionAst, block, context));
					statement.getElseIfBodies().add(block);
					
					elseBodyAst = elseIfBody.getNextSibling();
				}
				if (elseBodyAst != null) {
					statement.setElseBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(elseBodyAst, statement, context, ExpressionOrStatementBlockCreator.class));
				}
			}
		}
		
		return statement;
	}
}
