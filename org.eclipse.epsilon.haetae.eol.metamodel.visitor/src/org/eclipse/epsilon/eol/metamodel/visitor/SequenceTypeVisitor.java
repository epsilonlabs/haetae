package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SequenceTypeVisitor<T, R> {
	
	public boolean appliesTo(SequenceType sequenceType, T context) {
		return true;
	}
	
	public abstract R visit (SequenceType sequenceType, T context, EolVisitorController<T, R> controller);
	
}
