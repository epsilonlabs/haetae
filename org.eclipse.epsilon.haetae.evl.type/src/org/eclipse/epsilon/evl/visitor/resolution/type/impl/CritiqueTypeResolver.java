package org.eclipse.epsilon.evl.visitor.resolution.type.impl;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.ReturnStatement;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Critique;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.metamodel.visitor.CritiqueVisitor;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;
import org.eclipse.epsilon.evl.visitor.resolution.type.context.EvlTypeResolutionContext;

public class CritiqueTypeResolver extends CritiqueVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(Critique critique, TypeResolutionContext context,
			EvlVisitorController<TypeResolutionContext, Object> controller) {
		
		EvlTypeResolutionContext leContext = (EvlTypeResolutionContext) context;
		leContext.setCurrentInvariant(critique);
		
		ExpressionOrStatementBlock guard = critique.getGuard();
		ExpressionOrStatementBlock check = critique.getCheck();
		ExpressionOrStatementBlock message = critique.getMessage();
		
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
		
		if (check != null) {
			controller.visit(check, context);
			if (check.getExpression() != null) {
				Expression expression = check.getExpression();
				if (!(expression.getResolvedType() instanceof BooleanType)) {
					LogBook.getInstance().addError(expression, IMessage_TypeResolution.EXPRESSION_NOT_BOOLEAN);
				}
			}
			else if (check.getBlock() != null) {
				Block block = check.getBlock();
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
		
		if (message != null) {
			controller.visit(message, context);
			if (message.getExpression() != null) {
				Expression expression = message.getExpression();
				if (!(expression.getResolvedType() instanceof StringType)) {
					LogBook.getInstance().addError(expression, IMessage_TypeResolution.EXPRESSION_NOT_STRING);
				}
			}
			else if (message.getBlock() != null) {
				Block block = message.getBlock();
				for(Statement stmt: block.getStatements())
				{
					if (stmt instanceof ReturnStatement) {
						LogBook.getInstance().addError(stmt, IMessage_TypeResolution.RETURN_STMT_NOT_ALLOWED);
					}
					else if (stmt instanceof ExpressionStatement) {
						ExpressionStatement _stmt = (ExpressionStatement) stmt;
						if (!(_stmt.getExpression().getResolvedType() instanceof StringType)) {
							LogBook.getInstance().addError(_stmt.getExpression(), IMessage_TypeResolution.EXPRESSION_NOT_STRING);
						}
					}
				}
			}
		}
		
		for(Fix fix: critique.getFixes())
		{
			controller.visit(fix, context);
		}
		
		return null;
	}

}
