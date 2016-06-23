package org.eclipse.epsilon.eol.visitor.resolution.type.naive.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PrimitiveType;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.metamodel.SummablePrimitiveType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class TypeInferenceManager {
	
	private static TypeInferenceManager instance = null;

	protected TypeInferenceManager()
	{
	}
	
	public static TypeInferenceManager getInstance()
	{
		if (instance == null) {
			instance = new TypeInferenceManager();
		}
		return instance;
	}
	
	
	public ArrayList<Type> getCommonTypesForTwoAnys(AnyType anyType1, AnyType anyType2)
	{
		ArrayList<Type> result = new ArrayList<Type>();
		
		ArrayList<Type> dynTypes1 = new ArrayList<Type>();
		ArrayList<Type> dynTypes2 = new ArrayList<Type>();
		
		if (TypeUtil.getInstance().isInstanceofAnyType(anyType1)) {
			dynTypes1.addAll(EcoreUtil.copyAll(anyType1.getDynamicTypes()));
		}
		else {
			dynTypes1.add(EcoreUtil.copy(anyType1));
		}
		
		if (TypeUtil.getInstance().isInstanceofAnyType(anyType2)) {
			dynTypes2.addAll(EcoreUtil.copyAll(anyType2.getDynamicTypes()));
		}
		else {
			dynTypes2.add(EcoreUtil.copy(anyType2));
		}
		
		if (dynTypes1.size() == 0) {
			dynTypes1.add(null);
		}
		
		if (dynTypes2.size() == 0) {
			dynTypes2.add(null);
		}
		
		
		for(Type t1: dynTypes1)
		{
			for(Type t2: dynTypes2)
			{
				Type common = getLeastCommonType(t1, t2);
				if (common != null) {
					result.add(common);
				}
			}
		}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		Type t1 = EolFactory.eINSTANCE.createRealType();
		Type t2 = EolFactory.eINSTANCE.createIntegerType();
		Type t3 = EolFactory.eINSTANCE.createStringType();
		
		System.out.println(t1.eClass());
		System.out.println(t2.eClass());
		System.out.println(t3.eClass());
		
		if (t1.eClass().isSuperTypeOf(t2.eClass())) {
			System.out.println("trueeeeeeee");
		}
		
		System.out.println(t3.eClass().isSuperTypeOf(t1.eClass()));
		
		TypeInferenceManager typeInferenceManager = new TypeInferenceManager();
		System.out.println(typeInferenceManager.getLeastCommonTypeOf(t2.eClass(), t1.eClass()));
	}
	
	//retrieve a list of types by traversing nameExpression to its declaration
	public ArrayList<Type> getTypesForName(NameExpression nameExpression)
	{
		Object resolvedContent = nameExpression.getResolvedContent();
		if (resolvedContent != null && resolvedContent instanceof VariableDeclarationExpression) {
			VariableDeclarationExpression vde = (VariableDeclarationExpression) resolvedContent;
			return TypeResolutionContext.getInstance().getTypeRegistry().getTypesForVariable(vde);
		}
		return null;
	}
	
	//check if an AnyType's dynamic types contain the type under question
	public boolean containsDynamicType(AnyType anyType, EClass typeUnderQuestion)
	{
//		if (TypeUtil.getInstance().isInstanceofAnyType((EOLElement) typeUnderQuestion)) {
//			AnyType typesUnderQuestion = ((AnyType)typeUnderQuestion);
//			for(Type t: typesUnderQuestion.getDynamicTypes())
//			{
//				return containsDynamicType(anyType, (EClass) t);
//			}
//		}
		//iterate through dynamic types
		for(Type dynType: anyType.getDynamicTypes())
		{
			//if is subtype or is type return true
			if (typeUnderQuestion.isSuperTypeOf(dynType.eClass()) || typeUnderQuestion.equals(dynType.eClass())) {
				return true;
			}
			//if is anytype then call recursively
			else if(TypeUtil.getInstance().isInstanceofAnyType(dynType))
			{
				if (containsDynamicType((AnyType) dynType, typeUnderQuestion))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	//get the type in an AnyType's dynamic types that matches the type under question
	public Type getDynamicType(AnyType anyType, EClass typeUnderQuestion)
	{
		//iterate through dynamic types
		for(Type dynType: anyType.getDynamicTypes())
		{
			//if is sub type or is type return 
			if (typeUnderQuestion.isSuperTypeOf(dynType.eClass()) || typeUnderQuestion.equals(dynType.eClass())) {
				return dynType;
			}
			//if is any type, call recursively
			else if(TypeUtil.getInstance().isInstanceofAnyType(dynType))
			{
				Type temp = getDynamicType((AnyType) dynType, typeUnderQuestion);
				if (temp != null) {
					return temp;
				}
			}
		}
		return null;
	}
	
	public ArrayList<Type> getDynamicTypes(AnyType anyType, EClass typeUnderQuestion)
	{
		ArrayList<Type> result = new ArrayList<Type>();
		//iterate through dynamic types
		for(Type dynType: anyType.getDynamicTypes())
		{
			//if is sub type or is type return 
			if (typeUnderQuestion.isSuperTypeOf(dynType.eClass()) || typeUnderQuestion.equals(dynType.eClass())) {
				result.add(dynType);
			}
			//if is any type, call recursively
			else if(TypeUtil.getInstance().isInstanceofAnyType(dynType))
			{
				result.addAll(getDynamicTypes((AnyType) dynType, typeUnderQuestion));
			}
		}
		return result;
	}
	
	
	public Type getLeastCommonTypeFromDynamicTypes(AnyType anyType)
	{
		Type result = null;
		for(Type t: anyType.getDynamicTypes())
		{
			result = getLeastCommonType(result, t);
		}
		
		if (result == null) {
			return anyType;
		}
		else {
			return result;
		}
	}
	
	public Type getLeastCommonTypeFromTypes(ArrayList<Type> types)
	{
		Type result = null;
		for(Type t: types)
		{
			result = getLeastCommonType(result, t);
		}
		return result;
	}
	
	public boolean isRightCompatibleToLeft(Type left, AnyType right)
	{
		for(Type t : right.getDynamicTypes())
		{
			if (TypeUtil.getInstance().isTypeEqualOrGeneric(t, left)) {
				return true;
			}
		}
		return false;
	}
	
	public Type inferType(AnyType anyType, String property)
	{
		return null;
	}
	
	public Type getLeastCommonType(Type t1, Type t2)
	{
		if (t1 == null) {
			return EcoreUtil.copy(t2);
		}
		else {
			if (t2 == null) {
				return EcoreUtil.copy(t1);
			}
		}
		
		if (t1 instanceof PrimitiveType && t2 instanceof PrimitiveType) {
			return getLeastCommonPrimitiveType((PrimitiveType)t1, (PrimitiveType)t2);
		}
		else if (t1 instanceof CollectionType && t2 instanceof CollectionType) {
			return getLeastCommonCollectionType((CollectionType)t1, (CollectionType)t2);
		}
		else if (t1 instanceof ModelElementType && t2 instanceof ModelElementType) {
			return getLeastCommonModelElementType((ModelElementType)t1, (ModelElementType)t2);
		}
		return null;
	}
	
	public Type getLeastCommonCollectionType(CollectionType t1, CollectionType t2)
	{
		//if same collection
		if (t1.getClass().equals(t2.getClass())) {
			//if content type of t1 is not null
			if (t1.getContentType() != null) {
				//if content type of t2 is not null
				if (t2.getContentType() != null) {
					
					//get content types
					Type c1 = t1.getContentType();
					Type c2 = t2.getContentType();
					
					//if both primitive types
					if (c1 instanceof PrimitiveType && c2 instanceof PrimitiveType) {
						Type contentType = getLeastCommonPrimitiveType((PrimitiveType)c1, (PrimitiveType)c2);
						if (contentType != null) {
							CollectionType returnType = EcoreUtil.copy(t1);
							returnType.setContentType(EcoreUtil.copy(contentType));
							return returnType;
						}
					}
					else if (c1 instanceof ModelElementType && c2 instanceof ModelElementType) {
						Type contentType = getLeastCommonModelElementType((ModelElementType)c1, (ModelElementType)c2);
						if (contentType != null) {
							CollectionType returnType = EcoreUtil.copy(t1);
							returnType.setContentType(EcoreUtil.copy(contentType));
							return returnType;
						}
					}
					else if (c1 instanceof CollectionType && c2 instanceof CollectionType) {
						Type t = getLeastCommonCollectionType((CollectionType)c1, (CollectionType)c2);
						if (t!= null) {
							
						}
						CollectionType returnType = EcoreUtil.copy(t1);
						returnType.setContentType(EcoreUtil.copy(t));
						return returnType;
					}
				}
				else {
					return EcoreUtil.copy(t1);
				}
			}
			else {
				if (t2.getContentType() != null) {
					return EcoreUtil.copy(t2);
				}
			}
		}
		return null;
	}
	
	public boolean containsPrimitiveType(AnyType anyType)
	{
		if (containsDynamicType(anyType, EolPackage.eINSTANCE.getBooleanType())) {
			return true;
		}
		if (containsDynamicType(anyType, EolPackage.eINSTANCE.getIntegerType())) {
			return true;
		}
		if (containsDynamicType(anyType, EolPackage.eINSTANCE.getRealType())) {
			return true;
		}
		if (containsDynamicType(anyType, EolPackage.eINSTANCE.getStringType())) {
			return true;
		}
		return false;
	}
	
	public boolean containsCollectionType(AnyType anyType)
	{
		return false;
	}
	
	public ModelElementType getLeastCommonModelElementType(ModelElementType t1, ModelElementType t2)
	{
		EClass eClass1 = (EClass) t1.getModelElementType();
		EClass eClass2 = (EClass) t2.getModelElementType();

		if (eClass1.isSuperTypeOf(eClass2)) {
			return EcoreUtil.copy(t1);
		}
		else if (eClass2.isSuperTypeOf(eClass1)) {
			return EcoreUtil.copy(t2);
		}
		else {
			//get least common type
			EClass result = getLeastCommonTypeOf(eClass1, eClass2);
			//if result is not null
			if(result != null)
			{
				//get context
				TypeResolutionContext context = TypeResolutionContext.getInstance();
				//iterate modeldrivers
				for(IMetamodelDriver iMetamodelDriver : context.getiMetamodelManager().getiMetamodelDrivers())
				{
					for(IPackageDriver iPackageDriver: iMetamodelDriver.getIPackageDrivers()) {
						//fetch the class and set properties
						if (iPackageDriver.getClass(result.getName()) != null) {
							if (iPackageDriver.getClass(result.getName()).equals(result)) {
								ModelElementType modelElementType = EolFactory.eINSTANCE.createModelElementType();
								modelElementType.setModelElementType(result);
								modelElementType.setElementName(result.getName());
								modelElementType.setModelName(iMetamodelDriver.getName());
								modelElementType.setResolvedIMetamodel(iMetamodelDriver);
								modelElementType.setResolvedIPackage(iPackageDriver);
								
								return modelElementType;
							}
						}
					}
				}
				//return null
				return null;
			}
			else {
				return null;
			}
		}
	}
	
	public Type getLeastCommonPrimitiveType(PrimitiveType t1, PrimitiveType t2)
	{
		if (t1 instanceof BooleanType) {
			if (t2 instanceof BooleanType) {
				return EcoreUtil.copy(t2);
			}
			else {
				return null;
			}
		}
		
		if (t1 instanceof IntegerType) {
			if (t2 instanceof IntegerType) {
				return EcoreUtil.copy(t1);
			}
			else if (t2 instanceof RealType) {
				return null;
			}
			else if (t2 instanceof StringType) {
				return null;
			}
			else {
				return null;
			}
		}
		
		if (t1 instanceof RealType) {
			if (t2 instanceof IntegerType) {
				return EcoreUtil.copy(t1);
			}
			else if (t2 instanceof RealType) {
				return EcoreUtil.copy(t2);
			}
			else if (t2 instanceof StringType) {
				return null;
			}
			else {
				return null;
			}
		}
		
		if (t1 instanceof StringType) {
			if (t2 instanceof SummablePrimitiveType) {
				return EcoreUtil.copy(t1);
			}
			else {
				return null;
			}
		}
		
		return null;
	}
	
	public HashSet<EClass> getCommonTypesOf(EClass t1, EClass t2)
	{
		//prepare result
		HashSet<EClass> result = new HashSet<EClass>();
		
		//if t1 is super type of t2, or vice versa, return the super class
		if (t1.isSuperTypeOf(t2)) {
			result.add(t1);
		}
		if (t2.isSuperTypeOf(t1)) {
			result.add(t2);
		}
		
		//iterate t1 supertypes, if it is also a super type of t2, then add
		for(EClass eClass: t1.getEAllSuperTypes())
		{
			if (eClass.isSuperTypeOf(t2)) {
				result.add(eClass);
			}
		}
		
		//iterate t2 supertypes, if it is also a super type of t1, add to result
		for(EClass eClass: t2.getEAllSuperTypes())
		{
			if (eClass.isSuperTypeOf(t1)) {
				result.add(eClass);
			}
		}
		return result;
	}

	
	public EClass getLeastCommonTypeOf(EClass t1, EClass t2)
	{
		//prepare result;
		HashMap<EClass, Integer> result = new HashMap<EClass, Integer>();
		
		//iterate all common types
		for(EClass commonType: getCommonTypesOf(t1, t2))
		{
			//the distance should be sqrt(a^2 + b^2), but we just compare squares
			int temp1 = TypeUtil.getInstance().shortestDistanceBetweenClass(t1, commonType);
			int temp2 = TypeUtil.getInstance().shortestDistanceBetweenClass(t2, commonType);
			
			result.put(commonType, temp1*temp1 + temp2*temp2);
		}
		EClass least = null;
		long count = Integer.MAX_VALUE;
		for(EClass eClass: result.keySet())
		{
			int sum = result.get(eClass);
			if (sum < count) {
				least = eClass;
				count = sum;
			}
		}
		return least;
	}

}
