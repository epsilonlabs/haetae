package org.eclipse.epsilon.etl.visitor.resolution.type.impl;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.etl.metamodel.NamedBlock;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;
import org.eclipse.epsilon.etl.metamodel.visitor.NamedBlockVisitor;

public class NamedBlockTypeResolver extends NamedBlockVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(NamedBlock namedBlock, TypeResolutionContext context,
			EtlVisitorController<TypeResolutionContext, Object> controller) {
		// TODO Auto-generated method stub
		Block body = namedBlock.getBody();
		if (body != null) {
			controller.visit(body, context);
		}
		return null;
	}

}
