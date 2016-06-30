package org.eclipse.epsilon.haetae.model.connectivity.xml;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XML2EcoreTranslator {

	protected Document document;
	protected EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
	protected EPackage ePackage = ecoreFactory.createEPackage();
	protected EClass _root;
	protected Stack<EClass> classStack = new Stack<EClass>();
	
	protected HashMap<String, EClass> metaElementMap = new HashMap<String, EClass>();
	
	protected Node getRoot()
	{
		return document.getFirstChild();
	}
	
	public EPackage getEPackage() {
		return ePackage;
	}
	
	protected void setRoot(Node node)
	{
		Node oldRoot = getRoot();
		if (oldRoot != null) {
			document.removeChild(oldRoot);
			document.appendChild(node);
		}
	}
	
	public EClass get_root() {
		return _root;
	}
	
	public EClass createEClass(Element element)
	{
		String className = "t_" + element.getNodeName();
		
		EClass cls = getEClass(className);//get class, if exist, retrieve from epackage, if not, create one and put into epackage
		classStack.push(cls);
		
		NamedNodeMap attrs = element.getAttributes(); //get the attributes of the node
		
		HashMap<String, EAttribute> attributeMap = new HashMap<String, EAttribute>(); //initialise attribute map

		String attributeName = "tagName"; //get the attr name
		getEAttribute(className, attributeName, EcorePackage.eINSTANCE.getEString()); //retrieve attr if exist, if not create one
		
		attributeName = "text"; //get the attr name
		getEAttribute(className, attributeName, EcorePackage.eINSTANCE.getEString()); //retrieve attr if exist, if not create one
		
//		if (element.getTextContent().split("\n").length == 1) {
//			String attrName = "text"; //get the attr name
//			EAttribute attr = getEAttribute(className, attrName, EcorePackage.eINSTANCE.getEString()); //retrieve attr if exist, if not create one
//			if (attributeMap.containsKey(attrName)) { //if attribute already exists set upper bound to unlimited
//				attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
//			}
//			else {
//				attributeMap.put(attrName, attr); 
//			}
//		}

		for(int i = 0; i < attrs.getLength(); i++) //for each attribute
		{
			Node n = attrs.item(i);
			
			String attrName = n.getNodeName(); //get the attr name
			String attrVal = n.getNodeValue();
			EAttribute attr = null;
			if (isInteger(attrVal)) {
				attr = getEAttribute(className, attrName, EcorePackage.eINSTANCE.getEInt());
			}
			else if (isFloat(attrVal)) {
				attr = getEAttribute(className, attrName, EcorePackage.eINSTANCE.getEFloat());
			}
			else if (isDouble(attrVal)) {
				attr = getEAttribute(className, attrName, EcorePackage.eINSTANCE.getEDouble());
			}
			else if (isBoolean(attrVal)) {
				attr = getEAttribute(className, attrName, EcorePackage.eINSTANCE.getEBoolean());
			}
			
			if (attr == null) {
				attr = getEAttribute(className, attrName, EcorePackage.eINSTANCE.getEString());
			}
			
			if (attributeMap.containsKey(attrName)) { //if attribute already exists set upper bound to unlimited
				EAttribute _attr = attributeMap.get(attrName);
				if (_attr.getEType().equals(EcorePackage.eINSTANCE.getEBoolean())) {
					if (!attr.getEType().equals(EcorePackage.eINSTANCE.getEBoolean())) {
						
						attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
						attributeMap.put(attrName, attr);
					}
					else{
						_attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
					}
				}
				else if (_attr.getEType().equals(EcorePackage.eINSTANCE.getEInt())) {
					if ((!attr.getEType().equals(EcorePackage.eINSTANCE.getEBoolean())) && (!attr.getEType().equals(EcorePackage.eINSTANCE.getEInt()))) {
						
						attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
						attributeMap.put(attrName, attr);
					}
					else {
						_attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
					}
				}
				else if (_attr.getEType().equals(EcorePackage.eINSTANCE.getEFloat())) {
					if ((!attr.getEType().equals(EcorePackage.eINSTANCE.getEBoolean())) && 
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEInt())) &&
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEFloat()))) {
						
						attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
						attributeMap.put(attrName, attr);
					}
					else {
						_attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
					}
				}
				else if (_attr.getEType().equals(EcorePackage.eINSTANCE.getEDouble())) {
					if ((!attr.getEType().equals(EcorePackage.eINSTANCE.getEBoolean())) && 
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEInt())) &&
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEFloat())) &&
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEDouble()))) {
						
						attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
						attributeMap.put(attrName, attr);
					}
					else {
						_attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
					}
				}
				else if (_attr.getEType().equals(EcorePackage.eINSTANCE.getEString())) {
					if ((!attr.getEType().equals(EcorePackage.eINSTANCE.getEBoolean())) && 
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEInt())) &&
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEFloat())) &&
							(!attr.getEType().equals(EcorePackage.eINSTANCE.getEDouble()))) {
						
						attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
						attributeMap.put(attrName, attr);
					}
					else {
						_attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
					}
				}
				//attr.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
			}
			else {
				attributeMap.put(attrName, attr); 
			}
		}
		HashMap<String, EReference> referenceMap = new HashMap<String, EReference>(); //initialise reference map
		NodeList children = element.getChildNodes(); //get the child nodes of the node
		for (int i=0; i<children.getLength(); i++) { //for each node
			Object o = children.item(i); //get object
			if (o instanceof Element) { //if object is an element
				 //if is complex element
				EClass referenceNode = createEClass((Element) o); // create reference node
				EReference reference = getEReference(className, referenceNode, ((Element)o).getTagName()); //get eRef if exist, if not create one
				if (referenceMap.containsKey(reference.getName())) { // if reference map contains key
					if (reference.getUpperBound() == EStructuralFeature.UNBOUNDED_MULTIPLICITY) {
						
					}
					else {
						reference.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);	 //set upperbound to be multiple
					}
				}
				else {
					referenceMap.put(reference.getName(), reference); //put reference in the map
				}
			}
		}
		classStack.pop();
		return cls;
	}
	
	public EClass getEClass(String name)
	{
		EClass result = null;
		if (metaElementMap.containsKey(name)) {
			result = (EClass) ePackage.getEClassifier(name);
		}
		else {
			result = ecoreFactory.createEClass();
			result.setName(name);
			metaElementMap.put(name, result);
			ePackage.getEClassifiers().add(result);
		}
		if (classStack.size() > 0) {
			getEReference(name, classStack.peek(), "parentNode"); //get eRef if exist, if not create one
		}
		return result;
	}
	
	public EAttribute getEAttribute(String className, String attributeName, EDataType eType)
	{
		EAttribute result = null;
		if (metaElementMap.containsKey(className)) {
			EClass cls = metaElementMap.get(className);
			if (cls.getEStructuralFeature(attributeName) == null) {
				result = ecoreFactory.createEAttribute();
				result.setName(attributeName);
				result.setEType(eType);
				//result.setEType(EcorePackage.eINSTANCE.getEString());
				result.setLowerBound(0);
				result.setUpperBound(1);
				cls.getEStructuralFeatures().add(result);
			}
			else {
				result = (EAttribute) cls.getEStructuralFeature(attributeName);
			}
		}
		return result;
	}
	
	public EReference getEReference(String className, EClass referredClass, String referenceName)
	{
		EReference result = null;
		if (metaElementMap.containsKey(className)) {
			EClass cls = metaElementMap.get(className);
			if (cls.getEStructuralFeature(referenceName) == null) {
				result = ecoreFactory.createEReference();
				result.setContainment(true);
				result.setName(referenceName);
				result.setEType(referredClass);
				result.setLowerBound(0);
				result.setUpperBound(1);
				cls.getEStructuralFeatures().add(result);
			}
			else {
				result = (EReference) cls.getEStructuralFeature(referenceName);
			}
		}
		return result;
	}
	
	public boolean isComplexElement(Element element)
	{
		boolean result = true;
		if (element.getAttributes().getLength()==0) {
			if(element.getChildNodes().getLength()==1)
			{
				if (element.getChildNodes().item(0) instanceof Element) {
					
				}
				else {
					result = false;
				}
			}
		}
		return result;
	}
	
	public void translatePlainXMLFromFile(String filePath) throws ParserConfigurationException, SAXException, IOException
	{
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

		File file = new File(filePath);
		
		document = documentBuilder.parse(file);
		String packageName = getRoot().getNodeName();
		String prefix = packageName.toLowerCase();
		String nsURI = "http://" + packageName + "/1.0";
		ePackage.setName(packageName);
		ePackage.setNsPrefix(prefix);
		ePackage.setNsURI(nsURI);
		_root = createEClass((Element) getRoot());
	}
	
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		new XML2EcoreTranslator().testParse();
	}

	public void testParse() throws ParserConfigurationException, SAXException, IOException
	{
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

		URL url = getClass().getResource("library.xml");
		File file = new File(url.getPath());
		
		document = documentBuilder.parse(file);
		String packageName = getRoot().getNodeName();
		String prefix = packageName.toLowerCase();
		String nsURI = "http://" + packageName + "/1.0";
		ePackage.setName(packageName);
		ePackage.setNsPrefix(prefix);
		ePackage.setNsURI(nsURI);
		createEClass((Element) getRoot());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI(new File("library.ecore").getAbsolutePath()));
		resource.getContents().add(ePackage);
		System.out.println(resourceSet.getPackageRegistry().toString());
		System.out.println(EPackage.Registry.INSTANCE.toString());
		resource.save(null);	
	}
	
	public static boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Integer.parseInt(s);
	         // s is a valid integer
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValidInteger;
	}
	
	public static boolean isFloat(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Float.parseFloat(s);
	         // s is a valid integer
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValidInteger;
	}
	
	public static boolean isDouble(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Double.parseDouble(s);
	         // s is a valid integer
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValidInteger;
	}
	
	public static boolean isBoolean(String s)
	{
	      if (s.equals("true") || s.equals("false")) {
			return true;
		}
	      return false;
	}
	
	public EPackage getePackage() {
		return ePackage;
	}

}
