package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.BagType;
import org.eclipse.epsilon.eol.metamodel.visitor.BagTypeVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class BagTypePrinter extends BagTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(BagType bagType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (bagType.getContentType() == null) {
			result = "Bag";
		}
		else {
			result += "Bag(" + controller.visit(bagType.getContentType(), context) + ")";
		}
		return result;
	}

}
