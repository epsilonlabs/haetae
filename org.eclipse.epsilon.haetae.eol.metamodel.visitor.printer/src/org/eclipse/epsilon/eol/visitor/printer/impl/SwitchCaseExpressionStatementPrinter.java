package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SwitchCaseExpressionStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class SwitchCaseExpressionStatementPrinter extends SwitchCaseExpressionStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(
			SwitchCaseExpressionStatement switchCaseExpressionStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "case " + controller.visit(switchCaseExpressionStatement.getExpression(), context) + ":"; 
		result += context.newline();
		context.indent();
		result += controller.visit(switchCaseExpressionStatement.getBody(), context);
		context.outdent();
		return result;
	}

}
