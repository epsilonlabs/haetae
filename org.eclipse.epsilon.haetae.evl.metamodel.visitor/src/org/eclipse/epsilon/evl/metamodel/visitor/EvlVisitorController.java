package org.eclipse.epsilon.evl.metamodel.visitor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.evl.metamodel.Constraint;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Critique;
import org.eclipse.epsilon.evl.metamodel.EVLModule;
import org.eclipse.epsilon.evl.metamodel.EvlElement;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.metamodel.GuardedElement;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.metamodel.NamedBlock;

public class EvlVisitorController<T, R> extends EolVisitorController<T, R> {

	protected List<ConstraintVisitor<T, R>> constraintVisitors = new ArrayList<ConstraintVisitor<T, R>>();
	protected List<CritiqueVisitor<T, R>> critiqueVisitors = new ArrayList<CritiqueVisitor<T, R>>();
	protected List<ContextVisitor<T, R>> contextVisitors = new ArrayList<ContextVisitor<T, R>>();
	protected List<InvariantVisitor<T, R>> invariantVisitors = new ArrayList<InvariantVisitor<T, R>>();
	protected List<EVLModuleVisitor<T, R>> eVLModuleVisitors = new ArrayList<EVLModuleVisitor<T, R>>();
	protected List<GuardedElementVisitor<T, R>> guardedElementVisitors = new ArrayList<GuardedElementVisitor<T, R>>();
	protected List<FixVisitor<T, R>> fixVisitors = new ArrayList<FixVisitor<T, R>>();
	protected List<NamedBlockVisitor<T, R>> namedBlockVisitors = new ArrayList<NamedBlockVisitor<T, R>>();
	protected List<EvlElementVisitor<T, R>> evlElementVisitors = new ArrayList<EvlElementVisitor<T, R>>();
	
	public R visit(EObject o, T context) {
		if (o instanceof Constraint && !constraintVisitors.isEmpty()) {
			for (ConstraintVisitor<T, R> visitor : constraintVisitors) {
				if (visitor.appliesTo((Constraint) o, context)) {
					return visitor.visit((Constraint) o, context, this);
				}
			}
		}
		if (o instanceof Critique && !critiqueVisitors.isEmpty()) {
			for (CritiqueVisitor<T, R> visitor : critiqueVisitors) {
				if (visitor.appliesTo((Critique) o, context)) {
					return visitor.visit((Critique) o, context, this);
				}
			}
		}
		if (o instanceof Context && !contextVisitors.isEmpty()) {
			for (ContextVisitor<T, R> visitor : contextVisitors) {
				if (visitor.appliesTo((Context) o, context)) {
					return visitor.visit((Context) o, context, this);
				}
			}
		}
		if (o instanceof Invariant && !invariantVisitors.isEmpty()) {
			for (InvariantVisitor<T, R> visitor : invariantVisitors) {
				if (visitor.appliesTo((Invariant) o, context)) {
					return visitor.visit((Invariant) o, context, this);
				}
			}
		}
		if (o instanceof EVLModule && !eVLModuleVisitors.isEmpty()) {
			for (EVLModuleVisitor<T, R> visitor : eVLModuleVisitors) {
				if (visitor.appliesTo((EVLModule) o, context)) {
					return visitor.visit((EVLModule) o, context, this);
				}
			}
		}
		if (o instanceof GuardedElement && !guardedElementVisitors.isEmpty()) {
			for (GuardedElementVisitor<T, R> visitor : guardedElementVisitors) {
				if (visitor.appliesTo((GuardedElement) o, context)) {
					return visitor.visit((GuardedElement) o, context, this);
				}
			}
		}
		if (o instanceof Fix && !fixVisitors.isEmpty()) {
			for (FixVisitor<T, R> visitor : fixVisitors) {
				if (visitor.appliesTo((Fix) o, context)) {
					return visitor.visit((Fix) o, context, this);
				}
			}
		}
		if (o instanceof NamedBlock && !namedBlockVisitors.isEmpty()) {
			for (NamedBlockVisitor<T, R> visitor : namedBlockVisitors) {
				if (visitor.appliesTo((NamedBlock) o, context)) {
					return visitor.visit((NamedBlock) o, context, this);
				}
			}
		}
		if (o instanceof EvlElement && !evlElementVisitors.isEmpty()) {
			for (EvlElementVisitor<T, R> visitor : evlElementVisitors) {
				if (visitor.appliesTo((EvlElement) o, context)) {
					return visitor.visit((EvlElement) o, context, this);
				}
			}
		}
		
		return super.visit(o, context);
		//return null;
	}
	
	public void visitContents(EObject o, T context) {
		for (EObject content : o.eContents()) {
			visit(content, context);
		}
	}
	
	public R visitAsConstraint(Constraint constraint, T context) {
		if (!constraintVisitors.isEmpty()) {
			for (ConstraintVisitor<T, R> visitor : constraintVisitors) {
				if (visitor.appliesTo((Constraint) constraint, context)) {
					return visitor.visit((Constraint) constraint, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsCritique(Critique critique, T context) {
		if (!critiqueVisitors.isEmpty()) {
			for (CritiqueVisitor<T, R> visitor : critiqueVisitors) {
				if (visitor.appliesTo((Critique) critique, context)) {
					return visitor.visit((Critique) critique, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsContext(Context _context, T context) {
		if (!contextVisitors.isEmpty()) {
			for (ContextVisitor<T, R> visitor : contextVisitors) {
				if (visitor.appliesTo((Context) context, context)) {
					return visitor.visit((Context) context, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsInvariant(Invariant invariant, T context) {
		if (!invariantVisitors.isEmpty()) {
			for (InvariantVisitor<T, R> visitor : invariantVisitors) {
				if (visitor.appliesTo((Invariant) invariant, context)) {
					return visitor.visit((Invariant) invariant, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsEVLModule(EVLModule eVLModule, T context) {
		if (!eVLModuleVisitors.isEmpty()) {
			for (EVLModuleVisitor<T, R> visitor : eVLModuleVisitors) {
				if (visitor.appliesTo((EVLModule) eVLModule, context)) {
					return visitor.visit((EVLModule) eVLModule, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsGuardedElement(GuardedElement guardedElement, T context) {
		if (!guardedElementVisitors.isEmpty()) {
			for (GuardedElementVisitor<T, R> visitor : guardedElementVisitors) {
				if (visitor.appliesTo((GuardedElement) guardedElement, context)) {
					return visitor.visit((GuardedElement) guardedElement, context, this);
				}
			}
		}
		return null;
	}
	public R visitAsFix(Fix fix, T context) {
		if (!fixVisitors.isEmpty()) {
			for (FixVisitor<T, R> visitor : fixVisitors) {
				if (visitor.appliesTo((Fix) fix, context)) {
					return visitor.visit((Fix) fix, context, this);
				}
			}
		}
		return null;
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
	public R visitAsEvlElement(EvlElement evlElement, T context) {
		if (!evlElementVisitors.isEmpty()) {
			for (EvlElementVisitor<T, R> visitor : evlElementVisitors) {
				if (visitor.appliesTo((EvlElement) evlElement, context)) {
					return visitor.visit((EvlElement) evlElement, context, this);
				}
			}
		}
		return null;
	}
	
	public boolean addConstraintVisitor(ConstraintVisitor<T, R> constraintVisitor) {
		return this.constraintVisitors.add(constraintVisitor);
	}
	
	public boolean addCritiqueVisitor(CritiqueVisitor<T, R> critiqueVisitor) {
		return this.critiqueVisitors.add(critiqueVisitor);
	}
	
	public boolean addContextVisitor(ContextVisitor<T, R> contextVisitor) {
		return this.contextVisitors.add(contextVisitor);
	}
	
	public boolean addInvariantVisitor(InvariantVisitor<T, R> invariantVisitor) {
		return this.invariantVisitors.add(invariantVisitor);
	}
	
	public boolean addEVLModuleVisitor(EVLModuleVisitor<T, R> eVLModuleVisitor) {
		return this.eVLModuleVisitors.add(eVLModuleVisitor);
	}
	
	public boolean addGuardedElementVisitor(GuardedElementVisitor<T, R> guardedElementVisitor) {
		return this.guardedElementVisitors.add(guardedElementVisitor);
	}
	
	public boolean addFixVisitor(FixVisitor<T, R> fixVisitor) {
		return this.fixVisitors.add(fixVisitor);
	}
	
	public boolean addNamedBlockVisitor(NamedBlockVisitor<T, R> namedBlockVisitor) {
		return this.namedBlockVisitors.add(namedBlockVisitor);
	}
	
	public boolean addEvlElementVisitor(EvlElementVisitor<T, R> evlElementVisitor) {
		return this.evlElementVisitors.add(evlElementVisitor);
	}
	

	public boolean removeConstraintVisitor(ConstraintVisitor<T, R> constraintVisitor) {
		return this.constraintVisitors.remove(constraintVisitor);
	}
	
	public boolean removeCritiqueVisitor(CritiqueVisitor<T, R> critiqueVisitor) {
		return this.critiqueVisitors.remove(critiqueVisitor);
	}
	
	public boolean removeContextVisitor(ContextVisitor<T, R> contextVisitor) {
		return this.contextVisitors.remove(contextVisitor);
	}
	
	public boolean removeInvariantVisitor(InvariantVisitor<T, R> invariantVisitor) {
		return this.invariantVisitors.remove(invariantVisitor);
	}
	
	public boolean removeEVLModuleVisitor(EVLModuleVisitor<T, R> eVLModuleVisitor) {
		return this.eVLModuleVisitors.remove(eVLModuleVisitor);
	}
	
	public boolean removeGuardedElementVisitor(GuardedElementVisitor<T, R> guardedElementVisitor) {
		return this.guardedElementVisitors.remove(guardedElementVisitor);
	}
	
	public boolean removeFixVisitor(FixVisitor<T, R> fixVisitor) {
		return this.fixVisitors.remove(fixVisitor);
	}
	
	public boolean removeNamedBlockVisitor(NamedBlockVisitor<T, R> namedBlockVisitor) {
		return this.namedBlockVisitors.remove(namedBlockVisitor);
	}
	
	public boolean removeEvlElementVisitor(EvlElementVisitor<T, R> evlElementVisitor) {
		return this.evlElementVisitors.remove(evlElementVisitor);
	}
	
	
	
}