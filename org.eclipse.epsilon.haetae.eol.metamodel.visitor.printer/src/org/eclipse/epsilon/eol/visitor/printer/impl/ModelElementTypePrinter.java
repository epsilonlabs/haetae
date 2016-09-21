package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ModelElementTypeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ModelElementTypePrinter extends ModelElementTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ModelElementType modelElementType,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if(modelElementType.getModelName() != null)
		{
			result = modelElementType.getModelName() + "!" + modelElementType.getElementName();
		}
		else {
			result = modelElementType.getElementName();
		}
		return result;
	}

}
