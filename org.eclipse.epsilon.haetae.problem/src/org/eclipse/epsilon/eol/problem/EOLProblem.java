package org.eclipse.epsilon.eol.problem;

import org.eclipse.epsilon.eol.metamodel.EOLElement;

public abstract class EOLProblem {

	protected String message;
	protected EOLElement eolElement;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public EOLElement getEolElement() {
		return eolElement;
	}
	
	public void setEolElement(EOLElement eolElement) {
		this.eolElement = eolElement;
	}
}
