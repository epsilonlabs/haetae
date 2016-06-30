package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ExpressionRangeVisitor<T, R> {
	
	public boolean appliesTo(ExpressionRange expressionRange, T context) {
		return true;
	}
	
	public abstract R visit (ExpressionRange expressionRange, T context, EolVisitorController<T, R> controller);
	
}
