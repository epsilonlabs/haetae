package org.eclipse.epsilon.etl.metamodel.visitor;

import org.eclipse.epsilon.etl.metamodel.*;

public abstract class NamedBlockVisitor<T, R> {
	
	public boolean appliesTo(NamedBlock namedBlock, T context) {
		return true;
	}
	
	public abstract R visit (NamedBlock namedBlock, T context, EtlVisitorController<T, R> controller);
	
}
