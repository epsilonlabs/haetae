package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class IntegerTypeCreator extends PrimitiveTypeCreator{

	@Override
	public Type create(Ast2EolContext context) {
		return context.getEolFactory().createIntegerType();
	}

	@Override
	public String getType() {
		return "Integer";
	} 


}
