package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class EOLLibraryModuleVisitor<T, R> {
	
	public boolean appliesTo(EOLLibraryModule eOLLibraryModule, T context) {
		return true;
	}
	
	public abstract R visit (EOLLibraryModule eOLLibraryModule, T context, EolVisitorController<T, R> controller);
	
}
