package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SummablePrimitiveTypeVisitor<T, R> {
	
	public boolean appliesTo(SummablePrimitiveType summablePrimitiveType, T context) {
		return true;
	}
	
	public abstract R visit (SummablePrimitiveType summablePrimitiveType, T context, EolVisitorController<T, R> controller);
	
}
