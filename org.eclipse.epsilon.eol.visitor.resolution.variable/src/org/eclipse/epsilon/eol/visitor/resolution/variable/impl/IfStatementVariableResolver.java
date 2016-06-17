package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.IfStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.IfStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class IfStatementVariableResolver extends IfStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(IfStatement ifStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//visit the condition first
		controller.visit(ifStatement.getCondition(), context);
		//put to stack
		context.getStack().push(ifStatement.getIfBody(), true);
		//visit the if branch
		controller.visit(ifStatement.getIfBody(), context);
		//pop from stack
		context.getStack().pop();
		
		for(ExpressionOrStatementBlock eosb: ifStatement.getElseIfBodies())
		{
			//push to stack
			context.getStack().push(eosb, true);
			//visit the else branch
			controller.visit(eosb, context);
			//pop from the stack
			context.getStack().pop();
		}
		
		//if there is an else body
		if (ifStatement.getElseBody() != null) {
			//push to stack
			context.getStack().push(ifStatement.getElseBody(), true);
			//visit the else branch
			controller.visit(ifStatement.getElseBody(), context);
			//pop from the stack
			context.getStack().pop();
		}
		return null;
	}

}
