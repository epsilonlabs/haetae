package org.eclipse.epsilon.eol.problem.imessages;

public class IMessage_VariableResolution {

	public static final String VARIABLE_EXISTED = "Variable with the same name is already defined: ";
	public static final String RESERVED_KEYWORD = "Cannot create an variable with a reserved keyword";
	public static final String MODEL_DECL_NO_NAME = "Model declaration needs to define a name";
	public static final String MODEL_ALIAS_NAME_TAKEN = "Alias name already used in a model name";
	public static final String MODEL_DECL_NO_DRIVER = "No model driver specified";
	public static final String VARIABLE_UNUSED = "Variable %s is not used";
	public static final String VARIABLE_NOT_DEFINED = "Variable %s is not declared";
	
	public static final String ABORT_MUST_IN_TRANSACTION = "Abort statement should be used in a transaction statement";
	public static final String IMPORTED_PROGRAM_NOT_FOUND = "Imported module not found";
	
	public static final String X_CANNOT_BE_RESOLVED = "%s cannot be resolved";
	
	public static String bindMessage(String message, Object value)
	{
		String result = String.format(message, value.toString());
		return result;
	}
}
