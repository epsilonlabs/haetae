package org.eclipse.epsilon.etl.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.etl.metamodel.NamedBlock;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;
import org.eclipse.epsilon.etl.metamodel.visitor.NamedBlockVisitor;

public class NamedBlockVariableResolver extends NamedBlockVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(NamedBlock namedBlock,
			VariableResolutionContext context,
			EtlVisitorController<VariableResolutionContext, Object> controller) {
		if (namedBlock.getName() != null) {
			controller.visit(namedBlock.getName(), context);	
		}
		if (namedBlock.getBody() != null) {
			controller.visit(namedBlock.getBody(), context);	
		}
		
		return null;
	}

}
