package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class CollectionTypeCreator extends AnyTypeCreator{

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		//prepare collection type
		CollectionType type;
		
		
		if (getType().equals("Collection")) {
			type = context.getEolFactory().createCollectionType();
		}
		else {
			type = (CollectionType) create(context);
		}
		
		this.setAssets(ast, type, container);
		
		if(ast.getNumberOfChildren() != 0 && ast.getChild(0).getType() != EolParser.EXPRLIST && ast.getChild(0).getType() != EolParser.EXPRRANGE)
		{
			type.setContentType((AnyType) context.getEolElementCreatorFactory().createEOLElement(ast.getChild(0), type, context));
		}
		else {
			AnyType anyType = context.getEolFactory().createAnyType();
			setAssets(ast, anyType, type);
			type.setContentType(anyType);
		}
		
		return type;
	}
	
	public String getType()
	{
		return "Collection";
	}
}
