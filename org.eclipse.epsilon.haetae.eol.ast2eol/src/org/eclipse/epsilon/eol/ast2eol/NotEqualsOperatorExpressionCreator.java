package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class NotEqualsOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createNotEqualsOperatorExpression(); //create a NotEqualsOperatorExpression
	}

	@Override
	public String getOperator() {
		return "<>";
	}
 
}
