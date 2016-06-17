package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ExpressionVisitor<T, R> {
	
	public boolean appliesTo(Expression expression, T context) {
		return true;
	}
	
	public abstract R visit (Expression expression, T context, EolVisitorController<T, R> controller);
	
}
