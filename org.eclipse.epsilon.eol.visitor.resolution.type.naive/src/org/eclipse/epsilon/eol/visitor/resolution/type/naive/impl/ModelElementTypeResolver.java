package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.epsilon.analysis.model.driver.IMetamodelDriver;
import org.eclipse.epsilon.analysis.model.driver.IPackageDriver;
import org.eclipse.epsilon.analysis.model.driver.emf.EMFIMetamodelDriver;
import org.eclipse.epsilon.analysis.model.driver.plainxml.PlainXMLIMetamodelDriver;
import org.eclipse.epsilon.analysis.model.driver.plainxml.PlainXMLIpackageDriver;
import org.eclipse.epsilon.eol.metamodel.IPackage;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ModelElementTypeVisitor;
import org.eclipse.epsilon.eol.parse.Eol_EolParserRules.elseStatement_return;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class ModelElementTypeResolver extends ModelElementTypeVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ModelElementType modelElementType,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//get the string for model
		String modelName = modelElementType.getModelName();
		
		//get the string for element
		String elementName = modelElementType.getElementName(); 
		
		//get whole name
		String wholeName = "";
		if (modelName != null && elementName != null) {
			wholeName = modelName+"!"+elementName;
		}
		else if (modelName == null && elementName != null) {
			wholeName = elementName;
		}
		
		if (wholeName.equals("")) {
			LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, wholeName));
			return null;
		}
		else if (context.hasOpenXML()) {
			
		}
		else if(!context.isMetamodelRelatedKeywords(wholeName))
		{
			LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, wholeName));
			return null;
		}
			
		
		//if keyword _ModelElementType_ is found, then return null, do nothing
		if (modelName == null && elementName.equals("_ModelElementType_")) { 
			return null;
		}
		
		if (context.getiMetamodelManager().getiMetamodelDrivers().size() == 0) {
			LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.MODEL_DECL_NO_MODEL_DECLARED);
			return null;
		}
		
		//if model name is not null
		if (modelName != null) {
			if (context.getTypeUtil().getIMetamodelDriverByName(modelName).size() == 0) {
				LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.MODEL_NOT_FOUND, modelName));
			}
			else {
				//if elementString is not null
				if (elementName != null) {
					
					IMetamodelDriver iMetamodelDriver = context.getiMetamodelManager().getIMetamodelDriverWithName(modelName);
					if (iMetamodelDriver != null) {
						handleTypeWithIMetamodelDriver(modelElementType, iMetamodelDriver, context, modelName, elementName);
					}
					else {
						HashSet<IMetamodelDriver> iMetamodelDrivers = context.getiMetamodelManager().getIMetamodelDriversWithAlias(modelName);
						if (iMetamodelDrivers.size() == 0) {
							LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, modelName+"!"+elementName));
						}
						else if (iMetamodelDrivers.size() == 1) {
							handleTypeWithIMetamodelDriver(modelElementType, iMetamodelDriver, context, modelName, elementName);
						}
						else if (iMetamodelDrivers.size() > 1) {
							ArrayList<IMetamodelDriver> iMetamodelDriversFound = new ArrayList<IMetamodelDriver>();
							for(IMetamodelDriver iMetamodelDriver2: iMetamodelDrivers)
							{
								if (context.getTypeUtil().iMetamodelContainsMetaElement(iMetamodelDriver2, modelName, elementName)) {
									iMetamodelDriversFound.add(iMetamodelDriver2);
								}
							}
							if (iMetamodelDriversFound.size() == 0) {
								LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, modelName+"!"+elementName));
							}
							else if (iMetamodelDriversFound.size() > 1) {
								LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.MODEL_ELEMENT_DEFINED_IN_MULTIPLE_METAMODELS, modelName+"!"+elementName));
							}
							else {
								handleTypeWithIMetamodelDriver(modelElementType, iMetamodelDriversFound.get(0), context, modelName, elementName);
							}
						}
					}
				}
				else {
					LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.ELEMENT_TYPE_CANNOT_BE_NULL);
				}
			}
		}
		
		//if model string is null
		else {
			
			ArrayList<IMetamodelDriver> iMetamodelDrivers = context.getiMetamodelManager().getiMetamodelDrivers();
			if (iMetamodelDrivers.size() == 0) {
				LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, "!"+elementName));
			}
			else if (iMetamodelDrivers.size() == 1) {
				handleTypeWithIMetamodelDriver(modelElementType, iMetamodelDrivers.get(0), context, "", elementName);
			}
			else if (iMetamodelDrivers.size() > 1) {
				ArrayList<IMetamodelDriver> iMetamodelDriversFound = new ArrayList<IMetamodelDriver>();
				for(IMetamodelDriver iMetamodelDriver2: iMetamodelDrivers)
				{
					if (context.getTypeUtil().iMetamodelContainsMetaElement(iMetamodelDriver2, "", elementName)) {
						iMetamodelDriversFound.add(iMetamodelDriver2);
					}
				}
				if (iMetamodelDriversFound.size() == 0) {
					LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, "!"+elementName));
				}
				else if (iMetamodelDriversFound.size() > 1) {
					LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.MODEL_ELEMENT_DEFINED_IN_MULTIPLE_METAMODELS, "!"+elementName));
				}
				else {
					handleTypeWithIMetamodelDriver(modelElementType, iMetamodelDriversFound.get(0), context, "", elementName);
				}
			}
		}
			
			
		return null;
	}
	
	public void handleTypeWithIMetamodelDriver(ModelElementType modelElementType, IMetamodelDriver iMetamodelDriver, TypeResolutionContext context, String modelString, String elementString)
	{
		
		String[] identifiers = elementString.split("::");
		
		if (iMetamodelDriver instanceof EMFIMetamodelDriver) {
			
			if (identifiers.length == 1) {
				if (iMetamodelDriver.getIPackageDrivers().size() == 1) {
					IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDrivers().get(0);
					
					if (iPackageDriver.getMetaElement(identifiers[0]) != null) {
						modelElementType.setModelType(iPackageDriver.getMetaElement(identifiers[0]));
						modelElementType.setResolvedIMetamodel(iMetamodelDriver.getIMetamodel());
						modelElementType.setResolvedModelDeclaration(iMetamodelDriver.getModelDeclarationStatement());
						for(IPackage iPackage: iMetamodelDriver.getIMetamodel().getIPackages())
						{
							if (iPackage.getName().equals(iPackageDriver.getPackageName())) {
								modelElementType.setResolvedIPackage(iPackage);
								break;
							}
						}
						return;
					}
					else {
						LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, modelString+"!"+elementString));
					}				
				}
				else {
					boolean found = false;
					for(IPackageDriver iPackageDriver : context.getTypeUtil().getAllIPackageDrivers(iMetamodelDriver))
					{
						if (iPackageDriver.containsMetaElement(identifiers[0])) {
							found = true;
							modelElementType.setModelType(iPackageDriver.getMetaElement(identifiers[0]));
							modelElementType.setResolvedIMetamodel(iMetamodelDriver.getIMetamodel());
							modelElementType.setResolvedModelDeclaration(iMetamodelDriver.getModelDeclarationStatement());
							for(IPackage iPackage: iMetamodelDriver.getIMetamodel().getIPackages())
							{
								if (iPackage.getName().equals(iPackageDriver.getPackageName())) {
									modelElementType.setResolvedIPackage(iPackage);
									break;
								}
							}
							return;
						}
					}
					if (!found) {
						LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, modelString+"!"+elementString));
					}
				}
			}
			else {
				IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDriver(identifiers[0]);
				
				for(int i = 1; i < identifiers.length-1; i++)
				{
					iPackageDriver = iPackageDriver.getSubPackageDriver(identifiers[i]);
				}	
				if (iPackageDriver.getMetaElement(identifiers[identifiers.length-2]) != null) {
					modelElementType.setModelType(iPackageDriver.getMetaElement(identifiers[0]));
					modelElementType.setResolvedIMetamodel(iMetamodelDriver.getIMetamodel());
					modelElementType.setResolvedModelDeclaration(iMetamodelDriver.getModelDeclarationStatement());
					for(IPackage iPackage: iMetamodelDriver.getIMetamodel().getIPackages())
					{
						if (iPackage.getName().equals(iPackageDriver.getPackageName())) {
							modelElementType.setResolvedIPackage(iPackage);
							break;
						}
					}
					return;
				}
				else {
					LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, modelString+"!"+elementString));
				}
			}
		}
		
		else if (iMetamodelDriver instanceof PlainXMLIMetamodelDriver) {
			if (!elementString.startsWith("t_")) {
				LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.INVALID_XML_TYPE_NOTATION, elementString.substring(0, 2)));
				return;
			}
			else {

				if (iMetamodelDriver.getIPackageDrivers().size() == 1) {
					IPackageDriver iPackageDriver = iMetamodelDriver.getIPackageDrivers().get(0);
					PlainXMLIpackageDriver _iPackageDriver = (PlainXMLIpackageDriver) iPackageDriver;
					_iPackageDriver.setCurrentEolElement(modelElementType);
					if (iPackageDriver.getMetaElement(identifiers[0]) != null) {
						modelElementType.setModelType(iPackageDriver.getMetaElement(identifiers[0]));
						modelElementType.setResolvedIMetamodel(iMetamodelDriver.getIMetamodel());
						modelElementType.setResolvedModelDeclaration(iMetamodelDriver.getModelDeclarationStatement());
						for(IPackage iPackage: iMetamodelDriver.getIMetamodel().getIPackages())
						{
							if (iPackage.getName().equals(iPackageDriver.getPackageName())) {
								modelElementType.setResolvedIPackage(iPackage);
								break;
							}
						}
						return;
					}
					else {
						LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, modelString+"!"+elementString));
					}				
				}
				else {
					boolean found = false;
					for(IPackageDriver iPackageDriver : context.getTypeUtil().getAllIPackageDrivers(iMetamodelDriver))
					{
						if (iPackageDriver.containsMetaElement(identifiers[0])) {
							found = true;
							modelElementType.setModelType(iPackageDriver.getMetaElement(identifiers[0]));
							modelElementType.setResolvedIMetamodel(iMetamodelDriver.getIMetamodel());
							modelElementType.setResolvedModelDeclaration(iMetamodelDriver.getModelDeclarationStatement());
							for(IPackage iPackage: iMetamodelDriver.getIMetamodel().getIPackages())
							{
								if (iPackage.getName().equals(iPackageDriver.getPackageName())) {
									modelElementType.setResolvedIPackage(iPackage);
									break;
								}
							}
							return;
						}
					}
					if (!found) {
						LogBook.getInstance().addError(modelElementType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED, modelString+"!"+elementString));
					}
				}			
			}
		}
	}
	

	


}
