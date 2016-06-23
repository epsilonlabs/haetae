package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class TypeVisitor<T, R> {
	
	public boolean appliesTo(Type type, T context) {
		return true;
	}
	
	public abstract R visit (Type type, T context, EolVisitorController<T, R> controller);
	
}
