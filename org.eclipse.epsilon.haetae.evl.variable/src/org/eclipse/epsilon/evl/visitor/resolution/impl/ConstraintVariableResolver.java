package org.eclipse.epsilon.evl.visitor.resolution.impl;

import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Constraint;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.metamodel.visitor.ConstraintVisitor;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;

public class ConstraintVariableResolver extends ConstraintVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(Constraint constraint,
			VariableResolutionContext context,
			EvlVisitorController<VariableResolutionContext, Object> controller) {
		// TODO Auto-generated method stub
		context.getStack().push(constraint, true);

		ExpressionOrStatementBlock guard = constraint.getGuard();
		if (guard != null) {
			controller.visit(guard, context);
		}
		
		ExpressionOrStatementBlock check = constraint.getCheck();
		if (check != null) {
			controller.visit(check, context);
		}
		
		ExpressionOrStatementBlock message = constraint.getMessage();
		if (message != null) {
			controller.visit(message, context);
		}
		
		if (constraint.getFixes() != null) {
			for(Fix fix: constraint.getFixes())
			{
				controller.visit(fix, context);
			}
		}
		
		context.getStack().pop();
		return null;
	}

}
