package org.eclipse.epsilon.eol.visitor.printer.impl;

import java.util.Iterator;

import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.TransactionStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.TransactionStatementVisitor;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class TransactionStatementPrinter extends TransactionStatementVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(TransactionStatement transactionStatement,
			EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "transaction";
		if(transactionStatement.getNames() != null) {
			Iterator<NameExpression> iterator = transactionStatement.getNames().iterator();
			while(iterator.hasNext())
			{
				result += controller.visit(iterator.next(), context);
				if(iterator.hasNext())
				{
					result += ", ";
				}
			}
		}
		
		result += " {" + context.newline();
		context.indent();
		
		if(transactionStatement.getBody() != null)
		{
			result += controller.visit(transactionStatement.getBody(), context);
		}
		result += context.newline();
		context.outdent();
		result += context.whitespace() + "}";
		
		return result;
	}

}
