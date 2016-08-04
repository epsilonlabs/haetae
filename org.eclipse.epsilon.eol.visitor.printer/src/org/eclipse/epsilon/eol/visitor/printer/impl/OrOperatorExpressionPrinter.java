package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.OrOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.OrOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class OrOperatorExpressionPrinter extends OrOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(OrOperatorExpression orOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(orOperatorExpression.getLhs(), context);
		result += " or ";
		result += controller.visit(orOperatorExpression.getRhs(), context);
		
		if (orOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
