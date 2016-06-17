package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SwitchCaseExpressionStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class SwitchCaseExpressionStatementVariableResolver extends SwitchCaseExpressionStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(
			SwitchCaseExpressionStatement switchCaseExpressionStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//push to stack
		context.getStack().push(switchCaseExpressionStatement, true);
		//visit the expression
		controller.visit(switchCaseExpressionStatement.getExpression(), context);
		//visit the body
		controller.visit(switchCaseExpressionStatement.getBody(), context);
		//pop from stack
		context.getStack().pop();
		
		return null;
	}

}
