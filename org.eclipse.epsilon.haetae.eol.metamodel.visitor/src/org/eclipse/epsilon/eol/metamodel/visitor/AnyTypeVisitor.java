package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class AnyTypeVisitor<T, R> {
	
	public boolean appliesTo(AnyType anyType, T context) {
		return true;
	}
	
	public abstract R visit (AnyType anyType, T context, EolVisitorController<T, R> controller);
	
}
