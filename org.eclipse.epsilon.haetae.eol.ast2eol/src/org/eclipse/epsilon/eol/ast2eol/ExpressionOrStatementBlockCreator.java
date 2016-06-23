package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ExpressionOrStatementBlockCreator extends EOLElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		return false;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		ExpressionOrStatementBlock body = context.getEolFactory().createExpressionOrStatementBlock();
		setAssets(ast, body, container);
		
		if(ast.getType() == EolParser.BLOCK)
		{
			body.setBlock((Block)context.getEolElementCreatorFactory().createEOLElement(ast, body, context)); //process the body
		}
		else {
			if (statementShouldPrevail(ast)) {
				EOLElement createdElement = context.getEolElementCreatorFactory().createStatement(ast, body, context);
				
				if (createdElement instanceof ExpressionStatement) {
					context.getEolElementCreatorFactory().discardEolElement(createdElement);
					createdElement = context.getEolElementCreatorFactory().createEOLElement(ast, body, context);
					if (createdElement instanceof Expression) {
						body.setExpression((Expression) createdElement);	
					}

				}
				else {
					Block block = context.getEolFactory().createBlock();
					setAssets(ast, block, body);
					block.getStatements().add((Statement) createdElement);
					setAssets(ast, createdElement, block);
					body.setBlock(block);
				}
			}
			else {
				EOLElement createdElement = context.getEolElementCreatorFactory().createEOLElement(ast, body, context);
				if (createdElement instanceof Expression) {
					body.setExpression((Expression) createdElement);	
				}
				else {
					context.getEolElementCreatorFactory().discardEolElement(createdElement);
					Block block = context.getEolFactory().createBlock();
					setAssets(ast, block, body);
					Statement stmt = context.getEolElementCreatorFactory().createStatement(ast, block, context);
					block.getStatements().add(stmt);
					setAssets(ast, stmt, block);
					body.setBlock(block);
				}
			}
			
		}
		return body;
	}
	
	public boolean statementShouldPrevail(AST ast)
	{
		AST parent = ast.getParent();
		if (parent.getType() == EolParser.IF ||
				parent.getType() == EolParser.FOR ||
				parent.getType() == EolParser.WHILE ||
				parent.getType() == EolParser.CASE ||
				parent.getType() == EolParser.TRANSACTION) {
				//parent.getType() == EvlParser.FIX ||
				//parent.getType() == EvlParser.MESSAGE ||
				//parent.getType() == EvlParser.TITLE) {
			return true;
		}
		else {
			return false;
		}
	}

}
