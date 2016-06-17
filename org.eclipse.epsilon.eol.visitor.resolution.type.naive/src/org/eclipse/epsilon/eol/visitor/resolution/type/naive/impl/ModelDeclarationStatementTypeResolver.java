package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.epsilon.analysis.model.driver.IMetamodelDriver;
import org.eclipse.epsilon.analysis.model.driver.emf.EMFIMetamodelDriver;
import org.eclipse.epsilon.analysis.model.driver.plainxml.PlainXMLIMetamodelDriver;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationParameter;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ModelDeclarationStatementVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class ModelDeclarationStatementTypeResolver extends ModelDeclarationStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ModelDeclarationStatement modelDeclarationStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		if (validStatement(modelDeclarationStatement, context)) {
			//fetch the sourceParameter which specifies the metamodel information
			ModelDeclarationParameter sourceParameter = null;
			
			//fetch the metamodel name or NSURI
			//String sourceString = ""; 

			//if the driver is EMF
			if(getDriverType(modelDeclarationStatement).equals("EMF"))
			{
				HashMap<String, Object> options = new HashMap<String, Object>();
				
				//get the nsuri 
				sourceParameter = getParameter("nsuri", modelDeclarationStatement);
				if (sourceParameter != null) {
					options.put("nsuri", ((StringExpression)sourceParameter.getValue()).getValue());
				}
				else {
					sourceParameter = getParameter("path", modelDeclarationStatement);
					if (sourceParameter != null) {
						options.put("path", ((StringExpression)sourceParameter.getValue()).getValue());
					}
					else {
						LogBook.getInstance().addError(modelDeclarationStatement, IMessage_TypeResolution.MODEL_DECL_NSURI_OR_PATH_REQUIRED);
					}
				}
				

				
				//if nsuri or the uri is found, get it 
				//sourceString = ((StringExpression)sourceParameter.getValue()).getValue();
				
				//create a new MetaModel
				IMetamodelDriver iMetamodelDriver = new EMFIMetamodelDriver(); 
				iMetamodelDriver.setName(modelDeclarationStatement.getName().getName().getName());
				for(VariableDeclarationExpression vde: modelDeclarationStatement.getAliases())
				{
					iMetamodelDriver.getAliases().add(vde.getName().getName());
				}
				iMetamodelDriver.setLogBook(LogBook.getInstance());
				iMetamodelDriver.setModelDeclarationStatement(modelDeclarationStatement);
				
				
				boolean loaded = iMetamodelDriver.loadModel(options);
				
				if (loaded) {
					context.getiMetamodelManager().addIMetamodelDriver(iMetamodelDriver);
				}
			
			}
			else if (getDriverType(modelDeclarationStatement).equals("XML")) {
				

				HashMap<String, Object> options = new HashMap<String, Object>();
				
				boolean create = false;
				
				ModelDeclarationParameter createParameter = getParameter("create", modelDeclarationStatement);
				if (createParameter != null) {
					create = true;
				}
				
				options.put("create", create);
				
				if (create) {
					options.put("name", modelDeclarationStatement.getName().getName().getName());
					ArrayList<String> aliases = new ArrayList<String>();
					for(VariableDeclarationExpression vde: modelDeclarationStatement.getAliases())
					{
						aliases.add(vde.getName().getName());
					}
					options.put("aliases", aliases);
				}
				
				String sourceString = null;
				
				//get the nsuri 
				sourceParameter = getParameter("uri", modelDeclarationStatement);
				if (sourceParameter != null) {
					options.put("uri", ((StringExpression)sourceParameter.getValue()).getValue());
				}
				else {
					sourceParameter = getParameter("path", modelDeclarationStatement);
					if (sourceParameter != null) {
						sourceString = ((StringExpression)sourceParameter.getValue()).getValue();
						sourceString = context.getParentFolderDirectory() + sourceString;
						options.put("path", sourceString);
					}
					else {
						LogBook.getInstance().addError(modelDeclarationStatement, IMessage_TypeResolution.MODEL_DECL_NSURI_OR_PATH_REQUIRED);
					}
				}
				
				
				//create a new XMLMetaModel
				PlainXMLIMetamodelDriver iMetamodelDriver = new PlainXMLIMetamodelDriver();
				iMetamodelDriver.setName(modelDeclarationStatement.getName().getName().getName());
				for(VariableDeclarationExpression vde: modelDeclarationStatement.getAliases())
				{
					iMetamodelDriver.getAliases().add(vde.getName().getName());
				}
				iMetamodelDriver.setLogBook(LogBook.getInstance());
				iMetamodelDriver.setModelDeclarationStatement(modelDeclarationStatement);


				boolean loaded = iMetamodelDriver.loadModel(options);
				
				if (loaded) {
					context.getiMetamodelManager().addIMetamodelDriver(iMetamodelDriver);
					
				}
			}
		}
		
		return null;
		
	}
	
	private ModelDeclarationParameter getParameter(String paramName, ModelDeclarationStatement statement)
	{
		ModelDeclarationParameter result = null;
		for(ModelDeclarationParameter parameter: statement.getParameters())
		{
			NameExpression key = (NameExpression) parameter.getKey();
			
			if (key.getName().equals(paramName)) {
				return parameter;
			}
		}
		return result;
	}

	
	private String getDriverType(ModelDeclarationStatement statement)
	{
		if (statement.getDriver().getName() != null) {
			return statement.getDriver().getName();	
		}
		else {
			
			return null;
		}
		
	}
	
	private boolean validStatement(ModelDeclarationStatement statement, TypeResolutionContext context)
	{
		if (statement.getName() == null) {
			LogBook.getInstance().addError(statement, IMessage_TypeResolution.MODEL_DECL_NO_NAME);
			return false;
		}
		if (statement.getDriver() == null) {
			LogBook.getInstance().addError(statement, IMessage_TypeResolution.MODEL_DECL_NO_DRIVER);
			return false;
		}
		else {
			boolean supported = false;
			String driver = statement.getDriver().getName();
			for(String supportedDriver: context.getSupportedDrivers())
			{
				if (supportedDriver.equals(driver)) {
					supported = true;
					break;
				}
			}
			if (!supported) {
				LogBook.getInstance().addError(statement.getDriver(), IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.MODEL_DECL_DRIVER_NOT_SUPPORTED, driver));
				return false;
			}
		}
		return true;
		
	}

	
	

}
