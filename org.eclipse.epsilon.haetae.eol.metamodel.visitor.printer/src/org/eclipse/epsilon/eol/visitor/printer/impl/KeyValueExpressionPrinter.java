package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.KeyValueExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.KeyValueExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class KeyValueExpressionPrinter extends KeyValueExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(KeyValueExpression keyValue, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(keyValue.getKey(), context) + " = " + controller.visit(keyValue.getValue(), context);
		if (keyValue.isInBrackets()) {
			result = "(" + result + ")";
		}
		return result;
	}

}
