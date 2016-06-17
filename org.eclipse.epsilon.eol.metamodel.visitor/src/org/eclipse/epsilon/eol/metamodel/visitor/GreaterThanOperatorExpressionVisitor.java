package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class GreaterThanOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(GreaterThanOperatorExpression greaterThanOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (GreaterThanOperatorExpression greaterThanOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
