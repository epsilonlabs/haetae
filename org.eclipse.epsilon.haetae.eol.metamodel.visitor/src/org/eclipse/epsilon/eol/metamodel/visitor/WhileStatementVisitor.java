package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class WhileStatementVisitor<T, R> {
	
	public boolean appliesTo(WhileStatement whileStatement, T context) {
		return true;
	}
	
	public abstract R visit (WhileStatement whileStatement, T context, EolVisitorController<T, R> controller);
	
}
