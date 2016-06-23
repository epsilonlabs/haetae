package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SetTypeVisitor<T, R> {
	
	public boolean appliesTo(SetType setType, T context) {
		return true;
	}
	
	public abstract R visit (SetType setType, T context, EolVisitorController<T, R> controller);
	
}
