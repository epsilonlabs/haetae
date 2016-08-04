package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.DeleteStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.DeleteStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class DeleteStatementPrinter extends DeleteStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(DeleteStatement deleteStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += context.whitespace();
		result += "delete";
		if (deleteStatement.getExpression() != null) {
			result += " " + controller.visit(deleteStatement.getExpression(), context);
		}
		result += ";";
		
		return result;
	}

}
