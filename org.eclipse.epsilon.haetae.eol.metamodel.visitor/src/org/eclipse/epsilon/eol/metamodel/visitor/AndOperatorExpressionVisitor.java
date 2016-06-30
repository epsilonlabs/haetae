package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class AndOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(AndOperatorExpression andOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (AndOperatorExpression andOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
