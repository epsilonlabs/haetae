package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class PropertyCallExpressionVisitor<T, R> {
	
	public boolean appliesTo(PropertyCallExpression propertyCallExpression, T context) {
		return true;
	}
	
	public abstract R visit (PropertyCallExpression propertyCallExpression, T context, EolVisitorController<T, R> controller);
	
}
