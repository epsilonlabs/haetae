package org.eclipse.epsilon.haetae.effective.metamodel.extraction.context;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ForStatement;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.WhileStatement;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveFeature;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveMetamodel;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveType;

public class EffectiveMetamodelExtractionContext extends TypeResolutionContext {

	// effectivetype registry, used to register EOL elements with effective types
	protected HashMap<Object, EffectiveType> effectiveTypeRegistry = new HashMap<Object, EffectiveType>();
	
	// effective metamodels
	protected ArrayList<EffectiveMetamodel> effectiveMetamodels = new ArrayList<EffectiveMetamodel>();

	// current assignment statement
	protected AssignmentStatement currentAssignmentStatement = null;

	// map that maps fol method calls with effective features
	protected HashMap<Expression, EffectiveFeature> map = new HashMap<Expression, EffectiveFeature>();

	// get an effective feature from the map
	public EffectiveFeature getFromMap(
			FOLMethodCallExpression folMethodCallExpression) {
		return map.get(folMethodCallExpression);
	}

	// put a pair to the map
	public void putToMap(Expression expression,
			EffectiveFeature effectiveFeature) {
		map.put(expression, effectiveFeature);
	}

	// get the current assignment statement
	public AssignmentStatement getCurrentAssignmentStatement() {
		return currentAssignmentStatement;
	}

	// set the current assignment statement
	public void setCurrentAssignmentStatement(
			AssignmentStatement currentAssignmentStatement) {
		this.currentAssignmentStatement = currentAssignmentStatement;
	}

	// get the effective type from registry with an object
	public EffectiveType getEffectiveTypeFromRegistry(Object object) {
		EffectiveType et = effectiveTypeRegistry.get(object);
		return et;
	}

	// register an effective type with an object
	public void registerEffectiveType(Object object, EffectiveType effectiveType) {
		effectiveTypeRegistry.put(object, effectiveType);
	}

	// add to effective metamodels, if exist return, if not create then return
	public EffectiveMetamodel addEffectiveMetamodel(String modelName,
			String nsURI) {
		EffectiveMetamodel effectiveMetamodel = getEffectiveMetamodel(modelName);
		if (effectiveMetamodel == null) {
			effectiveMetamodel = new EffectiveMetamodel(modelName, nsURI);
			effectiveMetamodels.add(effectiveMetamodel);
		}
		return effectiveMetamodel;
	}

	// add effective type to existing metamodel's allOfType, if metamodel does
	// not exist return null;
	public EffectiveType addEffectiveTypeToAllOfType(EffectiveMetamodel em,
			String effectiveType) {
		return em.addToAllOfType(effectiveType);

	}

	// add effective type to existing metamodel's allOfKind, if metamodel does
	// not exist return null;
	public EffectiveType addEffectiveTypeToAllOfKind(EffectiveMetamodel em,
			String effectiveType) {
		return em.addToAllOfKind(effectiveType);
	}

	public EffectiveMetamodel getEffectiveMetamodel(String modelName) {
		for (EffectiveMetamodel mc : effectiveMetamodels) {
			if (mc.getName().equals(modelName)) {
				return mc;
			}
		}
		return null;
	}

	public ArrayList<EffectiveMetamodel> getEffectiveMetamodels() {
		return effectiveMetamodels;
	}

	public void registerEffectiveTypeWithObject(Object object,
			EffectiveType effectiveType) {
		// get the current assignment statement
		AssignmentStatement currentAssignmentStatement = getCurrentAssignmentStatement();

		if (currentAssignmentStatement != null) {
			// if the rhs of the current assignment is the object provided
			if (currentAssignmentStatement.getRhs().equals(object)) {
				// if the lhs of the current assignment is a variable
				// declaration expression
				if (currentAssignmentStatement.getLhs() instanceof VariableDeclarationExpression) {
					// get the variable declaration expression
					VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) currentAssignmentStatement
							.getLhs();

					// register the effective type with the variable declaration
					// expression
					registerEffectiveType(variableDeclarationExpression,
							effectiveType);
				}

				// if the lhs of the current assignment is a name expression
				else if (currentAssignmentStatement.getLhs() instanceof NameExpression) {
					// get the name expression
					NameExpression nameExpression = (NameExpression) currentAssignmentStatement
							.getLhs();

					// if the name expression has a resolved content and the
					// resolved content is a variable declaration expression
					if (nameExpression.getResolvedContent() != null
							&& nameExpression.getResolvedContent() instanceof VariableDeclarationExpression) {

						// get the resolved content
						VariableDeclarationExpression originalVariableDeclarationExpression = (VariableDeclarationExpression) nameExpression
								.getResolvedContent();
						// register the effective type with the resolved content
						registerEffectiveType(
								originalVariableDeclarationExpression,
								effectiveType);
					}
				}

			}

			registerEffectiveType(object, effectiveType);
		} else {
			registerEffectiveType(object, effectiveType);
		}
	}
	
	public OperationDefinition getContainingOperationDefinition(
			EOLElement eolElement) {
		EOLElement trace = eolElement.getContainer();
		while (trace != null) {
			if (trace instanceof OperationDefinition) {
				return (OperationDefinition) trace;
			}
			trace = trace.getContainer();
		}
		return null;
	}

	// go up through the containment chain return forstatement, whilestatement
	// or operationdefinition if they are encountered
	public EOLElement getTrace(EOLElement eolElement) {
		EOLElement trace = eolElement.getContainer();

		while (trace != null) {
			if ((trace instanceof ForStatement)
					|| (trace instanceof WhileStatement)
					|| (trace instanceof OperationDefinition)) {
				return trace;
			}
			trace = trace.getContainer();
		}

		return null;
	}

	// print the effective metamodels
	public void print() {
		for (EffectiveMetamodel mc : effectiveMetamodels) {
			System.out.println("Model: " + mc.getName());
			for (EffectiveType mec : mc.getAllOfType()) {
				System.out.println("	allOfType: " + mec.getName());
				for (EffectiveFeature attr : mec.getAttributes()) {
					System.out.println("		Attr: " + attr.getName());
				}
				for (EffectiveFeature ref : mec.getReferences()) {
					System.out.println("		Ref: " + ref.getName());
				}
			}
			for (EffectiveType mec : mc.getAllOfKind()) {
				System.out.println("	allOfKind: " + mec.getName());
				for (EffectiveFeature attr : mec.getAttributes()) {
					System.out.println("		Attr: " + attr.getName());
				}
				for (EffectiveFeature ref : mec.getReferences()) {
					System.out.println("		Ref: " + ref.getName());
				}
			}
			for (EffectiveType mec : mc.getTypes()) {
				System.out.println("	types: " + mec.getName());
				for (EffectiveFeature attr : mec.getAttributes()) {
					System.out.println("		Attr: " + attr.getName());
				}
				for (EffectiveFeature ref : mec.getReferences()) {
					System.out.println("		Ref: " + ref.getName());
				}
			}
		}
	}
}
