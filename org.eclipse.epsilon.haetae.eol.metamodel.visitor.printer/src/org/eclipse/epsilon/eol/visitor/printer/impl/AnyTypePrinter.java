package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.visitor.AnyTypeVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class AnyTypePrinter extends AnyTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(AnyType anyType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		
		return anyType.isDeclared() ? "Any" : "";
	}

}
