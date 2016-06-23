package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class MapExpressionCreator extends ExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.MAP)
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

		MapExpression expression = context.getEolFactory().createMapExpression(); //create a map expression first
		this.setAssets(ast, expression, container); //set assets
		
		AST keyValueListAst = ast.getFirstChild(); //keyValueList could be null
		if(keyValueListAst!=null && keyValueListAst.getType() == EolParser.KEYVALLIST) //if keyvalue is not null
		{
			for(AST child: keyValueListAst.getChildren()) //process keys and values
			{
				expression.getKeyValues().add((KeyValueExpression) context.getEolElementCreatorFactory().createEOLElement(child, expression, context)); //add pair
			}
		}
		
		expression.setResolvedType((Type) context.getEolElementCreatorFactory().createEOLElement(ast, expression, context, MapTypeCreator.class)); //set resolved type
		 
		return expression; //return
	}

}
