package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.ForStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ForStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class ForStatementVariableResolver extends ForStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(ForStatement forStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
 
		
		//push to stack
		context.getStack().push(forStatement, true);
		//visit the iterator
		controller.visit(forStatement.getIterator(), context);
		//visit the iterated
		controller.visit(forStatement.getCondition(), context);
		//visit the body
		controller.visit(forStatement.getBody(), context);
		//pop from stack
		context.getStack().pop();
		return null;
	}

}
