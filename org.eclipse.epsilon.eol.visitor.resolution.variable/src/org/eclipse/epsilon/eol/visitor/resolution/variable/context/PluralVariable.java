package org.eclipse.epsilon.eol.visitor.resolution.variable.context;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;

public class PluralVariable extends Variable{
	
	/* This class is particularly used for alias declarations for ModelDeclarationStatements,
	 * this is because that an alias (named "a" for example) can be declared in multiple ModeDeclarationStatements.
	 * So far, this class is only used when declaring aliases. No further usage known.
	 */

	protected ArrayList<VariableDeclarationExpression> values;

	public PluralVariable(String name, VariableDeclarationExpression value) {
		this.name = name;
		if (values == null) {
			values = new ArrayList<VariableDeclarationExpression>();
			values.add(value);
		}
		else {
			if(!values.contains(value))
			{
				values.add(value);
			}
		}
	}

	public void dispose()
	{
		values = null;
		name = null;
	}
	
	public ArrayList<VariableDeclarationExpression> getValues() {
		return values;
	}
	
	public void addValue(VariableDeclarationExpression value)
	{
		values.add(value);
	}

}
