package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.NegativeOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.NegativeOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class NegativeOperatorExpressionPrinter extends NegativeOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(NegativeOperatorExpression negativeOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "-" + controller.visit(negativeOperatorExpression.getExpression(), context);
		if (negativeOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		return result;
	}

}
