package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class IPackageVisitor<T, R> {
	
	public boolean appliesTo(IPackage iPackage, T context) {
		return true;
	}
	
	public abstract R visit (IPackage iPackage, T context, EolVisitorController<T, R> controller);
	
}
