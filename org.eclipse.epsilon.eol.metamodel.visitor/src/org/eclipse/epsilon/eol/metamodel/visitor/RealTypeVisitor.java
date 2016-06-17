package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class RealTypeVisitor<T, R> {
	
	public boolean appliesTo(RealType realType, T context) {
		return true;
	}
	
	public abstract R visit (RealType realType, T context, EolVisitorController<T, R> controller);
	
}
