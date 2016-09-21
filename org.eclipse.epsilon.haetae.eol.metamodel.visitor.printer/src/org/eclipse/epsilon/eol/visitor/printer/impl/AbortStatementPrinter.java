package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.AbortStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.AbortStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class AbortStatementPrinter extends AbortStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(AbortStatement abortStatement, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {

		return "abort;";
	}

}
