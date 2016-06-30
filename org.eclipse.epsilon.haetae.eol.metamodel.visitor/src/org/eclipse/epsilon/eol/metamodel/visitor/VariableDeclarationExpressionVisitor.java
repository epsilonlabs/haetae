package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class VariableDeclarationExpressionVisitor<T, R> {
	
	public boolean appliesTo(VariableDeclarationExpression variableDeclarationExpression, T context) {
		return true;
	}
	
	public abstract R visit (VariableDeclarationExpression variableDeclarationExpression, T context, EolVisitorController<T, R> controller);
	
}
