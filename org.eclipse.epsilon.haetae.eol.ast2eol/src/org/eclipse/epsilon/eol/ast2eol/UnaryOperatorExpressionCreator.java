package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public abstract class UnaryOperatorExpressionCreator extends OperatorExpressionCreator{

	
	@Override
	public boolean appliesTo(AST ast) {
		return (ast.getNumberOfChildren() == 1 && ast.getType() == EolParser.OPERATOR && ast.getText().equalsIgnoreCase(getOperator()));
	}
	
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		UnaryOperatorExpression expression = create(context);
		this.buildExpression(ast, expression, container, context);
		return expression;
	}
	
	public void buildExpression(AST ast, UnaryOperatorExpression expression, EOLElement container, Ast2EolContext context)
	{
		this.setAssets(ast, expression, container);
		
		AST expressionAST = ast.getFirstChild(); //fetch the expression AST
		expression.setExpression((Expression) context.getEolElementCreatorFactory().createEOLElement(expressionAST, expression, context)); //create dom for Expression ASt and set
	}
	
	public abstract UnaryOperatorExpression create(Ast2EolContext context);
	
	public abstract String getOperator();


}
