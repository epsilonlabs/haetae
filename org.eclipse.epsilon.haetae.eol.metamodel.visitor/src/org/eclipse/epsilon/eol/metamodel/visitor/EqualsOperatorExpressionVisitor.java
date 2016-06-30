package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class EqualsOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(EqualsOperatorExpression equalsOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (EqualsOperatorExpression equalsOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
