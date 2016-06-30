package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class BagTypeCreator extends CollectionTypeCreator{
 
	@Override
	public Type create(Ast2EolContext context) {
		return context.getEolFactory().createBagType();
	}

	@Override
	public String getType() {
		return "Bag";
	}

}
