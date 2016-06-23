package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class ContextVisitor<T, R> {
	
	public boolean appliesTo(Context _context, T context) {
		return true;
	}
	
	public abstract R visit (Context _context, T context, EvlVisitorController<T, R> controller);
	
}
