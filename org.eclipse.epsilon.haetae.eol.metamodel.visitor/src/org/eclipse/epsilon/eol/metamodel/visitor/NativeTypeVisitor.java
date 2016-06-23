package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class NativeTypeVisitor<T, R> {
	
	public boolean appliesTo(NativeType nativeType, T context) {
		return true;
	}
	
	public abstract R visit (NativeType nativeType, T context, EolVisitorController<T, R> controller);
	
}
