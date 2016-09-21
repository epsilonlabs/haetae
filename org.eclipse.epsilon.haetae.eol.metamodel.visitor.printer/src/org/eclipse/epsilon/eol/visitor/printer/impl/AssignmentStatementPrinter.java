package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.AssignmentStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class AssignmentStatementPrinter extends AssignmentStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(AssignmentStatement assignmentStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += context.whitespace();
		result += controller.visit(assignmentStatement.getLhs(), context);
		result += " = ";
		result += controller.visit(assignmentStatement.getRhs(), context);
		result += ";";
		return result;
	}

}
