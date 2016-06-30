package org.eclipse.epsilon.eol.problem.imessages;

public class IMessage_IMetamodelDriver {

	public static final String UNABLE_TO_LOAD_METAMODEL = "Unable to load metamodel";
	public static final String METAMODEL_NOT_IN_REGISTRY = "Metamodel is not registered in the EPackage Registry";
	public static final String METAMODEL_NAME_EXISTS = "Metamodel named %s already exists";
	public static final String DUPLICATE_ALIAS = "Duplicated alias: %s";
	
	public static final String METACLASS_MAY_NOT_EXIST = "Element may not exist";
	public static final String ATTRIBUTE_MAY_NOT_EXIST = "Attribute: %s may not exist";
	public static final String REFERENCE_MAY_NOT_EXIST = "Reference: %s may not exist";
	
	public static final String ATTRIBUTE_TYPE_MISMATCH = "Attribute: %s is not of type %s";

	public static final String DATATYPE_NOT_SUPPORTED = "DataType is not supported by plain XML driver";
	public static final String ENUMERATION_NOT_SUPPORTED = "Enumeration is not supported by plain XML driver";
	
	public static final String REFERENCE_SINGLE_VALUED = "Reference %s is single valued";
	public static final String REFERENCE_MULTI_VALUED = "Reference %s is multi valued";
	
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
