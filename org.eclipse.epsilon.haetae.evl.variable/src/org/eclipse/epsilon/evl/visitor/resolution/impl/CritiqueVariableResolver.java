package org.eclipse.epsilon.evl.visitor.resolution.impl;

import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Critique;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.metamodel.visitor.CritiqueVisitor;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;

public class CritiqueVariableResolver extends CritiqueVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(Critique critique, VariableResolutionContext context,
			EvlVisitorController<VariableResolutionContext, Object> controller) {

		context.getStack().push(critique, true);

		ExpressionOrStatementBlock guard = critique.getGuard();
		if (guard != null) {
			controller.visit(guard, context);
		}
		
		ExpressionOrStatementBlock check = critique.getCheck();
		if (check != null) {
			controller.visit(check, context);
		}
		
		ExpressionOrStatementBlock message = critique.getMessage();
		if (message != null) {
			controller.visit(message, context);
		}
		
		if (critique.getFixes() != null) {
			for(Fix fix: critique.getFixes())
			{
				controller.visit(fix, context);
			}
		}
		
		context.getStack().pop();
		
		return null;
	}

}
