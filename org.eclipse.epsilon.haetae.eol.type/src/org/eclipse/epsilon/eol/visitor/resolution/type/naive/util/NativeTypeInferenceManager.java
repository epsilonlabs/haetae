package org.eclipse.epsilon.eol.visitor.resolution.type.naive.util;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class NativeTypeInferenceManager {
	
	public static void main(String[] args) {
		NativeTypeInferenceManager manager = new NativeTypeInferenceManager();
		Class clazz = null;
		try {
			clazz = manager.getClassByName("javax.swing.JFrame");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method method = manager.getMethod("java.lang.String", "toString");
		
		
		System.out.println(clazz);
		System.out.println(method);
	}

	public Class<?> getClassByName(String name) throws ClassNotFoundException
	{
		return Class.forName(name);
	}
	
	public Method getMethod(String className, String methodName)
	{
		Class<?> class1 = null;
		Method result = null;
		try {
			class1 = getClassByName(className);
			if (class1 != null) {
				result = class1.getMethod(methodName, null);
			}
		} catch (Exception e) {
			
		}
		return result;
	}
	
	public Method getMethod(String className, String methodName, ArrayList<String> types)
	{
		Class<?> class1 = null;
		Method result = null;
		try {
			class1 = getClassByName(className);
			if (class1 != null) {
				result = class1.getMethod(methodName, null);
			}
		} catch (Exception e) {
			
		}
		return result;
	}
}
