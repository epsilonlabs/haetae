package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class CollectionExpressionVisitor<T, R> {
	
	public boolean appliesTo(CollectionExpression collectionExpression, T context) {
		return true;
	}
	
	public abstract R visit (CollectionExpression collectionExpression, T context, EolVisitorController<T, R> controller);
	
}
