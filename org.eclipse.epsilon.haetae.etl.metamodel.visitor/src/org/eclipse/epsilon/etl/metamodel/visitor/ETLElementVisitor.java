package org.eclipse.epsilon.etl.metamodel.visitor;

import org.eclipse.epsilon.etl.metamodel.*;

public abstract class ETLElementVisitor<T, R> {
	
	public boolean appliesTo(ETLElement eTLElement, T context) {
		return true;
	}
	
	public abstract R visit (ETLElement eTLElement, T context, EtlVisitorController<T, R> controller);
	
}
