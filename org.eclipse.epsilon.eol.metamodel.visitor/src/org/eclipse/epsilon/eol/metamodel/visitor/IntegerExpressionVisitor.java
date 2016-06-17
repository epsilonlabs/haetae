package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class IntegerExpressionVisitor<T, R> {
	
	public boolean appliesTo(IntegerExpression integerExpression, T context) {
		return true;
	}
	
	public abstract R visit (IntegerExpression integerExpression, T context, EolVisitorController<T, R> controller);
	
}
