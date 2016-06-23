package org.eclipse.epsilon.eol.ast2eol.util;

import java.io.File;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;



public class Ast2EolUtil {
	
	Ast2EolContext context = null;
	
	public Ast2EolUtil()
	{
		this.context = new Ast2EolContext();
	}
	
	public Ast2EolUtil(Ast2EolContext context) {
		this.context = context;
	}
	
	public Ast2EolContext getContext() {
		return context;
	}
	
	public EOLModule createEOLProgramFromPath(String path)
	{
		EOLModule result = null;
		AST ast = createASTFromPath(path);
		if (ast != null) {
			result = (EOLModule) context.getEolElementCreatorFactory().createEOLElement(ast, null, context);	
		}
		return result;
	}
	
	public AST createASTFromPath(String path)
	{
		EolModule eolModule = new EolModule();
		
		try {
			eolModule.parse(new File(path));
		} catch (Exception e) {
			//warning, parse may fail
		}
		
		return eolModule.getAst();
	}
}
