package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.NotEqualsOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class NotEqualsOperatorExpressionPrinter extends NotEqualsOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(
			NotEqualsOperatorExpression notEqualsOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(notEqualsOperatorExpression.getLhs(), context);
		result += " <> ";
		result += controller.visit(notEqualsOperatorExpression.getRhs(), context);
		
		if (notEqualsOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
