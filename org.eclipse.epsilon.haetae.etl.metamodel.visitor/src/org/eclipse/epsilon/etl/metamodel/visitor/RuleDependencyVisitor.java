package org.eclipse.epsilon.etl.metamodel.visitor;

import org.eclipse.epsilon.etl.metamodel.*;

public abstract class RuleDependencyVisitor<T, R> {
	
	public boolean appliesTo(RuleDependency ruleDependency, T context) {
		return true;
	}
	
	public abstract R visit (RuleDependency ruleDependency, T context, EtlVisitorController<T, R> controller);
	
}
