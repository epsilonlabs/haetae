package org.eclipse.epsilon.evl.visitor.resolution.impl;

import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.evl.metamodel.NamedBlock;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;
import org.eclipse.epsilon.evl.metamodel.visitor.NamedBlockVisitor;

public class NamedBlockVariableResolver extends NamedBlockVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(NamedBlock namedBlock,
			VariableResolutionContext context,
			EvlVisitorController<VariableResolutionContext, Object> controller) {
		controller.visit(namedBlock.getName(), context);
		controller.visit(namedBlock.getBody(), context);
		return null;
	}

}
