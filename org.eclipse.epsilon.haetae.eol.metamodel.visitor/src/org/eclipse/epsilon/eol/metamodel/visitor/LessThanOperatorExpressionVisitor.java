package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class LessThanOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(LessThanOperatorExpression lessThanOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (LessThanOperatorExpression lessThanOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
