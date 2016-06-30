package org.eclipse.epsilon.eol.visitor.resolution.variable.context;

import java.util.HashMap;

import org.eclipse.epsilon.eol.metamodel.EOLElement;

public class Frame {

	//map to store variables by name
	protected HashMap<String, Variable> storage;
	
	//type of frame
	protected FrameType type;
	
	//the entry point of the frame
	protected EOLElement entryPoint;
	
	public Frame(EOLElement entryPoint, boolean isUnprotected)
	{

		storage = new HashMap<String, Variable>();
		if(isUnprotected)
		{
			type = FrameType.UNPROTECTED;
		}
		else {
			type = FrameType.PROTECTED;
		}
		
		this.entryPoint = entryPoint;
	}
	
	public void setEntryPoint(EOLElement entry)
	{
		this.entryPoint = entry;
	}
	
	public EOLElement getEntryPoint()
	{
		return entryPoint;
	}
	
	public void put(String name, Variable var)
	{
		storage.put(name, var);
	}
	
	public void put(Variable var)
	{
		storage.put(var.getName(), var);
	}
	
	public void dispose()
	{
		for(Variable v: storage.values())
		{
			v.dispose();
		}
	}
	
	public void clear()
	{
		storage.clear();
	}
	
	public Variable get(String name)
	{
		return storage.get(name);
	}
	
	public boolean contains(String name)
	{
		return storage.containsKey(name);
	}
	
	public boolean contains(Variable v)
	{
		return storage.containsKey(v.getName());
	}
	
	public FrameType getType()
	{
		return type;
	}
	
}
