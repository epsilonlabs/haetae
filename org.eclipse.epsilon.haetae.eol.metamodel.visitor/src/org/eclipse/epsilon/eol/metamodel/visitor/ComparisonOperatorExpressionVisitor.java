package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ComparisonOperatorExpressionVisitor<T, R> {
	
	public boolean appliesTo(ComparisonOperatorExpression comparisonOperatorExpression, T context) {
		return true;
	}
	
	public abstract R visit (ComparisonOperatorExpression comparisonOperatorExpression, T context, EolVisitorController<T, R> controller);
	
}
