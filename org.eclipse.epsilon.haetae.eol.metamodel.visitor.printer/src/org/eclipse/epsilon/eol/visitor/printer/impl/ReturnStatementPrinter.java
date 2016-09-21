package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ReturnStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ReturnStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ReturnStatementPrinter extends ReturnStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ReturnStatement returnStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += context.whitespace();
		result += "return";
		if (returnStatement.getExpression() != null) {
			result += " " + controller.visit(returnStatement.getExpression(), context);
		}
		result += ";";
		return result;
	}

}
