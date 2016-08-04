package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.StringTypeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class StringTypePrinter extends StringTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(StringType stringType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		
		return "String";
	}

}
