package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ExecutableAnnotationStatementCreator extends AnnotationStatementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.EXECUTABLEANNOTATION)
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

		ExecutableAnnotationStatement executableAnnotationStatement = context.getEolFactory().createExecutableAnnotationStatement(); //create an ExecutableAnnotation
		this.setAssets(ast, executableAnnotationStatement, container);
		
		AST nameAst = ast.getFirstChild(); //fetch the first child
		if(nameAst != null && nameAst.getType() == EolParser.NAME)
		{
			executableAnnotationStatement.setName((NameExpression) context.getEolElementCreatorFactory().createEOLElement(nameAst, executableAnnotationStatement, context, NameExpressionCreator.class)); //set name for annotation
		}
		
		AST expressionAst = ast.getFirstChild().getNextSibling(); //fetch the second child
		executableAnnotationStatement.setExpression((Expression) context.getEolElementCreatorFactory().createEOLElement(expressionAst, executableAnnotationStatement, context)); //setExpression
		
		return executableAnnotationStatement;
	}


}
