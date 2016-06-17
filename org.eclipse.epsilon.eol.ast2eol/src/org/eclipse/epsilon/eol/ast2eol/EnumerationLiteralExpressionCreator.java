package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class EnumerationLiteralExpressionCreator extends ExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.ENUMERATION_VALUE)
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
		
		EnumerationLiteralExpression expression = (EnumerationLiteralExpression) context.getEolFactory().createEnumerationLiteralExpression(); //create an EnumerationLiteralExpression
		this.setAssets(ast, expression, container);
		
		if(ast.getText().contains("!"))
		{
			String[] arr1 = ast.getText().split("!"); //split the string by !
			NameExpression model = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, NameExpressionCreator.class);
			
			TextRegion modelRegion = createTextRegion(ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn(), ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr1[0].length());
			model.setRegion(modelRegion);
			
			model.setName(arr1[0]); //set name
			expression.setModel(model); //set model for the enumeration
		
			String[] arr2 = arr1[1].split("#"); //split the string by #			
			NameExpression enumeration = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, NameExpressionCreator.class);//create a NameExpression to express enumeration
			
			TextRegion enumerationRegion = createTextRegion(ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr1[0].length(), ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr1[0].length() + arr2[0].length());
			enumeration.setRegion(enumerationRegion);
			
			enumeration.setName(arr2[0]); //set name
			expression.setEnumeration(enumeration); //set enumeration for the enumeration
						
			NameExpression literal = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, NameExpressionCreator.class);//create a NameExpression to express enumeration literal
			
			TextRegion literalRegion = createTextRegion(ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr1[0].length() + arr2[0].length(), ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr1[0].length() + arr2[0].length() + arr2[1].length());
			enumeration.setRegion(literalRegion);
			
			literal.setName(arr2[1]); //set name
			expression.setLiteral(literal); //set literal
		}
		
		else {
			String[] arr2 = ast.getText().split("#"); //split the string by #
			
			NameExpression enumeration = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, NameExpressionCreator.class);//create a NameExpression to express enumeration
			
			TextRegion enumerationRegion = createTextRegion(ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn(), ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr2[0].length());
			enumeration.setRegion(enumerationRegion);
			
			enumeration.setName(arr2[0]); //set name
			expression.setEnumeration(enumeration); //set enumeration for the enumeration
			
			NameExpression literal = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, NameExpressionCreator.class);//create a NameExpression to express enumeration literal
			
			TextRegion literalRegion = createTextRegion(ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr2[0].length(), ast.getRegion().getStart().getLine(), ast.getRegion().getStart().getColumn() + arr2[0].length() + arr2[1].length());
			enumeration.setRegion(literalRegion);
			
			literal.setName(arr2[1]); //set name
			expression.setLiteral(literal); //set literal
		}

		return expression;
	}
}
