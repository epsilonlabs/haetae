package org.eclipse.epsilon.haetae.model.connectivity;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IPackageDriver {

	public abstract String getPackageName();
	public abstract String getPackageNSURI();
	public abstract String getPackageNSPrefix();
	
	
	public ArrayList<String> getAllTypeNames();
	
	public abstract boolean containsMetaElement(String elementName);
	public abstract EClassifier getMetaElement(String elementName);
	
	public abstract boolean containsClass(String elementName);
	public abstract EClass getClass(String elementName);
	
	public abstract boolean containsDataType(String elementName);
	public abstract EDataType getDataType(String elementName);
	
	public abstract boolean containsEnumeration(String enumerationName);
	public abstract EEnum getEnumeration(String enumerationName);
	
	public abstract boolean containsEnumerationLiteral(String enumerationName, String literalName);
	public EEnumLiteral getEnumerationLiteral(String enumerationName, String literalName);
	
	public abstract boolean containsAttribute(String elementName, String attributeName);
	public abstract boolean containsReference(String elementName, String referenceName);
	public abstract boolean containsFeature(String elementName, String featureName);
	
	public abstract EAttribute getAttribute(String elementName, String attributeName);
	public abstract EReference getReference(String elementName, String referenceName);
	public abstract EStructuralFeature getFeature(String elementName, String featureName);
	
	public abstract EAttribute getAttribute(EClass metaElement, String attributeName);
	public abstract EReference getReference(EClass metaElement, String referenceName);
	public abstract EStructuralFeature getFeature(EClass metaElement, String featureName);
	
	public abstract EDataType getTypeForAttribute(EClass metaElement, String attributeName);
	public abstract EClass getTypeForReference(EClass metaElement, String referenceName);
	public abstract EClassifier getTypeForFeature(EClass metaElement, String featureName);
	
	public abstract EDataType getTypeForAttribute(String elementName, String attributeName);
	public abstract EClass getTypeForReference(String elementName, String referenceName);
	public abstract EClassifier getTypeForFeature(String elementName, String featureName);
	
	public IPackageDriver getSubPackageDriver(String name);
	public ArrayList<IPackageDriver> getSubPackageDrivers();
	
	public abstract IMetamodelDriver getIMetamodelDriver();
	
	public abstract EPackage getEPackage();
}
