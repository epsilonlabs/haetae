package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class GreaterThanOperatorExpressionCreator extends BinaryOperatorExpressionCreator{


	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createGreaterThanOperatorExpression(); //create a GreaterThanOperatorExpression
	}

	@Override
	public String getOperator() {
		return ">";
	}
 
}
