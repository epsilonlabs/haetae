package org.eclipse.epsilon.eol.visitor.resolution.variable.context;

import java.util.LinkedList;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;

public class FrameStack {

	LinkedList<Frame> frames;
	
	public FrameStack()
	{
		frames = new LinkedList<Frame>();
	} 
	
	public void pop()
	{
		frames.getLast().dispose();
		frames.removeLast();
	}
	
	public void push(EOLElement entryPoint, boolean isUnprotected)
	{
		frames.addLast(new Frame(entryPoint, isUnprotected));
	}
	
	public void addOperation(OperationDefinition operation)
	{
		//operations.add(operation);
	}
	
	public Frame getTop()
	{
		if (frames.size() == 0) {
			return null;
		}
		return frames.getLast();
	}
	
	public void putVariable(VariableDeclarationExpression var, boolean plural)
	{
		String name = var.getName().getName();
		if (plural) {
			PluralVariable variable = (PluralVariable) getTop().get(name);
			if (variable == null) {
				variable = new PluralVariable(name, var);
				getTop().put(variable);
			}
			else
			{
				variable.addValue(var);	
			}
		}
		else {
			Variable variable = new SimpleVariable(name, var);
			getTop().put(variable);	
		}
		
	}
	
	public boolean variableExists(String name)
	{
		boolean result = false;
		for(int i = frames.size() - 1; i >= 0; i --)
		{
			Frame frame = frames.get(i);
			if(frame.getType() == FrameType.PROTECTED)
			{
				if(frame.contains(name))
				{
					result = true;
				}
				break;
			}
			else {
				if(frame.contains(name))
				{
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public boolean variableExistsInCurrentScope(String name)
	{
		boolean result = false;
		if (frames.size() == 0) {
			return false;
		}
		Frame frame = frames.getLast();
		if(frame.contains(name))
		{
			result = true;
		}
		return result;
	}
	
	public Variable getVariable(String name)
	{
		Variable result = null;
		int limit = frames.size()-1;
		for(int i = limit; i >= 0; i --)
		{
			Frame frame = frames.get(i);
			if(frame.getType() == FrameType.PROTECTED)
			{
				if(frame.contains(name))
				{
					result = frame.get(name);
				}
				break;
			}
			else {
				if(frame.contains(name))
				{
					result = frame.get(name);
					break;
				}
			}
		}
		return result;
	}
}
