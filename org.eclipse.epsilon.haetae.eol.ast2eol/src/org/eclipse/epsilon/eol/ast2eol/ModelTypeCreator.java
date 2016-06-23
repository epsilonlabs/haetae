package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public class ModelTypeCreator extends TypeCreator{

	@Override
	public Type create(Ast2EolContext context) {
		return context.getEolFactory().createModelType();
	}

	@Override
	public String getType() {
		return "N/A";
	}

}
