package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class BreakStatementVisitor<T, R> {
	
	public boolean appliesTo(BreakStatement breakStatement, T context) {
		return true;
	}
	
	public abstract R visit (BreakStatement breakStatement, T context, EolVisitorController<T, R> controller);
	
}
