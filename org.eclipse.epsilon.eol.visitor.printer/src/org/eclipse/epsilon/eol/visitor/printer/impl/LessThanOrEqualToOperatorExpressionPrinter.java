package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.LessThanOrEqualToOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.LessThanOrEqualToOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class LessThanOrEqualToOperatorExpressionPrinter extends LessThanOrEqualToOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(
			LessThanOrEqualToOperatorExpression lessThanOrEqualToOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(lessThanOrEqualToOperatorExpression.getLhs(), context);
		result += " <= ";
		result += controller.visit(lessThanOrEqualToOperatorExpression.getRhs(), context);
		
		if (lessThanOrEqualToOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
