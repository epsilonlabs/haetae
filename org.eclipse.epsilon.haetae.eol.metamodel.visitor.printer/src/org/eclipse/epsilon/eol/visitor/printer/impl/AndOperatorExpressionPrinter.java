package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.AndOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.AndOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class AndOperatorExpressionPrinter extends AndOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(AndOperatorExpression andOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {

		String result = "";
		result += controller.visit(andOperatorExpression.getLhs(), context);	
		result += " and ";
		result += controller.visit(andOperatorExpression.getRhs(), context);
		
		if (andOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		return result;
	}

}
