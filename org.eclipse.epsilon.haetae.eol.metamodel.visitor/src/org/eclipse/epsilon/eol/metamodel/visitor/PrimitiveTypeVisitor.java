package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class PrimitiveTypeVisitor<T, R> {
	
	public boolean appliesTo(PrimitiveType primitiveType, T context) {
		return true;
	}
	
	public abstract R visit (PrimitiveType primitiveType, T context, EolVisitorController<T, R> controller);
	
}
