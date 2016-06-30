package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class SwitchStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.SWITCH)
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
		
		SwitchStatement statement = (SwitchStatement) context.getEolFactory().createSwitchStatement(); //create a SwitchStatement
		this.setAssets(ast, statement, container);
		
		AST expressionAst = ast.getFirstChild(); //get expression AST
		statement.setExpression((Expression) context.getEolElementCreatorFactory().createEOLElement(expressionAst, statement, context)); //process expression AST
		
		for (AST caseAst : ast.getChildren()) {
			if (caseAst != expressionAst) {
				if(caseAst.getType() == EolParser.CASE)
				{
					statement.getCases().add((SwitchCaseExpressionStatement) context.getEolElementCreatorFactory().createEOLElement(caseAst, statement, context)); //process switch cases
				}
				else {
					statement.setDefault((SwitchCaseDefaultStatement) context.getEolElementCreatorFactory().createEOLElement(caseAst, statement, context));
				}
			}
		}
		
		return statement;
	}

}
