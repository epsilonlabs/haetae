package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.FormalParameterExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class FormalParameterExpressionTypeResolver extends FormalParameterExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(FormalParameterExpression formalParameterExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		controller.visit(formalParameterExpression.getResolvedType(), context);
		return null;
	}
 
}
