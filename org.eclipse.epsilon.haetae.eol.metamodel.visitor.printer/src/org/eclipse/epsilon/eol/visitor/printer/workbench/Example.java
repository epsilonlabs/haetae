package org.eclipse.epsilon.eol.visitor.printer.workbench;

import java.io.File;
import java.net.URL;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.visitor.printer.impl.EolPrinter;

public class Example {

	public static void main(String[] args) {
		new Example().run();
	}
	public void run()
	{
		URL url = getClass().getResource("test.eol");
		System.out.println(url.toString());
		EolModule eolModule = new EolModule();
		try {
			eolModule.parse(new File(url.getPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		Ast2EolContext context = new Ast2EolContext();
		EOLElement dom = context.getEolElementCreatorFactory().createEOLElement(eolModule.getAst(), null, context);
		
		System.err.println(context.getEolElementCreatorFactory().isProperlyContained() ? "DomElements are property contained" : "DomElements are NOT properly contained");

		EolPrinter printer = new EolPrinter();
		printer.run(dom);
		System.out.println(printer.getPrintedProgram());
				
	}
}
