package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class FormalParameterExpressionVisitor<T, R> {
	
	public boolean appliesTo(FormalParameterExpression formalParameterExpression, T context) {
		return true;
	}
	
	public abstract R visit (FormalParameterExpression formalParameterExpression, T context, EolVisitorController<T, R> controller);
	
}
