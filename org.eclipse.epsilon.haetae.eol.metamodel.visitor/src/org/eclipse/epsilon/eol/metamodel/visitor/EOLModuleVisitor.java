package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class EOLModuleVisitor<T, R> {
	
	public boolean appliesTo(EOLModule eOLModule, T context) {
		return true;
	}
	
	public abstract R visit (EOLModule eOLModule, T context, EolVisitorController<T, R> controller);
	
}
