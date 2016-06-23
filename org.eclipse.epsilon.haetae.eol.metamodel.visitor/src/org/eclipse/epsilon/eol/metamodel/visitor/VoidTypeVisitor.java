package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class VoidTypeVisitor<T, R> {
	
	public boolean appliesTo(VoidType voidType, T context) {
		return true;
	}
	
	public abstract R visit (VoidType voidType, T context, EolVisitorController<T, R> controller);
	
}
