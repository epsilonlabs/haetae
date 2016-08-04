package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.BreakStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.BreakStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class BreakStatementPrinter extends BreakStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(BreakStatement breakStatement, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {

		String result = "";
		result += context.whitespace();
		result += "break;";
		return result;
	}

}
