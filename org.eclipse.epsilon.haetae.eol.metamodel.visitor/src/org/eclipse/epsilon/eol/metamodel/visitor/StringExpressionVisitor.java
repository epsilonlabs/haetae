package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class StringExpressionVisitor<T, R> {
	
	public boolean appliesTo(StringExpression stringExpression, T context) {
		return true;
	}
	
	public abstract R visit (StringExpression stringExpression, T context, EolVisitorController<T, R> controller);
	
}
