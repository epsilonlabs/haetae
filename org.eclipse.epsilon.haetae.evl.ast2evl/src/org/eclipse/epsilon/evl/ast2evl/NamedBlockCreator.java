package org.eclipse.epsilon.evl.ast2evl;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.evl.metamodel.NamedBlock;
import org.eclipse.epsilon.evl.parse.EvlParser;

public class NamedBlockCreator extends EvlElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		return ((ast.getType() == EvlParser.PRE) || (ast.getType() == EvlParser.POST));
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		Ast2EvlContext _context = (Ast2EvlContext) context;

		NamedBlock namedBlock = _context.getEvlFactory().createNamedBlock();
		this.setAssets(ast, namedBlock, container);

		AST firstChild = ast.getFirstChild();
		if (firstChild!=null & firstChild.getType() != EvlParser.BLOCK) {
			namedBlock.setName((NameExpression) _context.getEvlElementCreatorFactory().createEOLElement(firstChild, namedBlock, _context));
		}
		
		AST blockAst = AstUtilities.getChild(ast, EvlParser.BLOCK);
		if (blockAst != null) {
			namedBlock.setBody((Block) _context.getEvlElementCreatorFactory().createEOLElement(blockAst, namedBlock, _context));
		}
		
		return null;
	}

}
