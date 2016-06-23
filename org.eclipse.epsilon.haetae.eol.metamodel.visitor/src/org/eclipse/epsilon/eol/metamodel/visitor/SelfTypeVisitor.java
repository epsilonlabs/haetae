package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SelfTypeVisitor<T, R> {
	
	public boolean appliesTo(SelfType selfType, T context) {
		return true;
	}
	
	public abstract R visit (SelfType selfType, T context, EolVisitorController<T, R> controller);
	
}
