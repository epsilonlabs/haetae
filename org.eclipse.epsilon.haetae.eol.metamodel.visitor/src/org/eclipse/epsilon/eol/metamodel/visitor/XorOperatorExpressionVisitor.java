package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class XorOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(XorOperatorExpression xorOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (XorOperatorExpression xorOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
