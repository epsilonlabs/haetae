package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.XorOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.XorOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class XorOperatorExpressionPrinter extends XorOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(XorOperatorExpression xorOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(xorOperatorExpression.getLhs(), context);
		result += " xor ";
		result += controller.visit(xorOperatorExpression.getRhs(), context);
		
		if (xorOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
