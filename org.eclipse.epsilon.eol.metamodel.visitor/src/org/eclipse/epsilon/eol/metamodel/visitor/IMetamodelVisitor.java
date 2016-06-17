package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class IMetamodelVisitor<T, R> {
	
	public boolean appliesTo(IMetamodel iMetamodel, T context) {
		return true;
	}
	
	public abstract R visit (IMetamodel iMetamodel, T context, EolVisitorController<T, R> controller);
	
}
