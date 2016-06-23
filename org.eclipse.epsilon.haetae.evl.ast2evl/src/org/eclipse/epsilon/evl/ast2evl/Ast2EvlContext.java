package org.eclipse.epsilon.evl.ast2evl;

import java.util.HashMap;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.evl.metamodel.EvlFactory;
import org.eclipse.epsilon.evl.metamodel.EvlPackage;

public class Ast2EvlContext extends Ast2EolContext {
	protected EvlElementCreatorFactory evlElementCreatorFactory;
	protected EolFactory eolFactory;
	protected EvlFactory evlFactory;
	protected HashMap<EOLElement, AST> trace = new HashMap<EOLElement, AST>();
	
	public Ast2EvlContext(EolLibraryModule module)
	{
		this.module = module;
		evlElementCreatorFactory = new EvlElementCreatorFactory();
		eolFactory = EolPackage.eINSTANCE.getEolFactory();
		evlFactory = EvlPackage.eINSTANCE.getEvlFactory();
	}
	
	public Ast2EvlContext(EvlElementCreatorFactory evlElementCreatorFactory)
	{
		this.evlElementCreatorFactory = evlElementCreatorFactory;
		eolFactory = EolPackage.eINSTANCE.getEolFactory();
		evlFactory = EvlPackage.eINSTANCE.getEvlFactory();
	}
	
	public EolFactory getEolFactory()
	{
		return eolFactory;
	}
	
	public EvlFactory getEvlFactory() {
		return evlFactory;
	}
	
	public EvlElementCreatorFactory getEvlElementCreatorFactory()
	{
		return evlElementCreatorFactory;
	}
	
	public HashMap<EOLElement, AST> getTrace() {
		return trace;
	}

}
