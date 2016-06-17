package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class FormalParameterExpressionCreator extends ExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.FORMAL)
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
		
		FormalParameterExpression expression = context.getEolFactory().createFormalParameterExpression();
		this.setAssets(ast, expression, container);
		
		AST nameAst = ast.getFirstChild(); //get the name ast
		expression.setName((NameExpression) context.getEolElementCreatorFactory().createEOLElement(nameAst, expression, context)); //set the name
		
		if(ast.getNumberOfChildren() > 1) //if there are any more ast, it means there should be a type
		{
			AST typeAst = nameAst.getNextSibling(); //fetch next sibling
			expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(typeAst, expression, context)); //set resolved type
		}
		else {
			expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(nameAst, expression, context, AnyTypeCreator.class));
			((AnyType)expression.getResolvedType()).setDeclared(false);
		}
		
		return expression;
	}

}
