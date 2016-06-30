package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class StringTypeVisitor<T, R> {
	
	public boolean appliesTo(StringType stringType, T context) {
		return true;
	}
	
	public abstract R visit (StringType stringType, T context, EolVisitorController<T, R> controller);
	
}
