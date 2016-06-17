package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class NotOperatorExpressionCreator extends UnaryOperatorExpressionCreator{

	@Override
	public UnaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createNotOperatorExpression(); //create a NotOperatorExpression;
	}

	@Override
	public String getOperator() {
		return "not";
	}
 
}
