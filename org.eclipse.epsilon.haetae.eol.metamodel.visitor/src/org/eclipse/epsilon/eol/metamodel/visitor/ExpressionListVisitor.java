package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ExpressionListVisitor<T, R> {
	
	public boolean appliesTo(ExpressionList expressionList, T context) {
		return true;
	}
	
	public abstract R visit (ExpressionList expressionList, T context, EolVisitorController<T, R> controller);
	
}
