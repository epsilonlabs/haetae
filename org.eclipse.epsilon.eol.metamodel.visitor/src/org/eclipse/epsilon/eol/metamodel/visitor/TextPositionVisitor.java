package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class TextPositionVisitor<T, R> {
	
	public boolean appliesTo(TextPosition textPosition, T context) {
		return true;
	}
	
	public abstract R visit (TextPosition textPosition, T context, EolVisitorController<T, R> controller);
	
}
