package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.BooleanExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.BooleanExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class BooleanExpressionPrinter extends BooleanExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(BooleanExpression booleanExpression,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (booleanExpression.isInBrackets()) {
			result += "(";
			result += booleanExpression.isValue();
			result += ")";
		}
		else {
			result += booleanExpression.isValue();	
		}
		return result;
	}

}
