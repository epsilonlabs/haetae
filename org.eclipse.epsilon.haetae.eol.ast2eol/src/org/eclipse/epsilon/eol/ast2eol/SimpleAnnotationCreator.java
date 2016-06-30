package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class SimpleAnnotationCreator extends AnnotationStatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.Annotation)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {

		SimpleAnnotationStatement simpleAnnotationStatement = context.getEolFactory().createSimpleAnnotationStatement(); //create a simple annotation
		this.setAssets(ast, simpleAnnotationStatement, container);
		
		String astText = ast.getText(); //fetch the ast text
		String arr[] = astText.split(" "); //split the string
		
		if (arr.length != 0) {
			String nameString = arr[0]; //the name string should be the first one
			nameString = nameString.substring(1);  //truncate "@"
			
			if (arr.length > 1) {
				String valueString = astText.substring(nameString.length()+2); //the value string should be the rest
				StringExpression value = (StringExpression) context.getEolElementCreatorFactory().createEOLElement(ast, simpleAnnotationStatement, context, StringExpressionCreator.class);
				
				TextRegion textRegion = createTextRegion(ast.getRegion().getStart().getLine(), nameString.length(), ast.getRegion().getEnd().getLine(), ast.getRegion().getEnd().getColumn());
				value.setRegion(textRegion);
//				textRegion.setContainer(value);
				
				value.setValue(valueString);
				simpleAnnotationStatement.getValues().add(value); //set the value of the annotation
			}
			
			NameExpression name = (NameExpression) context.getEolElementCreatorFactory().createEOLElement(ast, simpleAnnotationStatement, context, NameExpressionCreator.class);
			name.setName(nameString); //set name to the NameExpression
			
			simpleAnnotationStatement.setName(name); //set name for the annotation
		}
		return simpleAnnotationStatement;
	}
}
