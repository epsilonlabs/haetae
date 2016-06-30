package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class MultiplyOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createMultiplyOperatorExpression(); //create a MultiplyOperatorExpression;
	}

	@Override
	public String getOperator() {
		return "*";
	}
 
}
