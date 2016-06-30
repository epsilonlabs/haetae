package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class BooleanTypeVisitor<T, R> {
	
	public boolean appliesTo(BooleanType booleanType, T context) {
		return true;
	}
	
	public abstract R visit (BooleanType booleanType, T context, EolVisitorController<T, R> controller);
	
}
