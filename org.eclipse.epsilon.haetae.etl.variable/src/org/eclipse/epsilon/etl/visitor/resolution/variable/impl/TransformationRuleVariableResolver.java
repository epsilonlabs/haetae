package org.eclipse.epsilon.etl.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;
import org.eclipse.epsilon.etl.metamodel.visitor.TransformationRuleVisitor;

public class TransformationRuleVariableResolver extends TransformationRuleVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(TransformationRule transformationRule,
			VariableResolutionContext context,
			EtlVisitorController<VariableResolutionContext, Object> controller) {
		
		context.getStack().push(transformationRule, true);
		
		//controller.visit(transformationRule.getName(), context); 
				
		controller.visit(transformationRule.getSource(), context);
		
		for(FormalParameterExpression target: transformationRule.getTargets())
		{
			controller.visit(target, context);
		}
		
		if (transformationRule.getGuard() != null) {
			controller.visit(transformationRule.getGuard(), context);	
		}
		
		controller.visit(transformationRule.getBody(), context);
		
		context.getStack().pop();

		return null;
	}

}
