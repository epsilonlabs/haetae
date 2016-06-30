package org.eclipse.epsilon.haetae.model.connectivity.xml;

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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class PlainXMLIpackageDriver implements IPackageDriver{
	
	protected boolean create = false;
	protected EPackage ePackage;
	protected EClass root;
	protected PlainXMLMetamodelDriverUtil util = new PlainXMLMetamodelDriverUtil();
	protected IMetamodelDriver iMetamodelDriver = null;
	
	protected boolean read = false;
	
	protected EOLElement currentEolElement = null;
		
	public void setCreate(boolean create) {
		this.create = create;
	}
	
	public boolean isCreate() {
		return create;
	}
	
	public PlainXMLIpackageDriver(EPackage ePackage)
	{
		this.ePackage = ePackage;
	}
	
	public EClass getRoot() {
		return root;
	}
	
	public void setRoot(EClass root) {
		this.root = root;
	}
	
	public EOLElement getCurrentEolElement() {
		return currentEolElement;
	}
	
	public void setCurrentEolElement(EOLElement currentEolElement) {
		this.currentEolElement = currentEolElement;
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
		if (elementName.startsWith("t_") || elementName.equals("root")) {
			if (!create) {
				EClass result = (EClass) ePackage.getEClassifier(elementName);
				if (result != null) {
					return true;
				}
			}
			else {
				return true;	
			}
		}
		return false;
	}

	@Override
	public EClassifier getMetaElement(String elementName) {
		if (elementName.equals("root")) {
			if (root != null) {
				return root;
			}
			else {
				return null;
			}
		}
		else if (elementName.startsWith("t_")) {
			EClass result = (EClass) ePackage.getEClassifier(elementName);
			if (result != null) {
				return result; 
			}
			else {
				if (!create) {
					return null;
				}
				else {
					//LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.METACLASS_MAY_NOT_EXIST);
					result = EcoreFactory.eINSTANCE.createEClass();
					result.setName(elementName);
					ePackage.getEClassifiers().add(result);
					if (root == null) {
						root = result;
					}
					return result;	
				}
			}
		}
		else {
			return null;
		}
	}

	@Override
	public boolean containsClass(String elementName) {
		if (elementName.startsWith("t_") || elementName.equals("root")) {
			if (!create) {
				EClass result = (EClass) ePackage.getEClassifier(elementName);
				if (result != null) {
					return true;
				}
			}
			else {
				return true;	
			}
		}
		return false;
	}

	@Override
	public EClass getClass(String elementName) {
		if (elementName.equals("root")) {
			if (root != null) {
				return root;
			}
			else {
				return null;
			}
		}
		else if (elementName.startsWith("t_")) {
			EClass result = (EClass) ePackage.getEClassifier(elementName);
			if (result != null) {
				return result; 
			}
			else {
				if (!create) {
					return null;
				}
				else {
					//LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.METACLASS_MAY_NOT_EXIST);
					result = EcoreFactory.eINSTANCE.createEClass();
					result.setName(elementName);
					ePackage.getEClassifiers().add(result);
					if (root == null) {
						root = result;
					}
					return result;
				}
			}
		}
		else {
			return null;
		}
	}

	@Override
	public boolean containsDataType(String elementName) {
		// not supported
		LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.DATATYPE_NOT_SUPPORTED);
		return false;
	}

	@Override
	public EDataType getDataType(String elementName) {
		// not supported
		LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.DATATYPE_NOT_SUPPORTED);
		return null;
	}

	@Override
	public boolean containsEnumeration(String enumerationName) {
		// not supported
		LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.ENUMERATION_NOT_SUPPORTED);
		return false;
	}

	@Override
	public EEnum getEnumeration(String enumerationName) {
		// not supported
		LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.ENUMERATION_NOT_SUPPORTED);
		return null;
	}

	@Override
	public boolean containsEnumerationLiteral(String enumerationName,
			String literalName) {
		// not supported
		LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.ENUMERATION_NOT_SUPPORTED);
		return false;
	}

	@Override
	public EEnumLiteral getEnumerationLiteral(String enumerationName,
			String literalName) {
		// not supported
		LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.ENUMERATION_NOT_SUPPORTED);
		return null;
	}

	@Override
	public boolean containsAttribute(String elementName, String attributeName) {
		if (elementName.startsWith("t_") || elementName.equals("root")) {
			if (util.isXMLSyntax(attributeName)) {
				if (attributeName.startsWith("e_") ||
						attributeName.startsWith("x_") ||
						attributeName.startsWith("c_") ||
						attributeName.startsWith("t_")) {
					return false;
				}
				else {
					attributeName = util.removeTag(attributeName);
					if (!create || read) {
						EClass eClass = getClass(elementName);
						if (eClass == null) {
							return false;
						}
						else {
							EStructuralFeature feature = eClass.getEStructuralFeature(attributeName);
							if (feature == null) {
								return false;
							}
							else {
								if (feature instanceof EAttribute) {
									return true;
								}
								else {
									//should throw warning?
									return false;
								}
							}
						}
					}
					else {
						EClass eClass = getClass(elementName);
						if (eClass == null) {
							return true;
						}
						else {
							EStructuralFeature feature = eClass.getEStructuralFeature(attributeName);
							if (feature == null) {
								return true;
							}
							else {
								if (feature instanceof EAttribute) {
									return true;
								}
								else {
									//should throw warning?
									return false;
								}
							}
						}
					}
				}
			}
			else {
				if (attributeName.equals("text") || attributeName.equals("tagName")) {
					if (!create) {
						EClass eClass = getClass(elementName);
						if (eClass != null) {
							EStructuralFeature feature = eClass.getEStructuralFeature(attributeName);
							if (feature != null) {
								return true;
							}
							else {
								return false;
							}
						}
						else {
							return false;
						}
					}
					else {
						EClass eClass = getClass(elementName);
						if (eClass != null) {
							EStructuralFeature feature = eClass.getEStructuralFeature(attributeName);
							if (feature == null) {
								return true;
							}
							else {
								return true;
							}
						}
						else {
							return true;
						}
					}
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}

	@Override
	public boolean containsReference(String elementName, String referenceName) {
		if (elementName.startsWith("t_") || elementName.equals("root")) {
			if (util.isXMLSyntax(referenceName)) {
				if (referenceName.startsWith("e_") ||
						//referenceName.startsWith("x_") ||
						referenceName.startsWith("c_") ||
						referenceName.startsWith("t_")) {
					referenceName = util.removeTag(referenceName);
					if (!create || read) {
						EClass eClass = getClass(elementName);
						if (eClass == null) {
							return false;
						}
						else {
							EStructuralFeature feature = eClass.getEStructuralFeature(referenceName);
							if (feature == null) {
								return false;
							}
							else {
								if (feature instanceof EReference) {
									return true;
								}
								else {
									//should throw warning?
									return false;
								}
							}
						}
					}
					else {
						EClass eClass = getClass(elementName);
						if (eClass == null) {
							return true;
						}
						else {
							EStructuralFeature feature = eClass.getEStructuralFeature(referenceName);
							if (feature == null) {
								return true;
							}
							else {
								if (feature instanceof EReference) {
									return true;
								}
								else {
									//should throw warning?
									return false;
								}
							}
						}
					}
				}
				else {
					return false;
				}
			}
			else {
				if (referenceName.equals("parentNode") || referenceName.equals("children")) {
					if (!create) {
						EClass eClass = getClass(elementName);
						if (eClass == null) {
							return false;
						}
						else {
							EStructuralFeature feature = eClass.getEStructuralFeature(referenceName);
							if (feature == null) {
								return false;
							}
							else {
								if (feature instanceof EReference) {
									return true;
								}
								else {
									//should throw warning?
									return false;
								}
							}
						}
					}
					else {
						EClass eClass = getClass(elementName);
						if (eClass == null) {
							return true;
						}
						else {
							EStructuralFeature feature = eClass.getEStructuralFeature(referenceName);
							if (feature == null) {
								return true;
							}
							else {
								if (feature instanceof EReference) {
									return true;
								}
								else {
									//should throw warning?
									return false;
								}
							}
						}
					}
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}

	@Override
	public boolean containsFeature(String elementName, String featureName) {
		return containsReference(elementName, featureName) || containsAttribute(elementName, featureName);
	}

	@Override
	public EAttribute getAttribute(String elementName, String attributeName) {
		if (!(elementName.startsWith("t_") || elementName.equals("root"))) { //if classname is not xml syntax return null
			return null;
		}
		else { //if class name is xml syntax, get the class
			EClass clazz = getClass(elementName);
			if (clazz == null) {
				return null; //if class does not exist return null;
			}
			else { //if class exists (it always exists)
				if (attributeName.equals("text") || attributeName.equals("tagName")) { //if is keyword, handle it
					EAttribute result = (EAttribute) clazz.getEStructuralFeature(attributeName);
					if (result == null) {
						if (!create) {
							return null;
						}
						else {
							//should issue warning
							//LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_MAY_NOT_EXIST, attributeName));
							EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
							attribute.setName(attributeName);
							attribute.setUpperBound(1);
							attribute.setLowerBound(0);
							attribute.setEType(EcorePackage.eINSTANCE.getEString());
							clazz.getEStructuralFeatures().add(attribute);
							return attribute;
						}
					}
					else {
						return result;
					}
				}
				else if (util.isXMLSyntax(attributeName)) { //discard inappropriate keywords
					if (attributeName.startsWith("e_") ||
							attributeName.startsWith("x_") ||
							attributeName.startsWith("c_") ||
							attributeName.startsWith("t_")) {
						return null;
					}
					else {
						String escapedAttrName = util.removeTag(attributeName); //escape attribute name
						EStructuralFeature attribute = clazz.getEStructuralFeature(escapedAttrName); //get the estructurefeature
						if (attribute == null) { //if does not exist, create one and throw a warning
							if (!create) {
								return null;
							}
							else {
								//LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_MAY_NOT_EXIST, attributeName));
								attribute = EcoreFactory.eINSTANCE.createEAttribute();
								attribute.setName(escapedAttrName);
								attribute.setUpperBound(1);
								attribute.setLowerBound(0);
								attribute.setEType(util.getEDataTypeByName(attributeName));
								clazz.getEStructuralFeatures().add(attribute);
								return (EAttribute) attribute;	
							}
						}
						else { //if exists
							if (attribute instanceof EAttribute) { //if it is not an eattribute return null
								EAttribute _attribute = (EAttribute) attribute;
								EDataType eDataType = (EDataType) _attribute.getEType();
								if (attributeName.startsWith("i_")) {
									if (!eDataType.equals(EcorePackage.eINSTANCE.getEInt())) {
										LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_TYPE_MISMATCH, attributeName, "Integer"));
									}
								}
								else if (attributeName.startsWith("a_") || attributeName.startsWith("s_")) {
									if (!eDataType.equals(EcorePackage.eINSTANCE.getEString())) {
										LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_TYPE_MISMATCH, attributeName, "String"));
									}
								}
								else if (attributeName.startsWith("b_")) {
									if (!eDataType.equals(EcorePackage.eINSTANCE.getEBoolean())) {
										LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_TYPE_MISMATCH, attributeName, "Boolean"));
									}
								}
								else if (attributeName.startsWith("r_")) {
									if ((!eDataType.equals(EcorePackage.eINSTANCE.getEDouble())) && (!eDataType.equals(EcorePackage.eINSTANCE.getEFloat()))) {
										LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_TYPE_MISMATCH, attributeName, "Real"));
									}
								}
								return (EAttribute) attribute;
							}
							else {
								return null;
							}
						}
					}
				}
				else {
					return null;
				}
			}
		}
	}

	@Override
	public EReference getReference(String elementName, String referenceName) {
		if (!(elementName.startsWith("t_") || elementName.equals("root"))) { //if classname is not xml syntax return null
			return null;
		}
		else {
			EClass clazz = getClass(elementName);
			if (clazz == null) {
				return null; //if class does not exist return null;
			}
			else {
				if (referenceName.equals("parentNode")) {
					if (elementName.equals("root")) {
						return null;
					}
					else {
						EStructuralFeature feature = clazz.getEStructuralFeature("parentNode");
						if (feature instanceof EReference) {
							return (EReference) feature;
						}
						else {
							return null;
						}
					}
				}
				else if (referenceName.equals("children")) {
					EStructuralFeature feature = clazz.getEStructuralFeature("children");
					if (feature == null) {
						EReference eReference = EcoreFactory.eINSTANCE.createEReference();
						eReference.setName("children");
						eReference.setLowerBound(0);
						eReference.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
						
						EClass eType = null;
						if (clazz.getEAllReferences().size() == 1) {
							EReference ref = clazz.getEAllReferences().get(0);
							eType = (EClass) ref.getEType();
						}
						
						eReference.setEType(eType);
						clazz.getEStructuralFeatures().add(eReference);
						return eReference;
					}
					else {
						if (feature instanceof EReference) {
							EReference eReference = (EReference) feature;
							EClass eType = null;
							if (clazz.getEAllReferences().size() == 1) {
								EReference ref = clazz.getEAllReferences().get(0);
								eType = (EClass) ref.getEType();
							}
							eReference.setEType(eType);
							return eReference;
						}
						else {
							return null;
						}
					}
				}
				else {
					String escapedReferenceName = util.removeTag(referenceName);
					EStructuralFeature feature = clazz.getEStructuralFeature(escapedReferenceName);
					if (feature == null) {
						if (!create) {
							return null;
						}
						else {
							//LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.REFERENCE_MAY_NOT_EXIST, referenceName));
							EClass otherEnd = getClass("t_"+escapedReferenceName);
							EReference eReference = EcoreFactory.eINSTANCE.createEReference();
							eReference.setName(escapedReferenceName);
							eReference.setEType(otherEnd);
							eReference.setLowerBound(0);
							if (referenceName.startsWith("e_")) {
								eReference.setUpperBound(1);
							}
							if (referenceName.startsWith("c_")) {
								eReference.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);	
							}
							clazz.getEStructuralFeatures().add(eReference);
							return eReference;
						}
					}
					else {
						if (feature instanceof EReference) {
							if (!create) {
								if (referenceName.startsWith("c_")) {
									if (feature.getUpperBound() != EStructuralFeature.UNBOUNDED_MULTIPLICITY) {
										LogBook.getInstance().addError(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.REFERENCE_SINGLE_VALUED, referenceName));
									}
									feature.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
								}
								else if (referenceName.startsWith("e_")) {
									if (feature.getUpperBound() == EStructuralFeature.UNBOUNDED_MULTIPLICITY) {
										LogBook.getInstance().addError(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.REFERENCE_MULTI_VALUED, referenceName));
									}
									feature.setUpperBound(1);
								}
								return (EReference) feature;
							}
							else {
								if (referenceName.startsWith("c_")) {
									if (feature.getUpperBound() != EStructuralFeature.UNBOUNDED_MULTIPLICITY) {
										LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.REFERENCE_SINGLE_VALUED, referenceName));
									}
									feature.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
								}
								else if (referenceName.startsWith("e_")) {
									if (feature.getUpperBound() == EStructuralFeature.UNBOUNDED_MULTIPLICITY) {
										LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.REFERENCE_MULTI_VALUED, referenceName));
									}
									feature.setUpperBound(1);
								}
;								return (EReference) feature;
							}
							
						}
						else {
							return null;
						}
					}
				}
			}
		}
	
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
	public EDataType getTypeForAttribute(EClass metaElement,
			String attributeName) {
		EAttribute attribute = getAttribute(metaElement, attributeName);
		if (attribute != null) {
			return (EDataType) attribute.getEType();
		}
		return null;
	}

	@Override
	public EClass getTypeForReference(EClass metaElement, String referenceName) {
		EReference reference = getReference(metaElement, referenceName);
		if (reference != null) {
			return (EClass) reference.getEType();
		}
		return null;
	}

	@Override
	public EClassifier getTypeForFeature(EClass metaElement, String featureName) {
		EClassifier result = getTypeForAttribute(metaElement, featureName);
		if (result != null) {
			return result;
		}
		else {
			return getTypeForReference(metaElement, featureName);
		}
	}

	@Override
	public EDataType getTypeForAttribute(String elementName,
			String attributeName) {
		EAttribute attribute = getAttribute(elementName, attributeName);
		if (attribute != null) {
			return (EDataType) attribute.getEType();
		}
		return null;
	}

	@Override
	public EClass getTypeForReference(String elementName, String referenceName) {
		EReference reference = getReference(elementName, referenceName);
		if (reference != null) {
			return (EClass) reference.getEType();
		}
		return null;
	}

	@Override
	public EClassifier getTypeForFeature(String elementName, String featureName) {
		EClassifier result = getTypeForAttribute(elementName, featureName);
		if (result != null) {
			return result;
		}
		else {
			return getTypeForReference(elementName, featureName);
		}
	}

	@Override
	public EAttribute getAttribute(EClass metaElement, String attributeName) {
		if (attributeName.equals("text") || attributeName.equals("tagName")) { //if is keyword, handle it
			EAttribute result = (EAttribute) metaElement.getEStructuralFeature(attributeName);
			if (result == null) {
				if (!create) {
					return null;
				}
				else {
					//should issue warning
					LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_MAY_NOT_EXIST, attributeName));
					EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
					attribute.setName(attributeName);
					attribute.setUpperBound(1);
					attribute.setLowerBound(0);
					attribute.setEType(EcorePackage.eINSTANCE.getEString());
					metaElement.getEStructuralFeatures().add(attribute);
					return attribute;
				}
			}
			else {
				return result;
			}
		}
		else if (util.isXMLSyntax(attributeName)) { //discard inappropriate keywords
			if (attributeName.startsWith("e_") ||
					attributeName.startsWith("x_") ||
					attributeName.startsWith("c_") ||
					attributeName.startsWith("t_")) {
				return null;
			}
			else {
				String escapedAttrName = util.removeTag(attributeName); //escape attribute name
				EStructuralFeature attribute = metaElement.getEStructuralFeature(escapedAttrName); //get the estructurefeature
				if (attribute == null) { //if does not exist, create one and throw a warning
					if (!create) {
						return null;
					}
					else {
						LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.ATTRIBUTE_MAY_NOT_EXIST, attributeName));
						attribute = EcoreFactory.eINSTANCE.createEAttribute();
						attribute.setName(escapedAttrName);
						attribute.setUpperBound(1);
						attribute.setLowerBound(0);
						attribute.setEType(util.getEDataTypeByName(attributeName));
						metaElement.getEStructuralFeatures().add(attribute);
						return (EAttribute) attribute;	
					}
				}
				else { //if exists
					if (attribute instanceof EAttribute) { //if it is not an eattribute return null
						//attribute.setEType(util.getEDataTypeByName(attributeName));
						return (EAttribute) attribute;
					}
					else {
						return null;
					}
				}
			}
		}
		else {
			return null;
		}
	}

	@Override
	public EReference getReference(EClass metaElement, String referenceName) {
		if (referenceName.equals("parentNode")) {
			if (metaElement.equals(root)) {
				return null;
			}
			else {
				EStructuralFeature feature = metaElement.getEStructuralFeature("parentNode");
				if (feature instanceof EReference) {
					return (EReference) feature;
				}
				else {
					return null;
				}
			}
		}
		else if (referenceName.equals("children")) {
			EStructuralFeature feature = metaElement.getEStructuralFeature("children");
			if (feature == null) {
				EReference eReference = EcoreFactory.eINSTANCE.createEReference();
				eReference.setName("children");
				eReference.setLowerBound(0);
				eReference.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
				
				EClass eType = null;
				if (metaElement.getEAllReferences().size() == 1) {
					EReference ref = metaElement.getEAllReferences().get(0);
					eType = (EClass) ref.getEType();
				}
				
				eReference.setEType(eType);
				metaElement.getEStructuralFeatures().add(eReference);
				return eReference;
			}
			else {
				if (feature instanceof EReference) {
					EReference eReference = (EReference) feature;
					EClass eType = null;
					if (metaElement.getEAllReferences().size() == 1) {
						EReference ref = metaElement.getEAllReferences().get(0);
						eType = (EClass) ref.getEType();
					}
					eReference.setEType(eType);
					return eReference;
				}
				else {
					return null;
				}
			}
		}
		else {
			String escapedReferenceName = util.removeTag(referenceName);
			EStructuralFeature feature = metaElement.getEStructuralFeature(escapedReferenceName);
			if (feature == null) {
				if (!create) {
					return null;
				}
				else {
					LogBook.getInstance().addWarning(currentEolElement, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.REFERENCE_MAY_NOT_EXIST, referenceName));

					EClass otherEnd = getClass("t_"+escapedReferenceName);
					EReference eReference = EcoreFactory.eINSTANCE.createEReference();
					eReference.setName(escapedReferenceName);
					eReference.setEType(otherEnd);
					eReference.setLowerBound(0);
					if (referenceName.startsWith("e_")) {
						eReference.setUpperBound(1);
					}
					if (referenceName.startsWith("c_")) {
						eReference.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);	
					}
					metaElement.getEStructuralFeatures().add(eReference);
					return eReference;
				}
			}
			else {
				if (feature instanceof EReference) {
					return (EReference) feature;
				}
				else {
					return null;
				}
			}
		}
	}

	@Override
	public EStructuralFeature getFeature(EClass metaElement, String featureName) {
		EStructuralFeature feature = getAttribute(metaElement, featureName);
		if (feature != null) {
			return feature;
		}
		else {
			return getReference(metaElement, featureName);
		}
	}

	@Override
	public IPackageDriver getSubPackageDriver(String name) {
		//not supported
		return null;
	}

	@Override
	public ArrayList<IPackageDriver> getSubPackageDrivers() {
		//not supported
		return null;
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
		// TODO Auto-generated method stub
		return iMetamodelDriver;
	}
	
	public void setiMetamodelDriver(IMetamodelDriver iMetamodelDriver) {
		this.iMetamodelDriver = iMetamodelDriver;
	}

	@Override
	public EPackage getEPackage() {
		return ePackage;
	}
	
	public boolean isRead() {
		return read;
	}
	
	public void setRead(boolean read) {
		this.read = read;
	}

}
