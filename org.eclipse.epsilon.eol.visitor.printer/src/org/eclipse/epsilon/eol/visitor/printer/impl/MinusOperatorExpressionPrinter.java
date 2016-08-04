package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.MinusOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MinusOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class MinusOperatorExpressionPrinter extends MinusOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(MinusOperatorExpression minusOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(minusOperatorExpression.getLhs(), context);
		result += " - ";
		result += controller.visit(minusOperatorExpression.getRhs(), context);
		
		if (minusOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
