package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EnumerationLiteralExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class EnumerationLiteralExpressionVariableResolver extends EnumerationLiteralExpressionVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(
			EnumerationLiteralExpression enumerationLiteralExpression,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		// TODO Auto-generated method stub
		return null;
	}

}
