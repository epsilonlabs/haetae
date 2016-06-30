package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SetExpressionVisitor<T, R> {
	
	public boolean appliesTo(SetExpression setExpression, T context) {
		return true;
	}
	
	public abstract R visit (SetExpression setExpression, T context, EolVisitorController<T, R> controller);
	
}
