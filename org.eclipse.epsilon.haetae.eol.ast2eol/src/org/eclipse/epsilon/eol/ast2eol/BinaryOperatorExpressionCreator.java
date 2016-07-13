package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public abstract class BinaryOperatorExpressionCreator extends OperatorExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		return (ast.getNumberOfChildren() == 2 && (ast.getType() == EolParser.OPERATOR) && ast.getText().equalsIgnoreCase(getOperator()));
	}
	
	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		BinaryOperatorExpression expression = create(context);
		buildExpression(ast, expression, container, context);
		return expression;
	}
	
	public void buildExpression(AST ast, BinaryOperatorExpression expression, EOLElement container, Ast2EolContext context)
	{
		this.setAssets(ast, expression, container);
		
		AST lhsAst = ast.getChild(0); //fetch LHS AST
		AST rhsAst = ast.getChild(1); //fetch RHS AST
		
//		if (lhsAst.getType() == EolParser.EXPRESSIONINBRACKETS) {
//			lhsAst = lhsAst.getFirstChild();
//		}
//		if (rhsAst.getType() == EolParser.EXPRESSIONINBRACKETS) {
//			rhsAst = rhsAst.getFirstChild();
//		}
		
		expression.setLhs((Expression) context.getEolElementCreatorFactory().createEOLElement(lhsAst, expression, context)); //set LHS
		expression.setRhs((Expression) context.getEolElementCreatorFactory().createEOLElement(rhsAst, expression, context)); //set RHS
	}
		
	public abstract BinaryOperatorExpression create(Ast2EolContext context);
	
	public abstract String getOperator();

}
