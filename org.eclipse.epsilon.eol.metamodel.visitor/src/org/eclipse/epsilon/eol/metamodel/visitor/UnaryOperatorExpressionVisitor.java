package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class UnaryOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(UnaryOperatorExpression unaryOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (UnaryOperatorExpression unaryOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
