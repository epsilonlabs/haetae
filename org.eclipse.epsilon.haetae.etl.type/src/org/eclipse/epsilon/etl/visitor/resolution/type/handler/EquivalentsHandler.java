package org.eclipse.epsilon.etl.visitor.resolution.type.handler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.BagType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.SequenceType;
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

public class EquivalentsHandler extends AnyOperationDefinitionHandler{


	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) {
		
		StandardLibraryOperationDefinitionContainer container = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		OperationDefinition result = null;
		if (argTypes.size() == 0) {
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

		Expression target = featureCallExpression.getTarget();
		EtlTypeResolutionContext leContext = EtlTypeResolutionContext.getInstanace();

		if (target.getResolvedType() instanceof ModelElementType) {
			ModelElementType targetType = (ModelElementType) target.getResolvedType(); //get the target typ
			if (targetType != null) { //if target type is not null
				EClass ecoreType = (EClass) targetType.getModelElementType(); //get the ecore type from the target type
				
				ArrayList<TraceUnitContainer> containers = null;
				if (parameters.size() == 0) {
					containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType);
				}
				else {
					containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType, parameters);
				}

//				ArrayList<TraceUnitContainer> containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType);

				for(TraceUnitContainer tuc : containers)
				{
					TransformationRule dependingRule = tuc.getTransformationRule(); //get the depending rule from the context
					TransformationRule currentRule = leContext.getCurrentRule(); //get the current rul
					if (currentRule != null) { //if the current rule is not null
						RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
						ruleDependency.setDependingRule(dependingRule);
						ruleDependency.setSourceElement(featureCallExpression);
						leContext.setAssets(ruleDependency, currentRule);

						currentRule.getResolvedRuleDependencies().add(ruleDependency); //resolve the dependency
					}
				}
				SequenceType sequenceType = EolFactory.eINSTANCE.createSequenceType();
//				BagType bag2 = context.getEolFactory().createBagType();
//				bag2.setContentType(context.getEolFactory().createAnyType());
//				context.setAssets(bag2, bag);
//				bag.setContentType(bag2);
				sequenceType.setContentType(EolFactory.eINSTANCE.createAnyType());
				
				result.setReturnType(sequenceType);
				leContext.setAssets(sequenceType, result);

				
//				TransformationRule dependingRule = leContext.getTraceUnitContainerWhichTransforms(ecoreType).getTransformationRule(); //get the depending rule from the context
//				if (dependingRule == null) { //if depending rule is null, return null
//					LogBook.getInstance().addError(featureCallExpression, "No applicable transformation rule is found");
//					return null;
//				}
//				TransformationRule currentRule = leContext.getCurrentRule(); //get the current rul
//				if (currentRule != null) { //if the current rule is not null
//					RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
//					ruleDependency.setDependingRule(dependingRule);
//					ruleDependency.setSourceElement(featureCallExpression);
//					context.setAssets(ruleDependency, currentRule);
//
//					currentRule.getResolvedRuleDependencies().add(ruleDependency); //resolve the dependency
//				}
//				if (dependingRule.getTargets().size() > 0) { //if the depending rule has targets 
//					FormalParameterExpression primaryTarget = dependingRule.getTargets().get(0); //get the first target
//					ModelElementType primaryTargetType = (ModelElementType) primaryTarget.getResolvedType();
//					if (primaryTargetType != null) { //if the first target is not null
//						if (primaryTargetType.getEcoreType() != null) {
//							result.setReturnType(EcoreUtil.copy(primaryTargetType));
//						}
//						else {
//							LogBook.getInstance().addError(primaryTarget, "type not resolved properly");
//						}
//					}
//				}
			}

		}
		else if (target.getResolvedType() instanceof CollectionType) {
			CollectionType targetType = (CollectionType) target.getResolvedType();
			ModelElementType targetContentType = (ModelElementType) targetType.getContentType();
			if (targetContentType != null) {
				EClass ecoreType = (EClass) targetContentType.getModelElementType();
				
				ArrayList<TraceUnitContainer> containers = null;
				
				if (parameters.size() == 0) {
					containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType);

				}
				else {
					containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType, parameters);
				}

//				ArrayList<TraceUnitContainer> containers = leContext.getTraceUnitContainersWhichTransforms(ecoreType);
				for(TraceUnitContainer tuc : containers)
				{
					TransformationRule dependingRule = tuc.getTransformationRule(); //get the depending rule from the context
					TransformationRule currentRule = leContext.getCurrentRule(); //get the current rul
					if (currentRule != null) { //if the current rule is not null
						RuleDependency ruleDependency = leContext.getEtlFactory().createRuleDependency();
						ruleDependency.setDependingRule(dependingRule);
						ruleDependency.setSourceElement(featureCallExpression);
						leContext.setAssets(ruleDependency, currentRule);

						currentRule.getResolvedRuleDependencies().add(ruleDependency); //resolve the dependency
					}
				}
				BagType bag = EolFactory.eINSTANCE.createBagType();
				BagType bag2 = EolFactory.eINSTANCE.createBagType();
				bag2.setContentType(EolFactory.eINSTANCE.createAnyType());
				leContext.setAssets(bag2, bag);
				bag.setContentType(bag2);
				
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
		supressErrorForAssignment(featureCallExpression);
		return result;
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
		return name.equals("equivalents");
	}

}
