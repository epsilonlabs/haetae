package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class NameExpressionVisitor<T, R> {
	
	public boolean appliesTo(NameExpression nameExpression, T context) {
		return true;
	}
	
	public abstract R visit (NameExpression nameExpression, T context, EolVisitorController<T, R> controller);
	
}
