package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class BinaryOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(BinaryOperatorExpression binaryOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (BinaryOperatorExpression binaryOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
