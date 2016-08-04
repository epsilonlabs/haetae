package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.IntegerTypeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class IntegerTypePrinter extends IntegerTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(IntegerType integerType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		return "Integer";
	}

}
