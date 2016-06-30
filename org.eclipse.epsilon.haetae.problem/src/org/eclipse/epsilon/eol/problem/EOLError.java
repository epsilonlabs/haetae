package org.eclipse.epsilon.eol.problem;

import org.eclipse.epsilon.eol.metamodel.EOLElement;

public class EOLError extends EOLProblem{

	public EOLError(EOLElement eolElement, String message)
	{
		this.eolElement = eolElement;
		this.message = message;
	}
}
