package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class LogicalOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(LogicalOperatorExpression logicalOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (LogicalOperatorExpression logicalOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
