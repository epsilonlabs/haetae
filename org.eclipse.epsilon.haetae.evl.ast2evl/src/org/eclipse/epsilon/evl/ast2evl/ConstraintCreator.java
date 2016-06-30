package org.eclipse.epsilon.evl.ast2evl;

import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.ExpressionOrStatementBlockCreator;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.evl.metamodel.Constraint;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.parse.EvlParser;

public class ConstraintCreator extends InvariantCreator{

	@Override
	public boolean appliesTo(AST ast) {
		// TODO Auto-generated method stub
		return ast.getType() == EvlParser.CONSTRAINT;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		// TODO Auto-generated method stub
		Ast2EvlContext _context = (Ast2EvlContext) context;

		Constraint constraint = _context.getEvlFactory().createConstraint();
		this.setAssets(ast, constraint, container);
		
		NameExpression name = (NameExpression) _context.getEolFactory().createNameExpression(); //create a NameExpression
		name.setName(ast.getText());
		this.setAssets(ast, name, container);
		constraint.setName(name);
		
		AST guardAST = AstUtilities.getChild(ast, EvlParser.GUARD);
		if (guardAST != null) {
			AST childAst = guardAST.getFirstChild();
			ExpressionOrStatementBlock guard = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, constraint, _context, ExpressionOrStatementBlockCreator.class);
//			ExpressionOrStatementBlock guard = _context.getEolFactory().createExpressionOrStatementBlock();
//			this.setAssets(guardAST, guard, constraint);
//			AST childAst = guardAST.getFirstChild();
//			if (childAst != null) {
//				if (childAst.getType() == EvlParser.BLOCK) {
//					guard.setBlock((Block)_context.getEvlElementCreatorFactory().createDomElement(childAst, guard, _context));
//				}
//				else {
//					guard.setExpression((Expression)_context.getEvlElementCreatorFactory().createDomElement(childAst, guard, _context));
//				}
//			}
			constraint.setGuard(guard);
		}
		
		AST checkAST = AstUtilities.getChild(ast, EvlParser.CHECK);
		if (checkAST != null) {
			AST childAst = checkAST.getFirstChild();

			ExpressionOrStatementBlock check = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, constraint, _context, ExpressionOrStatementBlockCreator.class);
//			ExpressionOrStatementBlock check = _context.getEolFactory().createExpressionOrStatementBlock();
//			this.setAssets(checkAST, check, constraint);
//			AST childAst = checkAST.getFirstChild();
//			if (childAst != null) {
//				if (childAst.getType() == EvlParser.BLOCK) {
//					check.setBlock((Block) _context.getEvlElementCreatorFactory().createDomElement(childAst, check, _context));
//				}
//				else {
//					check.setExpression((Expression) _context.getEvlElementCreatorFactory().createDomElement(childAst, check, _context));
//				}
//			}
			constraint.setCheck(check);
			
		}
		
		AST messageAst = AstUtilities.getChild(ast, EvlParser.MESSAGE);
		if (messageAst != null) {
			AST childAst = messageAst.getFirstChild();
			ExpressionOrStatementBlock message = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, constraint, _context, ExpressionOrStatementBlockCreator.class);
//			ExpressionOrStatementBlock message = _context.getEolFactory().createExpressionOrStatementBlock();
//			this.setAssets(messageAst, message, constraint);
//			AST childAst = messageAst.getFirstChild();
//			if (childAst != null) {
//				if (childAst.getType() == EvlParser.BLOCK) {
//					message.setBlock((Block) _context.getEvlElementCreatorFactory().createDomElement(childAst, message, _context));
//				}
//				else {
//					message.setExpression((Expression) _context.getEvlElementCreatorFactory().createDomElement(childAst, message, _context));
//				}
//			}
			constraint.setMessage(message);
		}

		ArrayList<AST> fixesAST = AstUtilities.getChildren(ast, EvlParser.FIX);
		if (fixesAST != null) {
			for(AST fixAst : fixesAST)
			{
				constraint.getFixes().add((Fix) _context.getEvlElementCreatorFactory().createEOLElement(fixAst, constraint, _context));
			}
		}
		
		return constraint;
	}

}
