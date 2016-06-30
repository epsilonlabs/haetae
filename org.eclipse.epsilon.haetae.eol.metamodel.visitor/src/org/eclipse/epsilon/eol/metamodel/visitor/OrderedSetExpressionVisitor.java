package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class OrderedSetExpressionVisitor<T, R> {
	
	public boolean appliesTo(OrderedSetExpression orderedSetExpression, T context) {
		return true;
	}
	
	public abstract R visit (OrderedSetExpression orderedSetExpression, T context, EolVisitorController<T, R> controller);
	
}
