package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class MultiplyOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(MultiplyOperatorExpression multiplyOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (MultiplyOperatorExpression multiplyOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
