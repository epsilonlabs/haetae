package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public abstract class CollectionExpressionCreator extends ExpressionCreator{

	public void buildCollection(AST ast, CollectionExpression collection, EOLElement container, Ast2EolContext context)
	{
		this.setAssets(ast, collection, container);
		
		AST parameterAst = ast.getFirstChild();
		
		if(parameterAst != null)
		{
			collection.setParameterList((CollectionInitialisationExpression) context.getEolElementCreatorFactory().createEOLElement(parameterAst, collection, context));
		}
	} 
}
