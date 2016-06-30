package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SwitchCaseDefaultStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class SwitchCaseDefaultStatementVariableResolver extends SwitchCaseDefaultStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(SwitchCaseDefaultStatement switchCaseDefaultStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		
		//push to stack
		context.getStack().push(switchCaseDefaultStatement, true);
		//visit the body
		controller.visit(switchCaseDefaultStatement.getBody(), context);
		//pop from stack
		context.getStack().pop();
		
		return null;
	}
}
