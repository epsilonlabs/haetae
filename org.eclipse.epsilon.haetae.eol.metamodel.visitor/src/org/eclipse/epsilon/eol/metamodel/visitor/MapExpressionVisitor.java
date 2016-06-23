package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class MapExpressionVisitor<T, R> {
	
	public boolean appliesTo(MapExpression mapExpression, T context) {
		return true;
	}
	
	public abstract R visit (MapExpression mapExpression, T context, EolVisitorController<T, R> controller);
	
}
