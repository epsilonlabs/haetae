package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.AbortStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.TransactionStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.AbortStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_VariableResolution;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class AbortStatementVariableResolver extends AbortStatementVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(AbortStatement abortStatement,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		EOLElement trace = abortStatement.getContainer();
		while(trace != null && !(trace instanceof TransactionStatement))
		{
			trace = trace.getContainer();
		}
		if (trace == null || !(trace instanceof TransactionStatement)) {
			LogBook.getInstance().addError(abortStatement, IMessage_VariableResolution.ABORT_MUST_IN_TRANSACTION);
		}
		return null;
	}

}
