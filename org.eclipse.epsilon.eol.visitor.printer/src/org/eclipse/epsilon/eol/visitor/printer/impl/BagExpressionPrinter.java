package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.BagExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.BagExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class BagExpressionPrinter extends BagExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(BagExpression bagExpression, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (bagExpression.isInBrackets()) {
			result += "(Bag{";
			if (bagExpression.getParameterList() != null) {
				result += controller.visit(bagExpression.getParameterList(), context);
			}
			result += "})";
		}
		else {
			result += "Bag{";
			if (bagExpression.getParameterList() != null) {
				result += controller.visit(bagExpression.getParameterList(), context);
			}
			result += "}";
		}
		return result;
	}

}
