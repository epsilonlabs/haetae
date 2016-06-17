package org.eclipse.epsilon.etl.ast2etl;

import java.util.HashMap;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.etl.metamodel.EtlFactory;
import org.eclipse.epsilon.etl.metamodel.EtlPackage;


public class Ast2EtlContext extends Ast2EolContext{

	protected EtlElementCreatorFactory etlElementCreatorFactory;
	protected EolFactory eolFactory;
	protected EtlFactory etlFactory;
	protected HashMap<EOLElement, AST> trace = new HashMap<EOLElement, AST>();
	
	public Ast2EtlContext(EolLibraryModule module)
	{
		this.module = module;
		etlElementCreatorFactory = new EtlElementCreatorFactory();
		eolFactory = EolPackage.eINSTANCE.getEolFactory();
		etlFactory = EtlPackage.eINSTANCE.getEtlFactory();
	}
	
	public Ast2EtlContext(EtlElementCreatorFactory eolElementCreatorFactory)
	{
		this.etlElementCreatorFactory = eolElementCreatorFactory;
		eolFactory = EolPackage.eINSTANCE.getEolFactory();
		etlFactory = EtlPackage.eINSTANCE.getEtlFactory();
	}
	
	public EolFactory getEolFactory()
	{
		return eolFactory;
	}
	
	public EtlFactory getEtlFactory() {
		return etlFactory;
	}
	
	public EtlElementCreatorFactory getEtlElementCreatorFactory()
	{
		return etlElementCreatorFactory;
	}
	
	public HashMap<EOLElement, AST> getTrace() {
		return trace;
	}
	
	
}
