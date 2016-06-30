package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class OperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(OperatorExpression operatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (OperatorExpression operatorExpression, T context, EolVisitorController<T, R> controller);
	
}
