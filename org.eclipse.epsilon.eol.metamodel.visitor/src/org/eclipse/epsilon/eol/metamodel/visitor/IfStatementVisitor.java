package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class IfStatementVisitor<T, R> {
	
	public boolean appliesTo(IfStatement ifStatement, T context) {
		return true;
	}
	
	public abstract R visit (IfStatement ifStatement, T context, EolVisitorController<T, R> controller);
	
}
