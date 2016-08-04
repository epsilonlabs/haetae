package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.ExecutableAnnotationStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ExecutableAnnotationStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class ExecutableAnnotationPrinter extends ExecutableAnnotationStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(ExecutableAnnotationStatement executableAnnotationStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "$" + controller.visit(executableAnnotationStatement.getName(), context) + " " + controller.visit(executableAnnotationStatement.getExpression(), context);
		return result;
	}

}
