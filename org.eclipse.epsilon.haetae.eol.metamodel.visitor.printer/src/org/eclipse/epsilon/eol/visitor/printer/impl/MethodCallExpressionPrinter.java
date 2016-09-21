package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MethodCallExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class MethodCallExpressionPrinter extends MethodCallExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(MethodCallExpression methodCallExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if(methodCallExpression.getTarget() != null)
		{
			result += controller.visit(methodCallExpression.getTarget(), context);
			result += methodCallExpression.isArrow() ? "->" : ".";
		}
		result += controller.visit(methodCallExpression.getMethod(), context) + "(";
		
		if(methodCallExpression.getArguments().size() != 0)
		{
			result += controller.visit(methodCallExpression.getArguments().get(0), context);
			for(int i = 1; i < methodCallExpression.getArguments().size(); i ++)
			{
				result += ", " + controller.visit(methodCallExpression.getArguments().get(i), context);
			}
			result += ")";
		}
		else {
			result += ")";
		}
		
		if (methodCallExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
