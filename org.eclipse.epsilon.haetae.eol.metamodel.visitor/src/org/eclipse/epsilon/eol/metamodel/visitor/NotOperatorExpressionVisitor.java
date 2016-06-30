package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class NotOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(NotOperatorExpression notOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (NotOperatorExpression notOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
