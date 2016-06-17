package org.eclipse.epsilon.eol.visitor.resolution.variable.context;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;

/*
 * This class is used to store a VariableDeclarationExpression, used mostly 99% of the variable resolution.
 * One exception for variable resolution is the PluralVariable, description attached to that class.
 */
public class SimpleVariable extends Variable{

	protected VariableDeclarationExpression value;

	public SimpleVariable(String name, VariableDeclarationExpression value) {
		this.name = name;
		this.value = value;
	}

	public void dispose()
	{
		value = null;
		name = null;
	}
	
	public EOLElement getVariable()
	{
		return value;
	}

}
