package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class AnyTypeCreator extends TypeCreator{

	@Override
	public Type create(Ast2EolContext context) {
		AnyType anyType = context.getEolFactory().createAnyType();
		anyType.setDeclared(true);
		return anyType;
	}

	@Override
	public String getType() {
		return "Any";
	}
 
}
