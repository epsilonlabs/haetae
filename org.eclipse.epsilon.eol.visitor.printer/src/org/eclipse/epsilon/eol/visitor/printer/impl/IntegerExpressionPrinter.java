package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.IntegerExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class IntegerExpressionPrinter extends IntegerExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(IntegerExpression integerExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		if (integerExpression.isInBrackets()) {
			return "(" + integerExpression.getValue() + ")";
		}
		return integerExpression.getValue() + "";
	}

}
