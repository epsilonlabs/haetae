package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ModelElementTypeVisitor<T, R> {
	
	public boolean appliesTo(ModelElementType modelElementType, T context) {
		return true;
	}
	
	public abstract R visit (ModelElementType modelElementType, T context, EolVisitorController<T, R> controller);
	
}
