package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.OperationDefinitionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class OperationDefinitionVariableResolver extends OperationDefinitionVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(OperationDefinition operationDefinition,
			VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//push to the stack
		context.getStack().push(operationDefinition, true);
		//put self into the frame
		if (operationDefinition.getSelf() != null) {
			context.getStack().putVariable(operationDefinition.getSelf(), false); //put 'self'
		}
		//put result into the frame
		if (operationDefinition.get_result() != null) {
			context.getStack().putVariable(operationDefinition.get_result(), false); //put "_result"
		}
		//visit annotation block 
		if(operationDefinition.getAnnotationBlock()!= null)
		{
			controller.visit(operationDefinition.getAnnotationBlock(), context);
		}
		//visit parameter
		for(FormalParameterExpression param: operationDefinition.getParameters())
		{
			controller.visit(param, context);
		}
		//visit the body
		controller.visit(operationDefinition.getBody(), context);
		//pop from the stack
		context.getStack().pop();
		return null;
	}
}
