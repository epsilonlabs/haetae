package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.FormalParameterExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class FormalParameterExpressionVariableResolver extends FormalParameterExpressionVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(FormalParameterExpression formalParameterExpression,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//just like VariableDeclarationExpression, put the variable in the frame
		context.getStack().putVariable(formalParameterExpression, false);
		context.storeVariable(formalParameterExpression);
		return null;
	}
 
}
