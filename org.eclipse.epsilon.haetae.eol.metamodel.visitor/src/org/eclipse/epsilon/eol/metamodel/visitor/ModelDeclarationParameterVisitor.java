package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ModelDeclarationParameterVisitor<T, R> {
	
	public boolean appliesTo(ModelDeclarationParameter modelDeclarationParameter, T context) {
		return true;
	}
	
	public abstract R visit (ModelDeclarationParameter modelDeclarationParameter, T context, EolVisitorController<T, R> controller);
	
}
