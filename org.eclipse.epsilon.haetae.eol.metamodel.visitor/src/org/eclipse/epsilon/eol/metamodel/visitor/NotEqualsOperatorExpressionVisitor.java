package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class NotEqualsOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(NotEqualsOperatorExpression notEqualsOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (NotEqualsOperatorExpression notEqualsOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
