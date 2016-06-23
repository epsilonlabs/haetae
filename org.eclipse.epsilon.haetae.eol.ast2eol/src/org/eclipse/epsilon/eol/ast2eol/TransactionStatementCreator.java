package org.eclipse.epsilon.eol.ast2eol;

import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class TransactionStatementCreator extends StatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.TRANSACTION)
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
		
		TransactionStatement statement = context.getEolFactory().createTransactionStatement();
		this.setAssets(ast, statement, container);
		
		ArrayList<AST> childrenAsts = AstUtilities.getChildren(ast);
		int temp = 0;
		while(temp < childrenAsts.size() - 1)
		{
			AST nameAst = childrenAsts.get(temp);
			statement.getNames().add((NameExpression) context.getEolElementCreatorFactory().createEOLElement(nameAst, statement, context));
			temp++;
		}
		
		AST bodyAst = childrenAsts.get(childrenAsts.size()-1);
		if (bodyAst != null) {
			statement.setBody((ExpressionOrStatementBlock) context.getEolElementCreatorFactory().createEOLElement(bodyAst, statement, context, ExpressionOrStatementBlockCreator.class));
		}
		return statement;
	}

}
