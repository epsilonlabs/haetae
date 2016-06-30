package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class LessThanOrEqualToOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createLessThanOrEqualToOperatorExpression(); //create a LessThanOrEqualToOperatorExpression;
	}

	@Override
	public String getOperator() {
		return "<=";
	}
 
}
