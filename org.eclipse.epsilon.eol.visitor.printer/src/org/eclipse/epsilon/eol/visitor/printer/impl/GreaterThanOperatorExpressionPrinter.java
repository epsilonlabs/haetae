package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.GreaterThanOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class GreaterThanOperatorExpressionPrinter extends GreaterThanOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(
			GreaterThanOperatorExpression greaterThanOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(greaterThanOperatorExpression.getLhs(), context);
		result += " > ";
		result += controller.visit(greaterThanOperatorExpression.getRhs(), context);
		
		if (greaterThanOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
