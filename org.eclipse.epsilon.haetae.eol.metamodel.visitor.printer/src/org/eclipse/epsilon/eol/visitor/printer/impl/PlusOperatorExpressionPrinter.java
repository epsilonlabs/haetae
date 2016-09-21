package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.PlusOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.PlusOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class PlusOperatorExpressionPrinter extends PlusOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(PlusOperatorExpression plusOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(plusOperatorExpression.getLhs(), context);
		result += " + ";
		result += controller.visit(plusOperatorExpression.getRhs(), context);
		
		if (plusOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
