package org.eclipse.epsilon.etl.visitor.resolution.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.eol.metamodel.AnnotationBlock;
import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;
import org.eclipse.epsilon.etl.metamodel.visitor.TransformationRuleVisitor;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.EtlTypeResolutionContext;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.TraceUnitContainer;

public class TransformationRuleTypeResolver extends TransformationRuleVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(TransformationRule transformationRule,
			TypeResolutionContext context,
			EtlVisitorController<TypeResolutionContext, Object> controller) {
		
		context.getTypeRegistry().pushScope(transformationRule);//////////
		
		//cast the context to be the etl type resolution context
		EtlTypeResolutionContext leContext = (EtlTypeResolutionContext) context;
		//set the current rule to be this rule
		leContext.setCurrentRule(transformationRule);
		
		leContext.addToVisitedRules(transformationRule);
		
		//get the annotation block, if not null, visit it
		AnnotationBlock annotationBlock = transformationRule.getAnnotationBlock();
		if (annotationBlock != null) {
			controller.visit(annotationBlock, context);
		}
		
		//get the source, if not null, visit it
		FormalParameterExpression source = transformationRule.getSource();
		if (source != null) {
			controller.visit(source, context);
			if (!TypeUtil.getInstance().isInstanceofAnyType(source.getResolvedType())) {
				context.getTypeRegistry().assignType(source, source.getResolvedType());
			}
			
		}
		else {
			//
		}
		
		//iterate the targets, and visit
		for(FormalParameterExpression target: transformationRule.getTargets())
		{
			controller.visit(target, context);
			if (!TypeUtil.getInstance().isInstanceofAnyType(target.getResolvedType())) {
				context.getTypeRegistry().assignType(target, target.getResolvedType());
			}
		}
		
		//get the guard, if not null, visit it
		ExpressionOrStatementBlock guard = transformationRule.getGuard();
		if (guard != null) {
			if (guard.getExpression() != null) {
				Expression expression = guard.getExpression();
				controller.visit(expression, leContext);
				if (!(expression.getResolvedType() instanceof BooleanType)) {
					LogBook.getInstance().addError(expression, IMessage_TypeResolution.EXPRESSION_EXPECTED_BOOLEAN);
				}
			}
			else if (guard.getBlock() != null) {
				for(Statement stmt: guard.getBlock().getStatements())
				{
					controller.visit(stmt, leContext);
					if (stmt instanceof ExpressionStatement) {
						if (!(((ExpressionStatement) stmt).getExpression() instanceof BooleanType)) {
							LogBook.getInstance().addError(((ExpressionStatement) stmt).getExpression(), IMessage_TypeResolution.EXPRESSION_EXPECTED_BOOLEAN);
						}
					}
					else if (stmt instanceof AssignmentStatement) {
						
					}
					else {
						LogBook.getInstance().addError(stmt, "Expected expression statement");
					}
				}
			}
		}
		
		//visit body if not null
		Block body = transformationRule.getBody();
		if (body != null) {
			controller.visit(body, context);
		}
		
		if (transformationRule.getExtends().size() > 0) {
			for(NameExpression name: transformationRule.getExtends())
			{
				String ruleName = name.getName();
				TraceUnitContainer tuc = leContext.getTraceUnitContainer(ruleName);
				if (tuc == null) {
					LogBook.getInstance().addError(name, "transformation rule " + name.getName() + " is not found");
				}
				else {
					TransformationRule rule = tuc.getTransformationRule();
					if (!leContext.visitedRule(rule)) {
						controller.visit(rule, leContext);
					}
					
					Type source1 = transformationRule.getSource().getResolvedType();
					Type source2 = rule.getSource().getResolvedType(); 
					if (!TypeUtil.getInstance().isTypeEqualOrGeneric(source1, source2)) {
						LogBook.getInstance().addError(name, "Rule " + ruleName + " transforms a source that is not a super class of rule " + transformationRule.getName().getName());
					}
					
					for(int i = 0; i < transformationRule.getTargets().size(); i++)
					{
						Type target1 = transformationRule.getTargets().get(i).getResolvedType();
						if (rule.getTargets().get(i) != null) {
							Type target2 = rule.getTargets().get(i).getResolvedType();
							if (!TypeUtil.getInstance().isTypeEqualOrGeneric(target1, target2)) {
								LogBook.getInstance().addError(name, "Rule " + ruleName + " transforms to a target that is not a super class of the target for rule " + transformationRule.getName().getName());
							}
						}
						
					}
					transformationRule.getResolvedParentRules().add(rule);
				}
			}
		}
		
		context.getTypeRegistry().popScope();//////////
		return null;
	}
	
	
	public EClass getEcoreType(FormalParameterExpression fpe)
	{
		//get the MET, if not null, get the ecore of it
		ModelElementType met = (ModelElementType) fpe.getResolvedType();
		if (met != null) {
			EClass eClass = (EClass) met.getModelElementType();
			return eClass;
		}
		else {
			return null;
		}
	}

}
