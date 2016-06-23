package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class AssignmentStatementVisitor<T, R> {
	
	public boolean appliesTo(AssignmentStatement assignmentStatement, T context) {
		return true;
	}
	
	public abstract R visit (AssignmentStatement assignmentStatement, T context, EolVisitorController<T, R> controller);
	
}
