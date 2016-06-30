package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SummableExpressionVisitor<T, R> {
	
	public boolean appliesTo(SummableExpression summableExpression, T context) {
		return true;
	}
	
	public abstract R visit (SummableExpression summableExpression, T context, EolVisitorController<T, R> controller);
	
}
