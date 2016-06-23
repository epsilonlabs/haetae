package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class DivideOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(DivideOperatorExpression divideOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (DivideOperatorExpression divideOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
