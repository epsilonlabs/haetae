package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler.OperationDefinitionHandlerFactory;

public class OperationDefinitionManager {

	protected static OperationDefinitionManager instance = null;
	
	protected UserDefinedOperationDefinitionContainer userDefinedOperations; //used to store user defined oeprations
	protected StandardLibraryOperationDefinitionContainer standardLibraryOperations; //used to store standard library operations
	protected OperationDefinitionHandlerFactory handlerFactory;
	
	protected HashSet<OperationDefinition> handledOperationDefinitions;
	
	protected OperationDefinitionManager()
	{
		
		userDefinedOperations = new UserDefinedOperationDefinitionContainer();
		standardLibraryOperations = new StandardLibraryOperationDefinitionContainer();
		handlerFactory = new OperationDefinitionHandlerFactory();
		handledOperationDefinitions = new HashSet<OperationDefinition>();
	}
	
	public HashSet<OperationDefinition> getHandledOperationDefinitions() {
		return handledOperationDefinitions;
	}
	
	public boolean handled(OperationDefinition operationDefinition)
	{
		return handledOperationDefinitions.contains(operationDefinition);
	}
	
	public void registerHandledOperationDefinition(OperationDefinition operationDefinition)
	{
		handledOperationDefinitions.add(operationDefinition);
	}
	
	public static OperationDefinitionManager getInstance()
	{
		if (instance == null) {
			instance = new OperationDefinitionManager();
		}
		return instance;
	}
	
	public static OperationDefinitionManager getInstance(boolean initialise)
	{
		if (initialise) {
			instance = new OperationDefinitionManager();
			return instance;	
		}
		else {
			return getInstance();
		}
		
	}
	
	public OperationDefinitionHandlerFactory getHandlerFactory()
	{
		return handlerFactory;
	}
	
	public StandardLibraryOperationDefinitionContainer getStandardLibraryOperationDefinitionContainer()
	{
		return standardLibraryOperations;
	}
	
	
	public void putOperationDefinition(OperationDefinition operation)
	{
		userDefinedOperations.putOperation(operation);
	}
	
	public OperationDefinition getOperation(FeatureCallExpression methodCallExpression, String name, Type contextType, ArrayList<Type> argTypes, boolean priority) throws AnalysisInterruptException
	{
		OperationDefinition operation = null; //prepare the result
		if (!priority) { //if priority is given to the userdefined operations
			operation = userDefinedOperations.getOperation(name, contextType, argTypes); //get operation from the user defined opeartions
			if (operation == null) { //if there is no operation in the user defined operations
				operation = standardLibraryOperations.getOperation(name, contextType, argTypes); //look for standard library
				if (operation != null) { //if there's an operation in the standard library
					OperationDefinition temp = handlerFactory.handle(methodCallExpression, name, contextType, argTypes);
					if (temp != null) {
						operation = temp;
					}
				}
			}
		}
		else { //if priority is given to the standard library
			operation = standardLibraryOperations.getOperation(name, contextType, argTypes); //look for standard library
			
			if (operation == null) { //if there is no operation in the standard library
				operation = userDefinedOperations.getOperation(name, contextType, argTypes); //assign operation
			}
			else { //if there is operation in the standard library, proceed as before
				OperationDefinition temp = handlerFactory.handle(methodCallExpression, name, contextType, argTypes);
				if (temp != null) {
					operation = temp;
				}
			}
		}
		return operation;
	}

	public boolean containsOperation(String name, Type contextType, ArrayList<Type> argTypes)
	{
		return userDefinedOperations.containsOperation(name, contextType, argTypes);
	}
	
	public OperationDefinition getOperation(String name, Type contextType, ArrayList<Type> argTypes)
	{
		return userDefinedOperations.getOperation(name, contextType, argTypes);
	}
	
	public boolean isStandardLibraryOperationDefinition(OperationDefinition operationDefinition)
	{
		return standardLibraryOperations.getOperations().contains(operationDefinition);
	}
	
	
	
}
