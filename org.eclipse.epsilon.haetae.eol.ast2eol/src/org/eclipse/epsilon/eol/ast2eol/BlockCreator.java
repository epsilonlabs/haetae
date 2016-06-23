package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class BlockCreator extends EOLElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.BLOCK)
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
		
		Block block = context.getEolFactory().createBlock(); //create a block
		this.setAssets(ast, block, container);
		
		for (AST statementAst : ast.getChildren()) {
			block.getStatements().add(context.getEolElementCreatorFactory().createStatement(statementAst, block, context));//process block AST
		}
		
		return block;
	}

}
