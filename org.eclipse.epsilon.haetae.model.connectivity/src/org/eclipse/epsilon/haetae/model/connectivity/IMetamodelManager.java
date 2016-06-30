package org.eclipse.epsilon.haetae.model.connectivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.epsilon.eol.problem.imessages.IMessage_IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.xml.PlainXMLIMetamodelDriver;

public class IMetamodelManager {

	ArrayList<IMetamodelDriver> iMetamodelDrivers = new ArrayList<IMetamodelDriver>();

	HashMap<String, HashSet<IMetamodelDriver>> aliasMap = new HashMap<String, HashSet<IMetamodelDriver>>();
	
	HashSet<String> metamodelNamespace = new HashSet<String>();
	
	public ArrayList<IMetamodelDriver> getiMetamodelDrivers() {
		return iMetamodelDrivers;
	}
	
	public ArrayList<String> generateKeyWordsFromModelDeclarations()
	{
		ArrayList<String> result = new ArrayList<String>();
		if (iMetamodelDrivers.size() == 1) {
			if (iMetamodelDrivers.get(0) instanceof PlainXMLIMetamodelDriver) {
//				result.add("XMLDoc");
//				result.add("Element");
			}
			result.addAll(iMetamodelDrivers.get(0).getAllTypeNames(true));
		}
		else if(iMetamodelDrivers.size() > 1)
		{
			for(IMetamodelDriver imd: iMetamodelDrivers)
			{
				result.addAll(imd.getAllTypeNames(false));
			}
		}
		
		return result;
	}
	
	public void addIMetamodelDriver(IMetamodelDriver iMetamodelDriver)
	{
		if (addToMetamodelNamespace(iMetamodelDriver)) {
			iMetamodelDrivers.add(iMetamodelDriver);
			for(String alias: iMetamodelDriver.getAliases())
			{
				HashSet<IMetamodelDriver> _iMetamodelDrivers = aliasMap.get(alias);
				if (_iMetamodelDrivers != null) {
					_iMetamodelDrivers.add(iMetamodelDriver);
				}
				else {
					_iMetamodelDrivers = new HashSet<IMetamodelDriver>();
					_iMetamodelDrivers.add(iMetamodelDriver);
					aliasMap.put(alias, _iMetamodelDrivers);
				}
			}
		}
	}
	
	public boolean addToMetamodelNamespace(IMetamodelDriver iMetamodelDriver)
	{
		if (metamodelNamespace.contains(iMetamodelDriver.getName())) {
			iMetamodelDriver.getLogBook().addError(iMetamodelDriver.getModelDeclarationStatement().getName(), IMessage_IMetamodelDriver.bindMessage(IMessage_IMetamodelDriver.METAMODEL_NAME_EXISTS,  iMetamodelDriver.getModelDeclarationStatement().getName().getName().getName()));
			return false;
		}
		else {
			metamodelNamespace.add(iMetamodelDriver.getName());
			return true;
		}
	}
	
	public boolean isMetamodelName(String str)
	{
		return metamodelNamespace.contains(str);
	}
	
	public boolean isMetamodelAlias(String str)
	{
		return aliasMap.containsKey(str);
	}
	
	public boolean metamodelNamespaceContains(String str)
	{
		return metamodelNamespace.contains(str);
	}
	
	public IMetamodelDriver getIMetamodelDriverWithName(String iMetamodelDriver)
	{
		for(IMetamodelDriver driver: iMetamodelDrivers)
		{
			if (driver.getName().equals(iMetamodelDriver)) {
				return driver;
			}
		}
		return null;
	}
	
	public HashSet<IMetamodelDriver> getIMetamodelDriversWithAlias(String alias)
	{
		return aliasMap.get(alias);
	}
	        
}
