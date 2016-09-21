package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ContinueStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.ContinueStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ContinueStatementPrinter extends ContinueStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ContinueStatement continueStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += context.whitespace();
		result += "continue;";
		return result;
	}

}
