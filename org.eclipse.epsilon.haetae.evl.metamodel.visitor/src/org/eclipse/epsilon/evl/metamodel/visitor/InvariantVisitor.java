package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class InvariantVisitor<T, R> {
	
	public boolean appliesTo(Invariant invariant, T context) {
		return true;
	}
	
	public abstract R visit (Invariant invariant, T context, EvlVisitorController<T, R> controller);
	
}
