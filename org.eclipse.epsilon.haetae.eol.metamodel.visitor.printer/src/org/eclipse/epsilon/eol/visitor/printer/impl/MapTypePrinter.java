package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.MapType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MapTypeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class MapTypePrinter extends MapTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(MapType mapType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		return "Map";
	}

}
