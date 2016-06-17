package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class KeyValueExpressionVisitor<T, R> {
	
	public boolean appliesTo(KeyValueExpression keyValueExpression, T context) {
		return true;
	}
	
	public abstract R visit (KeyValueExpression keyValueExpression, T context, EolVisitorController<T, R> controller);
	
}
