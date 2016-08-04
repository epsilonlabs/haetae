package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.BreakAllStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.BreakAllStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class BreakAllStatementPrinter extends BreakAllStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(BreakAllStatement breakAllStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += context.whitespace();
		result += "breakAll;";
		return result;
	}

}
