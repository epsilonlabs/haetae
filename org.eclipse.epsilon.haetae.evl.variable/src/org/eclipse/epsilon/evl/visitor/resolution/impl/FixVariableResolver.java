package org.eclipse.epsilon.evl.visitor.resolution.impl;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;
import org.eclipse.epsilon.evl.metamodel.visitor.FixVisitor;

public class FixVariableResolver extends FixVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(Fix fix, VariableResolutionContext context,
			EvlVisitorController<VariableResolutionContext, Object> controller) {
		context.getStack().push(fix, true);
		ExpressionOrStatementBlock title = fix.getTitle();
		if (title != null) {
			controller.visit(title, context);
		}
		
		Block theFix = fix.getDo();
		if (theFix != null) {
			controller.visit(theFix, context);
		}
		
		context.getStack().pop();
		
		return null;
	}

}
