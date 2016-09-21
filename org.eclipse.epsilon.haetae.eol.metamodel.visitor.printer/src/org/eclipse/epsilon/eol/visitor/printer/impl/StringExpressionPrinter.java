package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.StringExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class StringExpressionPrinter extends StringExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(StringExpression stringExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		
		
		String result = "\'" + stringExpression.getValue() + "\'";
		
		if (stringExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
