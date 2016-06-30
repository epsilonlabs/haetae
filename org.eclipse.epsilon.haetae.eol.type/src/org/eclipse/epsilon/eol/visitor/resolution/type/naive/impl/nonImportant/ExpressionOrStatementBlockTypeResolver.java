package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ExpressionOrStatementBlockVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class ExpressionOrStatementBlockTypeResolver extends ExpressionOrStatementBlockVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ExpressionOrStatementBlock expressionOrStatementBlock,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		if (expressionOrStatementBlock.getCondition() != null) {
			context.setHandlingBranchCondition(true);
			controller.visit(expressionOrStatementBlock.getCondition(), context);
			context.setHandlingBranchCondition(false);
		}
		
		Expression expression = expressionOrStatementBlock.getExpression();
		Block block = expressionOrStatementBlock.getBlock();
		
		if (expression != null) {
			controller.visit(expression, context);
		}
		else if (block != null) {
			controller.visit(block, context);
		}
		
		return null;
	}

}
