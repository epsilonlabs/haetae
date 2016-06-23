package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ForStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.FOR)
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
		
		ForStatement statement = (ForStatement) context.getEolFactory().createForStatement(); //create a ForStatement
		this.setAssets(ast, statement, container);
		
		AST iteratorAst = ast.getChild(0); //obtain the iterator AST
		AST iteratedAst = ast.getChild(1); //obtain the iterated AST
		statement.setIterator((FormalParameterExpression) context.getEolElementCreatorFactory().createEOLElement(iteratorAst, statement, context)); //process the iterator
		statement.setCondition((Expression) context.getEolElementCreatorFactory().createEOLElement(iteratedAst, statement, context)); //process the iterated
		
		AST bodyAst = ast.getChild(2);
		if (bodyAst != null) {
			statement.setBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(bodyAst, statement, context, ExpressionOrStatementBlockCreator.class));
		}		
		return statement;
	}


}
