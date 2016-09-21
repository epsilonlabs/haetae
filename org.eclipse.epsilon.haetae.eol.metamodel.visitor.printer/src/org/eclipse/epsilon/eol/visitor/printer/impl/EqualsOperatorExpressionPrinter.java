package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.EqualsOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class EqualsOperatorExpressionPrinter extends EqualsOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(EqualsOperatorExpression equalsOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(equalsOperatorExpression.getLhs(), context);
		result += "=";
		result += controller.visit(equalsOperatorExpression.getRhs(), context);
		
		if (equalsOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
