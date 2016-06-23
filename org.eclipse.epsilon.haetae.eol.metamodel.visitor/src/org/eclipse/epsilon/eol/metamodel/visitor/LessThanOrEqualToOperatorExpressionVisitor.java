package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class LessThanOrEqualToOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(LessThanOrEqualToOperatorExpression lessThanOrEqualToOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (LessThanOrEqualToOperatorExpression lessThanOrEqualToOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
