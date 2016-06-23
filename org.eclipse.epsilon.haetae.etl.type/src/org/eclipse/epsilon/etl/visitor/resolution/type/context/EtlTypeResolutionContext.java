package org.eclipse.epsilon.etl.visitor.resolution.type.context;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.metamodel.AnnotationBlock;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.problem.EOLError;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.etl.metamodel.EtlFactory;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.visitor.resolution.type.handler.EquivalentHandler;
import org.eclipse.epsilon.etl.visitor.resolution.type.handler.EquivalentsHandler;

public class EtlTypeResolutionContext extends TypeResolutionContext{

	private static EtlTypeResolutionContext instance = null;
	
	protected EolLibraryModule module;
	protected TransformationRule currentRule;
	protected EtlFactory etlFactory = EtlFactory.eINSTANCE;
	protected ArrayList<Expression> surpressionList = new ArrayList<Expression>();
	protected ArrayList<TransformationRule> visitedRules = new ArrayList<TransformationRule>();
	
	
	public EtlTypeResolutionContext(){
		super();
		instance = this;
		initialiseETLReservedKeywords();
		//this.module = module;
		OperationDefinitionManager.getInstance(true);
		OperationDefinitionManager.getInstance().getHandlerFactory().addHandler(new EquivalentHandler());
		OperationDefinitionManager.getInstance().getHandlerFactory().addHandler(new EquivalentsHandler());
		
		//OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer().registerOperation("EtlOperations.eol");

	}
	
	public void addToVisitedRules(TransformationRule rule)
	{
		visitedRules.add(rule);
	}
	
	public boolean visitedRule(TransformationRule rule)
	{
		return visitedRules.contains(rule);
	}
	
//	public static EtlTypeResolutionContext getInstance(boolean initialise)
//	{
//		if (initialise) {
//			instance = new EtlTypeResolutionContext();
//			OperationDefinitionManager.getInstance(true);
//			LogBook.getInstance();
//			return instance;
//		}
//		else {
//			return getInstanace();
//		}
//	}
	
	public static EtlTypeResolutionContext getInstanace()
	{
		return instance;
	}
	
	public void initialiseETLReservedKeywords()
	{
		super.initialiseEOLReservedKeywords();
		EOLReservedKeywords.add("transform");
		EOLReservedKeywords.add("from");
		EOLReservedKeywords.add("to");
		EOLReservedKeywords.add("rule");
		EOLReservedKeywords.add("extends");
		EOLReservedKeywords.add("guard");
		EOLReservedKeywords.add("pre");
		EOLReservedKeywords.add("post");
		EOLReservedKeywords.add("lazy");
		EOLReservedKeywords.add("abstract");
		EOLReservedKeywords.add("greedy");
		EOLReservedKeywords.add("primary");
		
	}
	
	public EtlFactory getEtlFactory() {
		return etlFactory;
	}
	
	public void setCurrentRule(TransformationRule currentRule) {
		this.currentRule = currentRule;
	}
	
	public TransformationRule getCurrentRule() {
		return currentRule;
	}
	
	public void printTraceUnitContainers()
	{
		for(TraceUnitContainer tuc: traceUnitContainers)
		{
			System.out.println(tuc.toString());
		}
	}
	
	protected ArrayList<TraceUnitContainer> traceUnitContainers = new ArrayList<TraceUnitContainer>();
	
	public void addTraceUnitContainer(TraceUnitContainer container)
	{
		traceUnitContainers.add(container);
	}
	
//	public void addTraceUnitContainer(TransformationRule rule)
//	{
//		traceUnitContainers.add(new TraceUnitContainer(rule));
//	}
	
	public ArrayList<TraceUnitContainer> getTraceUnitContainers() {
		return traceUnitContainers;
	}
	
	public TraceUnitContainer getTraceUnitContainer(String name)
	{
		for(TraceUnitContainer tuc: traceUnitContainers)
		{
			if (tuc.getName().equals(name)) {
				return tuc;
			}
		}
		return null;
	}
	
	public ArrayList<TraceUnitContainer> getTraceUnitContainersWhichTransforms(EClass eClass)
	{
		//normal rule container
		ArrayList<TraceUnitContainer> normalRules = new ArrayList<TraceUnitContainer>();
		//primary rule container
		ArrayList<TraceUnitContainer> primaryRules = new ArrayList<TraceUnitContainer>();
		//result container
		ArrayList<TraceUnitContainer> result = new ArrayList<TraceUnitContainer>();
		//iterate TUCs
		for(TraceUnitContainer tuc: traceUnitContainers)
		{
			//if tuc is greedy, if source matches, if is primary add to primary rules
			if (isGreedy(tuc.getTransformationRule())) {
				if (tuc.getSource().equals(eClass)) {
					if (isPrimary(tuc.getTransformationRule())) {
						primaryRules.add(tuc);
					}
					else {
						normalRules.add(tuc);
					}
				}
				//if not equals, iterate super class, if primary add to primary rules
				else {
					for(EClass superClass: eClass.getEAllSuperTypes())
					{
						if (superClass.equals(tuc.getSource())) {
							if (isPrimary(tuc.getTransformationRule())) {
								primaryRules.add(tuc);
							}
							else {
								normalRules.add(tuc);
							}
						}
					}
				}
			}
			//if not greedy, if classes match, if primary add to primary
			else {
				if (tuc.getSource().equals(eClass)) { //if not greedy if classes match
					if (isPrimary(tuc.getTransformationRule())) { //if is primary rule return immediately
						primaryRules.add(tuc);
					}
					else {
						normalRules.add(tuc);
					}
				}
			}
			//for all super types of the source's eclass, if it matches, if it is primary then add to primary, otherwise add to normal
//			for(EClass theClass: tuc.getSource().getEAllSuperTypes())
//			{
//				if (theClass.equals(eClass)) {
//					if (isPrimary(tuc.getTransformationRule())) {
//						primaryRules.add(tuc);
//					}
//					else {
//						normalRules.add(tuc);
//					}
//				}
//			}
		}
		//add primary to results 
		result.addAll(primaryRules);
		//add normal to results
		result.addAll(normalRules);
		//return results
		return result;
	}
	
	public ArrayList<TraceUnitContainer> getTraceUnitContainersWhichTransforms(EClass eClass, ArrayList<StringExpression> names)
	{
		
		//normal rule container
		ArrayList<TraceUnitContainer> normalRules = new ArrayList<TraceUnitContainer>();
		//primary rule container
		ArrayList<TraceUnitContainer> primaryRules = new ArrayList<TraceUnitContainer>();
		//result container
		ArrayList<TraceUnitContainer> result = new ArrayList<TraceUnitContainer>();
		//iterate TUCs
		for(TraceUnitContainer tuc: traceUnitContainers)
		{
			//if tuc is greedy, if source matches, if is primary add to primary rules
			if (isGreedy(tuc.getTransformationRule())) {
				if (tuc.getSource().equals(eClass)) {
					if (isPrimary(tuc.getTransformationRule())) {
						primaryRules.add(tuc);
					}
					else {
						normalRules.add(tuc);
					}
				}
				//if not equals, iterate super class, if primary add to primary rules
				else {
					for(EClass superClass: eClass.getEAllSuperTypes())
					{
						if (superClass.equals(tuc.getSource())) {
							if (isPrimary(tuc.getTransformationRule())) {
								primaryRules.add(tuc);
							}
							else {
								normalRules.add(tuc);
							}
						}
					}
				}
			}
			//if not greedy, if classes match, if primary add to primary
			else {
				if (tuc.getSource().equals(eClass)) { //if not greedy if classes match
					if (isPrimary(tuc.getTransformationRule())) { //if is primary rule return immediately
						primaryRules.add(tuc);
					}
					else {
						normalRules.add(tuc);
					}
				}
			}
			//for all super types of the source's eclass, if it matches, if it is primary then add to primary, otherwise add to normal
			for(EClass theClass: tuc.getSource().getEAllSuperTypes())
			{
				if (theClass.equals(eClass)) {
					if (isPrimary(tuc.getTransformationRule())) {
						primaryRules.add(tuc);
					}
					else {
						normalRules.add(tuc);
					}
				}
			}
		}
		//add primary to results 
		result.addAll(primaryRules);
		//add normal to results
		result.addAll(normalRules);
		//return results
		
		ArrayList<TraceUnitContainer> resultClone = (ArrayList<TraceUnitContainer>) result.clone();
		ArrayList<TraceUnitContainer> selected = new ArrayList<TraceUnitContainer>();
		
		for(int i = 0; i < names.size(); i++)
		{
			String str = names.get(i).getValue();
			for(TraceUnitContainer tuc: resultClone)
			{
				if (tuc.getName().equals(str)) {
					selected.add(tuc);
					result.remove(tuc);
					break;
				}
			}
		}
		
		selected.addAll(result);
		return selected;
	}
	
//	public ArrayList<TraceUnitContainer> getTraceUnitContainersForEquivalent(EClass eClass)
//	{
//		ArrayList<TraceUnitContainer> result = new ArrayList<TraceUnitContainer>();
// 		TraceUnitContainer first = null;
//
//		for (TraceUnitContainer tuc: traceUnitContainers) {
//			if (first != null) { //if first is not null
//				if (isGreedy(tuc.getTransformationRule())) { //if rule is greedy
//					if (tuc.getSource().equals(eClass)) {//if source equals eclass, if is primary, clear the result and add to result, and return
//						if (isPrimary(tuc.getTransformationRule())) {
//							result.clear();
//							result.add(tuc);
//							return result;
//						}
//					}
//					else {//if source not equal to the eclass, iterate super types, if match and is primary, clear result, add to result and return result
//						for(EClass superClass : eClass.getEAllSuperTypes())
//						{
//							if (superClass.equals(tuc.getSource())) {
//								if (isPrimary(tuc.getTransformationRule())) {
//									result.clear();
//									result.add(tuc);
//									return result;
//								}
//							}
//						}
//					}
//					for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
//						if (eClass2.equals(eClass)) { 
//							if (isPrimary(tuc.getTransformationRule())) { //if is primary then add to the head of the result
//								result.add(0, tuc);
//							}
//						}
//					}	
//				}
//				else {
//					if (tuc.getSource().equals(eClass)) {
//						if (isPrimary(tuc.getTransformationRule())) {
//							result.clear();
//							result.add(tuc);
//							return result;
//						}
//					}
//					for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
//						if (eClass2.equals(eClass)) { 
//							if (isPrimary(tuc.getTransformationRule())) { //if is primary return immediately
//								result.add(0, tuc);
//							}
//						}
//					}	
//				}
//			}
//			else {//if the first is null
//				if (isGreedy(tuc.getTransformationRule())) { //if the transformation rule is greedy
//					if (tuc.getSource().equals(eClass)) { //if the source equals eClass, if it is also primary, add to the result then return the result
//						if (isPrimary(tuc.getTransformationRule())) {
//							result.add(tuc);
//							return result;
//						}
//						first = tuc; //if not primary then set the first
//					}
//					else {//if not euqls to the source, look for the superclasses, if primary add to the result and return, if not set first
//						for(EClass superClass : eClass.getEAllSuperTypes())
//						{
//							if (superClass.equals(tuc.getSource())) {
//								if (isPrimary(tuc.getTransformationRule())) {
//									result.add(tuc);
//									return result;
//								}
//								first = tuc;
//							}
//						}
//					}
//					for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
//						if (eClass2.equals(eClass)) { 
//							if (isPrimary(tuc.getTransformationRule())) { //if is primary then add to the front of the result
//								result.add(0, tuc);
//							}
//						}
//					}	
//				}
//				else {//if it is not greedy
//					if (tuc.getSource().equals(eClass)) {//if source equals eclass, if is primary then add to the result and return if not add to result and set first
//						if (isPrimary(tuc.getTransformationRule())) {
//							result.add(tuc);
//							return result;
//						}
//						result.add(tuc);
//						first = tuc;
//					}
//					for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
//						if (eClass2.equals(eClass)) { 
//							if (isPrimary(tuc.getTransformationRule())) { //if is primary add to result
//								result.add(0, tuc);
//							}
//						}
//					}	
//				}
//			}
//		}
//		return result;
//	}
	
	public TraceUnitContainer getTraceUnitContainerWhichTransforms(EClass eClass)
	{
		//first means the first in the results
 		TraceUnitContainer first = null;
 		//for all TUCs, TUCs rock!
		for(TraceUnitContainer tuc: traceUnitContainers)
		{
			//if first is not null
			if (first != null) { 
				if (isGreedy(tuc.getTransformationRule())) { //if greedy
					if(tuc.getSource().equals(eClass)) //if source is the type
					{
						if (isPrimary(tuc.getTransformationRule())) { //if source is primary too, then return immediately
							return tuc;
						}
					}
					else {
						for(EClass eClass2: eClass.getEAllSuperTypes()) { //if source is not the type look for sub types
							if (eClass2.equals(tuc.getSource())) { 
								if (isPrimary(tuc.getTransformationRule())) { //if is primary return immediately
									return tuc;
								}
							}
						}
					}
					for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
						if (eClass2.equals(eClass)) { 
							if (isPrimary(tuc.getTransformationRule())) { //if is primary return immediately
								return tuc;
							}
						}
					}	

				}
				else {
					if (tuc.getSource().equals(eClass)) { //if not greedy if classes match
						if (isPrimary(tuc.getTransformationRule())) { //if is primary rule return immediately
							return tuc;
						}
					}
					else {
						for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
							if (eClass2.equals(eClass)) { 
								if (isPrimary(tuc.getTransformationRule())) { //if is primary return immediately
									return tuc;
								}
							}
						}	
					}
				}
			}
			else { //if first is not null
				if (isGreedy(tuc.getTransformationRule())) { //if greedy
					if(tuc.getSource().equals(eClass))
					{
						if (isPrimary(tuc.getTransformationRule())) { //if is primary then return
							return tuc;
						}
						first = tuc; //record first
					}
					else {
						for(EClass eClass2: eClass.getEAllSuperTypes()) {
							if (eClass2.equals(tuc.getSource())) {
								if (isPrimary(tuc.getTransformationRule())) { //if is primary then return
									return tuc;
								}
								first = tuc; //record first
							}
						}	
					}
					for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
						if (eClass2.equals(eClass)) { 
							if (isPrimary(tuc.getTransformationRule())) { //if is primary return immediately
								return tuc;
							}
							first = tuc;
						}
					}	

				}
				else {
					if (tuc.getSource().equals(eClass)) {
						if (isPrimary(tuc.getTransformationRule())) { //if is primary then return
							return tuc;
						}
						first = tuc; //record first
					}
					else {
						for(EClass eClass2: tuc.getSource().getEAllSuperTypes()) { //if source is not the type look for sub types
							if (eClass2.equals(eClass)) { 
								if (isPrimary(tuc.getTransformationRule())) { //if is primary return immediately
									return tuc;
								}
								first = tuc;
							}
						}	
					}
				}
			}
			
		}
		return first;
	}
	
	public boolean isAbstract(TransformationRule rule)
	{
		AnnotationBlock annot = rule.getAnnotationBlock();
		if (annot != null) {
			for(Statement sa: annot.getStatements())
			{
				if (sa instanceof SimpleAnnotationStatement) {
					SimpleAnnotationStatement _sa = (SimpleAnnotationStatement) sa;
					if (_sa.getName().getName().equals("abstract")) {
						return true;
					}
				}
				
			}
			return false;
		}
		else {
			return false;
		}
	}
	
	public boolean isLazy(TransformationRule rule)
	{
		AnnotationBlock annot = rule.getAnnotationBlock();
		if (annot != null) {
			for(Statement sa: annot.getStatements())
			{
				if (sa instanceof SimpleAnnotationStatement) {
					SimpleAnnotationStatement _sa = (SimpleAnnotationStatement) sa;
					if (_sa.getName().getName().equals("lazy")) {
						return true;
					}
				}
			}
			return false;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrimary(TransformationRule rule)
	{
		AnnotationBlock annot = rule.getAnnotationBlock();
		if (annot != null) {
			for(Statement sa: annot.getStatements())
			{
				if (sa instanceof SimpleAnnotationStatement) {
					SimpleAnnotationStatement _sa = (SimpleAnnotationStatement) sa;
					if (_sa.getName().getName().equals("primary")) {
						return true;
					}
				}
			}
			return false;
		}
		else {
			return false;
		}
	}
	
	public boolean isGreedy(TransformationRule rule)
	{
		AnnotationBlock annot = rule.getAnnotationBlock();
		if (annot != null) {
			for(Statement sa: annot.getStatements())
			{
				if (sa instanceof SimpleAnnotationStatement) {
					SimpleAnnotationStatement _sa = (SimpleAnnotationStatement) sa;
					if (_sa.getName().getName().equals("greedy")) {
						return true;
					}
				}
			}
			return false;
		}
		else {
			return false;
		}
	}
	
	
	public void addSupression(Expression expr)
	{
		surpressionList.add(expr);
	}
	
	public void supressErrors()
	{
		for(Expression expr: surpressionList)
		{
			//LogBook.getInstance().removerError(expr);
		}
	}
	

	
	

}
