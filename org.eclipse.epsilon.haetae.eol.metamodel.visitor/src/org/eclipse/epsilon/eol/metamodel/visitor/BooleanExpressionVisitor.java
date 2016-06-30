package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class BooleanExpressionVisitor<T, R> {
	
	public boolean appliesTo(BooleanExpression booleanExpression, T context) {
		return true;
	}
	
	public abstract R visit (BooleanExpression booleanExpression, T context, EolVisitorController<T, R> controller);
	
}
