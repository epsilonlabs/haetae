package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class SimpleAnnotationStatementVisitor<T, R> {
	
	public boolean appliesTo(SimpleAnnotationStatement simpleAnnotationStatement, T context) {
		return true;
	}
	
	public abstract R visit (SimpleAnnotationStatement simpleAnnotationStatement, T context, EolVisitorController<T, R> controller);
	
}
