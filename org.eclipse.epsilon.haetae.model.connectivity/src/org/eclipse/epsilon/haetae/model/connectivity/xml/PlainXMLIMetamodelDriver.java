package org.eclipse.epsilon.haetae.model.connectivity.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class PlainXMLIMetamodelDriver implements IMetamodelDriver{

	protected HashMap<String, PlainXMLIpackageDriver> packages = new HashMap<String, PlainXMLIpackageDriver>();
	protected String name;
	protected HashSet<String> aliases = new HashSet<String>();
	protected ModelDeclarationStatement modelDeclarationStatement = null;
	protected LogBook logBook = null;
	protected PlainXMLMetamodelDriverUtil util = new PlainXMLMetamodelDriverUtil();

	@Override
	public boolean loadModel(HashMap<String, Object> options) {
		ArrayList<XML2EcoreTranslator> result = new ArrayList<XML2EcoreTranslator>();
		String path = (String) options.get("path");
		Boolean create = (Boolean) options.get("create");
		String name = (String) options.get("name");
		
		if (create) {
			EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
			PlainXMLIpackageDriver driver = new PlainXMLIpackageDriver(ePackage);
			driver.setCreate(true);
			if (name != null) {
				ePackage.setName(name);
			}
			if (path != null) {
				ePackage.setNsURI(path);
			}
			driver.setiMetamodelDriver(this);
			packages.put(name, driver);
			return true;
		}
		
		else {
			result.add(util.translatePlainXML2EPackage(path));
			if (result.size() > 0) {
				for(XML2EcoreTranslator translator: result)
				{
					EPackage ePackage = translator.getEPackage();
					PlainXMLIpackageDriver driver = new PlainXMLIpackageDriver(ePackage);
					driver.setiMetamodelDriver(this);
					driver.setRoot(translator.get_root());
					packages.put(ePackage.getName(), driver);
				}
				return true;
			}
			else {
				logBook.addError(modelDeclarationStatement, IMessage_IMetamodelDriver.UNABLE_TO_LOAD_METAMODEL);
				return false;
			}
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Set<String> getAliases() {
		return aliases;
	}

	@Override
	public void addAlias(String alias) {
		if (!aliases.add(alias)) {
			for(VariableDeclarationExpression var: modelDeclarationStatement.getAliases())
			{
				if (var.getName().getName().equals(alias)) {
					logBook.addWarning(var, IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.DUPLICATE_ALIAS, var.getName().getName()));
				}
			}
		}
	}

	@Override
	public IPackageDriver getIPackageDriver(String packageName) {
		return packages.get(packageName);
	}

	@Override
	public boolean containsIPackage(String packageName) {
		return packages.containsKey(packageName);
	}

	@Override
	public LogBook getLogBook() {
		return logBook;
	}

	@Override
	public void setLogBook(LogBook logBook) {
		this.logBook = logBook;
	}

	@Override
	public ModelDeclarationStatement getModelDeclarationStatement() {
		return modelDeclarationStatement;
	}

	@Override
	public void setModelDeclarationStatement(
			ModelDeclarationStatement modelDeclarationStatement) {
		this.modelDeclarationStatement = modelDeclarationStatement;
		
	}

	@Override
	public ArrayList<IPackageDriver> getIPackageDrivers() {
		ArrayList<IPackageDriver> result = new ArrayList<IPackageDriver>();
		result.addAll(packages.values());
		return result;
	}


	@Override
	public ArrayList<String> getAllTypeNames(boolean allowSingleIdentifier) {
		
		ArrayList<String> result = new ArrayList<String>();
		if(allowSingleIdentifier)
		{
			for(IPackageDriver ipd: getIPackageDrivers())
			{
				for(String typeName: ipd.getAllTypeNames())
				{
					result.add(name + "!" + typeName);
					result.add(ipd.getPackageName() + "!" + typeName);
				}
				for(String alias: aliases)
				{
					for(String typeName: ipd.getAllTypeNames())
					{
						result.add(alias+"!"+typeName);
					}
				}
			}
			
			if(getIPackageDrivers().size() == 1)
			{
				IPackageDriver ipd = getIPackageDrivers().get(0);
				result.addAll(ipd.getAllTypeNames());
			}
		}
		else {
			for(IPackageDriver ipd: getIPackageDrivers())
			{
				for(String typeName: ipd.getAllTypeNames())
				{
					result.add(name + "!" + typeName);
				}
				for(String alias: aliases)
				{
					for(String typeName: ipd.getAllTypeNames())
					{
						result.add(alias+"!"+typeName);
					}
				}
			}
		}
		
		
		return result;}

}
