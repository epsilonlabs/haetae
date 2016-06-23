package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ModelDeclarationParameterCreator extends EOLElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.MODELDECLARATIONPARAMETER)
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
		
		ModelDeclarationParameter expression = context.getEolFactory().createModelDeclarationParameter();
		this.setAssets(ast, expression, container);
		
		AST nameAst = ast.getChild(0);
		AST valueAst = ast.getChild(1);
		
		expression.setKey((NameExpression) context.getEolElementCreatorFactory().createEOLElement(nameAst, expression, context));
		expression.setValue((StringExpression) context.getEolElementCreatorFactory().createEOLElement(valueAst, expression, context));
		
		return expression;
	}

}
