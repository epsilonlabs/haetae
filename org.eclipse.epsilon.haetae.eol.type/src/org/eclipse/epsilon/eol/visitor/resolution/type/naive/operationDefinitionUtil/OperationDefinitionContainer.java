package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class OperationDefinitionContainer {

	protected ArrayList<OperationDefinition> operations;
	protected TypeUtil typeUtil;
	
	public OperationDefinitionContainer()
	{
		operations = new ArrayList<OperationDefinition>();
		typeUtil = TypeUtil.getInstance();
	}
	
	//returns true if there is one operationdefinition which has exactly the same context type and name, and (vague) parameter types
	public boolean containsOperation(String name, Type contextType, ArrayList<Type> argTypes)
	{
		boolean result = false;
		for(OperationDefinition op: operations) //for each operation in the operations
		{
			if (op.getName().getName().equals(name)) { //if name equals
 				if (typeUtil.isTypeEqual(contextType, op.getContextType())) { //if context types are compatible
					if (op.getParameters().size() == argTypes.size()) { //if number of arguments equals
						if (op.getParameters().size() == 0) { //if size is 0 should return true
							result = true;
							return result;
						}
						else { //if number of arguments is not 0
							for (int i = 0; i < op.getParameters().size(); i++) { //for each of the parameter
								Type a = argTypes.get(i); //get the arg type in question
								Type b = op.getParameters().get(i).getResolvedType(); // get the actual parameter type
								result = typeUtil.isTypeEqualOrGeneric(a, b); //if a and b is equal or generic
								if (!result) {
									break;
								}
							}
							if (result) {
								return true;
							}
						}
					}
				}
			}
		}		
		return result;
	}
	
	//get the operation which is most feasible in terms of contextType
	public OperationDefinition getOperation(String name, Type contextType, ArrayList<Type> argTypes)
	{
		ArrayList<OperationDefinition> list = getOperations(name, argTypes);
		if (list == null) {
			return null;
		}
		else {
			int index = -1;
			int depth = 999;
			for (int i = 0; i < list.size(); i++) {
				OperationDefinition op = list.get(i);
				int distance = typeUtil.shortestDistanceBetweenObject(contextType, op.getContextType());
				if (distance < depth) {
					depth = distance;
					index = i;
				}
			}
			return list.get(index);
		}		
	}
	
	//returns a list of operations which has the same name and number (and type or generic type) of arguments
	public ArrayList<OperationDefinition> getOperations(String name, ArrayList<Type> argTypes)
	{
		ArrayList<OperationDefinition> result = new ArrayList<OperationDefinition>();//initialise the result
		for(OperationDefinition op: operations) //for every operation
		{
			if(op.getName().getName().equals(name)) //if name is the same
			{
				if (op.getParameters().size() == argTypes.size()) { //if same argument type
					if (op.getParameters().size() == 0) { //if argument size is 0
						result.add(op); //add to result
					}
					else {
						boolean compare = false; //flag
						for (int i = 0; i < op.getParameters().size(); i++) { //for each parameter
							
							Type argType = argTypes.get(i); //get arg type
							Type opParamType = op.getParameters().get(i).getResolvedType(); //get parameter type
							compare = typeUtil.isTypeEqualOrGeneric(argType, opParamType); //determine if the types are same or generically related
							if (!compare) { //if not
								break; //break
							}
						}
						if (compare) { //if compare is true then the signature is identical
							result.add(op); //add to result
						}
					}
				}
			}
		}
		if (result.size() != 0) { //if result is not empty
			return result; //return
		}
		else {
			return null;
		}
	}
	
	public OperationDefinition getOperation(String name, ArrayList<Type> argTypes)
	{
		boolean compare = false;
		for(OperationDefinition op: operations)
		{
			if (op.getName().getName().equals(name)) {
				if (op.getParameters().size() == argTypes.size()) {
					if (op.getParameters().size() == 0) {
						return op;
					}
					else {
						for (int i = 0; i < op.getParameters().size(); i++) {
							
							Type a = argTypes.get(i);
							Type b = op.getParameters().get(i).getResolvedType();
							compare = typeUtil.isTypeEqualOrGeneric(a, b);
							if (!compare) {
								break;
							}
						}
						if (compare) {
							return op;
						}
					}
				}
			}
		}
		return null;
	}
	
	public void putOperation(OperationDefinition op)
	{
		operations.add(op);
	}

}
