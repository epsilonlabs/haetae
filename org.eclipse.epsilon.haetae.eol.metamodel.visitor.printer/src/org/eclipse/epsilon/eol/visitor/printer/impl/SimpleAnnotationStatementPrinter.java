package org.eclipse.epsilon.eol.visitor.printer.impl;

import java.util.Iterator;

import org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SimpleAnnotationStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class SimpleAnnotationStatementPrinter extends SimpleAnnotationStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(SimpleAnnotationStatement simpleAnnotationStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "@" + controller.visit(simpleAnnotationStatement.getName(), context);
		if (simpleAnnotationStatement.getValues() != null && simpleAnnotationStatement.getValues().size() != 0) {
			Iterator<StringExpression> iterator = simpleAnnotationStatement.getValues().iterator();
			while(iterator.hasNext())
			{
				result += controller.visit(iterator.next(), context);
				if (iterator.hasNext()) {
					result += " ";
				}
			}
		}
		return result;
	}

}
