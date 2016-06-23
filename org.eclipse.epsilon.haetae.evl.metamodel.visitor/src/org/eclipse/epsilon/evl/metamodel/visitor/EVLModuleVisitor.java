package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class EVLModuleVisitor<T, R> {
	
	public boolean appliesTo(EVLModule eVLModule, T context) {
		return true;
	}
	
	public abstract R visit (EVLModule eVLModule, T context, EvlVisitorController<T, R> controller);
	
}
