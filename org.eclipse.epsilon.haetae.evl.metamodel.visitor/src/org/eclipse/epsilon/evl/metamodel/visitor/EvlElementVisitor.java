package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class EvlElementVisitor<T, R> {
	
	public boolean appliesTo(EvlElement evlElement, T context) {
		return true;
	}
	
	public abstract R visit (EvlElement evlElement, T context, EvlVisitorController<T, R> controller);
	
}
