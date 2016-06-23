package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class StatementVisitor<T, R> {
	
	public boolean appliesTo(Statement statement, T context) {
		return true;
	}
	
	public abstract R visit (Statement statement, T context, EolVisitorController<T, R> controller);
	
}
