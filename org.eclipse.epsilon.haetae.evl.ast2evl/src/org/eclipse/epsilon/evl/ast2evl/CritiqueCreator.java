package org.eclipse.epsilon.evl.ast2evl;

import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.ExpressionOrStatementBlockCreator;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.evl.metamodel.Critique;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.parse.EvlParser;

public class CritiqueCreator extends InvariantCreator{

	@Override
	public boolean appliesTo(AST ast) {
		// TODO Auto-generated method stub
		return ast.getType() == EvlParser.CRITIQUE;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		Ast2EvlContext _context = (Ast2EvlContext) context;

		Critique critique = _context.getEvlFactory().createCritique();
		this.setAssets(ast, critique, container);
		
		NameExpression name = (NameExpression) _context.getEolFactory().createNameExpression(); //create a NameExpression
		name.setName(ast.getText());
		this.setAssets(ast, name, container);
		critique.setName(name);
		
		AST guardAST = AstUtilities.getChild(ast, EvlParser.GUARD);
		if (guardAST != null) {
			AST childAst = guardAST.getFirstChild();
			ExpressionOrStatementBlock guard = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, critique, _context, ExpressionOrStatementBlockCreator.class);

//			ExpressionOrStatementBlock guard = _context.getEolFactory().createExpressionOrStatementBlock();
//			this.setAssets(guardAST, guard, critique);
//			AST childAst = guardAST.getFirstChild();
//			if (childAst != null) {
//				if (childAst.getType() == EvlParser.BLOCK) {
//					guard.setBlock((Block)_context.getEvlElementCreatorFactory().createDomElement(childAst, guard, _context));
//				}
//				else {
//					guard.setExpression((Expression)_context.getEvlElementCreatorFactory().createDomElement(childAst, guard, _context));
//				}
//			}
			critique.setGuard(guard);
		}
		
		AST checkAST = AstUtilities.getChild(ast, EvlParser.CHECK);
		if (checkAST != null) {
			AST childAst = checkAST.getFirstChild();

			ExpressionOrStatementBlock check = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, critique, _context, ExpressionOrStatementBlockCreator.class);

//			ExpressionOrStatementBlock check = _context.getEolFactory().createExpressionOrStatementBlock();
//			this.setAssets(checkAST, check, critique);
//			AST childAst = checkAST.getFirstChild();
//			if (childAst != null) {
//				if (childAst.getType() == EvlParser.BLOCK) {
//					check.setBlock((Block) _context.getEvlElementCreatorFactory().createDomElement(childAst, check, _context));
//				}
//				else {
//					check.setExpression((Expression) _context.getEvlElementCreatorFactory().createDomElement(childAst, check, _context));
//				}
//			}
			critique.setCheck(check);
			
		}
		
		AST messageAst = AstUtilities.getChild(ast, EvlParser.MESSAGE);
		if (messageAst != null) {
			AST childAst = messageAst.getFirstChild();
			ExpressionOrStatementBlock message = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, critique, _context, ExpressionOrStatementBlockCreator.class);

//			ExpressionOrStatementBlock message = _context.getEolFactory().createExpressionOrStatementBlock();
//			this.setAssets(messageAst, message, critique);
//			AST childAst = messageAst.getFirstChild();
//			if (childAst != null) {
//				if (childAst.getType() == EvlParser.BLOCK) {
//					message.setBlock((Block) _context.getEvlElementCreatorFactory().createDomElement(childAst, message, _context));
//				}
//				else {
//					message.setExpression((Expression) _context.getEvlElementCreatorFactory().createDomElement(childAst, message, _context));
//				}
//			}
			critique.setMessage(message);
		}

		ArrayList<AST> fixesAST = AstUtilities.getChildren(ast, EvlParser.FIX);
		if (fixesAST != null) {
			for(AST fixAst : fixesAST)
			{
				critique.getFixes().add((Fix) _context.getEvlElementCreatorFactory().createEOLElement(fixAst, critique, _context));
			}
		}
		
		return critique;

	}

}
