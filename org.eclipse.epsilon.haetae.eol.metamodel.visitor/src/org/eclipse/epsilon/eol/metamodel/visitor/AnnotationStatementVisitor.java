package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class AnnotationStatementVisitor<T, R> {
	
	public boolean appliesTo(AnnotationStatement annotationStatement, T context) {
		return true;
	}
	
	public abstract R visit (AnnotationStatement annotationStatement, T context, EolVisitorController<T, R> controller);
	
}
