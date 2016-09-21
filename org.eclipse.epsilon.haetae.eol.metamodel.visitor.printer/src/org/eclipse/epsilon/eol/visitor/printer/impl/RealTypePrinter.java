package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.RealTypeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class RealTypePrinter extends RealTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(RealType realType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		
		return "Real";
	}

}
