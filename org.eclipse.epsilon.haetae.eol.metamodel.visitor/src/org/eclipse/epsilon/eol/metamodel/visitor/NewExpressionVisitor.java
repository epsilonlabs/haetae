package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class NewExpressionVisitor<T, R> {
	
	public boolean appliesTo(NewExpression newExpression, T context) {
		return true;
	}
	
	public abstract R visit (NewExpression newExpression, T context, EolVisitorController<T, R> controller);
	
}
