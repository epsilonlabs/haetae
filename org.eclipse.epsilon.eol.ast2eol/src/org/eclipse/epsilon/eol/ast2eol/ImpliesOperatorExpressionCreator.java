package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression;


public class ImpliesOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {
		return context.getEolFactory().createImpliesOperatorExpression(); //create an ImpliesOperatorExpression;
	}

	@Override
	public String getOperator() {
		return "implies";
	}
 
}
