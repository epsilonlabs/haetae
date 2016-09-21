package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.WhileStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.WhileStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class WhileStatementPrinter extends WhileStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(WhileStatement whileStatement, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "while (" + controller.visit(whileStatement.getCondition(), context) + ") {" + context.newline(); 
		context.indent();
		result += controller.visit(whileStatement.getBody(), context);
		context.outdent();
		result += context.newline() + context.whitespace() + "}";
		return result;
	}

}
