package org.eclipse.epsilon.etl.visitor.resolution.type.context;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;

public class TraceUnitContainer {

	protected TransformationRule transformationRule;
	protected String name;
	
	protected EClass source;
	protected ArrayList<EClass> targets = new ArrayList<EClass>();
	
	public TraceUnitContainer(TransformationRule rule)
	{
		this.transformationRule = rule;
		this.name = rule.getName().getName();
	}
	
	public TraceUnitContainer(String name)
	{
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSource(EClass source) {
		this.source = source;
	}
	
	public EClass getSource() {
		return source;
	}
	
	public ArrayList<EClass> getTargets() {
		return targets;
	}
	
	public void setTargets(ArrayList<EClass> targets) {
		this.targets = targets;
	}
	
	public void addTarget(EClass target)
	{
		targets.add(target);
	}
	
	
	public TransformationRule getTransformationRule() {
		return transformationRule;
	}
	
	public String toString()
	{
		String result = name;
		result += " \nsource element:" + source.getName();
		for(EClass eClass : targets)
		{
			result += " \ntarget element:" + eClass.getName();

		}
		return result;
	}
	
}
