package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.SetExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SetExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class SetExpressionPrinter extends SetExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(SetExpression setExpression, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "Set{";
		if (setExpression.getParameterList() != null) {
			result += controller.visit(setExpression.getParameterList(), context);
		}
		result += "}";
		
		if (setExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
