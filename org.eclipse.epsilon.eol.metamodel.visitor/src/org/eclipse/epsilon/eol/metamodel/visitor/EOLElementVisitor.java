package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class EOLElementVisitor<T, R> {
	
	public boolean appliesTo(EOLElement eOLElement, T context) {
		return true;
	}
	
	public abstract R visit (EOLElement eOLElement, T context, EolVisitorController<T, R> controller);
	
}
