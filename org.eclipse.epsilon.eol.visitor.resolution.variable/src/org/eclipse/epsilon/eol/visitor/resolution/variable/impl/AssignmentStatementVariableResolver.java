package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.AssignmentStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class AssignmentStatementVariableResolver extends AssignmentStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(AssignmentStatement assignmentStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		controller.visit(assignmentStatement.getRhs(), context);
		controller.visit(assignmentStatement.getLhs(), context);
		return null;
	}

}
