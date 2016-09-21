package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.DivideOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.DivideOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class DivideOperatorExpressionPrinter extends DivideOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(DivideOperatorExpression divideOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(divideOperatorExpression.getLhs(), context);
		result += " / ";
		result += controller.visit(divideOperatorExpression.getRhs(), context);
		
		if (divideOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		return result;
	}

}
