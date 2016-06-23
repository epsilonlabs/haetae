package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class UniqueCollectionVisitor<T, R> {
	
	public boolean appliesTo(UniqueCollection uniqueCollection, T context) {
		return true;
	}
	
	public abstract R visit (UniqueCollection uniqueCollection, T context, EolVisitorController<T, R> controller);
	
}
