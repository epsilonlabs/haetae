package org.eclipse.epsilon.eol.ast2eol;


import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class AssignmentStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) { 
		if(ast.getType() == EolParser.ASSIGNMENT)
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

		AssignmentStatement statement = context.getEolFactory().createAssignmentStatement(); //create AssignmentStatement
		this.setAssets(ast, statement, container);
		
		statement.setLhs((Expression) context.getEolElementCreatorFactory().createEOLElement(ast.getChild(0), statement, context)); //set Lhs
		statement.setRhs((Expression) context.getEolElementCreatorFactory().createEOLElement(ast.getChild(1), statement, context)); //set Rhs

		return statement;
	}
}
