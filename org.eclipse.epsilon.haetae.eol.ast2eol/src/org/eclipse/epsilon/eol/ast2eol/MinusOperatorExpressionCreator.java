package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class MinusOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createMinusOperatorExpression(); //create a MinusOperatorExpression;
	}

	@Override
	public String getOperator() {
		return "-";
	}
 
}
