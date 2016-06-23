package org.eclipse.epsilon.evl.visitor.resolution.impl;

import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.EVLModule;
import org.eclipse.epsilon.evl.metamodel.NamedBlock;
import org.eclipse.epsilon.evl.metamodel.visitor.EVLModuleVisitor;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;

public class EVLModuleVariableResolver extends EVLModuleVisitor<VariableResolutionContext, Object>{

	@Override
	public Object visit(EVLModule evlProgram,
			VariableResolutionContext context,
			EvlVisitorController<VariableResolutionContext, Object> controller) {
		
		if (context.getMainProgram() == null) { //if the program is the ETL in question (the main program)
			context.getStack().push(evlProgram, true); //insert a stack
			context.setMainProgram(evlProgram); //set the main program to be this one
		}
			for(Import imported : evlProgram.getImports())
			{
				controller.visit(imported, context); //visit each import statement and resolve the imported programs
			}
			for(NamedBlock pre: evlProgram.getPreBlocks())
			{
				controller.visit(pre, context);
			}
			for(OperationDefinition op: evlProgram.getOperations())
			{
				controller.visit(op, context);
			}
			for(Context c: evlProgram.getContexts())
			{
				controller.visit(c, context);
			}
			
			for(NamedBlock post: evlProgram.getPostBlocks())
			{
				controller.visit(post, context);
			}
		
		return null;
	}

}
