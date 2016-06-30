package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression;

public class OrOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createOrOperatorExpression(); //create an OrOperatorExpression;
	}

	@Override
	public String getOperator() {
		return "or";
	}
 
}
