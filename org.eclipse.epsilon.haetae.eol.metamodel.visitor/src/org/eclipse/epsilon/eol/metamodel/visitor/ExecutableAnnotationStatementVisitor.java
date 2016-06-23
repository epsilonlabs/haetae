package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class ExecutableAnnotationStatementVisitor<T, R> {
	
	public boolean appliesTo(ExecutableAnnotationStatement executableAnnotationStatement, T context) {
		return true;
	}
	
	public abstract R visit (ExecutableAnnotationStatement executableAnnotationStatement, T context, EolVisitorController<T, R> controller);
	
}
