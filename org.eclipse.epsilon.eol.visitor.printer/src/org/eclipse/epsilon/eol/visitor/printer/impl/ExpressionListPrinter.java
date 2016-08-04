package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ExpressionList;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ExpressionListVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ExpressionListPrinter extends ExpressionListVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ExpressionList expressionList, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (expressionList.isInBrackets()) {
			result += "(";
			if (expressionList.getExpressions().size() > 0) {
				result += controller.visit(expressionList.getExpressions().get(0), context);
				for(int i = 1; i < expressionList.getExpressions().size(); i++)
				{
					result += "," + controller.visit(expressionList.getExpressions().get(i), context);
				}

			}
			result += ")";
		}
		else {
			if (expressionList.getExpressions().size() > 0) {
				result += controller.visit(expressionList.getExpressions().get(0), context);
				for(int i = 1; i < expressionList.getExpressions().size(); i++)
				{
					result += "," + controller.visit(expressionList.getExpressions().get(i), context);
				}
			}
		}
		return result;
	}

}
