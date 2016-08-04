package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.SequenceExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SequenceExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class SequenceExpressionPrinter extends SequenceExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(SequenceExpression sequenceExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "Sequence{";
		if (sequenceExpression.getParameterList() != null) {
			result += controller.visit(sequenceExpression.getParameterList(), context);
		}
		result += "}";
		
		if (sequenceExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
