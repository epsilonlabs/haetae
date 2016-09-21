package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ModelDeclarationParameter;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ModelDeclarationParameterVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ModelDeclarationParameterPrinter extends ModelDeclarationParameterVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ModelDeclarationParameter modelDeclarationParameter,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = controller.visit(modelDeclarationParameter.getKey(), context) + " = " + controller.visit(modelDeclarationParameter.getValue(), context); 
		return result;
	}


}
