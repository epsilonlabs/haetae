package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class SwitchCaseExpressionStatementCreator extends SwitchStatementCaseCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.CASE)
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

		SwitchCaseExpressionStatement statement = (SwitchCaseExpressionStatement) context.getEolFactory().createSwitchCaseExpressionStatement(); //create a SwitchCaseExpressionStatement
		this.setAssets(ast, statement, container);
		
		AST expressionAst = ast.getFirstChild();
		if(expressionAst != null)
		{
			((SwitchCaseExpressionStatement)statement).setExpression((Expression) context.getEolElementCreatorFactory().createEOLElement(expressionAst, statement, context)); //set the Expression	
		}
		
		AST blockAST = expressionAst.getNextSibling();
		if(blockAST != null)
		{
			statement.setBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(blockAST, statement, context, ExpressionOrStatementBlockCreator.class));
			//set the body of the switch case
		}
		
		return statement;
	}

}
