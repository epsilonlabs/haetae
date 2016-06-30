package org.eclipse.epsilon.etl.metamodel.visitor;

import org.eclipse.epsilon.etl.metamodel.*;

public abstract class TransformationRuleVisitor<T, R> {
	
	public boolean appliesTo(TransformationRule transformationRule, T context) {
		return true;
	}
	
	public abstract R visit (TransformationRule transformationRule, T context, EtlVisitorController<T, R> controller);
	
}
