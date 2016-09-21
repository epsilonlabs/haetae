package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.MultiplyOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MultiplyOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class MultiplyOperatorExpressionPrinter extends MultiplyOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(MultiplyOperatorExpression multiplyOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(multiplyOperatorExpression.getLhs(), context);
		result += " * ";
		result += controller.visit(multiplyOperatorExpression.getRhs(), context);
		
		if (multiplyOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
