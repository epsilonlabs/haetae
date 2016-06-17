package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ExpressionOrStatementBlockVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class ExpressionOrStatementBlockVariableResolver extends ExpressionOrStatementBlockVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(ExpressionOrStatementBlock expressionOrStatementBlock,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//push to stack first
		context.getStack().push(expressionOrStatementBlock, true);
		//get the block
		Block block = expressionOrStatementBlock.getBlock();
		//get the expression
		Expression expr = expressionOrStatementBlock.getExpression();
		
		Expression condition = expressionOrStatementBlock.getCondition();
		if (condition != null) {
			controller.visit(condition, context);
		}
		
		//if block is not null visit the block
		if (block != null) {
			controller.visit(block, context);
		}
		
		//if expression is not null visit the expression
		if (expr != null) {
			controller.visit(expr, context);
		}
		
		//pop from stack
		context.getStack().pop();
		return null;
	}

}
