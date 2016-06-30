package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class MethodCallExpressionCreator extends FeatureCallExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {	
		if(		((ast.getType() == EolParser.ARROW || 
				ast.getType() == EolParser.POINT) && 
				ast.getChild(1).getNumberOfChildren() > 0 && 
				ast.getChild(1).getFirstChild().getType() == EolParser.PARAMETERS)
				
				||
	
				(ast.getType() == EolParser.FEATURECALL && 
				ast.getNumberOfChildren() > 0 && 
				ast.getFirstChild().getType() == EolParser.PARAMETERS &&
				(ast.getParent().getType() != EolParser.POINT ||
				ast.getParent().getType() != EolParser.ARROW))
				
				)
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
		
		if(ast.getType() == EolParser.ARROW || ast.getType() == EolParser.POINT) //if there is a target
		{
			MethodCallExpression expression = (MethodCallExpression) context.getEolFactory().createMethodCallExpression(); //create a method call
			this.setAssets(ast, expression, container);
			
			AST targetAst = ast.getFirstChild(); //get the targetAst
			AST featureAst = targetAst.getNextSibling(); //get the featureAst
			AST parametersAst = featureAst.getFirstChild(); //get the parameterAs
			
			if(targetAst.getType() == EolParser.EXPRESSIONINBRACKETS)
			{
				targetAst = targetAst.getFirstChild();
			}
			
			expression.setTarget((Expression) context.getEolElementCreatorFactory().createEOLElement(targetAst, expression, context)); //set target
			
			expression.setMethod((NameExpression) context.getEolElementCreatorFactory().createEOLElement(featureAst, expression, context, NameExpressionCreator.class));
					
			for (AST parameterAst : parametersAst.getChildren()) {
				if (isKeyWord(parameterAst.getText())) {
					if (parameterAst.getFirstChild() != null && (parameterAst.getFirstChild().getType() == EolParser.EXPRLIST || parameterAst.getFirstChild().getType() == EolParser.EXPRRANGE)) {
						expression.getArguments().add((Expression) context.getEolElementCreatorFactory().createEOLElement(parameterAst, expression, context)); //process arguments
					}
					else {
						NameExpression name = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(parameterAst, expression, context, NameExpressionCreator.class);
						name.setIsType(true);
						expression.getArguments().add(name);  //process arguments which is an actual type		
					}
				}
				else {
					expression.getArguments().add((Expression) context.getEolElementCreatorFactory().createEOLElement(parameterAst, expression, context)); //process arguments
				}
			}
			
			boolean isArrow = ast.getType() == EolParser.ARROW ? true : false;
			expression.setArrow(isArrow);
			
			return expression;
		}
		else { //when there is no target
			MethodCallExpression expression = (MethodCallExpression)context.getEolFactory().createMethodCallExpression(); //create a NaturalMethodCallExpression
			this.setAssets(ast, expression, container);
			
			NameExpression method = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, NameExpressionCreator.class);
			method.setName(ast.getText()); //set name
			expression.setMethod(method); //set method for MethodCall
			
			AST argumentListAst = ast.getFirstChild(); //fetch the argument AST
			if(argumentListAst != null) //if there are arguments
			{
				for(AST argumentAst: argumentListAst.getChildren()) //process argument
				{
 					if (isKeyWord(argumentAst.getText())) {
						if (argumentAst.getFirstChild() != null && (argumentAst.getFirstChild().getType() == EolParser.EXPRLIST || argumentAst.getFirstChild().getType() == EolParser.EXPRRANGE)) {
							expression.getArguments().add((Expression) context.getEolElementCreatorFactory().createEOLElement(argumentAst, expression, context)); //process arguments
						}
						else {
							NameExpression name = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(argumentAst, expression, context, NameExpressionCreator.class);
							name.setIsType(true);
							expression.getArguments().add(name);  //process arguments which is an actual type	
						}
					}
					else {
						expression.getArguments().add((Expression) context.getEolElementCreatorFactory().createEOLElement(argumentAst, expression, context)); //process arguments
					}
				}
			}
			return expression;
		}
	}
	
	public static void main(String[] args) {
		MethodCallExpressionCreator creator = new MethodCallExpressionCreator();
		System.out.println(creator.isKeyWord("Bag(Sequence(Sequence(Map)))"));
	}
	
	public boolean isKeyWord(String s)
	{
		if (s.equals("Any") ||
				s.equals("Integer") ||
				s.equals("Boolean") ||
				s.equals("Real") ||
				s.equals("String") ||
				s.equals("Bag") ||
				s.equals("Set") ||
				s.equals("OrderedSet") ||
				s.equals("Sequence") ||
				s.equals("Map")) {
			return true;
		}
		else if (s.contains("Bag(")) {
			String temp = s.replaceFirst("Bag\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWord(temp);
		}
		else if (s.contains("Set(")) {
			String temp = s.replaceFirst("Set\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWord(temp);
		}
		else if (s.contains("OrderedSet(")) {
			String temp = s.replaceFirst("OrderedSet\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWord(temp);
		}
		else if (s.contains("Sequence(")) {
			String temp = s.replaceFirst("Sequence\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWord(temp);
		}
		else
		{
			return false;
		}
	}

}
