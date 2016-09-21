package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.NameExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class NameExpressionPrinter extends NameExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(NameExpression nameExpression, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = nameExpression.getName();
		if (nameExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		return result;
	}

}
