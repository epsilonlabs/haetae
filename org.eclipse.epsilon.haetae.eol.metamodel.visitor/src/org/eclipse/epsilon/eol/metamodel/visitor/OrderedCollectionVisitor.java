package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class OrderedCollectionVisitor<T, R> {
	
	public boolean appliesTo(OrderedCollection orderedCollection, T context) {
		return true;
	}
	
	public abstract R visit (OrderedCollection orderedCollection, T context, EolVisitorController<T, R> controller);
	
}
