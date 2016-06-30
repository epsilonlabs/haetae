package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;

public abstract class OperationDefinitionHandler {

	public abstract boolean appliesTo(String name, Type contextType, ArrayList<Type> argTypes);
	
	public abstract OperationDefinition handle(FeatureCallExpression featureCallExpression, Type contextType, ArrayList<Type> argTypes) throws AnalysisInterruptException;
}
