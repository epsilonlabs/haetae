package org.eclipse.epsilon.etl.metamodel.visitor;

import org.eclipse.emf.ecore.EObject;

public class EtlDefaultVisitor<T, R> {
	
	public boolean appliesTo (EObject o, T context) {
		return true;
	}
	
	public R visit (EObject o, T context, EtlVisitorController<T, R> controller) {
		
		for (EObject content : o.eContents()) {
			controller.visit(content, context);
		}
		
		return null;
	}
	
}
