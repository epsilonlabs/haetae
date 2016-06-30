package org.eclipse.epsilon.etl.visitor.resolution.type.handler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.BagType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler.AnyOperationDefinitionHandler;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.etl.metamodel.RuleDependency;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.EtlTypeResolutionContext;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.TraceUnitContainer;

public class EquivalentHandler extends AnyOperationDefinitionHandler{

	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) {
		
		//get the standard library operation definition contianer (quite a long name i know...)
		StandardLibraryOperationDefinitionContainer container = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		OperationDefinition result = null;
		
		if (argTypes.size() != 0) {
			//get the operation by name and arg types
			result = container.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		}
		
		else {
			//get the operation by name and arg types
			result = container.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), new ArrayList<Type>());
		}
		
		if (result != null) {
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);
		}
		
		ArrayList<StringExpression> parameters = new ArrayList<StringExpression>();
		
		MethodCallExpression mce = (MethodCallExpression) featureCallExpression;
		for(Expression expr: mce.getArguments())
		{
			if (expr.getResolvedType() instanceof StringType) {
				if (expr instanceof StringExpression) {
					parameters.add((StringExpression) expr);
				}
				else {
					LogBook.getInstance().addWarning(expr, "use of String expression is recommended");
				}
			}
			else {
				LogBook.getInstance().addError(expr, "This expression should be of type String");
			}
		}

		//get the target of the feature call expression
		Expression target = featureCallExpression.getTarget();
		
		//cast the context to be the etl type resolution context
		EtlTypeResolutionContext leContext = EtlTypeResolutionContext.getInstanace();
		
		//if the target has a resolved type
		if (target.getResolvedType() != null) {
			//if target type is model element type
			if (target.getResolvedType() instanceof ModelElementType) {
				//get the target type
				ModelElementType targetType = (ModelElementType) target.getResolvedType();

				//get the ecore type from the target type
				EClass ecoreType = (EClass) targetType.getModelElementType(); 
				ArrayList<TraceUnitContainer> containers = null;
				if (parameters.size() == 0) {
					containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType);
				}
				else {
					containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType, parameters);
				}
				//get the containers
				//ArrayList<TraceUnitContainer> containers = leContext.getTraceUnitContainersForEquivalent(ecoreType);
				//if there are no containers found, report error
				if (containers.size() == 0) {
					LogBook.getInstance().addError(featureCallExpression, "No applicable transformation rule is found");
					return null;
				}
				//if there are contianers
				else {
					TraceUnitContainer tuc = containers.get(0);
					//get the depending rule 
					TransformationRule dependingRule = tuc.getTransformationRule();
					//get the current rule
					TransformationRule currentRule = leContext.getCurrentRule();
					//if the current rule is not null
					if (currentRule != null) {
						//create rule dependency and attach the leads
						RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
						ruleDependency.setDependingRule(dependingRule);
						ruleDependency.setSourceElement(featureCallExpression);
						leContext.setAssets(ruleDependency, currentRule);

						//resolve the dependency
						currentRule.getResolvedRuleDependencies().add(ruleDependency); 
					}
					//iterate
//					for(TraceUnitContainer tuc : containers)
//					{
//						//get the depending rule 
//						TransformationRule dependingRule = tuc.getTransformationRule();
//						//get the current rule
//						TransformationRule currentRule = leContext.getCurrentRule();
//						//if the current rule is not null
//						if (currentRule != null) {
//							//create rule dependency and attach the leads
//							RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
//							ruleDependency.setDependingRule(dependingRule);
//							ruleDependency.setSourceElement(featureCallExpression);
//							leContext.setAssets(ruleDependency, currentRule);
//
//							//resolve the dependency
//							currentRule.getResolvedRuleDependencies().add(ruleDependency); 
//						}
//					}
					
					//get the first rule
					TransformationRule firstRule = containers.get(0).getTransformationRule();
					
					//if the depending rule has targets
					if (firstRule.getTargets().size() > 0) {
						//get the first target
						FormalParameterExpression primaryTarget = firstRule.getTargets().get(0); 
						//get the type fot he primary target
						ModelElementType primaryTargetType = (ModelElementType) primaryTarget.getResolvedType();
						//if the first target is not null
						if (primaryTargetType != null) {
							if (primaryTargetType.getModelElementType() != null) {
								result.setReturnType(EcoreUtil.copy(primaryTargetType));
							}
							else {
								LogBook.getInstance().addError(primaryTarget, "type not resolved properly");
							}
						}
					}
				}
			}
			//else if target type is a collection type
			else if (target.getResolvedType() instanceof CollectionType) {
				//get the target type
				CollectionType targetType = (CollectionType) target.getResolvedType();
				
				if (targetType.getContentType() != null) {
					//get the target content type
					ModelElementType targetContentType = (ModelElementType) targetType.getContentType();
					
					//get the target ecore type
					EClass ecoreType = (EClass) targetContentType.getModelElementType();
					
					//get the containers with the ecore
					ArrayList<TraceUnitContainer> containers = null;
					
					if (parameters.size() == 0) {
						containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType);

					}
					else {
						containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType, parameters);
					}

					
					//if no containers, report error
					if (containers.size() == 0) {
						LogBook.getInstance().addError(featureCallExpression, "No applicable transformation rule is found");
						return null;
					}

					//iterate TUCs, TUC rules
					for(TraceUnitContainer tuc : containers)
					{
						//get the depending rule from the context
						TransformationRule dependingRule = tuc.getTransformationRule();
						//get the current rule
						TransformationRule currentRule = leContext.getCurrentRule();
						//if the current rule is not null
						if (currentRule != null) { 
							//create rule dependency and attach the leads
							RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
							ruleDependency.setDependingRule(dependingRule);
							ruleDependency.setSourceElement(featureCallExpression);
							leContext.setAssets(ruleDependency, currentRule);
							
							//resolve the dependency
							currentRule.getResolvedRuleDependencies().add(ruleDependency); 
						}
					}
					//create a bag type and assign it to the result
					BagType bag = EolFactory.eINSTANCE.createBagType();
					bag.setContentType(EolFactory.eINSTANCE.createAnyType());
					result.setReturnType(bag);
					leContext.setAssets(bag, result);
				
				}
				else {
					LogBook.getInstance().addError(targetType, "type not resolved properly");
				}
			}
			else {
				LogBook.getInstance().addError(target, "operaiton equivalents() can only be used on model elements and collections"); 
			}
			//supressErrorForAssignment(featureCallExpression);
			return result;
		}
		else {
			return null;
		}
	}
	
	public void supressErrorForAssignment(FeatureCallExpression featureCallExpression)
	{
		EOLElement container = featureCallExpression;
		Expression rhs = null;
		while(container != null)
		{
			if (container.getContainer() instanceof AssignmentStatement) {
				rhs = (Expression) container;
				EtlTypeResolutionContext leContext = EtlTypeResolutionContext.getInstanace();
				leContext.addSupression(rhs);
//				ArrayList<log.Error> errors = LogBook.getInstance().getErrors();
//				for(log.Error error: errors)
//				{
//					if (error.getDomElement().equals(rhs)) {
//						errors.remove(error);
//					}
//				}
//				LogBook.getInstance().addWarning(rhs, "potential type mismatch");
				break;
			}
			container = container.getContainer();
		}
	}

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		return name.equals("equivalent");
	}	
}
