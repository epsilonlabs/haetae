package org.eclipse.epsilon.evl.visitor.resolution.type.context;

import java.util.HashMap;

import org.eclipse.epsilon.evl.metamodel.Invariant;

public class InvariantHolder {

	protected HashMap<String, Invariant> invMap = new HashMap<String, Invariant>();
	
	public void insertInv(String name, Invariant inv)
	{
		if (!invMap.containsKey(name)) {
			invMap.put(name, inv);
		}
	}
	
	public Invariant getInv(String name)
	{
		return invMap.get(name);
	}
}
