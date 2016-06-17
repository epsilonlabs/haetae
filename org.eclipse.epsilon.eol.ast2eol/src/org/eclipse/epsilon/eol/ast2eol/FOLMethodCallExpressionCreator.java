package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class FOLMethodCallExpressionCreator extends FeatureCallExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if((ast.getType() == EolParser.POINT || ast.getType() == EolParser.ARROW) && 
				ast.getNumberOfChildren() > 1 &&
				ast.getChild(1).getNumberOfChildren() > 0 &&
				ast.getChild(1).getFirstChild().getType() == EolParser.PARAMLIST)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		FOLMethodCallExpression expression = (FOLMethodCallExpression) context.getEolFactory().createFOLMethodCallExpression(); //create a FOLMethodCallExpression
		this.setAssets(ast, expression, container);
		
		AST targetAst = ast.getFirstChild(); //get the targetAst
		AST methodAst = targetAst.getNextSibling(); //get the featureAst
		AST parametersAst = methodAst.getFirstChild(); //get the parameterAst
		
		expression.setTarget((Expression) context.getEolElementCreatorFactory().createEOLElement(targetAst, expression, context));
		
		expression.setMethod((NameExpression) context.getEolElementCreatorFactory().createEOLElement(methodAst, expression, context, NameExpressionCreator.class));
		
		AST iteratorAST = parametersAst.getFirstChild();
		if (iteratorAST != null) {
			expression.setIterator((FormalParameterExpression) context.getEolElementCreatorFactory().createEOLElement(iteratorAST, expression, context));
		}
		
		AST conditionAst = parametersAst.getNextSibling();
		if (conditionAst != null) {
			expression.getConditions().add((Expression) context.getEolElementCreatorFactory().createEOLElement(conditionAst, expression, context));
			//expression.setCondition((Expression) context.getEolElementCreatorFactory().createEOLElement(conditionAst, expression, context));
			AST anotherConditionAst = conditionAst.getNextSibling();
			if (anotherConditionAst != null) {
				expression.getConditions().add((Expression) context.getEolElementCreatorFactory().createEOLElement(anotherConditionAst, expression, context));
			}
		}
		
		
		
		boolean isArrow = ast.getType() == EolParser.ARROW ? true : false;
		expression.setArrow(isArrow);
		
		return expression;
	}

}
