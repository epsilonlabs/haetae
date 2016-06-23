package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class NamedBlockVisitor<T, R> {
	
	public boolean appliesTo(NamedBlock namedBlock, T context) {
		return true;
	}
	
	public abstract R visit (NamedBlock namedBlock, T context, EvlVisitorController<T, R> controller);
	
}
