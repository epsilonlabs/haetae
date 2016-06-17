package org.eclipse.epsilon.etl.ast2etl.test;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.ast2etl.Ast2EtlContext;

public class AST2EtlElementProducer {

	public static EOLElement parseAST(String text)
	{
		EtlModule etlModule = new EtlModule();
		
		try {
			etlModule.parse(text);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		Ast2EtlContext context = new Ast2EtlContext(etlModule);
		
		EOLElement result = context.getEtlElementCreatorFactory().createEOLElement(etlModule.getAst(), null, context);
		return result;
	}
	
}
