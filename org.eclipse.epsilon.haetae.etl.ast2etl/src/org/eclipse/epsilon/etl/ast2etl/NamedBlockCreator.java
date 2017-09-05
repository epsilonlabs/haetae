package org.eclipse.epsilon.etl.ast2etl;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.etl.metamodel.EtlFactory;
import org.eclipse.epsilon.etl.metamodel.NamedBlock;
import org.eclipse.epsilon.etl.parse.EtlParser;

public class NamedBlockCreator extends EtlElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		return (ast.getType() == EtlParser.PRE);
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		Ast2EtlContext _context = (Ast2EtlContext) context;

		NamedBlock namedBlock = EtlFactory.eINSTANCE.createNamedBlock();
		this.setAssets(ast, namedBlock, container);

		AST firstChild = ast.getFirstChild();
		if (firstChild!=null & firstChild.getType() != EtlParser.BLOCK) {
			namedBlock.setName((NameExpression) _context.getEtlElementCreatorFactory().createEOLElement(firstChild, namedBlock, _context));
		}
		
		AST blockAst = AstUtilities.getChild(ast, EtlParser.BLOCK);
		if (blockAst != null) {
			namedBlock.setBody((Block) _context.getEtlElementCreatorFactory().createEOLElement(blockAst, namedBlock, _context));
		}
		
		return namedBlock;
	}

}
