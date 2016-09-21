package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.visitor.BooleanTypeVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class BooleanTypePrinter extends BooleanTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(BooleanType booleanType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		return "Boolean";
	}

}
