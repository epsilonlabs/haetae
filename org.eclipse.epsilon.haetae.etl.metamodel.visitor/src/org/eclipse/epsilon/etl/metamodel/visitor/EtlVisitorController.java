package org.eclipse.epsilon.etl.metamodel.visitor;

import org.eclipse.epsilon.etl.metamodel.*;
import org.eclipse.emf.ecore.EObject;
import java.util.List;
import java.util.ArrayList;


import org.eclipse.epsilon.eol.metamodel.visitor.*;

public class EtlVisitorController<T, R> extends EolVisitorController<T, R> {

	protected List<NamedBlockVisitor<T, R>> namedBlockVisitors = new ArrayList<NamedBlockVisitor<T, R>>();
	protected List<ETLModuleVisitor<T, R>> eTLModuleVisitors = new ArrayList<ETLModuleVisitor<T, R>>();
	protected List<TransformationRuleVisitor<T, R>> transformationRuleVisitors = new ArrayList<TransformationRuleVisitor<T, R>>();
	protected List<RuleDependencyVisitor<T, R>> ruleDependencyVisitors = new ArrayList<RuleDependencyVisitor<T, R>>();
	protected List<ETLElementVisitor<T, R>> eTLElementVisitors = new ArrayList<ETLElementVisitor<T, R>>();
	
	public R visit(EObject o, T context) {
		if (o instanceof NamedBlock && !namedBlockVisitors.isEmpty()) {
			for (NamedBlockVisitor<T, R> visitor : namedBlockVisitors) {
				if (visitor.appliesTo((NamedBlock) o, context)) {
					return visitor.visit((NamedBlock) o, context, this);
				}
			}
		}
		if (o instanceof ETLModule && !eTLModuleVisitors.isEmpty()) {
			for (ETLModuleVisitor<T, R> visitor : eTLModuleVisitors) {
				if (visitor.appliesTo((ETLModule) o, context)) {
					return visitor.visit((ETLModule) o, context, this);
				}
			}
		}
		if (o instanceof TransformationRule && !transformationRuleVisitors.isEmpty()) {
			for (TransformationRuleVisitor<T, R> visitor : transformationRuleVisitors) {
				if (visitor.appliesTo((TransformationRule) o, context)) {
					return visitor.visit((TransformationRule) o, context, this);
				}
			}
		}
		if (o instanceof RuleDependency && !ruleDependencyVisitors.isEmpty()) {
			for (RuleDependencyVisitor<T, R> visitor : ruleDependencyVisitors) {
				if (visitor.appliesTo((RuleDependency) o, context)) {
					return visitor.visit((RuleDependency) o, context, this);
				}
			}
		}
		if (o instanceof ETLElement && !eTLElementVisitors.isEmpty()) {
			for (ETLElementVisitor<T, R> visitor : eTLElementVisitors) {
				if (visitor.appliesTo((ETLElement) o, context)) {
					return visitor.visit((ETLElement) o, context, this);
				}
			}
		}
		
		return super.visit(o, context);
//		return null;
	}
	
	public void visitContents(EObject o, T context) {
		for (EObject content : o.eContents()) {
			visit(content, context);
		}
	}
	
	public R visitAsNamedBlock(NamedBlock namedBlock, T context) {
		if (!namedBlockVisitors.isEmpty()) {
			for (NamedBlockVisitor<T, R> visitor : namedBlockVisitors) {
				if (visitor.appliesTo((NamedBlock) namedBlock, context)) {
					return visitor.visit((NamedBlock) namedBlock, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsETLModule(ETLModule eTLModule, T context) {
		if (!eTLModuleVisitors.isEmpty()) {
			for (ETLModuleVisitor<T, R> visitor : eTLModuleVisitors) {
				if (visitor.appliesTo((ETLModule) eTLModule, context)) {
					return visitor.visit((ETLModule) eTLModule, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsTransformationRule(TransformationRule transformationRule, T context) {
		if (!transformationRuleVisitors.isEmpty()) {
			for (TransformationRuleVisitor<T, R> visitor : transformationRuleVisitors) {
				if (visitor.appliesTo((TransformationRule) transformationRule, context)) {
					return visitor.visit((TransformationRule) transformationRule, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsRuleDependency(RuleDependency ruleDependency, T context) {
		if (!ruleDependencyVisitors.isEmpty()) {
			for (RuleDependencyVisitor<T, R> visitor : ruleDependencyVisitors) {
				if (visitor.appliesTo((RuleDependency) ruleDependency, context)) {
					return visitor.visit((RuleDependency) ruleDependency, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsETLElement(ETLElement eTLElement, T context) {
		if (!eTLElementVisitors.isEmpty()) {
			for (ETLElementVisitor<T, R> visitor : eTLElementVisitors) {
				if (visitor.appliesTo((ETLElement) eTLElement, context)) {
					return visitor.visit((ETLElement) eTLElement, context, this);
				}
			}
		}
		return null;
	}
	
	public boolean addNamedBlockVisitor(NamedBlockVisitor<T, R> namedBlockVisitor) {
		return this.namedBlockVisitors.add(namedBlockVisitor);
	}
	
	public boolean addETLModuleVisitor(ETLModuleVisitor<T, R> eTLModuleVisitor) {
		return this.eTLModuleVisitors.add(eTLModuleVisitor);
	}
	
	public boolean addTransformationRuleVisitor(TransformationRuleVisitor<T, R> transformationRuleVisitor) {
		return this.transformationRuleVisitors.add(transformationRuleVisitor);
	}
	
	public boolean addRuleDependencyVisitor(RuleDependencyVisitor<T, R> ruleDependencyVisitor) {
		return this.ruleDependencyVisitors.add(ruleDependencyVisitor);
	}
	
	public boolean addETLElementVisitor(ETLElementVisitor<T, R> eTLElementVisitor) {
		return this.eTLElementVisitors.add(eTLElementVisitor);
	}
	

	public boolean removeNamedBlockVisitor(NamedBlockVisitor<T, R> namedBlockVisitor) {
		return this.namedBlockVisitors.remove(namedBlockVisitor);
	}
	
	public boolean removeETLModuleVisitor(ETLModuleVisitor<T, R> eTLModuleVisitor) {
		return this.eTLModuleVisitors.remove(eTLModuleVisitor);
	}
	
	public boolean removeTransformationRuleVisitor(TransformationRuleVisitor<T, R> transformationRuleVisitor) {
		return this.transformationRuleVisitors.remove(transformationRuleVisitor);
	}
	
	public boolean removeRuleDependencyVisitor(RuleDependencyVisitor<T, R> ruleDependencyVisitor) {
		return this.ruleDependencyVisitors.remove(ruleDependencyVisitor);
	}
	
	public boolean removeETLElementVisitor(ETLElementVisitor<T, R> eTLElementVisitor) {
		return this.eTLElementVisitors.remove(eTLElementVisitor);
	}
	
	
	
}