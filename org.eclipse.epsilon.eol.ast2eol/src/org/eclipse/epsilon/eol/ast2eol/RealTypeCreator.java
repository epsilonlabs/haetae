package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class RealTypeCreator extends PrimitiveTypeCreator{

	@Override
	public Type create(Ast2EolContext context) {
		return context.getEolFactory().createRealType();
	}
	@Override
	public String getType() {
		return "Real";
	}
 
}
