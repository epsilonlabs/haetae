package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ForStatementVisitor<T, R> {
	
	public boolean appliesTo(ForStatement forStatement, T context) {
		return true;
	}
	
	public abstract R visit (ForStatement forStatement, T context, EolVisitorController<T, R> controller);
	
}
