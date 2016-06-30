package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class CollectionTypeVisitor<T, R> {
	
	public boolean appliesTo(CollectionType collectionType, T context) {
		return true;
	}
	
	public abstract R visit (CollectionType collectionType, T context, EolVisitorController<T, R> controller);
	
}
