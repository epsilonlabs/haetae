package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ModelDeclarationStatementVisitor<T, R> {
	
	public boolean appliesTo(ModelDeclarationStatement modelDeclarationStatement, T context) {
		return true;
	}
	
	public abstract R visit (ModelDeclarationStatement modelDeclarationStatement, T context, EolVisitorController<T, R> controller);
	
}
