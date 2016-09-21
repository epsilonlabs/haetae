package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.AnnotationBlock;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.visitor.AnnotationBlockVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class AnnotationBlockPrinter extends AnnotationBlockVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(AnnotationBlock annotationBlock,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (annotationBlock.getStatements() != null) {
			for(Statement sa : annotationBlock.getStatements())
			{
				result += controller.visit(sa, context);
			}
		}
		return result;
	}

}
