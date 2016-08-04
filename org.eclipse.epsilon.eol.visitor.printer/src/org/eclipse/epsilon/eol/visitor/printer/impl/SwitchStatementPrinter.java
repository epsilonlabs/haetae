package org.eclipse.epsilon.eol.visitor.printer.impl;

import java.util.Iterator;

import org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.SwitchStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SwitchStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class SwitchStatementPrinter extends SwitchStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(SwitchStatement switchStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		
		String result = "switch (" + controller.visit(switchStatement.getExpression(), context) + ") {" + context.newline();
		context.indent();
		
		if (switchStatement.getCases() != null) {
			Iterator<SwitchCaseExpressionStatement> iterator = switchStatement.getCases().iterator();
			while(iterator.hasNext())
			{
				result += controller.visit(iterator.next(), context);
				if (iterator.hasNext()) {
					result += context.newline();
				}
			}
			result += context.newline();
		}
		
		if (switchStatement.getDefault() != null) {
			result += controller.visit(switchStatement.getDefault(), context) + context.newline();
		}
		context.outdent();
		result += context.newline() + "}";
		
		return result;

	}

}
