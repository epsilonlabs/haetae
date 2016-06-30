package org.eclipse.epsilon.etl.visitor.resolution.type.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.BagType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.SpecialAssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SpecialAssignmentStatementVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.etl.metamodel.RuleDependency;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.EtlTypeResolutionContext;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.TraceUnitContainer;

public class SpecialAssignmentStatementTypeResolver extends SpecialAssignmentStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(SpecialAssignmentStatement specialAssignmentStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//get lhs expression
		Expression lhs = specialAssignmentStatement.getLhs(); 
		//get rhs expression
		Expression rhs = specialAssignmentStatement.getRhs();
		
		//if the lhs is a property call, a name expression or a variable declaration
		if (lhs instanceof PropertyCallExpression || lhs instanceof NameExpression || lhs instanceof VariableDeclarationExpression) {
			//visit rhs
			controller.visit(rhs, context); 
			//visit lhs
			controller.visit(lhs, context); 
			
			//cast the context to be an ETL type resolution context
			EtlTypeResolutionContext leContext = (EtlTypeResolutionContext) context;
			
			
			//if both the lhs and the rhs are model element types
			if (lhs.getResolvedType() instanceof ModelElementType && rhs.getResolvedType() instanceof ModelElementType) {
				//get the rhs type
				ModelElementType rhsType = (ModelElementType) rhs.getResolvedType();
				//get the ecoretype of the rhs type
				EClass ecoreType = (EClass) rhsType.getModelElementType();
				
				//if ecore type is not null
				if (ecoreType != null) {
					//get the depending rule from the context
					TransformationRule dependingRule = leContext.getTraceUnitContainerWhichTransforms(ecoreType).getTransformationRule(); 
					
					//if depending rule is null, return null
					if (dependingRule == null) { 
						LogBook.getInstance().addError(specialAssignmentStatement, "No applicable transformation rule is found");
						return null;
					}
					
					TransformationRule currentRule = leContext.getCurrentRule(); //get the current rule
					if (currentRule != null) { //if the current rule is null
						//create a rule dependency and attach the leads
						RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
						ruleDependency.setDependingRule(dependingRule);
						ruleDependency.setSourceElement(specialAssignmentStatement);
						context.setAssets(ruleDependency, currentRule);

						//resolve the dependency
						currentRule.getResolvedRuleDependencies().add(ruleDependency);
					}
					
					
					
					//if the depending rule has targets
					if (dependingRule.getTargets().size() > 0) {
						//get the first target
						FormalParameterExpression primaryTarget = dependingRule.getTargets().get(0);
						//get the type of the first target
						ModelElementType primaryTargetType = (ModelElementType) primaryTarget.getResolvedType();
						//if the first target type is not null, get the ecore type and set the resolved type to the rhs
						if (primaryTargetType != null) { 
							if (primaryTargetType.getModelElementType() != null) {
								rhs.setResolvedType(EcoreUtil.copy(primaryTargetType));
							}
							else {
								LogBook.getInstance().addError(primaryTarget, "type not resolved properly");
							}
						}
					}
				}
				//if ecore type is null, report error
				else {
					LogBook.getInstance().addError(rhs, "type is not properly resolved");
				}
			}
			//if lhs and rhs are both collections
			else if (lhs.getResolvedType() instanceof CollectionType && rhs.getResolvedType() instanceof CollectionType) {
				//get the type of the rhs
				CollectionType rhsType = (CollectionType) rhs.getResolvedType();
				//get the content type of rhs
 				ModelElementType rhsContentType = (ModelElementType) rhsType.getContentType();
				if (rhsContentType != null) {
					EClass ecoreType = (EClass) rhsContentType.getModelElementType();
					
					ArrayList<TraceUnitContainer> containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType);
					for(TraceUnitContainer tuc : containers)
					{
						TransformationRule dependingRule = tuc.getTransformationRule(); //get the depending rule from the context
						TransformationRule currentRule = leContext.getCurrentRule(); //get the current rul
						if (currentRule != null) { //if the current rule is not null
							RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
							ruleDependency.setDependingRule(dependingRule);
							ruleDependency.setSourceElement(specialAssignmentStatement);
							context.setAssets(ruleDependency, currentRule);

							currentRule.getResolvedRuleDependencies().add(ruleDependency); //resolve the dependency
						}
					}
					BagType bag = EolFactory.eINSTANCE.createBagType();
					bag.setContentType(EolFactory.eINSTANCE.createAnyType());
					rhs.setResolvedType(bag);
					context.setAssets(bag, rhs);


//					TransformationRule dependingRule = leContext.getTraceUnitContainerWhichTransforms(ecoreType, false).getTransformationRule(); //get the depending rule from the context
//					if (dependingRule == null) { //if depending rule is null, return null
//						context.getLogBook().addError(specialAssignmentStatement, "No applicable transformation rule is found");
//						return null;
//					}
//					TransformationRule currentRule = leContext.getCurrentRule(); //get the current rul
//					if (currentRule != null) { //if the current rule is not null
//						RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
//						ruleDependency.setDependingRule(dependingRule);
//						ruleDependency.setSourceElement(specialAssignmentStatement);
//						context.setAssets(ruleDependency, currentRule);
//
//						currentRule.getResolvedRuleDependencies().add(ruleDependency); //resolve the dependency
//					}
//					if (dependingRule.getTargets().size() > 0) { //if the depending rule has targets 
//						FormalParameterExpression primaryTarget = dependingRule.getTargets().get(0); //get the first target
//						ModelElementType primaryTargetType = (ModelElementType) primaryTarget.getResolvedType();
//						if (primaryTargetType != null) { //if the first target is not null
//							if (primaryTargetType.getEcoreType() != null) {
//								BagType bag = context.getEolFactory().createBagType();
//								bag.setContentType(EcoreUtil.copy(primaryTargetType));
//								
//								rhs.setResolvedType(bag);
//								context.setAssets(bag, rhs);
//							}
//							else {
//								context.getLogBook().addError(primaryTarget, "type not resolved properly");
//							}
//						}
//					}
				}
				else {
					LogBook.getInstance().addError(rhs, "type not resolved properly");
				}

			}
		}
		else {
			LogBook.getInstance().addError(lhs, "can only assign values to variables and features");
		}
		return null;
	}
	


}
