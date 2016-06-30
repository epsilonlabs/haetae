package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class GreaterThanOrEqualToOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(GreaterThanOrEqualToOperatorExpression greaterThanOrEqualToOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (GreaterThanOrEqualToOperatorExpression greaterThanOrEqualToOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
