package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SwitchCaseDefaultStatementVisitor<T, R> {
	
	public boolean appliesTo(SwitchCaseDefaultStatement switchCaseDefaultStatement, T context) {
		return true;
	}
	
	public abstract R visit (SwitchCaseDefaultStatement switchCaseDefaultStatement, T context, EolVisitorController<T, R> controller);
	
}
