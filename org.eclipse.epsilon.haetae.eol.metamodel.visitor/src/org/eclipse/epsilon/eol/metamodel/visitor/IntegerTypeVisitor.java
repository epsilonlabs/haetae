package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class IntegerTypeVisitor<T, R> {
	
	public boolean appliesTo(IntegerType integerType, T context) {
		return true;
	}
	
	public abstract R visit (IntegerType integerType, T context, EolVisitorController<T, R> controller);
	
}
