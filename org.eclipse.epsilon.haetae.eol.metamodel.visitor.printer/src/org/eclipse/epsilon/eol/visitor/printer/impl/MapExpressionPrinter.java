package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

import org.eclipse.epsilon.eol.metamodel.MapExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MapExpressionVisitor;

public class MapExpressionPrinter extends MapExpressionVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(MapExpression mapExpression, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "Map{";
		if (mapExpression.getKeyValues() != null && mapExpression.getKeyValues().size() >0) {
			result += controller.visit(mapExpression.getKeyValues().get(0), context);
			for(int i = 1; i < mapExpression.getKeyValues().size(); i++)
			{
				result += "," + controller.visit(mapExpression.getKeyValues().get(i), context);
			}
		}
		
		if (mapExpression.isInBrackets()) {
			result = "(" + result + ")";
		}
		
		return result;
	}

}
