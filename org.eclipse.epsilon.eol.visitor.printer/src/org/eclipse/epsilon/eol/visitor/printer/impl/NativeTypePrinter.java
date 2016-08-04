package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.NativeType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.NativeTypeVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class NativeTypePrinter extends NativeTypeVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(NativeType nativeType, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "native(" + controller.visit(nativeType.getExpression(), context) + ")";
		return result;
	}

}
