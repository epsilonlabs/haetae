package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.EOLLibraryModule;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ImportVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_VariableResolution;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class ImportVariableResolver extends ImportVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(Import _import, VariableResolutionContext context,
			EolVisitorController<VariableResolutionContext, Object> controller) {
		//get the imported program
		EOLLibraryModule program = _import.getImportedModule();
		//if program is not null
		if (program != null) { 
			//if program is eol program then it is good
			if (program instanceof EOLModule) {
				EOLModule temp = (EOLModule) program;
				controller.visit(temp, context);	
			}
		}
		else {
			//if program is null, something is wrong
			LogBook.getInstance().addError(_import, IMessage_VariableResolution.IMPORTED_PROGRAM_NOT_FOUND);
		}
		return null;
	}

}
