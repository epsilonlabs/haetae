package org.eclipse.epsilon.evl.visitor.resolution.impl;

import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.metamodel.visitor.ContextVisitor;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;

public class ContextVariableResolver extends ContextVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(Context _context, VariableResolutionContext context,
			EvlVisitorController<VariableResolutionContext, Object> controller) {
		
		context.getStack().push(_context, true);
		context.getStack().putVariable(_context.getSelf(), false); //put self on the stack
		
		ExpressionOrStatementBlock guard = _context.getGuard();
		if (guard != null) {
			controller.visit(guard, context);
		}
		
		for(Invariant inv: _context.getInvariants())
		{
			controller.visit(inv, context);
		}
		
		context.getStack().pop();
		
		
		return null;
	}

}
