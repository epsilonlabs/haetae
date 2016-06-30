package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class EqualsOperatorExpressionCreator extends BinaryOperatorExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.OPERATOR && (ast.getText().equals("=") || ast.getText().equals("==")) && ast.getNumberOfChildren() == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public BinaryOperatorExpression create(Ast2EolContext context) {		
		return context.getEolFactory().createEqualsOperatorExpression(); //create an EqualsOperatorExpression;
	}

	@Override
	public String getOperator() {
		return null; //this class requires more elaborate appliesTo() method 
	}


}
