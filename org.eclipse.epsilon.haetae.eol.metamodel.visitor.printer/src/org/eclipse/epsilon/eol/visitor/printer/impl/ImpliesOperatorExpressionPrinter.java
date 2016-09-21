package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ImpliesOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ImpliesOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ImpliesOperatorExpressionPrinter extends ImpliesOperatorExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ImpliesOperatorExpression impliesOperatorExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		result += controller.visit(impliesOperatorExpression.getLhs(), context);
		result += " imlpies ";
		result += controller.visit(impliesOperatorExpression.getRhs(), context);
		
		if (impliesOperatorExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
