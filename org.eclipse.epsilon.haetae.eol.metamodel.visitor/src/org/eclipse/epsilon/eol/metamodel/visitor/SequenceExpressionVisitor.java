package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SequenceExpressionVisitor<T, R> {
	
	public boolean appliesTo(SequenceExpression sequenceExpression, T context) {
		return true;
	}
	
	public abstract R visit (SequenceExpression sequenceExpression, T context, EolVisitorController<T, R> controller);
	
}
