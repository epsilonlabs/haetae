package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.epsilon.evl.metamodel.*;

public abstract class CritiqueVisitor<T, R> {
	
	public boolean appliesTo(Critique critique, T context) {
		return true;
	}
	
	public abstract R visit (Critique critique, T context, EvlVisitorController<T, R> controller);
	
}
