package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.WhileStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class WhileStatementVariableResolver extends WhileStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(WhileStatement whileStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//push to stack
		context.getStack().push(whileStatement, true);
		//visit the condition
		controller.visit(whileStatement.getCondition(), context);
		//visit the body
		controller.visit(whileStatement.getBody(),context);
		//pop from stack
		context.getStack().pop();
		return null;
	}

}
