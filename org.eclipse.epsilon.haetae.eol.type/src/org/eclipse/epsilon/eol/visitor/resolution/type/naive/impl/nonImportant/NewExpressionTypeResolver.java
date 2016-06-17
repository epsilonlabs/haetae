package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.NewExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class NewExpressionTypeResolver extends NewExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(NewExpression newExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {

		//visit resolved type is enough
		controller.visit(newExpression.getResolvedType(), context);
		return null;
	}

}
