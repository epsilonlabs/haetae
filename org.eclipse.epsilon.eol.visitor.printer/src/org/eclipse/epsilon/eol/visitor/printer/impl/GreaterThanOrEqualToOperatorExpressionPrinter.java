package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.GreaterThanOrEqualToOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.GreaterThanOrEqualToOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class GreaterThanOrEqualToOperatorExpressionPrinter extends GreaterThanOrEqualToOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(
			GreaterThanOrEqualToOperatorExpression greaterThanOrEqualToOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(greaterThanOrEqualToOperatorExpression.getLhs(), context);
		result += " >= ";
		result += controller.visit(greaterThanOrEqualToOperatorExpression.getRhs(), context);
		
		if (greaterThanOrEqualToOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
