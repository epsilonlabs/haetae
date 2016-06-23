package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SpecialAssignmentStatementVisitor<T, R> {
	
	public boolean appliesTo(SpecialAssignmentStatement specialAssignmentStatement, T context) {
		return true;
	}
	
	public abstract R visit (SpecialAssignmentStatement specialAssignmentStatement, T context, EolVisitorController<T, R> controller);
	
}
