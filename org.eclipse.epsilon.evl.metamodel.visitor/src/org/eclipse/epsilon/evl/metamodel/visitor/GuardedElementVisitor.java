package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class GuardedElementVisitor<T, R> {
	
	public boolean appliesTo(GuardedElement guardedElement, T context) {
		return true;
	}
	
	public abstract R visit (GuardedElement guardedElement, T context, EvlVisitorController<T, R> controller);
	
}
