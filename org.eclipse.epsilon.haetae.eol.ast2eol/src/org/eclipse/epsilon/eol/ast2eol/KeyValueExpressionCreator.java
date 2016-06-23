package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class KeyValueExpressionCreator extends ExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		boolean condition = ast.getType() == EolParser.KEYVAL;
		if(condition)
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
		
		KeyValueExpression keyValue = context.getEolFactory().createKeyValueExpression(); //create a KeyValueExpression
		this.setAssets(ast, keyValue, container);
		
		AST keyAst = ast.getChild(0); //fetch key ast
		AST valueAst = ast.getChild(1); //fetch value ast
		
		keyValue.setKey((Expression) context.getEolElementCreatorFactory().createEOLElement(keyAst, keyValue, context)); //set key
		keyValue.setValue((Expression) context.getEolElementCreatorFactory().createEOLElement(valueAst, keyValue, context)); //set value
		
		return keyValue;
	}

}
