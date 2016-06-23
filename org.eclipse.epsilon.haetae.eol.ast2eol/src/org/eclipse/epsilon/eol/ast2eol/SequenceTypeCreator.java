package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class SequenceTypeCreator extends CollectionTypeCreator{
	
	@Override
	public SequenceType create(Ast2EolContext context) {
		return context.getEolFactory().createSequenceType();
	}

	@Override
	public String getType() {
		return "Sequence";
	}
 
}
