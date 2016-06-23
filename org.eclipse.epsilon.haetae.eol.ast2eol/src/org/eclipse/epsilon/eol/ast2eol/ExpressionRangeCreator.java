package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ExpressionRangeCreator extends CollectionInitValueExpressionCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.EXPRRANGE && ast.getNumberOfChildren() == 2)
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
		
		ExpressionRange list = (ExpressionRange) context.getEolFactory().createExpressionRange();
		this.setAssets(ast, list, container);
		
		AST beginAst = ast.getChild(0);
		AST endAst = ast.getChild(1);
		
		list.setStart((Expression) context.getEolElementCreatorFactory().createEOLElement(beginAst, list, context));
		list.setEnd((Expression) context.getEolElementCreatorFactory().createEOLElement(endAst, list, context));
		
		return list;
	} 
}
