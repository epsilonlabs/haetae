package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ExpressionRange;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ExpressionRangeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ExpressionRangePrinter extends ExpressionRangeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ExpressionRange expressionRange, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (expressionRange.isInBrackets()) {
			result += "(";
			result += controller.visit(expressionRange.getStart(), context) + ".." + controller.visit(expressionRange.getEnd(), context);
			result += ")";
		}
		else {
			result += controller.visit(expressionRange.getStart(), context) + ".." + controller.visit(expressionRange.getEnd(), context);
		}
		return result;
	}

}
