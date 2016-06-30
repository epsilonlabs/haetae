package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ExpressionStatementVisitor<T, R> {
	
	public boolean appliesTo(ExpressionStatement expressionStatement, T context) {
		return true;
	}
	
	public abstract R visit (ExpressionStatement expressionStatement, T context, EolVisitorController<T, R> controller);
	
}
