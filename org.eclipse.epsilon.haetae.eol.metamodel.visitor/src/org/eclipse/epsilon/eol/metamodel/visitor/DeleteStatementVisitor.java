package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class DeleteStatementVisitor<T, R> {
	
	public boolean appliesTo(DeleteStatement deleteStatement, T context) {
		return true;
	}
	
	public abstract R visit (DeleteStatement deleteStatement, T context, EolVisitorController<T, R> controller);
	
}
