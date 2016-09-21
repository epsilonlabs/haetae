package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.SwitchCaseDefaultStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SwitchCaseDefaultStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class SwitchCaseDefaultStatementPrinter extends SwitchCaseDefaultStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(SwitchCaseDefaultStatement switchCaseDefaultStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "default :" + context.newline();
		context.indent();
		result += switchCaseDefaultStatement.getBody();
		context.outdent();
		return result;
	}

}
