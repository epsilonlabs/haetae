package org.eclipse.epsilon.evl.visitor.resolution.type.impl;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.evl.metamodel.NamedBlock;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;
import org.eclipse.epsilon.evl.metamodel.visitor.NamedBlockVisitor;

public class NamedBlockTypeResolver extends NamedBlockVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(NamedBlock namedBlock, TypeResolutionContext context,
			EvlVisitorController<TypeResolutionContext, Object> controller) {
		Block body = namedBlock.getBody();
		if (body != null) {
			controller.visit(body, context);
		}
		return null;
	}

}
