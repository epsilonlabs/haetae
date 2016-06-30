package org.eclipse.epsilon.haetae.model.connectivity.util;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EPackage;

public class EcoreRegistryLoader {

	public static ArrayList<EPackage> loadEPackageFromRegistry(String nsURI)
	{
		ArrayList<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage(nsURI));
		return result;
	}
}
