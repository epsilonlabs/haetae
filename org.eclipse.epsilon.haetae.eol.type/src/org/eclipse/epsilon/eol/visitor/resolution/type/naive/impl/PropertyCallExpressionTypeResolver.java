package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;


import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.ModelType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.SelfContentType;
import org.eclipse.epsilon.eol.metamodel.SelfType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.PropertyCallExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;
import org.eclipse.epsilon.haetae.model.connectivity.xml.PlainXMLIMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.xml.PlainXMLIpackageDriver;

public class PropertyCallExpressionTypeResolver extends PropertyCallExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(PropertyCallExpression propertyCallExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//get target

		Expression target = propertyCallExpression.getTarget(); //get the target
		
		//should not happen
		if (target == null) {
			LogBook.getInstance().addError(propertyCallExpression, IMessage_TypeResolution.PROPERTY_MUST_HAVE_A_TARGET);
			return null;
		}
		
		//get the property
		String property = propertyCallExpression.getProperty().getName();
		
		//visit the target first
		controller.visit(target, context); 
		
		//get resolved type
		Type targetType = target.getResolvedType();
		
		//if target type is null, report (should not happen)
		if (targetType == null) {
			LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			propertyCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
			return null;
		}
		
		//get typeutil and type inference manager
		TypeUtil typeUtil = TypeUtil.getInstance();
		
		//should handle extended property
		if (propertyCallExpression.isExtended()) {
			AnyType anyType = EolFactory.eINSTANCE.createAnyType(); //create an anyType
			context.setAssets(anyType, propertyCallExpression); //set assets
			propertyCallExpression.setResolvedType(anyType); //assign type
			
			LogBook.getInstance().addWarning(propertyCallExpression.getProperty(), "property is an Extended property, expression type is set to Any");
			return null;
		}
		
		if (targetType instanceof ModelElementType) {
			if (isMetamodelKeyword(property)) {
				handleModeElementKeyword(propertyCallExpression, context);
			}
			else {
				ModelElementType modelElementType = (ModelElementType) targetType; //get the type
				
				String elementString = modelElementType.getElementName();
				
				IPackageDriver ipd = (IPackageDriver) modelElementType.getResolvedIPackage();
				
				if (ipd != null) {
					if (ipd instanceof PlainXMLIpackageDriver) {
						((PlainXMLIpackageDriver) ipd).setCurrentEolElement(propertyCallExpression);
						if (!lhsOfAssignment(propertyCallExpression)) {
							((PlainXMLIpackageDriver) ipd).setRead(true);
						}
						
					}
					if (!ipd.containsFeature(elementString, property)) {
						LogBook.getInstance().addError(propertyCallExpression.getProperty(), IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.ELEMENT_DOES_NOT_CONTAIN_PROPERTY, elementString, property));
						propertyCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
						if (ipd instanceof PlainXMLIpackageDriver) {
								((PlainXMLIpackageDriver) ipd).setRead(false);						
						}
						return null;
					}
					else {
						EStructuralFeature feature = ipd.getFeature(elementString, property); //get the property 
						
						propertyCallExpression.getProperty().setResolvedContent(feature); //set the resolved content for the property
						
						if (feature.getUpperBound() != 1) { //this means that the feature is a many value aggregation
							Type contentType = null; //each collection type needs a content type
							CollectionType callType = null; //prepare the callType
							
							EClassifier propertyType = ipd.getTypeForFeature(elementString, property); //get the type for the property
							
							if (typeUtil.isEDataType(propertyType)) {//if type is EDataType
								if(typeUtil.isNormalisable(propertyType)){ //if type is normalisable
									contentType = typeUtil.normalise(propertyType); //normalise and assign type to contentType
								}
								else { //if type is not normalisable
									contentType = EolFactory.eINSTANCE.createModelElementType(); //create a EType and assign it to contentType
									((ModelElementType)contentType).setModelElementType(propertyType);
									IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
									if (imd!= null) {
										((ModelElementType)contentType).setModelName(imd.getName());
									}
									((ModelElementType)contentType).setElementName(propertyType.getName());
									controller.visit(contentType, context);
								}
							}
							else { //if type is not EDatatype
								contentType = EolFactory.eINSTANCE.createModelElementType(); //assign a ModelElementType to contentType 
								((ModelElementType) contentType).setModelElementType(propertyType); //setEcoreType
								IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
								if (imd!= null) {
									((ModelElementType)contentType).setModelName(imd.getName());
								}
								((ModelElementType) contentType).setElementName(propertyType.getName()); //element name
								controller.visit(contentType, context);
							}

							if (feature.isOrdered() && feature.isUnique()) { //if feature is ordered and unique
								callType = EolFactory.eINSTANCE.createOrderedSetType(); //this should be ordered set
							}
							else if (feature.isOrdered() && !feature.isUnique()) { //if feature is ordered but not unique
								callType = EolFactory.eINSTANCE.createSequenceType(); //this should be a sequence
							}
							else if (!feature.isOrdered() && feature.isUnique()) {//if feature is unordered and unique
								callType = EolFactory.eINSTANCE.createSetType();  //this should be a set
							}
							else if (!feature.isOrdered() && !feature.isUnique()) {//if feature is unordered and non-unique
								callType = EolFactory.eINSTANCE.createBagType(); //this should be a bag
							}
							
							callType.setContentType(EcoreUtil.copy(contentType));
							
							Type typeCopy = EcoreUtil.copy(callType);
							propertyCallExpression.getProperty().setResolvedType(typeCopy);
							context.setAssets(typeCopy, propertyCallExpression.getProperty());
							
							propertyCallExpression.setResolvedType(typeCopy);
							context.setAssets(typeCopy, propertyCallExpression); //set assets for callType
							
						}
						else { //if the feature is single value aggregation
							
							EClassifier propertyType = ipd.getTypeForFeature(elementString, property); //get property
							if (typeUtil.isEDataType(propertyType)) { //if property is data type
								if(typeUtil.isNormalisable(propertyType)){ //if the data type is normalisable
									Type type = typeUtil.normalise(propertyType);
									propertyCallExpression.getProperty().setResolvedType(type);
									context.setAssets(type, propertyCallExpression.getProperty());
									
									Type typeCopy = EcoreUtil.copy(type);
									propertyCallExpression.setResolvedType(typeCopy);
									context.setAssets(typeCopy, propertyCallExpression);
								}
								else { //if the data type is not normalisable
									ModelElementType eType = EolFactory.eINSTANCE.createModelElementType();
									eType.setModelElementType(propertyType);
									IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
									if (imd!= null) {
										eType.setModelName(imd.getName());
									}
									eType.setElementName(propertyType.getName());
									controller.visit(eType, context);
									propertyCallExpression.getProperty().setResolvedType(eType);
									context.setAssets(eType, propertyCallExpression.getProperty());
									
									Type typeCopy = EcoreUtil.copy(eType);
									propertyCallExpression.setResolvedType(typeCopy);
									context.setAssets(typeCopy, propertyCallExpression);
								}
							}
							else { //if the property is not data type, then it should be model element type
								ModelElementType callType = EolFactory.eINSTANCE.createModelElementType();
								callType.setModelElementType(propertyType);
								IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
								if (imd!= null) {
									callType.setModelName(imd.getName());
								}
								callType.setElementName(propertyType.getName());
								controller.visit(callType, context);
								propertyCallExpression.getProperty().setResolvedType(callType);
								context.setAssets(callType, propertyCallExpression.getProperty());
								
								Type typeCopy = EcoreUtil.copy(callType);
								propertyCallExpression.setResolvedType(typeCopy);
								context.setAssets(typeCopy, propertyCallExpression);
							}
						}
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.OBJECT_NOT_DEFINED_IN_MODEL);
					propertyCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
					return null;
				}
			}
		}
		else if (targetType instanceof CollectionType) {
			if (isCollectionKeyword(property)) {
				handleKeywords(propertyCallExpression, context);
			}
			else { //if target is of type CollectionType
				CollectionType rawCollectionType = (CollectionType) targetType; //prepare collection type
				
				CollectionType rawResultType = EcoreUtil.copy(rawCollectionType);
				
				if (getInnermostType(rawCollectionType) instanceof ModelElementType) 
				{ //if contentType is ModelElementType
					
					ModelElementType resultContentType = (ModelElementType) getInnermostType(rawCollectionType); //prepare result content type
					IPackageDriver ipd = (IPackageDriver) resultContentType.getResolvedIPackage();
					if(ipd != null) //if meta model exists
					{
						String elementString = resultContentType.getElementName(); //get metaclass string
						
						if(ipd.containsFeature(elementString, property)) //if metamode class contains the property
						{
							EStructuralFeature feature = ipd.getFeature(elementString, property); //get the property 
							propertyCallExpression.getProperty().setResolvedContent(feature); //set the resolved content for the property

							if (feature.getUpperBound() != 1) { //this means that the feature is a many value aggregation
								Type contentType = null; //each collection type needs a content type
								CollectionType callType = null; //prepare the callType
								
								EClassifier propertyType = ipd.getTypeForFeature(elementString, property); //get the type for the property
								if (context.getTypeUtil().isEDataType(propertyType)) { //if type is EDataType
									if(context.getTypeUtil().isNormalisable(propertyType)){ //if type is normalisable
										contentType = context.getTypeUtil().normalise(propertyType); //normalise and assign type to contentType
									}
									else { //if type is not normalisable
										contentType = EolFactory.eINSTANCE.createModelElementType();
										((ModelElementType)contentType).setModelElementType(propertyType);
										IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
										if (imd!= null) {
											((ModelElementType)contentType).setModelName(imd.getName());
										}
										((ModelElementType)contentType).setElementName(propertyType.getName());
										controller.visit(contentType, context);
									}
								}
								else { //if type is not EDatatype
									contentType = EolFactory.eINSTANCE.createModelElementType(); //assign a ModelElementType to contentType 
									((ModelElementType) contentType).setModelElementType(propertyType); //setEcoreType
									IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
									if (imd!= null) {
										((ModelElementType)contentType).setModelName(imd.getName());
									}
									((ModelElementType) contentType).setElementName(propertyType.getName()); //element name
									controller.visit(contentType, context);
								}

					
								
								if (feature.isOrdered() && feature.isUnique()) { //if feature is ordered and unique
									callType = EolFactory.eINSTANCE.createOrderedSetType(); //this should be ordered set
								}
								else if (feature.isOrdered() && !feature.isUnique()) { //if feature is ordered but not unique
									callType = EolFactory.eINSTANCE.createSequenceType(); //this should be a sequence
								}
								else if (!feature.isOrdered() && feature.isUnique()) {//if feature is unordered and unique
									callType = EolFactory.eINSTANCE.createSetType();  //this should be a set
								}
								else if (!feature.isOrdered() && !feature.isUnique()) {//if feature is unordered and non-unique
									callType = EolFactory.eINSTANCE.createBagType(); //this should be a bag
								}
								
								callType.setContentType(contentType);
								context.setAssets(contentType, callType); //set assets for contentType
								
								Type typeCopy = EcoreUtil.copy(callType);
								propertyCallExpression.getProperty().setResolvedType(typeCopy);
								context.setAssets(typeCopy, propertyCallExpression.getProperty());
								
								rawResultType.setContentType(callType);
								context.setAssets(callType, rawResultType);
								
								propertyCallExpression.setResolvedType(rawResultType);
								context.setAssets(rawResultType, propertyCallExpression); //set assets for callType
								
							}
							else { //if the feature is single value aggregation
								
								EClassifier propertyType = ipd.getTypeForFeature(elementString, property); //get property
								if (context.getTypeUtil().isEDataType(propertyType)) { //if property is data type
									if(context.getTypeUtil().isNormalisable(propertyType)){ //if the data type is normalisable
										Type type = context.getTypeUtil().normalise(propertyType);
										propertyCallExpression.getProperty().setResolvedType(type);
										context.setAssets(type, propertyCallExpression.getProperty());
										
										Type typeCopy = EcoreUtil.copy(type);
										rawResultType.setContentType(typeCopy);
										context.setAssets(typeCopy, rawResultType);
										
										propertyCallExpression.setResolvedType(rawResultType);
										context.setAssets(rawResultType, propertyCallExpression);
									}
									else { //if the data type is not normalisable
										ModelElementType eType = EolFactory.eINSTANCE.createModelElementType();
										eType.setModelElementType(propertyType);
										IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
										if (imd!= null) {
											eType.setModelName(imd.getName());
										}
										eType.setElementName(propertyType.getName());
										controller.visit(eType, context);
										propertyCallExpression.getProperty().setResolvedType(eType);
										context.setAssets(eType, propertyCallExpression.getProperty());
										
										Type typeCopy = EcoreUtil.copy(eType);
										rawResultType.setContentType(typeCopy);
										context.setAssets(typeCopy, rawResultType);
										
										propertyCallExpression.setResolvedType(rawResultType);
										context.setAssets(rawResultType, propertyCallExpression);
									}
								}
								else { //if the property is not data type, then it should be model element type
									ModelElementType callType = EolFactory.eINSTANCE.createModelElementType();
									callType.setModelElementType(propertyType);
									IMetamodelDriver imd = context.locateIMetamodelDriver(propertyType);
									if (imd!= null) {
										callType.setModelName(imd.getName());
									}
									callType.setElementName(propertyType.getName());
									controller.visit(callType, context);
									propertyCallExpression.getProperty().setResolvedType(callType);
									context.setAssets(callType, propertyCallExpression.getProperty());
									
									Type typeCopy = EcoreUtil.copy(callType);
									rawResultType.setContentType(typeCopy);
									context.setAssets(typeCopy, rawResultType);
									
									propertyCallExpression.setResolvedType(rawResultType);
									context.setAssets(rawResultType, propertyCallExpression);
								}
							}
						}
						else {
							LogBook.getInstance().addError(propertyCallExpression.getProperty(), "Property with name " + property
									+ " is not found" );
							propertyCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
						}
					}
				}
				else {
					LogBook.getInstance().addError(propertyCallExpression.getProperty(), IMessage_TypeResolution.PROPERTY_NOT_FOUND);
					propertyCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
				}
			}
		}
		else if (targetType instanceof ModelType) {
			ModelType modelType = (ModelType) targetType;
			IMetamodelDriver iMetamodel = (IMetamodelDriver) modelType.getResolvedIMetamodel();
			if (iMetamodel instanceof PlainXMLIMetamodelDriver) {
				PlainXMLIMetamodelDriver iMetamodelDriver = (PlainXMLIMetamodelDriver) iMetamodel;
				PlainXMLIpackageDriver ipackageDriver = (PlainXMLIpackageDriver) iMetamodelDriver.getIPackageDrivers().get(0);
				if (property.equals("root")) {
					if (ipackageDriver.getRoot() != null) {
						EClass root = ipackageDriver.getRoot();
						ModelElementType modelElementType = EolFactory.eINSTANCE.createModelElementType();
						modelElementType.setElementName(root.getName());
						modelElementType.setResolvedIMetamodel(iMetamodel);
						modelElementType.setResolvedIPackage(iMetamodel.getIPackageDrivers().get(0));
						modelElementType.setModelName(iMetamodel.getName());
						controller.visit(modelElementType, context);
						propertyCallExpression.setResolvedType(modelElementType);
					}
					else {
						propertyCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType());
					}
				}
			}
		}
		else if (typeUtil.isInstanceofAnyType(targetType)) {
			LogBook.getInstance().addWarning(target, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			AnyType resolvedType = EolFactory.eINSTANCE.createAnyType();
			propertyCallExpression.setResolvedType(resolvedType);
			context.setAssets(resolvedType, propertyCallExpression);
			return null;
		}
				
		return null;
	}
	
	public boolean isMetamodelKeyword(String s)
	{
		if (s.equals("all") || s.equals("allInstances")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isCollectionKeyword(String s)
	{
		if (s.equals("first") ||
				s.equals("second") ||
				s.equals("third") ||
				s.equals("fourth") ||
				s.equals("last") ||
				s.equals("one")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Object handleModeElementKeyword(PropertyCallExpression propertyCallExpression, TypeResolutionContext context)
	{

		//get the target type
		Type targetType = propertyCallExpression.getTarget().getResolvedType();
		
		//prepare arg types
		ArrayList<Type> argTypes = new ArrayList<Type>();
		
		Expression target = propertyCallExpression.getTarget();
		
		//get the operation definition
		OperationDefinition operationDefinition = null;
		try {
			operationDefinition = context.getOperationDefinitionManager().getOperation(propertyCallExpression, propertyCallExpression.getProperty().getName(), targetType, argTypes, false);
		} catch (AnalysisInterruptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fetch operation definition using name, context type and arg types
		//if an operation is found
		if (operationDefinition != null) {
			
			//get the context type of the operation
			Type contextType = operationDefinition.getContextType();
			
			//if target type and context type is generic
			if (context.getTypeUtil().isTypeEqualOrGeneric(targetType,contextType)) {
				
				if (OperationDefinitionManager.getInstance().handled(operationDefinition)) {
					propertyCallExpression.setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType()));
					//set the resolved type of the method
					propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType()));
					//set resolved content
					propertyCallExpression.getProperty().setResolvedContent(operationDefinition); 
				}
				else {
					
					//if is self type
					if (operationDefinition.getReturnType() instanceof SelfType) { 
						//just copy the target type because the target type has been resolved
						propertyCallExpression.setResolvedType(EcoreUtil.copy(targetType));
						//set the resolved type of the method
						propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(targetType));
						//set resolved content
						propertyCallExpression.getProperty().setResolvedContent(operationDefinition); 
					}
					
					//if is selfContentType
					else if (operationDefinition.getReturnType() instanceof SelfContentType) {
						
						//if target type is of collection type
						if (targetType instanceof CollectionType) {
							Type contentType = ((CollectionType) targetType).getContentType(); //getContentType
							if (contentType != null) {
								propertyCallExpression.setResolvedType(EcoreUtil.copy(contentType)); //set resolved type
								propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(contentType)); //set method type
								propertyCallExpression.getProperty().setResolvedContent(operationDefinition); //set resolved content
							}
							else {
								AnyType tempAnyType = EolFactory.eINSTANCE.createAnyType();
								propertyCallExpression.setResolvedType(EcoreUtil.copy(tempAnyType));
								propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(tempAnyType));
								//handle content type null
							}
						}
						else {
							LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_COLLECTION_TYPE);
							
							AnyType tempAnyType = EolFactory.eINSTANCE.createAnyType();
							propertyCallExpression.setResolvedType(EcoreUtil.copy(tempAnyType));
							propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(tempAnyType));
						}
					}
					
					else if (operationDefinition.getReturnType() instanceof CollectionType && 
							(((CollectionType)operationDefinition.getReturnType()).getContentType() instanceof SelfType)) { //if the return type is collection type and its content type is SelfType ============================
						
						CollectionType returnType = (CollectionType) operationDefinition.getReturnType();
						
						CollectionType resultType = EcoreUtil.copy(returnType);
						resultType.setContentType(EcoreUtil.copy(targetType));
						propertyCallExpression.setResolvedType(EcoreUtil.copy(resultType)); //set the type of the method call
						propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(resultType)); //set resolved type
						propertyCallExpression.getProperty().setResolvedContent(operationDefinition); //set resolved content
					}
					
					else {
						propertyCallExpression.setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType())); //set the type of the method call
						propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType())); //set resolved type
						propertyCallExpression.getProperty().setResolvedContent(operationDefinition); //set resolved content
					}
				}
				
				
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				propertyCallExpression.setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType())); //set the type of the method call
				propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(operationDefinition.getReturnType())); //set resolved type
				propertyCallExpression.getProperty().setResolvedContent(operationDefinition); //set resolved conten
			}
			else {
				String expectedType = "";
				if (contextType instanceof ModelElementType) {
					expectedType = ((ModelElementType)contextType).getModelName() + "!" + ((ModelElementType)contextType).getElementName();
				}
				
				else {
					expectedType = contextType.getClass().toString();
				}
				LogBook.getInstance().addError(target, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, expectedType));
			}
		}
		else {
			String argString = "";
			for(int i = 0; i < argTypes.size(); i++)
			{
				argString.concat(argTypes.get(i).getClass().toString());
				if (i == argTypes.size() - 1) {
					
				}
				else {
					argString.concat(", ");
				}
			}
			
			LogBook.getInstance().addError(propertyCallExpression.getProperty(), IMessage_TypeResolution.PROPERTY_NOT_FOUND);
		}
		return null;
		
	
	}
	
	public Object handleKeywords(PropertyCallExpression propertyCallExpression, TypeResolutionContext context)
	{
		//get the target type
		Type targetType = propertyCallExpression.getTarget().getResolvedType();
		//prepare arg types
		ArrayList<Type> argTypes = new ArrayList<Type>();
		
		Expression target = propertyCallExpression.getTarget();
		
		//get the operation definition
		OperationDefinition operationDefinition = null;
		try {
			operationDefinition = context.getOperationDefinitionManager().getOperation(propertyCallExpression, propertyCallExpression.getProperty().getName(), targetType, argTypes, false);
		} catch (AnalysisInterruptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fetch operation definition using name, context type and arg types
		//if an operation is found
		if (operationDefinition != null) {
			
			//get the context type of the operation
			Type opContextType = operationDefinition.getContextType();
			
			//if target type and context type is generic
			if (context.getTypeUtil().isTypeEqualOrGeneric(targetType,opContextType)) {
				
				
				//if handled
				if (OperationDefinitionManager.getInstance().handled(operationDefinition)) {
					//make a copy of the return type
					Type returnType = EcoreUtil.copy(operationDefinition.getReturnType());
					//set the resolved type
					propertyCallExpression.setResolvedType(returnType);
					//set assets
					context.setAssets(returnType, propertyCallExpression);
					//set the resolved type of the method
					propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(returnType));
					//set resolved content
					propertyCallExpression.getProperty().setResolvedContent(operationDefinition); 
				}
				//if there is no handler
				else {
					System.err.println("NO_HANDLER: " );

					Type returnTypeCopy = EcoreUtil.copy(operationDefinition.getReturnType());
					
					propertyCallExpression.setResolvedType(returnTypeCopy); //set the type of the method call
					context.setAssets(returnTypeCopy, propertyCallExpression);
					propertyCallExpression.getProperty().setResolvedType(EcoreUtil.copy(returnTypeCopy)); //set resolved type
					propertyCallExpression.getProperty().setResolvedContent(operationDefinition); //set resolved content
				}
				
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					if (!TypeInferenceManager.getInstance().containsDynamicType((AnyType) targetType, opContextType.eClass())) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_TYPE, TypeUtil.getInstance().getTypeName(opContextType)));
					}
					propertyCallExpression.setResolvedType(EolFactory.eINSTANCE.createAnyType()); //set the type of the method call
					propertyCallExpression.getProperty().setResolvedType(EolFactory.eINSTANCE.createAnyType()); //set resolved type
					propertyCallExpression.getProperty().setResolvedContent(operationDefinition); //set resolved conten
			}
			else {
				//handle type incompatible
				String expectedType = "";
				@SuppressWarnings("unused")
				String actualType = "";
				if (opContextType instanceof ModelElementType) {
					expectedType = ((ModelElementType)opContextType).getModelName() + "!" + ((ModelElementType)opContextType).getElementName();
				}
				
				else {
					expectedType = opContextType.getClass().toString();
				}
				if (targetType instanceof ModelElementType) {
					actualType = ((ModelElementType)targetType).getModelName() + "!" + ((ModelElementType)targetType).getElementName();
				}
				else {
					actualType = targetType.getClass().toString();
				}
				LogBook.getInstance().addError(target, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, expectedType));
			}
		}
		else {
			String argString = "";
			for(int i = 0; i < argTypes.size(); i++)
			{
				argString += argTypes.get(i).eClass().getName();
				if (i == argTypes.size() - 1) {
					
				}
				else {
					argString.concat(", ");
				}
			}
			AnyType returnType = EolFactory.eINSTANCE.createAnyType();
			
			propertyCallExpression.setResolvedType(returnType); //set the type of the method call
			context.setAssets(returnType, propertyCallExpression);
			//LogBook.getInstance().addError(propertyCallExpression, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.OPERATION_NOT_FOUND, methodName, argString));
		}
		return null;
		
	}
	
	
	public Type getInnermostType(Type t)
	{
		if (t instanceof CollectionType) {
			CollectionType collectionType = (CollectionType) t;
			Type contentType = collectionType.getContentType();
			while(contentType instanceof CollectionType)
			{
				contentType = ((CollectionType)contentType).getContentType();
			}
			return EcoreUtil.copy(contentType);
		}
		else {
			return EcoreUtil.copy(t);
		}
	}
	
	public Type getInnermosTypeRecursively(Type t)
	{
		Type result = null;
		if(t instanceof CollectionType)
		{
			CollectionType _t = (CollectionType) t;
			Type ct = _t.getContentType();
			if (ct instanceof CollectionType) {
				return getInnermosTypeRecursively(ct);
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(ct)) {
				result = EolFactory.eINSTANCE.createAnyType();
				AnyType _result = (AnyType) result;
				_result.getDynamicTypes().addAll(getAllDynamicTypesRecursively((AnyType) ct));
				return _result;
			}
			else {
				return EcoreUtil.copy(ct);
			}
		}
		else if (TypeUtil.getInstance().isInstanceofAnyType(t)) {
			AnyType _t = (AnyType) t;
			result = EolFactory.eINSTANCE.createAnyType();
			AnyType _result = (AnyType) result;

			for(Type __t: _t.getDynamicTypes())
			{
				if (__t instanceof CollectionType) {
					CollectionType ___t = (CollectionType) __t;
					_result.getDynamicTypes().add(getInnermosTypeRecursively(___t.getContentType()));
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(__t)) {
					_result.getDynamicTypes().addAll(getAllDynamicTypesRecursively((AnyType) __t));
				}
			}
			return _result;
		}
		return EcoreUtil.copy(t);
	}
	
	private ArrayList<Type> getAllDynamicTypesRecursively(AnyType anyType)
	{
		ArrayList<Type> result = new ArrayList<Type>();
		if(TypeUtil.getInstance().isInstanceofAnyType(anyType))
		{
			for(Type t: anyType.getDynamicTypes())
			{
				if (t instanceof CollectionType) {
					result.addAll(getAllDynamicTypesRecursively((AnyType) ((CollectionType)t).getContentType()));
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(t)) {
					result.addAll(getAllDynamicTypesRecursively((AnyType) t));
				}
				else{
					result.add(t);
				}
			}
		}
		else {
			result.add(anyType);
		}
		
		return result;
	}
	
	private boolean lhsOfAssignment(PropertyCallExpression propertyCallExpression)
	{
		EOLElement container = propertyCallExpression.getContainer();
		Expression expr = propertyCallExpression;
		while (container != null && !(container instanceof AssignmentStatement)) {
			container = container.getContainer();
		}
		if (container instanceof AssignmentStatement) {
			while(expr.getContainer() != container)
			{
				expr = (Expression) expr.getContainer();
			}
			if (((AssignmentStatement)container).getLhs().equals(expr)) {
				return true;
			}
		}
		return false;
	}
	
}
