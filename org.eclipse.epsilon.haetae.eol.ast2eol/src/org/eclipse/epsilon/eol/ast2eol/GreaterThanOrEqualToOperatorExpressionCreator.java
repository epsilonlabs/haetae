package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class GreaterThanOrEqualToOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createGreaterThanOrEqualToOperatorExpression(); //create a GreaterThanOrEqualToOperatorExpression;
	}

	@Override
	public String getOperator() {
		return ">=";
	}
 
}
