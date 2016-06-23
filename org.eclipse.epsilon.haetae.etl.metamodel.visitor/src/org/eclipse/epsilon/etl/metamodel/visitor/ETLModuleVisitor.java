package org.eclipse.epsilon.etl.metamodel.visitor;

import org.eclipse.epsilon.etl.metamodel.*;

public abstract class ETLModuleVisitor<T, R> {
	
	public boolean appliesTo(ETLModule eTLModule, T context) {
		return true;
	}
	
	public abstract R visit (ETLModule eTLModule, T context, EtlVisitorController<T, R> controller);
	
}
