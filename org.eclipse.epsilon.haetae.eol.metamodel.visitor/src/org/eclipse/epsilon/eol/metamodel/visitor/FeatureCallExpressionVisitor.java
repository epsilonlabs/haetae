package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class FeatureCallExpressionVisitor<T, R> {
	
	public boolean appliesTo(FeatureCallExpression featureCallExpression, T context) {
		return true;
	}
	
	public abstract R visit (FeatureCallExpression featureCallExpression, T context, EolVisitorController<T, R> controller);
	
}
