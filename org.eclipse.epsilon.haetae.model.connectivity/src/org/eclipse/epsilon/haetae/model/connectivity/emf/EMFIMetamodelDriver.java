package org.eclipse.epsilon.haetae.model.connectivity.emf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;
import org.eclipse.epsilon.haetae.model.connectivity.util.EcoreFileLoader;
import org.eclipse.epsilon.haetae.model.connectivity.util.EcoreRegistryLoader;

public class EMFIMetamodelDriver implements IMetamodelDriver{

	protected HashMap<String, EMFIPackageDriver> packages = new HashMap<String, EMFIPackageDriver>();
	protected String name;
	protected HashSet<String> aliases = new HashSet<String>();
	protected ModelDeclarationStatement modelDeclarationStatement = null;
	protected LogBook logBook = null;
	
	@Override
	public boolean loadModel(HashMap<String, Object> options) {
		ArrayList<EPackage> result = new ArrayList<EPackage>();
		
		String path = (String) options.get("path");
		if (path != null) {
			result.addAll(EcoreFileLoader.loadEPackageFromFile(path));
			if (result.size() > 0) {
				for(EPackage ePackage: result)
				{
					if (ePackage != null) {
						EMFIPackageDriver iPackageDriver = new EMFIPackageDriver(ePackage);
						iPackageDriver.setiMetamodelDriver(this);
						packages.put(ePackage.getName(), iPackageDriver);
					}
					else {
						//logBook.addError(modelDeclarationStatement, IMessage_IMetamodelDriver.UNABLE_TO_LOAD_METAMODEL);
						return false;
					}
				}
				return true;
			}
			else {
				logBook.addError(modelDeclarationStatement, IMessage_IMetamodelDriver.UNABLE_TO_LOAD_METAMODEL);
				return false;
			}
		}
		else {
			String nsuri = (String) options.get("nsuri");
			if (nsuri != null) {
				result.addAll(EcoreRegistryLoader.loadEPackageFromRegistry(nsuri));
				for(EPackage ePackage: result)
				{
					if (ePackage != null) {
						EMFIPackageDriver iPackageDriver = new EMFIPackageDriver(ePackage);
						iPackageDriver.setiMetamodelDriver(this);
						packages.put(ePackage.getName(), iPackageDriver);	
					}
					else {
						//logBook.addError(modelDeclarationStatement, IMessage_IMetamodelDriver.UNABLE_TO_LOAD_METAMODEL);
						return false;
					}
				}
				return true;
			}
			else {
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
		for(String s: packages.keySet())
		{
			if (s.equalsIgnoreCase(packageName)) {
				return packages.get(s);
			}
		}
		return null;
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
		}
		
		
		return result;}

}
