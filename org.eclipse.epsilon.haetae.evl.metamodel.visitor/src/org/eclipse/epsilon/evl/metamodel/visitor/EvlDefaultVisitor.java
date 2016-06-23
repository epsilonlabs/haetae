package org.eclipse.epsilon.evl.metamodel.visitor;

import org.eclipse.emf.ecore.EObject;

public class EvlDefaultVisitor<T, R> {
	
	public boolean appliesTo (EObject o, T context) {
		return true;
	}
	
	public R visit (EObject o, T context, EvlVisitorController<T, R> controller) {
		
		for (EObject content : o.eContents()) {
			controller.visit(content, context);
		}
		
		return null;
	}
	
}
