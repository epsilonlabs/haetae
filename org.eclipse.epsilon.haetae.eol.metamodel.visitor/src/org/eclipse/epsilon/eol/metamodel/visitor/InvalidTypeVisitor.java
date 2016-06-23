package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class InvalidTypeVisitor<T, R> {
	
	public boolean appliesTo(InvalidType invalidType, T context) {
		return true;
	}
	
	public abstract R visit (InvalidType invalidType, T context, EolVisitorController<T, R> controller);
	
}
