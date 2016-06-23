package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ComparableExpressionVisitor<T, R> {
	
	public boolean appliesTo(ComparableExpression comparableExpression, T context) {
		return true;
	}
	
	public abstract R visit (ComparableExpression comparableExpression, T context, EolVisitorController<T, R> controller);
	
}
