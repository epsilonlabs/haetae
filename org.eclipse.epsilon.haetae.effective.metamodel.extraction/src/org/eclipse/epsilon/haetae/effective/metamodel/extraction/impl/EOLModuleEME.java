package org.eclipse.epsilon.haetae.effective.metamodel.extraction.impl;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EOLModuleVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.extraction.context.EffectiveMetamodelExtractionContext;

public class EOLModuleEME extends EOLModuleVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(EOLModule module, TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//get the context
		EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;

		//visit imports
		for(Import import1: module.getImports())
		{
			controller.visit(import1, context);
		}
		
		//visit model declarations
		for(ModelDeclarationStatement mds: module.getModelDeclarations()) 
		{
			controller.visit(mds, context);
		}
		
		//process operation definitions
		for(OperationDefinition od: module.getOperations()) //process each operation
		{
			
			Type contextType = od.getContextType(); //get the contextType
			ArrayList<Type> argTypes = new ArrayList<Type>(); //prepare argTypes
			
			for(VariableDeclarationExpression v: od.getParameters()) //process each arg type
			{
				argTypes.add(v.getResolvedType()); //resolve and collect argument types
			}
			if (!context.getOperationDefinitionManager().containsOperation(od.getName().getName(), contextType, argTypes)) { //check if operation with the same name and arg list exists
				context.getOperationDefinitionManager().putOperationDefinition(od);
			}
			else {
				LogBook.getInstance().addError(od, "OperationDefinition with same signature already defined");
			}
			
		}
		
		//visit the block
		controller.visitContents(module.getBlock(), context); //process statement block

		
		//visit each operation definition
		for(OperationDefinition od: module.getOperations())
		{			
			controller.visit(od, context);
		}
		
		return null;
	}

}
