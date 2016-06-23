package org.eclipse.epsilon.haetae.model.connectivity.emf;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class EMFIPackageDriver implements IPackageDriver{

	protected IMetamodelDriver iMetamodelDriver = null;
	protected EPackage ePackage;
	protected HashMap<String, EMFIPackageDriver> subPackages = new HashMap<String, EMFIPackageDriver>();

	
	public EMFIPackageDriver(EPackage ePackage)
	{
		this.ePackage = ePackage;
		for(EObject subEPackage: ePackage.eContents())
		{
			if (subEPackage instanceof EPackage) {
				subPackages.put(ePackage.getName(), new EMFIPackageDriver(ePackage));
			}
		}
	}
	
	@Override
	public String getPackageName() {
		return ePackage.getName();
	}

	@Override
	public String getPackageNSURI() {
		return ePackage.getNsURI();
	}

	@Override
	public String getPackageNSPrefix() {
		return ePackage.getNsPrefix();
	}

	@Override
	public boolean containsMetaElement(String elementName) {
		for(EClassifier eClassifier: ePackage.getEClassifiers())
		{
			if (eClassifier.getName().equals(elementName)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public EClassifier getMetaElement(String elementName) {
		for(EClassifier eClassifier: ePackage.getEClassifiers())
		{
			if (eClassifier.getName().equals(elementName)) {
				return eClassifier;
			}
		}
		return null;
	}

	@Override
	public boolean containsEnumeration(String enumerationName) {
		for(EClassifier eClassifier: ePackage.getEClassifiers())
		{
			if (eClassifier instanceof EEnum) {
				EEnum enumeration = (EEnum) eClassifier;
				if (enumeration.getName().equals(enumerationName)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public EEnum getEnumeration(String enumerationName) {
		for(EClassifier eClassifier: ePackage.getEClassifiers())
		{
			if (eClassifier instanceof EEnum) {
				EEnum enumeration = (EEnum) eClassifier;
				if (enumeration.getName().equals(enumerationName)) {
					return enumeration;
				}
			}
		}
		return null;
	}

	@Override
	public boolean containsEnumerationLiteral(String enumerationName,
			String literalName) {
		EEnum enumeration = getEnumeration(enumerationName);
		if (enumeration != null) {
			if (enumeration.getEEnumLiteral(literalName) != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public EEnumLiteral getEnumerationLiteral(String enumerationName, String literalName) {
		EEnum enumeration = getEnumeration(enumerationName);
		if (enumeration != null) {
			if (enumeration.getEEnumLiteral(literalName) != null) {
				return enumeration.getEEnumLiteral(literalName);
			}
		}
		return null;
	}

	@Override
	public boolean containsAttribute(String elementName, String attributeName) {
		EClass eClass = getClass(elementName);
		if (eClass != null) {
			for(EAttribute eAttribute : eClass.getEAllAttributes())
			{
				if (eAttribute.getName().equals(attributeName)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean containsReference(String elementName, String referenceName) {
		EClass eClass = getClass(elementName);
		if (eClass != null) {
			for(EReference eReference : eClass.getEAllReferences())
			{
				if (eReference.getName().equals(referenceName)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean containsFeature(String elementName, String featureName) {
		return containsAttribute(elementName, featureName) || containsReference(elementName, featureName);
	}

	@Override
	public EAttribute getAttribute(String elementName, String attributeName) {
		EClass eClass = getClass(elementName);
		for(EAttribute eAttribute : eClass.getEAllAttributes())
		{
			if (eAttribute.getName().equals(attributeName)) {
				return eAttribute;
			}
		}
		return null;
	}

	@Override
	public EReference getReference(String elementName, String referenceName) {
		EClass eClass = getClass(elementName);
		for(EReference eReference : eClass.getEAllReferences())
		{
			if (eReference.getName().equals(referenceName)) {
				return eReference;
			}
		}
		return null;
	}

	@Override
	public EStructuralFeature getFeature(String elementName, String featureName) {
		EStructuralFeature feature = getAttribute(elementName, featureName);
		if (feature != null) {
			return feature;
		}
		else {
			return getReference(elementName, featureName);
		}
	}

	@Override
	public EDataType getTypeForAttribute(EClass metaElement, String attributeName) {
		EStructuralFeature feature = metaElement.getEStructuralFeature(attributeName);
		if (feature != null && feature instanceof EAttribute) {
			return (EDataType) feature.getEType();
		}
		else {
			return null;
		}
	}

	@Override
	public EClass getTypeForReference(EClass metaElement, String referenceName) {
		EStructuralFeature feature = metaElement.getEStructuralFeature(referenceName);
		if (feature != null && feature instanceof EReference) {
			return (EClass) feature.getEType();
		}
		else {
			return null;
		}
	}

	@Override
	public EClassifier getTypeForFeature(EClass metaElement, String featureName) {
		EStructuralFeature feature = metaElement.getEStructuralFeature(featureName);
		if (feature != null) {
			return feature.getEType();
		}
		else {
			return null;
		}
	}

	@Override
	public EDataType getTypeForAttribute(String elementName,
			String attributeName) {
		EClass eClass = getClass(elementName);
		if (eClass != null) {
			return getTypeForAttribute(eClass, attributeName);
		}
		else {
			return null;
		}
	}

	@Override
	public EClass getTypeForReference(String elementName, String referenceName) {
		EClass eClass = getClass(elementName);
		if (eClass != null) {
			return getTypeForReference(eClass, referenceName);
		}
		else {
			return null;
		}
	}

	@Override
	public EClassifier getTypeForFeature(String elementName, String featureName) {
		EClass eClass = getClass(elementName);
		if (eClass != null) {
			return getTypeForFeature(eClass, featureName);
		}
		else {
			return null;
		}
	}

	@Override
	public boolean containsClass(String elementName) {
		EClassifier eClassifier = ePackage.getEClassifier(elementName);
		if (eClassifier instanceof EClass) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EClass getClass(String elementName) {
		EClassifier eClassifier = ePackage.getEClassifier(elementName);
		if (eClassifier instanceof EClass) {
			return (EClass) eClassifier;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean containsDataType(String elementName) {
		EClassifier eClassifier = ePackage.getEClassifier(elementName);
		if (eClassifier instanceof EDataType) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EDataType getDataType(String elementName) {
		EClassifier eClassifier = ePackage.getEClassifier(elementName);
		if (eClassifier instanceof EDataType) {
			return (EDataType) eClassifier;
		}
		else {
			return null;
		}
	}

	@Override
	public EAttribute getAttribute(EClass metaElement, String attributeName) {
		EStructuralFeature feature = metaElement.getEStructuralFeature(attributeName);
		if (feature != null && feature instanceof EAttribute) {
			return (EAttribute) feature;
		}
		return null;
	}

	@Override
	public EReference getReference(EClass metaElement, String referenceName) {
		EStructuralFeature feature = metaElement.getEStructuralFeature(referenceName);
		if (feature != null && feature instanceof EReference) {
			return (EReference) feature;
		}
		return null;
	}

	@Override
	public EStructuralFeature getFeature(EClass metaElement, String featureName) {
		return metaElement.getEStructuralFeature(featureName);
	}

	@Override
	public IPackageDriver getSubPackageDriver(String name) {
		return subPackages.get(name);
	}

	@Override
	public ArrayList<IPackageDriver> getSubPackageDrivers() {
		ArrayList<IPackageDriver> drivers = new ArrayList<IPackageDriver>();
		drivers.addAll(subPackages.values());
		return drivers;
	}
	
	@Override
	public ArrayList<String> getAllTypeNames() {
		ArrayList<String> result = new ArrayList<String>();
 		for(EClassifier eClassifier: ePackage.getEClassifiers())
		{
			result.add(eClassifier.getName());
		}
 		return result;
	}

	@Override
	public IMetamodelDriver getIMetamodelDriver() {
		return iMetamodelDriver;
	}
	
	public void setiMetamodelDriver(IMetamodelDriver iMetamodelDriver) {
		this.iMetamodelDriver = iMetamodelDriver;
	}

	@Override
	public EPackage getEPackage() {
		// TODO Auto-generated method stub
		return ePackage;
	}

}
