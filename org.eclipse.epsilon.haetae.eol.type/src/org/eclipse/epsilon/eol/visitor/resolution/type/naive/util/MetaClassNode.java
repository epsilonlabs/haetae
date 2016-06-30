package org.eclipse.epsilon.eol.visitor.resolution.type.naive.util;

import java.util.ArrayList;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EClass;

public class MetaClassNode {

	EClass eClass;
	int weight;
	MetaClassNode previous;
	
	public MetaClassNode(EClass eClass)
	{
		this.eClass = eClass;
		weight = 0;
		previous = null;
	}
	
	public EClass getEClass()
	{
		return eClass;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void setWeight(int w)
	{
		weight = w;
	}
	
	public MetaClassNode getPrevious()
	{
		return previous;
	}
	
	public void setPrevious(MetaClassNode previous)
	{
		this.previous = previous;
	}
	
	//returns the node which has the minimum weight in the list
	public MetaClassNode extractMin(ArrayList<MetaClassNode> list)
	{
		int min = 100000; //set the weight to be infinite
		MetaClassNode result = null; //set result to null
		for(MetaClassNode node: list) //for all nodes in the list
		{
			if (node.getWeight() < min) { 
				min = node.getWeight();
				result = node;
			}
		}
		if (result != null) { //remove result from list if applicable
			list.remove(result);
		}
		return result; //return result
	}
	
	//returns a list that contains the superTypes of the argument node that exist in the argument list
	public LinkedList<MetaClassNode> getNeighbours(MetaClassNode node, ArrayList<MetaClassNode> list)
	{
		LinkedList<MetaClassNode> result = new LinkedList<MetaClassNode>();
		for(EClass cls: node.getEClass().getESuperTypes())
		{
			for(MetaClassNode n: list)
			{
				if(n.getEClass().equals(cls))
				{
					result.add(n);
				}
			}
		}
		return result;
	}
}
