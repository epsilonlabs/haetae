package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.FOLMethodCallExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class FOLMethodCallExpressionPrinter extends FOLMethodCallExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(FOLMethodCallExpression fOLMethodCallExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if(fOLMethodCallExpression.getTarget() != null)
		{
			result += controller.visit(fOLMethodCallExpression.getTarget(), context);
			result += fOLMethodCallExpression.isArrow() ? "->" : ".";
		}
		result += controller.visit(fOLMethodCallExpression.getMethod(), context);
		result += "(" + controller.visit(fOLMethodCallExpression.getIterator(), context) + "|";
		if (fOLMethodCallExpression.getConditions().size() == 1) {
			result += controller.visit(fOLMethodCallExpression.getConditions().get(0), context) + ")";
		}
		else {
			result += controller.visit(fOLMethodCallExpression.getConditions().get(0), context) + ",";
			result += controller.visit(fOLMethodCallExpression.getConditions().get(1), context) + ")";
		}
		
		if (fOLMethodCallExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
