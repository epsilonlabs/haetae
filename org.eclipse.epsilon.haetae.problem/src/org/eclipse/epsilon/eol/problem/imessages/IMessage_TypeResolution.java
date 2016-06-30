package org.eclipse.epsilon.eol.problem.imessages;


public class IMessage_TypeResolution {

	public static final String TYPE_NOT_INSTANTIABLE = "Type %s is not instantiable";
	
	public static final String MODEL_DECL_NO_MODEL_DECLARED = "No metamodel has been loaded, please declare a metamodel first";

	public static final String MODEL_DECL_NSURI_OR_PATH_REQUIRED = "\"nsuri\" or \"path\" is required to access metamodel";
	
	public static final String MODEL_DECL_NO_NAME = "Model Declaration MUST have a name";
	public static final String MODEL_DECL_NO_DRIVER = "Model Declaration MUST have a driver";
	public static final String MODEL_DECL_DRIVER_NOT_SUPPORTED = "Model driver %s is not supported";
	
	public static final String MODEL_DECL_CANNOT_LOAD = "Metamodel specified cannot be loaded";
	
	public static final String TYPE_CANNOT_BE_RESOLVED = "%s cannot be resolved to a type";
	
	public static final String INVALID_XML_TYPE_NOTATION = "prefix %s cannot be used to denote an XML type";
	
	public static final String MODEL_NOT_FOUND = "Metamodel named %s cannot be found";
	
	public static final String MODEL_ELEMENT_DEFINED_IN_MULTIPLE_METAMODELS = "Model element %s is defined in more than one metamodels";
	
	public static final String ELEMENT_TYPE_CANNOT_BE_NULL = "Element type cannot be null";
	
	public static final String EXPRESSION_DOES_NOT_HAVE_A_TYPE = "Expression does not have a type";
	public static final String EXPRESSION_NOT_BOOLEAN = "Expression is not of type Boolean";
	public static final String EXPRESSION_NOT_NUMERAL = "Expression should be of either type Integer or type Real";
	public static final String EXPRESSION_NOT_STRING = "Expression is not of type String";
	
	public static final String EXPRESSION_EXPECTED_BOOLEAN = "Expected boolean type, actual type is: %s";
	public static final String EXPRESSION_EXPECTED_STRING = "Expected String type, actual type is: %s";
	
	public static final String EXPRESSION_CANNOT_BE_NULL = "Expression cannot be null";
	public static final String EXPRESSION_CANNOT_BE_BOOLEAN = "Expression cannot be Boolean";
	public static final String EXPRESSION_CANNOT_BE_STRING = "Expression cannot be String";
	
	public static final String EXPRESSION_MUST_BE_INTEGER = "Expression must be of type Integer";
	public static final String EXPRESSION_MUST_BE_STRING = "Expression must be a String";

	public static final String EXPRESSION_INIT_CANNOT_CONTAIN_COLLECTION = "Expression is of type Collection, it is not allowed in the initialisation of a Collection.";

	public static final String CONTENT_TYPE_IS_ANY = "Collection's content type is Any";
	
	public static final String EXPRESSION_IS_ANYTYPE = "Expression is of type Any";
	public static final String EXPRESSION_CANNOT_BE_CAST_TO_TYPE = "Expression cannot be cast to type: %s";
	public static final String EXPRESSION_SHOULD_BE_COMPARABLE = "Expression should be of type Comparable";
	
	
	public static final String EXPRESSION_SHOULD_BE_TYPE = "Expression should be a legal type";
	public static final String EXPRESSION_SHOULD_BE_MODELELEMENT_TYPE = "Expression should be a model element type";
	public static final String EXPRESSION_SHOULD_BE_COLLECTION_TYPE = "Expression should be a collection type";
	
	public static final String RESOLVED_CONTENT_NOT_VAR = "Resolved content is not a variable declaraion or a formal parameter epression";
	
	public static final String ENUM_CANNOT_BE_RESOLVED = "Enumeration cannot be resolved";
	public static final String ENUM_LITERAL_CANNOT_BE_RESLVED = "Enumeration literal cannot be resolved";
	public static final String ENUM_DUPLICATE = "Multiple enumerations found";
	
	public static final String FOR_STMT_CONDITION_NOT_COLLECTION_TYPE = "Expression should be of type Collection";
	
	public static final String COLLECTION_EXPRESSION_NO_CONTENT_TYPE = "Expression does not have a content type";
	
	
	public static final String RETURN_STATEMENT_NOT_IN_OP = "Return statement should be included in an operation/helper definition or in a transaction statement";
	
	public static final String POTENTIAL_TYPE_MISMATCH = "Potential type mismatch";
	public static final String TYPE_MISMATCH = "Type mismatch";
	
	public static final String INVALID_ASSIGNMENT_TARGET = "Invalid assignment target";
	
	public static final String OPERAND_TYPE_MISMATCH = "Operand type mismatch";
	
	
	public static final String EXPECTED_TYPE = "Expected type: %s";
	public static final String EXPECTED_CONTENT_TYPE = "Expected content type: %s";
	
	public static final String DIVISION_BY_ZERO = "Division by 0";
	
	public static final String OPERATION_SIGNATURE_EXISTS = "Operation with same signature has already been defined";
	
	public static final String OPERATION_REQUIRES_TARGET ="Operation may require a target for it to be invoked";
	
	public static final String OPERATION_CONTEXT_TYPE_MISMATCH = "Type mismatch for Operation: %s(), expected type: %s, actual type: %s.";
	public static final String OPERATION_NOT_FOUND = "Operation definition: %s(%s) cannot be found";
	
	public static final String ELEMENT_DOES_NOT_CONTAIN_PROPERTY = "Element %s does not contain property %s";
	
	public static final String PROPERTY_NOT_FOUND = "Property not found";
	public static final String PROPERTY_MUST_HAVE_A_TARGET = "Property does not have a target";
	
	public static final String FOL_MUST_HAVE_TARGET = "First Order Logic method calls must have a target";
	public static final String FOL_TARGET_MUST_BE_COLLECTION = "First Order Logic method %s must be performed on collection types";
	
	public static final String NAME_CANNOT_BE_RESOLVED = "\"%s\" cannot be resolved, check model declaration";
	
	public static final String NAME_IS_RESERVED = "%s is a reserved EOL keyword";
	
	public static final String EXPRESSION_MAY_NOT_BE_NUMERAL = "Expression may not evaluate to a numeral value";
	public static final String EXPRESSION_MAY_NOT_BE_INTEGER = "Expression may not evaluate to an Integer value";
	public static final String EXPRESSION_MAY_NOT_BE_REAL = "Expression may not evaluate to an Real value";
	public static final String EXPRESSION_MAY_NOT_BE_BOOLEAN = "Expression may not evaluate to a Boolean value";
	public static final String EXPRESSION_MAY_NOT_BE_STRING = "Expression may not evaluate to a String value";

	
	public static final String EXPRESSION_MAY_NOT_BE_MAP = "Expression may not evaluate to a value of Map type";	

	
	public static final String EXPRESSION_MAY_NOT_BE_SUMMABLE = "Expression may not apply to the \"+\" operator";	
	public static final String EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE = "Expression may not evaluate to a value of Collection type";
	public static final String EXPRESSION_MAY_NOT_BE_ORDERED_COLLECTION_TYPE = "Expression may not evaluate to a value of Ordered Collection type";
	
	public static final String EXPRESSION_MAY_NOT_BE_TYPE = "Expression may not evaluate to a value of type %s";


	public static final String EXPRESSION_MAY_NOT_BE_MODEL_ELEMENT = "Expression may not evaluate to a model element";
	
	public static final String POTENTIAL_ARGUMENT_MISMATCH = "Argument may not evaluate to a value that is applicable to %s";

	public static final String OBJECT_NOT_DEFINED_IN_MODEL = "The object is not defined in any known models";
	
	public static final String ARG_NOT_IN_THE_SAME_PACKAGE = "The type of the argument is not defined in the target domain";
	
	public static final String RETURN_STMT_NOT_ALLOWED = "Return statement is not allowed here";
	
	public static String bindMessage(String message, Object value)
	{
		String result = String.format(message, value.toString());
		return result;
	}
	
	public static String bindMessage(String message, Object... values)
	{
		String result = String.format(message, values);
		return result;
	}
}
