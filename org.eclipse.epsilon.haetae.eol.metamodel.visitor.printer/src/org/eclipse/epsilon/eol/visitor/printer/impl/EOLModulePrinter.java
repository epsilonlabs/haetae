package org.eclipse.epsilon.eol.visitor.printer.impl;

import java.util.Iterator;

import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.visitor.EOLModuleVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class EOLModulePrinter extends EOLModuleVisitor<EOLPrinterContext, Object>{

	@Override
	public Object visit(EOLModule eolProgram, EOLPrinterContext context,
			EolVisitorController<EOLPrinterContext, Object> controller) {
		String result = "";
		if (eolProgram.getModelDeclarations() != null && eolProgram.getModelDeclarations().size() != 0) {
			Iterator<ModelDeclarationStatement> iterator = eolProgram.getModelDeclarations().iterator();
			while(iterator.hasNext())
			{
				result += controller.visit(iterator.next(), context);
				if (iterator.hasNext()) {
					result += context.newline();
				}
			}
			result += context.newline();
		}
		if (eolProgram.getImports() != null && eolProgram.getImports().size() != 0) {
			Iterator<Import> iterator = eolProgram.getImports().iterator();
			while(iterator.hasNext())
			{
				result += controller.visit(iterator.next(), context);
				if (iterator.hasNext()) {
					result += context.newline();
				}
			}
			result += context.newline();
		}
		if (eolProgram.getBlock() != null) {
			result += controller.visit(eolProgram.getBlock(), context) + context.newline();
		}
		if (eolProgram.getOperations() != null && eolProgram.getOperations().size() != 0) {
			Iterator<OperationDefinition> iterator = eolProgram.getOperations().iterator();
			while(iterator.hasNext())
			{
				result += controller.visit(iterator.next(), context);
				if (iterator.hasNext()) {
					result += context.newline();
				}
			}
		}
		return result;
	}

}
