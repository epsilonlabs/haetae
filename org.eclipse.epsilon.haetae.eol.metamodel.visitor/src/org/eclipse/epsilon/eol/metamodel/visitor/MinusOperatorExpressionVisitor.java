package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class MinusOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(MinusOperatorExpression minusOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (MinusOperatorExpression minusOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
