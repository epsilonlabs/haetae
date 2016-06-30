package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ThrowStatementVisitor<T, R> {
	
	public boolean appliesTo(ThrowStatement throwStatement, T context) {
		return true;
	}
	
	public abstract R visit (ThrowStatement throwStatement, T context, EolVisitorController<T, R> controller);
	
}
