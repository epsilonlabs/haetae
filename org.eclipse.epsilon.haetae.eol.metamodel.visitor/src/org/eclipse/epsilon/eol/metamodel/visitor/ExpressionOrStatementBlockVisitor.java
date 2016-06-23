package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ExpressionOrStatementBlockVisitor<T, R> {
	
	public boolean appliesTo(ExpressionOrStatementBlock expressionOrStatementBlock, T context) {
		return true;
	}
	
	public abstract R visit (ExpressionOrStatementBlock expressionOrStatementBlock, T context, EolVisitorController<T, R> controller);
	
}
