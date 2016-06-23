package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class NegativeOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(NegativeOperatorExpression negativeOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (NegativeOperatorExpression negativeOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
