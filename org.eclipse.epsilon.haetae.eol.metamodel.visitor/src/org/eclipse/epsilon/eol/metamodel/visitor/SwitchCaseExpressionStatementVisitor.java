package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SwitchCaseExpressionStatementVisitor<T, R> {
	
	public boolean appliesTo(SwitchCaseExpressionStatement switchCaseExpressionStatement, T context) {
		return true;
	}
	
	public abstract R visit (SwitchCaseExpressionStatement switchCaseExpressionStatement, T context, EolVisitorController<T, R> controller);
	
}
