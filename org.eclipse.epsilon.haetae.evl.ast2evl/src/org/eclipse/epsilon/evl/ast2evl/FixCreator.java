package org.eclipse.epsilon.evl.ast2evl;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.ExpressionOrStatementBlockCreator;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.parse.EvlParser;

public class FixCreator extends EvlElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		// TODO Auto-generated method stub
		return ast.getType() == EvlParser.FIX;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		// TODO Auto-generated method stub
		Ast2EvlContext _context = (Ast2EvlContext) context;
		
		Fix fix = _context.getEvlFactory().createFix();
		this.setAssets(ast, fix, container);
		
		
		AST titleAST = AstUtilities.getChild(ast, EvlParser.TITLE);
		if (titleAST!=null) {
			AST childAst = titleAST.getFirstChild();
			if (childAst != null) {
				ExpressionOrStatementBlock title = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, fix, _context, ExpressionOrStatementBlockCreator.class);

//				ExpressionOrStatementBlock title = _context.getEolFactory().createExpressionOrStatementBlock();
//				this.setAssets(childAst, title, fix);
//				if (childAst.getType() == EvlParser.BLOCK) {
//					title.setBlock((Block) _context.getEvlElementCreatorFactory().createDomElement(childAst, title, _context));
//				}
//				else
//				{
//					title.setExpression((Expression) _context.getEvlElementCreatorFactory().createDomElement(childAst, title, _context));
//				}
				fix.setTitle(title);
			}
		}
		
		AST doAST = AstUtilities.getChild(ast, EvlParser.DO);
		if (doAST != null) {
			fix.setDo((Block) _context.getEvlElementCreatorFactory().createEOLElement(doAST.getFirstChild(), fix, _context));
		}
		
		return fix;
	}

}
