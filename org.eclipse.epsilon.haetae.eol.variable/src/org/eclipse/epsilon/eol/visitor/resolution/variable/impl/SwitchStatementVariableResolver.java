package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SwitchStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class SwitchStatementVariableResolver extends SwitchStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(SwitchStatement switchStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//push to stack
		context.getStack().push(switchStatement, true);
		//visit the expression
		controller.visit(switchStatement.getExpression(), context);
		//visit the switch cases
		for(SwitchCaseStatement switchCase : switchStatement.getCases())
		{
			controller.visit(switchCase, context);
		}
		//visit the default
		if (switchStatement.getDefault() != null) {
			controller.visit(switchStatement.getDefault(), context);			
		}
		//pop from the frame
		context.getStack().pop(); 
		return null;
	}

}
