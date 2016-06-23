package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class TextRegionVisitor<T, R> {
	
	public boolean appliesTo(TextRegion textRegion, T context) {
		return true;
	}
	
	public abstract R visit (TextRegion textRegion, T context, EolVisitorController<T, R> controller);
	
}
