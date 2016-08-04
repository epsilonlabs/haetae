package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ExpressionStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ExpressionStatementPrinter extends ExpressionStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ExpressionStatement expressionStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += context.whitespace();
		result += controller.visit(expressionStatement.getExpression(), context);
		result += ";";
		return result;
	}

}
