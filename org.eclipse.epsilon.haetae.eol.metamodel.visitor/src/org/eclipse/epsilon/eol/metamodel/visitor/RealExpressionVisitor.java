package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class RealExpressionVisitor<T, R> {
	
	public boolean appliesTo(RealExpression realExpression, T context) {
		return true;
	}
	
	public abstract R visit (RealExpression realExpression, T context, EolVisitorController<T, R> controller);
	
}
