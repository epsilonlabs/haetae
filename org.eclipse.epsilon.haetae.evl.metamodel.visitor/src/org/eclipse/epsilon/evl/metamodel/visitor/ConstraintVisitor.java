package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class ConstraintVisitor<T, R> {
	
	public boolean appliesTo(Constraint constraint, T context) {
		return true;
	}
	
	public abstract R visit (Constraint constraint, T context, EvlVisitorController<T, R> controller);
	
}
