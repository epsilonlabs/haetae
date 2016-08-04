package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.OrderedSetExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.OrderedSetExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class OrderedSetExpressionPrinter extends OrderedSetExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(OrderedSetExpression orderedSetExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "OrderedSet{";
		if (orderedSetExpression.getParameterList() != null) {
			result += controller.visit(orderedSetExpression.getParameterList(), context);
		}
		result += "}";
		
		if (orderedSetExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
