package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ReturnStatementVisitor<T, R> {
	
	public boolean appliesTo(ReturnStatement returnStatement, T context) {
		return true;
	}
	
	public abstract R visit (ReturnStatement returnStatement, T context, EolVisitorController<T, R> controller);
	
}
