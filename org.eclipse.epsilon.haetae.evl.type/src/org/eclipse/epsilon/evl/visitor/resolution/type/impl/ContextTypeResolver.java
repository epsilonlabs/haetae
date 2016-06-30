package org.eclipse.epsilon.evl.visitor.resolution.type.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.ReturnStatement;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.metamodel.visitor.ContextVisitor;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;
import org.eclipse.epsilon.evl.visitor.resolution.type.context.EvlTypeResolutionContext;

public class ContextTypeResolver extends ContextVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(Context _context, TypeResolutionContext context,
			EvlVisitorController<TypeResolutionContext, Object> controller) {

		EvlTypeResolutionContext leContext = (EvlTypeResolutionContext) context;
		
		leContext.setCurrentContext(_context);
		
		controller.visit(_context.getType(), context);
		
		_context.getSelf().setResolvedType(EcoreUtil.copy(_context.getType()));
		context.getTypeRegistry().assignType(_context.getSelf(), _context.getSelf().getResolvedType());
		
		if (_context.getSelf() != null) {
			_context.getSelf().setResolvedType(EcoreUtil.copy(_context.getType()));	
			_context.getSelf().getName().setResolvedType(EcoreUtil.copy(_context.getType()));
		}
		
		ExpressionOrStatementBlock guard = _context.getGuard();
		if (guard != null) {
			controller.visit(guard, context);
			if (guard.getExpression() != null) {
				Expression expression = guard.getExpression();
				if (!(expression.getResolvedType() instanceof BooleanType)) {
					LogBook.getInstance().addError(expression, IMessage_TypeResolution.EXPRESSION_NOT_BOOLEAN);
				}
			}
			else if (guard.getBlock() != null) {
				Block block = guard.getBlock();
				for(Statement stmt: block.getStatements())
				{
					if (stmt instanceof ReturnStatement) {
						LogBook.getInstance().addError(stmt, IMessage_TypeResolution.RETURN_STMT_NOT_ALLOWED);
					}
					else if (stmt instanceof ExpressionStatement) {
						ExpressionStatement _stmt = (ExpressionStatement) stmt;
						if (!(_stmt.getExpression().getResolvedType() instanceof BooleanType)) {
							LogBook.getInstance().addError(_stmt.getExpression(), IMessage_TypeResolution.EXPRESSION_NOT_BOOLEAN);
						}
					}
				}
			}
		}
		
		for (Invariant inv: _context.getInvariants()) {
			controller.visit(inv, context);
		}
		return null;
	}

}
