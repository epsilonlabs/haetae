package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.OperationDefinitionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class OperationDefinitionTypeResolver extends OperationDefinitionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(OperationDefinition operationDefinition,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		context.getTypeRegistry().pushScope(operationDefinition);
		for(FormalParameterExpression param: operationDefinition.getParameters())
		{
			controller.visit(param, context);
			context.getTypeRegistry().assignType(param, param.getResolvedType());
		}
		controller.visit(operationDefinition.getContextType(), context);
		context.getTypeRegistry().assignType(operationDefinition.getSelf(), operationDefinition.getContextType());
		//visit body
		controller.visit(operationDefinition.getBody(), context);
		context.getTypeRegistry().popScope();
		return null;
	}

}
