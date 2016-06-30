package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class BreakAllStatementVisitor<T, R> {
	
	public boolean appliesTo(BreakAllStatement breakAllStatement, T context) {
		return true;
	}
	
	public abstract R visit (BreakAllStatement breakAllStatement, T context, EolVisitorController<T, R> controller);
	
}
