package org.eclipse.epsilon.eol.visitor.resolution.type.naive.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class TypeRegisterEntry {

	protected EOLElement scope;
	
	//the map look up
	protected HashMap<VariableDeclarationExpression, HashSet<Type>> variableTypesInEntry = new HashMap<VariableDeclarationExpression, HashSet<Type>>();
	
	//types to disregard
	protected HashMap<VariableDeclarationExpression, ArrayList<TypeRegisterEntry>> disregardSubContainersMap = new HashMap<VariableDeclarationExpression, ArrayList<TypeRegisterEntry>>();
	
	//sub containers
	protected ArrayList<TypeRegisterEntry> subEntries = new ArrayList<TypeRegisterEntry>();
	
	//previous container
	protected TypeRegisterEntry previousEntry;
	
	protected HashMap<VariableDeclarationExpression, Boolean> variableRedefinedInEntry = new HashMap<VariableDeclarationExpression, Boolean>();
	
	//set the scope
	public void setScope(EOLElement scope) {
		this.scope = scope;
	}
	
	//get sub containers
	public ArrayList<TypeRegisterEntry> getSubEntries() {
		return subEntries;
	}
	
	//set the previous container
	public void setPreviousEntry(
			TypeRegisterEntry previousEntry) {
		this.previousEntry = previousEntry;
	}
	
	//get the previous container
	public TypeRegisterEntry getPreviousEntry() {
		return previousEntry;
	}
	
	//assign the type, will overwrite all previous type in this entry
	public void assignType(VariableDeclarationExpression vde, Type type)
	{
		HashSet<Type> replace = new HashSet<Type>();
		
		//if is any type, add all dynamic types
		if (TypeUtil.getInstance().isInstanceofAnyType(type)) {
			AnyType anyType = (AnyType) type;
			for(Type t: anyType.getDynamicTypes())
			{
				replace.add(EcoreUtil.copy(t));
			}
		}
		//if is normal type, add
		else {
			replace.add(EcoreUtil.copy(type));
		}
		variableTypesInEntry.put(vde, replace);
		
		ArrayList<TypeRegisterEntry> temp = new ArrayList<TypeRegisterEntry>();
		temp.addAll(subEntries);
		disregardSubContainersMap.put(vde, temp);
		
		variableRedefinedInEntry.put(vde, true);
	}
	
	public boolean variableDefinedInEntry(VariableDeclarationExpression vde)
	{
		if (variableRedefinedInEntry.containsKey(vde)) {
			return variableRedefinedInEntry.get(vde);
		}
		else {
			return false;
		}
	}
	
	
	
	//insert type, will insert a type for a variable in this entry
	public void insertType(VariableDeclarationExpression vde, Type type)
	{
		HashSet<Type> storedTypes = variableTypesInEntry.get(vde);
		if (storedTypes != null) {
			storedTypes.add(EcoreUtil.copy(type));
		}
		else {
			storedTypes = new HashSet<Type>();
			storedTypes.add(EcoreUtil.copy(type));
			variableTypesInEntry.put(vde, storedTypes);
		}
	}
	
	//get sub entries to discard for a var
	public ArrayList<TypeRegisterEntry> getEntriesToDiscard(VariableDeclarationExpression variableDeclarationExpression)
	{
		return disregardSubContainersMap.get(variableDeclarationExpression);
	}
	
	//get the types of a var in this entry
	public HashSet<Type> getTypes(VariableDeclarationExpression vde)
	{
		return variableTypesInEntry.get(vde);
	}
	
}
