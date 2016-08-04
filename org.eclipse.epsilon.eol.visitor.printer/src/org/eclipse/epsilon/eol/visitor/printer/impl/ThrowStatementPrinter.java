package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ThrowStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ThrowStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ThrowStatementPrinter extends ThrowStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ThrowStatement throwStatement, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "throw";
		if (throwStatement.getExpression() != null) {
			result += " " + controller.visit(throwStatement.getExpression(), context); 
		}
		result += ";";
		return result;	
	}

}
