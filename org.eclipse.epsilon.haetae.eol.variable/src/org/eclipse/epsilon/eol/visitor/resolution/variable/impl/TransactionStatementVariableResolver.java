package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.TransactionStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.TransactionStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class TransactionStatementVariableResolver extends TransactionStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(TransactionStatement transactionStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		
		//visit the transaction name(s)
		for(NameExpression ne: transactionStatement.getNames())
		{
			controller.visit(ne, context);
		}
		//push to stack
		context.getStack().push(transactionStatement, true);
		//visit the body
		controller.visit(transactionStatement.getBody(), context);
		//pop from stack
		context.getStack().pop();
		
		return null;
	}

}
