package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class FixVisitor<T, R> {
	
	public boolean appliesTo(Fix fix, T context) {
		return true;
	}
	
	public abstract R visit (Fix fix, T context, EvlVisitorController<T, R> controller);
	
}
