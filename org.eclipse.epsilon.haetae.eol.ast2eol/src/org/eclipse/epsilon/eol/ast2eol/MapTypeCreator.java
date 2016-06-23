package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class MapTypeCreator extends TypeCreator{

	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		MapType type = context.getEolFactory().createMapType();
		AnyType keyType = EolFactory.eINSTANCE.createAnyType();
		AnyType valueType = EolFactory.eINSTANCE.createAnyType();
		type.setKeyType(keyType);
		type.setValueType(valueType);
		setAssets(ast, keyType, type);
		setAssets(ast, valueType, type);
		
		this.setAssets(ast, type, container);
		return type;
	}
	
	@Override
	public String getType() {
		return "Map";
	}
 
}
