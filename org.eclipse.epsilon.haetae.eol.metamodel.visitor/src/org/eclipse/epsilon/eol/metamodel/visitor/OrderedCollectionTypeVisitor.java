package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class OrderedCollectionTypeVisitor<T, R> {
	
	public boolean appliesTo(OrderedCollectionType orderedCollectionType, T context) {
		return true;
	}
	
	public abstract R visit (OrderedCollectionType orderedCollectionType, T context, EolVisitorController<T, R> controller);
	
}
