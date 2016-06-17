package org.eclipse.epsilon.eol.visitor.resolution.type.naive.context;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;

public class TypeRegistry {

	protected TypeRegisterEntry baseEntry;
	protected TypeRegisterEntry currentEntry;

	
	public TypeRegisterEntry getBaseEntry() {
		return baseEntry;
	}
	
	public TypeRegisterEntry getCurrentEntry() {
		return currentEntry;
	}
	
	public void pushScope(EOLElement eolElement)
	{
		if (baseEntry == null) {
			baseEntry = new TypeRegisterEntry();
			baseEntry.setScope(eolElement);
			currentEntry = baseEntry;
		}
		else {
			TypeRegisterEntry container = new TypeRegisterEntry();
			container.setPreviousEntry(currentEntry);
			container.setScope(eolElement);
			currentEntry.getSubEntries().add(container);
			currentEntry = container;
		}
	}
	
	public void popScope()
	{	
		if (currentEntry.getPreviousEntry() != null) {
			currentEntry = currentEntry.getPreviousEntry();	
		}
		else {
			//System.err.println("ERROR: Stack is empty");
		}
	}
	
	public void assignType(VariableDeclarationExpression variableDeclarationExpression, Type type)
	{
		currentEntry.assignType(variableDeclarationExpression, type);
	}
	
	public void insertType(VariableDeclarationExpression vde, Type type)
	{
		currentEntry.insertType(vde, type);
	}
	
	
	
	public ArrayList<Type> getTypesForVariable(VariableDeclarationExpression variableDeclarationExpression)
	{
		ArrayList<Type> result = new ArrayList<Type>();
		
		TypeRegisterEntry container = currentEntry;
		while(container != null)
		{
			
			ArrayList<TypeRegisterEntry> toIgnore = container.getEntriesToDiscard(variableDeclarationExpression);
			for(TypeRegisterEntry c : container.getSubEntries())
			{
				if (toIgnore != null) {
					if (toIgnore.contains(c)) {
						continue;
					}
				}
				if (c.getTypes(variableDeclarationExpression) != null) {
					result.addAll(c.getTypes(variableDeclarationExpression));
				}
			}
			if (container.getTypes(variableDeclarationExpression) != null) {
				result.addAll(container.getTypes(variableDeclarationExpression));
			}
			
			if (container.variableDefinedInEntry(variableDeclarationExpression)) {
				break;
			}
			
			container = container.getPreviousEntry();
		}
		return result;
	}
}
