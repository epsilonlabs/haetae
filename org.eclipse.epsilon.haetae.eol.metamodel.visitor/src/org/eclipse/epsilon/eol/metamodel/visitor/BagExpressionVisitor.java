package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class BagExpressionVisitor<T, R> {
	
	public boolean appliesTo(BagExpression bagExpression, T context) {
		return true;
	}
	
	public abstract R visit (BagExpression bagExpression, T context, EolVisitorController<T, R> controller);
	
}
