package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ComparablePrimitiveTypeVisitor<T, R> {
	
	public boolean appliesTo(ComparablePrimitiveType comparablePrimitiveType, T context) {
		return true;
	}
	
	public abstract R visit (ComparablePrimitiveType comparablePrimitiveType, T context, EolVisitorController<T, R> controller);
	
}
