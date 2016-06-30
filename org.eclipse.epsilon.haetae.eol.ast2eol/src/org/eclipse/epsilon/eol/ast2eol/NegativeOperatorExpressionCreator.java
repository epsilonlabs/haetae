package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class NegativeOperatorExpressionCreator extends UnaryOperatorExpressionCreator{

	@Override
	public UnaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createNegativeOperatorExpression(); //create an NegativeOperatorExpression;
	}

	@Override
	public String getOperator() {
		return "-";
	}
 
}
