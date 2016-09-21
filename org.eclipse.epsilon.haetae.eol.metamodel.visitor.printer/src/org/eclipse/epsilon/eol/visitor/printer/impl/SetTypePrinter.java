package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.SetType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SetTypeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class SetTypePrinter extends SetTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(SetType setType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (setType.getContentType() == null) {
			result = "Set";
		}
		else {
			result += "Set(" + controller.visit(setType.getContentType(), context) + ")";
		}
		return result;
	}

}
