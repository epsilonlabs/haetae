package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ArithmeticOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(ArithmeticOperatorExpression arithmeticOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (ArithmeticOperatorExpression arithmeticOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
