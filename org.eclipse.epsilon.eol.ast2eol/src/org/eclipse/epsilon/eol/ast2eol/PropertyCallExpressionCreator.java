package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class PropertyCallExpressionCreator extends FeatureCallExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if((ast.getType() == EolParser.ARROW || ast.getType() == EolParser.POINT) && 
				ast.getChild(1).getNumberOfChildren() == 0)
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
		
		PropertyCallExpression expression = context.getEolFactory().createPropertyCallExpression(); //create an PropertyCallExpression
		this.setAssets(ast, expression, container);
		
		AST targetAst = ast.getFirstChild(); //get the targetAst
		AST propertyAst = targetAst.getNextSibling(); //get the featureAst
		
		expression.setTarget((Expression) context.getEolElementCreatorFactory().createEOLElement(targetAst, expression, context)); //set target
		expression.setProperty((NameExpression) context.getEolElementCreatorFactory().createEOLElement(propertyAst, expression, context)); //set property
		
		String propertyString = propertyAst.getText(); //obtain the string for the property
		
		boolean isExtended = propertyString.startsWith("~") ? true : false;
		expression.setExtended(isExtended); //set the extended of the pexp		
		
		boolean isArrow = ast.getType() == EolParser.ARROW ? true : false;
		expression.setArrow(isArrow);
		
		return expression;
	} 

}
