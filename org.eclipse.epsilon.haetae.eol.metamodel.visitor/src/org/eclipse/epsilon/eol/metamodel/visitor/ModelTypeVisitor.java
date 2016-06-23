package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ModelTypeVisitor<T, R> {
	
	public boolean appliesTo(ModelType modelType, T context) {
		return true;
	}
	
	public abstract R visit (ModelType modelType, T context, EolVisitorController<T, R> controller);
	
}
