package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class SwitchCaseDefaultStatementCreator extends SwitchStatementCaseCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.DEFAULT)
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

		SwitchCaseDefaultStatement statement = (SwitchCaseDefaultStatement) context.getEolFactory().createSwitchCaseDefaultStatement(); //create a SwitchCaseDefaultStatment
		this.setAssets(ast, statement, container);
		
		AST blockAST = AstUtilities.getChild(ast, EolParser.BLOCK); //fetch the body AST for the switch case, there is always a block
		if(blockAST != null)
		{
			statement.setBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(blockAST, statement, context, ExpressionOrStatementBlockCreator.class));
			//set the body of the switch case
		}
		
		return statement;
	}
}
