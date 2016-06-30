package org.eclipse.epsilon.haetae.model.connectivity.xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;
import org.xml.sax.SAXException;

public class PlainXMLMetamodelDriverUtil {

	protected XML2EcoreTranslator xml2EcoreTranslator = new XML2EcoreTranslator();
	
	public XML2EcoreTranslator translatePlainXML2EPackage(String URIorPath)
	{
		try {
			xml2EcoreTranslator.translatePlainXMLFromFile(URIorPath);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally
		{
			xml2EcoreTranslator.getePackage().setName(URIorPath);
			return xml2EcoreTranslator;	
		}
	}
	
	public boolean isXMLSyntax(String fullName)
	{
		if (fullName.startsWith("a_") || fullName.startsWith("b_") ||
				fullName.startsWith("i_") || fullName.startsWith("f_") || 
				fullName.startsWith("d_") || fullName.startsWith("s_") ||
				fullName.startsWith("t_") || fullName.startsWith("c_") ||
				fullName.startsWith("e_") || fullName.startsWith("x_") || fullName.startsWith("r_")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String removeTag(String fullName)
	{
		if (isXMLSyntax(fullName)) {
			return fullName.substring(2, fullName.length());
		}
		else {
			return fullName;
		}
	}
	
	public EDataType getEDataTypeByName(String s)
	{
		if (s.startsWith("b_")) {
			return EcorePackage.eINSTANCE.getEBoolean();
		}
		else if (s.startsWith("f_")) {
			return EcorePackage.eINSTANCE.getEFloat();
		}
		else if (s.startsWith("d_")) {
			return EcorePackage.eINSTANCE.getEDouble();
		}
		else if (s.startsWith("i_")) {
			return EcorePackage.eINSTANCE.getEInt();
		}
		else if (s.startsWith("r_")) {
			return EcorePackage.eINSTANCE.getEFloat();
		}
		else if (s.startsWith("s_") || s.startsWith("a_")) {
			return EcorePackage.eINSTANCE.getEString();
		}
		return null;
	}
}
