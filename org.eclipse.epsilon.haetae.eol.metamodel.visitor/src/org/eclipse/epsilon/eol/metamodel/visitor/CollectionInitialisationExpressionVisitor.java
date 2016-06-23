package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class CollectionInitialisationExpressionVisitor<T, R> {
	
	public boolean appliesTo(CollectionInitialisationExpression collectionInitialisationExpression, T context) {
		return true;
	}
	
	public abstract R visit (CollectionInitialisationExpression collectionInitialisationExpression, T context, EolVisitorController<T, R> controller);
	
}
