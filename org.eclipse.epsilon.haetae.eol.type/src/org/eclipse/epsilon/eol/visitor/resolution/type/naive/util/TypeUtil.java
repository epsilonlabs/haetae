package org.eclipse.epsilon.eol.visitor.resolution.type.naive.util;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.BagType;
import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.MapType;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NativeType;
import org.eclipse.epsilon.eol.metamodel.OrderedSetType;
import org.eclipse.epsilon.eol.metamodel.PrimitiveType;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.SequenceType;
import org.eclipse.epsilon.eol.metamodel.SetType;
import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;
import org.eclipse.epsilon.haetae.model.connectivity.emf.EMFIMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.xml.PlainXMLIMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.xml.PlainXMLIpackageDriver;

public class TypeUtil {

	private static TypeUtil instance = null;
	
	protected TypeUtil()
	{
	}
	
	public static TypeUtil getInstance()
	{
		if (instance == null) {
			instance = new TypeUtil();
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		AnyType anyType = EolFactory.eINSTANCE.createAnyType();
		
		BooleanType booleanType = EolFactory.eINSTANCE.createBooleanType();
		
		System.out.println(TypeUtil.getInstance().isInstanceofAnyType(anyType));
		System.out.println(TypeUtil.getInstance().isInstanceofAnyType(booleanType));
	}
	
	public boolean isInstanceofAnyType(EOLElement eolElement)
	{
		return eolElement.getClass().getSimpleName().equals("AnyTypeImpl");
	}
	
	public boolean isEDataType(EObject eObject) {
		return eObject instanceof EDataType;
	}
	
	public ArrayList<Type> getAllDynamicTypes(AnyType anyType)
	{
		ArrayList<Type> result = new ArrayList<Type>();
		for(Type t: anyType.getDynamicTypes())
		{
			result.add(t);
			if (isInstanceofAnyType(t)) {
				result.addAll(getAllDynamicTypes((AnyType) t));
			}
		}
		return result;
	}
	
	

	// returns true if the argument falls into the category of being primitive
	// types in EOL
	public boolean isNormalisable(EObject obj) {
		boolean result = false;
		EDataType dataType = (EDataType) obj;
		String className = dataType.getInstanceClassName();
		if (dataType instanceof EEnum) {
			return true;
		}
		if (className.equals("boolean")
				|| className.equals("java.lang.Boolean")
				|| className.equals("int")
				|| className.equals("java.lang.Integer")
				|| className.equals("double")
				|| className.equals("java.lang.Double")
				|| className.equals("float")
				|| className.equals("java.lang.Float")
				|| className.equals("String")
				|| className.equalsIgnoreCase("java.lang.String")) {
			result = true;
		}
		return result;
	}
	
	public Type normalise(EObject obj)
	{
		EolFactory eolFactory = EolFactory.eINSTANCE;
		//prepare a return type
		Type result = null;
		//prepare a datatype
		EDataType dataType = (EDataType) obj;
		
		if (dataType instanceof EEnum) {
			result = eolFactory.createIntegerType();
		}
		
		//get the instance class name of the data type
		String instanceClassName = dataType.getInstanceClassName();
		//if the class name is int then create a IntegerType
		if(instanceClassName.equals("int") ||
				instanceClassName.equals("java.lang.Integer"))
		{
			result = eolFactory.createIntegerType();
		}
		//if is double or float then create a RealType
		else if(instanceClassName.equals("double") ||
				instanceClassName.equals("java.lang.Double") ||
				instanceClassName.equals("float") ||
				instanceClassName.equals("java.lang.Float"))
		{
			result = eolFactory.createRealType();
		}
		//if is boolean then create a BooleanType
		else if(instanceClassName.equals("boolean") ||
				instanceClassName.equals("java.lang.Boolean"))
		{
			result = eolFactory.createBooleanType();
		}
		//if is string then create a StringType
		else if(instanceClassName.equals("String") ||
				instanceClassName.equalsIgnoreCase("java.lang.String"))
		{
			result = eolFactory.createStringType();
		}
		else {
			
		}
		return EcoreUtil.copy(result);
	}
	
	public boolean isTypeEqual(Type t1, Type t2) //need to include native and map types
	{
		if (t1 == null && t2 == null) {
			return true;
		}
		else if (t1 == null || t2 == null) {
			return false;
		}
		
		Type a = null;
		Type b = null;
		
		//normalise t1 and t2 if possible 
		if (isEDataType(t1)) {
			if (isNormalisable(t1)) {
				a = normalise(t1);
			}
		}
		else {
			a = (Type) t1;
		}
		if (isEDataType(t2)) {
			if(isNormalisable(t2))
			{
				b = normalise(t2);
			}
		}
		else {
			b = (Type) t2;
		}
		
		//if a and b are both of type Any then return true
		if (isInstanceofAnyType(a) && isInstanceofAnyType(b)) {
			return true;
		}
		//if a and b are both of type PrimitiveType and they are of the same class return true, else return false
		else if(a instanceof PrimitiveType && b instanceof PrimitiveType)
		{
			PrimitiveType type1 = (PrimitiveType) a;
			PrimitiveType type2 = (PrimitiveType) b;
			if (type1.eClass().equals(type2.eClass())) {
				return true;
			}
			else {
				return false;
			}
		}
		//if a and b are both of type CollectionType and they have the same content type (including Any), then return true, else false
		else if(a instanceof CollectionType && b instanceof CollectionType)
		{
			CollectionType type1 = (CollectionType) a;
			CollectionType type2 = (CollectionType) b;
		
			if (type1.eClass().equals(type2.eClass())) {
				if (isTypeEqual(type1.getContentType(), type2.getContentType())) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		
		//if a and b are both of type ModelElementType and both refer to the same meta class in the same metamodel, then return true, else fase
		else if(a instanceof ModelElementType && b instanceof ModelElementType)
		{
			ModelElementType type1 = (ModelElementType) a;
			ModelElementType type2 = (ModelElementType) b;
			
			EClass eClass1 = (EClass) type1.getModelElementType();
			EClass eClass2 = (EClass) type2.getModelElementType();
			
			if (eClass1 == null || eClass2 == null) {
				return false;
			}
			else {
				if (eClass1.equals(eClass2)) {
					return true;
				}
			}
		}
		else {
			return false;
		}
		return false;
	}
	
	public boolean isKeyWordSimple(String s)
	{
		if (s.equals("Any") ||
				s.equals("Integer") ||
				s.equals("Boolean") ||
				s.equals("Real") ||
				s.equals("String") ||
				s.equals("Bag") ||
				s.equals("Set") ||
				s.equals("OrderedSet") ||
				s.equals("Sequence") ||
				s.equals("Map") ||
				s.equals("_ModelElementType_")) {
			return true;
		}
		else if (s.contains("Bag(")) {
			String temp = s.replaceFirst("Bag\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWordSimple(temp);
		}
		else if (s.contains("Set\\(")) {
			String temp = s.replaceFirst("Set\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWordSimple(temp);
		}
		else if (s.contains("OrderedSet(")) {
			String temp = s.replaceFirst("OrderedSet\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWordSimple(temp);
		}
		else if (s.contains("Sequence(")) {
			String temp = s.replaceFirst("Sequence\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isKeyWordSimple(temp);
		}
		else {
			for(String str: TypeResolutionContext.getInstance().getMetamodelRelatedKeywords())
			{
				if(s.equals(str))
					return true;
			}
			return false;
		}
	}
	
	public boolean isTypeKeyWord(String s)
	{
		if (s.equals("Any") ||
				s.equals("Integer") ||
				s.equals("Boolean") ||
				s.equals("Real") ||
				s.equals("String") ||
				s.equals("Bag") ||
				s.equals("Set") ||
				s.equals("OrderedSet") ||
				s.equals("Sequence") ||
				s.equals("Map") ||
				s.equals("_ModelElementType_")) {
			return true;
		}
		else if (s.contains("Bag(")) {
			String temp = s.replaceFirst("Bag\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isTypeKeyWord(temp);
		}
		else if (s.contains("Set(")) {
			String temp = s.replaceFirst("Set\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isTypeKeyWord(temp);
		}
		else if (s.contains("OrderedSet(")) {
			String temp = s.replaceFirst("OrderedSet\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isTypeKeyWord(temp);
		}
		else if (s.contains("Sequence(")) {
			String temp = s.replaceFirst("Sequence\\(", "");
			temp = temp.replaceFirst("\\)", "");
			return isTypeKeyWord(temp);
		}
		else if (isMetamodelElement(s)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getTypeName(Type t)
	{
		if (t instanceof PrimitiveType) {
			if (t instanceof IntegerType) {
				return "Integer";
			}
			else if (t instanceof RealType) {
				return "Real";
			}
			else if (t instanceof BooleanType) {
				return "Boolean";
			}
			else if (t instanceof StringType) {
				return "String";
			}
		}
		else if (t instanceof CollectionType) {
			String buff = "";
			if (t instanceof SetType) {
				buff = "Set";
			}
			else if (t instanceof SequenceType) {
				buff = "Sequence";
			}
			else if (t instanceof OrderedSetType) {
				buff = "OrderedSet";
			}
			else if (t instanceof BagType) {
				buff = "Bag";
			}
			else {
				buff = "Collection";
			}
			if (((CollectionType) t).getContentType() != null) {
				buff = buff + "(" + getTypeName(((CollectionType) t).getContentType()) + ")";
			}
			return buff;
		}
		else if (t instanceof ModelElementType) {
			String buff = "";
			ModelElementType _t = (ModelElementType) t;
			if (_t.getElementName().equals("_ModelElementType_")) {
				return "ModelElementType";
			}
			if (_t.getModelName() != null) {
				buff += _t.getModelName()+"!";
			}
			if (_t.getElementName() != null) {
				buff += _t.getElementName();
			}
			return buff;
		}
		else if (t instanceof NativeType) {
			String buff = "Native";
			NativeType _t = (NativeType) t;
			if (_t.getExpression() != null) {
				buff = buff + "(" + _t.getExpression().getValue() + ")";
			}
			return buff;
		}
		else if (t instanceof MapType) {
			return "Map";
		}
		else if (t instanceof AnyType) {
			AnyType _t = (AnyType) t;
			String buff = "Any";
			if (_t.getDynamicTypes() != null) {
				buff += "{";
				for(Type __t: _t.getDynamicTypes())
				{
					buff = buff + getTypeName(__t);
					buff += ", ";
				}
				if (_t.getDynamicTypes().size() > 0) {
					buff = buff.substring(0, buff.length()-2);
				}
				buff += "}";
			}
			return buff;
		}
		return null;
	}
	
	public AnyType createType(String s)
	{
		EolFactory eolFactory = EolFactory.eINSTANCE;
		AnyType result = null;
		if (s.equals("Any")) {
			result = eolFactory.createAnyType();
			return result;
		}
		else if(s.equals("Integer"))
		{
			result = eolFactory.createIntegerType();
			return result;
		}
		else if (s.equals("Real")) {
			result = eolFactory.createRealType();
			return result;
		}
		else if (s.equals("String")) {
			result = eolFactory.createStringType();
			return result;
		}
		else if(s.equals("Bag"))
		{
			result = eolFactory.createBagType();
			CollectionType _result = (CollectionType) result;
			_result.setContentType(eolFactory.createAnyType());
			return _result;
		}
		else if (s.equals("Set")) {
			result = eolFactory.createSetType();
			CollectionType _result = (CollectionType) result;
			_result.setContentType(eolFactory.createAnyType());
			return _result;
		}
		else if(s.equals("Sequence"))
		{
			result = eolFactory.createSequenceType();
			CollectionType _result = (CollectionType) result;
			_result.setContentType(eolFactory.createAnyType());
			return _result;
		}
		else if(s.equals("OrderedSet"))
		{
			result = eolFactory.createOrderedSetType();
			CollectionType _result = (CollectionType) result;
			_result.setContentType(eolFactory.createAnyType());
			return _result;
		}
		else if (s.contains("Bag(")) {
			String temp = s.replaceFirst("Bag\\(", "");
			temp = temp.replaceFirst("\\)", "");
			result = eolFactory.createBagType();
			((BagType)result).setContentType(createType(temp));
			return result;
		}
		else if (s.contains("Set(")) {
			String temp = s.replaceFirst("Set\\(", "");
			temp = temp.replaceFirst("\\)", "");
			result = eolFactory.createSetType();
			((SetType)result).setContentType(createType(temp));
			return result;
		}
		else if (s.contains("OrderedSet(")) {
			String temp = s.replaceFirst("OrderedSet\\(", "");
			temp = temp.replaceFirst("\\)", "");
			result = eolFactory.createOrderedSetType();
			((OrderedSetType)result).setContentType(createType(temp));
			return result;
		}
		else if (s.contains("Sequence(")) {
			String temp = s.replaceFirst("Sequence\\(", "");
			temp = temp.replaceFirst("\\)", "");
			result = eolFactory.createSequenceType();
			((SequenceType)result).setContentType(createType(temp));
			return result;
		}
		else if (s.contains("Native")) {
			String temp = s.replaceFirst("Native\\(", "");
			temp = temp.replace("\\)", "");

			result = eolFactory.createNativeType();
			return result;
		}
		else if (s.equals("_ModelElementType_")) {
			result = eolFactory.createModelElementType();
			return result;
		}
		else if (isMetamodelElement(s)) {
			result = eolFactory.createModelElementType();
			String modelName = null;
			String elementName = null;
			if (s.contains("!")) {
				String[] names = s.split("!");
				modelName = names[0];
				elementName = names[1];
				((ModelElementType)result).setModelName(modelName);
				((ModelElementType)result).setElementName(elementName);
			}
			else {
				elementName = s;
				((ModelElementType)result).setElementName(elementName);
			}
		}
		return result;
	}
	
	public boolean hasOpenXML()
	{
		TypeResolutionContext context = TypeResolutionContext.getInstance();
		for(IMetamodelDriver imd: context.getiMetamodelManager().getiMetamodelDrivers())
		{
			if (imd instanceof PlainXMLIMetamodelDriver) {
				PlainXMLIMetamodelDriver pxmlmd = (PlainXMLIMetamodelDriver) imd;
				for(IPackageDriver ipackageDriver: pxmlmd.getIPackageDrivers())
				{
					PlainXMLIpackageDriver ipd = (PlainXMLIpackageDriver) ipackageDriver;
					if (ipd.isCreate()) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean isMetamodelElement(String name)
	{
		if (hasOpenXML() && name.startsWith("t_")) {
			return true;
		}
		for(String str: TypeResolutionContext.getInstance().getMetamodelRelatedKeywords())
		{
			if(name.equals(str))
				return true;
		}
		return false;
	}
	
//	public boolean isMetamodelElement(String name)
//	{
//		String[] names = name.split("!");
//		String modelString = null;
//		String elementString = null;
//		
//		if (names.length == 1) {
//			elementString = names[0];
//		}
//		else if (names.length == 2) {
//			modelString = names[0];
//			elementString = names[1];
//		}
//		if (modelString != null) {
//			//if elementString is not null
//			if (elementString != null) {
//				IMetamodelDriver iMetamodelDriver = context.getiMetamodelManager().getIMetamodelDriverWithName(modelString);
//				if (iMetamodelDriver != null) {
//					return iMetamodelContainsMetaElement(iMetamodelDriver, modelString, elementString);
//				}
//				else {
//					HashSet<IMetamodelDriver> iMetamodelDrivers = context.getiMetamodelManager().getIMetamodelDriversWithAlias(modelString);
//					if (iMetamodelDrivers.size() == 0) {
//						return false;
//					}
//					else if (iMetamodelDrivers.size() == 1) {
//						return iMetamodelContainsMetaElement(iMetamodelDriver, modelString, elementString);
//					}
//					else if (iMetamodelDrivers.size() > 1) {
//						ArrayList<IMetamodelDriver> iMetamodelDriversFound = new ArrayList<IMetamodelDriver>();
//						for(IMetamodelDriver iMetamodelDriver2: iMetamodelDrivers)
//						{
//							if (iMetamodelContainsMetaElement(iMetamodelDriver2, modelString, elementString)) {
//								iMetamodelDriversFound.add(iMetamodelDriver2);
//							}
//						}
//						if (iMetamodelDriversFound.size() == 0) {
//							return false;
//						}
//						else if (iMetamodelDriversFound.size() > 1) {
//							return true;
//						}
//						else {
//							return true;
//						}
//					}
//				}
//			}
//			else {
//				return false;
//			}
//		}
//		
//		//if model string is null
//		else {
//			
//			if (context.getiMetamodelManager().getiMetamodelDrivers() != null) {
//				ArrayList<IMetamodelDriver> iMetamodelDrivers = context.getiMetamodelManager().getiMetamodelDrivers();
//				if (iMetamodelDrivers.size() == 0) {
//					return false;
//				}
//				else if (iMetamodelDrivers.size() == 1) {
//					return iMetamodelContainsMetaElement(iMetamodelDrivers.get(0), "", elementString);
//				}
//				else if (iMetamodelDrivers.size() > 1) {
//					ArrayList<IMetamodelDriver> iMetamodelDriversFound = new ArrayList<IMetamodelDriver>();
//					for(IMetamodelDriver iMetamodelDriver2: iMetamodelDrivers)
//					{
//						if (iMetamodelContainsMetaElement(iMetamodelDriver2, "", elementString)) {
//							iMetamodelDriversFound.add(iMetamodelDriver2);
//						}
//					}
//					if (iMetamodelDriversFound.size() == 0) {
//						return false;
//					}
//					else if (iMetamodelDriversFound.size() > 1) {
//						return true;
//					}
//					else {
//						return iMetamodelContainsMetaElement(iMetamodelDriversFound.get(0), "", elementString);
//					}
//				}
//			}
//		}
//		return false;
//	}
	
	public boolean iMetamodelExists(String modelName) {
		IMetamodelDriver iMetamodelDriver = TypeResolutionContext.getInstance().getiMetamodelManager().getIMetamodelDriverWithName(modelName);
		if (iMetamodelDriver != null) {
			return true;
		}
		else {
			HashSet<IMetamodelDriver> iMetamodelDrivers = TypeResolutionContext.getInstance().getiMetamodelManager().getIMetamodelDriversWithAlias(modelName);
			if (iMetamodelDrivers.size() > 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public ArrayList<IMetamodelDriver> getIMetamodelDriverByName(String modelName)
	{
		ArrayList<IMetamodelDriver> result = new ArrayList<IMetamodelDriver>();
		IMetamodelDriver iMetamodelDriver = TypeResolutionContext.getInstance().getiMetamodelManager().getIMetamodelDriverWithName(modelName);
		if (iMetamodelDriver != null) {
			result.add(iMetamodelDriver);
			return result;
		}
		else {
			HashSet<IMetamodelDriver> iMetamodelDrivers = TypeResolutionContext.getInstance().getiMetamodelManager().getIMetamodelDriversWithAlias(modelName);
			for(IMetamodelDriver imd: iMetamodelDrivers)
			{
				result.add(imd);
			}
		}
		return result;
	}
	
	public ArrayList<IMetamodelDriver> getIMetamodelDrivers(String modelName, String elementName)
	{
		ArrayList<IMetamodelDriver> result = new ArrayList<IMetamodelDriver>();
		
		String modelString = modelName;
		String elementString = elementName;
		
		if (modelString != null) {
			
			//if elementString is not null
			if (elementString != null) {
				
				IMetamodelDriver iMetamodelDriver = TypeResolutionContext.getInstance().getiMetamodelManager().getIMetamodelDriverWithName(modelString);
				if (iMetamodelDriver != null) {
					if(iMetamodelContainsMetaElement(iMetamodelDriver, modelString, elementString))
					{
						result.add(iMetamodelDriver);
					}
				}
				else {
					HashSet<IMetamodelDriver> iMetamodelDrivers = TypeResolutionContext.getInstance().getiMetamodelManager().getIMetamodelDriversWithAlias(modelString);
					for(IMetamodelDriver imd: iMetamodelDrivers)
					{
						if (iMetamodelContainsMetaElement(imd, modelString, elementString)) {
							result.add(imd);
						}
					}
				}
			}
			else {
				return result;
			}
		}
		
		//if model string is null
		else {
			
			ArrayList<IMetamodelDriver> iMetamodelDrivers = TypeResolutionContext.getInstance().getiMetamodelManager().getiMetamodelDrivers();
			for(IMetamodelDriver imd: iMetamodelDrivers)
			{
				if (iMetamodelContainsMetaElement(imd, modelString, elementString)) {
					result.add(imd);
				}
			}
		}
		return result;
	}
	
	public IMetamodelDriver getIMetamodelDriver(String modelString, String elementString)
	{
		for(IMetamodelDriver iMetamodelDriver: getIMetamodelDrivers(modelString, elementString))
		{
			if (iMetamodelContainsMetaElement(iMetamodelDriver, modelString, elementString)) {
				return iMetamodelDriver;
			}
		}
		return null;
	}
	
	public ArrayList<IPackageDriver> getIPackageDrivers(IMetamodelDriver iMetamodelDriver, String modelName, String elementName)
	{
		ArrayList<IPackageDriver> result = new ArrayList<IPackageDriver>();
		String[] identifiers = elementName.split("::");
		if (iMetamodelDriver instanceof EMFIMetamodelDriver) {
			if (identifiers.length == 1) {
				if (iMetamodelDriver.getIPackageDrivers().size() == 1) {
					IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDrivers().get(0);
					if (iPackageDriver.getMetaElement(identifiers[0]) != null) {
						result.add(iPackageDriver);
						return result;
					}
					else {
						return result;
					}				
				}
				else {
					for(IPackageDriver iPackageDriver : getAllIPackageDrivers(iMetamodelDriver))
					{
						if (iPackageDriver.containsMetaElement(identifiers[0])) {
							result.add(iPackageDriver);
						}
					}
					return result;
				}
			}
			else {
				IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDriver(identifiers[0]);
				
				for(int i = 1; i < identifiers.length-1; i++)
				{
					iPackageDriver = iPackageDriver.getSubPackageDriver(identifiers[i]);
				}	
				if (iPackageDriver.getMetaElement(identifiers[identifiers.length-2]) != null) {
					result.add(iPackageDriver);
					return result;
				}
				else {
					return result;
				}
			}
		}
		else if (iMetamodelDriver instanceof PlainXMLIMetamodelDriver) {
			if (!elementName.startsWith("t_")) {
				return result;
			}
			else {

				if (iMetamodelDriver.getIPackageDrivers().size() == 1) {
					IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDrivers().get(0);
					if (iPackageDriver.getMetaElement(identifiers[0]) != null) {
						result.add(iPackageDriver);
						return result;
					}
					else {
						return result;
					}				
				}
				else {
					for(IPackageDriver iPackageDriver : getAllIPackageDrivers(iMetamodelDriver))
					{
						if (iPackageDriver.containsMetaElement(identifiers[0])) {
							result.add(iPackageDriver);
						}
					}
					return result;
				}			
			}
		}
		return result;
	}
	
	public boolean iMetamodelContainsMetaElement(IMetamodelDriver iMetamodelDriver, String modelString, String elementString)
	{
		String[] identifiers = elementString.split("::");
		
		if (iMetamodelDriver instanceof EMFIMetamodelDriver) {
			
			if (identifiers.length == 1) {
				if (iMetamodelDriver.getIPackageDrivers().size() == 1) {
					IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDrivers().get(0);
					if (iPackageDriver.getMetaElement(identifiers[0]) != null) {
						return true;
					}
					else {
						return false;
					}				
				}
				else {
					for(IPackageDriver iPackageDriver : getAllIPackageDrivers(iMetamodelDriver))
					{
						if (iPackageDriver.containsMetaElement(identifiers[0])) {
							return true;
						}
					}
					return false;
				}
			}
			else {
				IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDriver(identifiers[0]);
				
				for(int i = 1; i < identifiers.length-1; i++)
				{
					iPackageDriver = iPackageDriver.getSubPackageDriver(identifiers[i]);
				}	
				if (iPackageDriver.getMetaElement(identifiers[identifiers.length-2]) != null) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		
		else if (iMetamodelDriver instanceof PlainXMLIMetamodelDriver) {
			if (!elementString.startsWith("t_")) {
				return false;
			}
			else {

				if (iMetamodelDriver.getIPackageDrivers().size() == 1) {
					IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDrivers().get(0);
					if (iPackageDriver.getMetaElement(identifiers[0]) != null) {
						return true;
					}
					else {
						return false;
					}				
				}
				else {
					for(IPackageDriver iPackageDriver : getAllIPackageDrivers(iMetamodelDriver))
					{
						if (iPackageDriver.containsMetaElement(identifiers[0])) {
							return true;
						}
					}
					return false;
				}			
			}
		}
		return false;
	}
	
	public ArrayList<IPackageDriver> getAllIPackageDrivers(IMetamodelDriver iMetamodelDriver)
	{
		ArrayList<IPackageDriver> result = new ArrayList<IPackageDriver>();
		for(IPackageDriver iPackageDriver: iMetamodelDriver.getIPackageDrivers())
		{
			getAllSubPackageDrivers(iPackageDriver, result);
		}
		return result;
	}
	
	public void getAllSubPackageDrivers(IPackageDriver iPackageDriver, ArrayList<IPackageDriver> result)
	{
		if (!result.contains(iPackageDriver)) {
			result.add(iPackageDriver);
		}
		for(IPackageDriver driver: iPackageDriver.getSubPackageDrivers())
		{
			getAllSubPackageDrivers(driver, result);
		}
	}
	
	public boolean isTypeEqualOrGeneric(EObject t1, EObject t2)
	{
		Type a = null;
		Type b = null;
		if (t1 == null || t2 == null) {
			return false;
		}
		if (isEDataType(t1)) {
			if (isNormalisable(t1)) {
				a = normalise(t1);
			}
		}
		else {
			a = (Type) t1;
		}
		if (isEDataType(t2)) {
			if(isNormalisable(t2))
			{
				b = normalise(t2);
			}
		}
		else {
			b = (Type) t2;
		}
		
		if (isInstanceofAnyType(a) || isInstanceofAnyType(b)) {
			return true;
		}
		
		if (isInstanceofAnyType(b)) {
			return true;
		}
		
		if(a instanceof PrimitiveType && b instanceof PrimitiveType)
		{
			if (b instanceof StringType) {
				return true;
			}
			
			if (a.eClass().getEAllSuperTypes().contains(b.eClass())) {
				return true;
			}
			else if (a.eClass().equals(b.eClass())) {
				return true;
			}
		}
		else if(a instanceof CollectionType && b instanceof CollectionType) //if both of the types are collection type
		{
			CollectionType type1 = (CollectionType) a;
			CollectionType type2 = (CollectionType) b;
		
			if (type1.eClass().equals(type2.eClass())) { //if the class are equal
				if (isTypeEqualOrGeneric(type1.getContentType(), type2.getContentType())) { //check for content type (this should be recursive for contained collection type, too)
					return true;
				}
				else {
					return false;
				}
			}
			else if (b.getClass().getSimpleName().equals("CollectionTypeImpl")) { //theoretically this should not happen
				return true;
			}
		}
		else if(a instanceof ModelElementType && b instanceof ModelElementType) //when both of the types are ModelElementTypes
		{
			ModelElementType type1 = (ModelElementType) EcoreUtil.copy(a);
			ModelElementType type2 = (ModelElementType) EcoreUtil.copy(b);
			
			if (type2.getElementName().equals("_ModelElementType_")) {
				return true;
			}
			else if(shortestDistanceBetweenClass((EClass)type1.getModelElementType(), (EClass)type2.getModelElementType()) != 999)
			{
				return true;
			}
			else {
				return false;
			}
		}
		else if (b.getClass().getSimpleName().equals("TypeImpl") && a instanceof Type) {
			return true;
		}
		else if (a instanceof MapType && b instanceof MapType) {
			return true;
		}
		else {
			return false;
		}
		return false;
	}
	
	//returns the number of ancestors between the subClass and the superClass, returns -1 if they are not inherently related
	public int shortestDistanceBetweenClass(EClass subClass, EClass superClass)
	{
		int result = 999;

		//if the class share the same EPackage		
		if(subClass.getEAllSuperTypes().contains(superClass)) //if the superClass is an ancestor of the subClass
		{
			ArrayList<MetaClassNode> unvisited = new ArrayList<MetaClassNode>(); //create unvisited list 
			ArrayList<MetaClassNode> visited = new ArrayList<MetaClassNode>(); //create visited list
			result = 0; //set result to 0
			for(EClass cls: subClass.getEAllSuperTypes()) //for all of the super classes of the subClass
			{
				MetaClassNode node = new MetaClassNode(cls); //create a Node
				node.setWeight(100000); //set weight to be infinite
				unvisited.add(node); //add node to unvisited
			}
			MetaClassNode current = new MetaClassNode(subClass); //set the current node to be the one that contains subClass
			current.setWeight(0); //set the weight to be 0
			unvisited.add(current); //add the current to the unvisited
			
			while(unvisited.size() != 0) //if there are remaining unvisited nodes
			{
				MetaClassNode min = current.extractMin(unvisited); //get the node with the smallest weight
				if (min.getEClass().equals(superClass)) { //stop when sub = super
					break;
				}
				visited.add(min); //add the node with the minimum weight to the visited list
				for(MetaClassNode n: current.getNeighbours(min, unvisited)) //get the neighbours for the current node
				{
					if (n.getWeight() > min.getWeight() + 1) { //if the weight of the node is greater than the min node + 1
						n.setWeight(min.getWeight() + 1); //set the weight to be min node's weight + 1
						n.setPrevious(min); //set the previous of the node to be min
					}
				}
			}
			result = visited.size();
			
		}
		else if(subClass.equals(superClass))
		{
			result = 0;
		}
	
		return result;
	}

	public int shortestDistanceBetweenObject(EObject subObj, EObject superObj)
	{
		int result = 998;
		EClass subClass = subObj.eClass(); //get the eclass of subObj
		EClass superClass = superObj.eClass(); //get the eclass of superObj 

		 //if these two classes are in the same epackage
		if (subObj instanceof ModelElementType && superObj instanceof ModelElementType) { //if both of the parameters are model element types
			subClass = (EClass) ((ModelElementType)subObj).getModelElementType(); //get the ecoretype
			
			superClass = (EClass) ((ModelElementType)superObj).getModelElementType(); //get the ecore type
			if (subClass == null || superClass == null) { //if ecore type is null, return null
				return -1;
			}
		}
		
		if(subClass.getEAllSuperTypes().contains(superClass))
		{
			ArrayList<MetaClassNode> unvisited = new ArrayList<MetaClassNode>();
			ArrayList<MetaClassNode> visited = new ArrayList<MetaClassNode>();
			result = 0;
			for(EClass cls: subClass.getEAllSuperTypes())
			{
				MetaClassNode node = new MetaClassNode(cls);
				node.setWeight(100000);
				unvisited.add(node);
			}
			MetaClassNode current = new MetaClassNode(subClass);
			current.setWeight(0);
			unvisited.add(current);
			
			while(unvisited.size() != 0)
			{
				MetaClassNode min = current.extractMin(unvisited);
				if (min.getEClass().equals(superClass)) {
					break;
				}
				visited.add(min);
				for(MetaClassNode n: current.getNeighbours(min, unvisited))
				{
					if (n.getWeight() > min.getWeight() + 1) {
						n.setWeight(min.getWeight() + 1);
						n.setPrevious(min);
					}
				}
			}
			
			result = visited.size();
			
		}
		else if(subClass.equals(superClass))
		{
			result = 0;
		}
	
		return result;
	}
	

}
