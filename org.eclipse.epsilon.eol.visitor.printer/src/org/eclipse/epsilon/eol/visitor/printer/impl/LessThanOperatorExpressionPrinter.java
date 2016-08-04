package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.LessThanOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.LessThanOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class LessThanOperatorExpressionPrinter extends LessThanOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(LessThanOperatorExpression lessThanOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(lessThanOperatorExpression.getLhs(), context);
		result += " < ";
		result += controller.visit(lessThanOperatorExpression.getRhs(), context);
		
		if (lessThanOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
