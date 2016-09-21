package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.NewExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.NewExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class NewExpressionPrinter extends NewExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(NewExpression newExpression, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "new ";
		result += controller.visit(newExpression.getResolvedType(), context);
		
		if(newExpression.getParameters() != null && newExpression.getParameters().size() != 0)
		{
			result += "("+  controller.visit(newExpression.getParameters().get(0), context);
			for(int i = 1; i < newExpression.getParameters().size(); i++)
			{
				result += ", " + controller.visit(newExpression.getParameters().get(i), context);
			}
		result += ")";
		}
		
		if (newExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}
}
