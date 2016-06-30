package org.eclipse.epsilon.eol.problem;

import org.eclipse.epsilon.eol.metamodel.EOLElement;

public class EOLWarning extends EOLProblem{

	public EOLWarning(EOLElement eolElement, String message)
	{
		this.eolElement = eolElement;
		this.message = message;
	}
}
