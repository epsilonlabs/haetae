package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class OrderedSetTypeVisitor<T, R> {
	
	public boolean appliesTo(OrderedSetType orderedSetType, T context) {
		return true;
	}
	
	public abstract R visit (OrderedSetType orderedSetType, T context, EolVisitorController<T, R> controller);
	
}
