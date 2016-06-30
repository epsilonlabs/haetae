package org.eclipse.epsilon.eol.ast2eol.test;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;

public class AST2EolElementProducer {

	public static EOLElement parseAST(String text)
	{
		EolModule eolModule = new EolModule();
		
		try {
			eolModule.parse(text);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		Ast2EolContext context = new Ast2EolContext(eolModule);
		
		EOLElement result = context.getEolElementCreatorFactory().createEOLElement(eolModule.getAst(), null, context);
		return result;
	}
	
}
