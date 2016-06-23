package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class AnnotationBlockVisitor<T, R> {
	
	public boolean appliesTo(AnnotationBlock annotationBlock, T context) {
		return true;
	}
	
	public abstract R visit (AnnotationBlock annotationBlock, T context, EolVisitorController<T, R> controller);
	
}
