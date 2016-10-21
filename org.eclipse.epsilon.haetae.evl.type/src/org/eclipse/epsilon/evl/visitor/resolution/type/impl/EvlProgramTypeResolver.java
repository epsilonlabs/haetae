package org.eclipse.epsilon.evl.visitor.resolution.type.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.EVLModule;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.metamodel.NamedBlock;
import org.eclipse.epsilon.evl.metamodel.visitor.EVLModuleVisitor;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;
import org.eclipse.epsilon.evl.visitor.resolution.type.context.EvlTypeResolutionContext;

public class EvlProgramTypeResolver extends EVLModuleVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(EVLModule evlModule, TypeResolutionContext context,
			EvlVisitorController<TypeResolutionContext, Object> controller) {
		EvlTypeResolutionContext leContext = (EvlTypeResolutionContext) context;
		for(Import _import: evlModule.getImports())
		{
			controller.visit(_import, context);
		}
		
		for(ModelDeclarationStatement mds: evlModule.getModelDeclarations())
		{
			controller.visit(mds, context);
		}
		
		context.generateKeyWordsFromModelDeclarations();
		
		for(OperationDefinition od: evlModule.getOperations())
		{
			if (od.getContextType() != null) {
				controller.visit(od.getContextType(), context); //resolve context type	
			}
			controller.visit(od.getReturnType(), context); //resolve return type
			if (od.getSelf() != null) {
				od.getSelf().setResolvedType(EcoreUtil.copy(od.getContextType()));	
				od.getSelf().getName().setResolvedType(EcoreUtil.copy(od.getContextType()));
			}
			Type contextType = od.getContextType(); //get the contextType
			ArrayList<Type> argTypes = new ArrayList<Type>(); //prepare argTypes
			
			for(VariableDeclarationExpression v: od.getParameters()) //process each arg type
			{
				controller.visit(v, context);
				argTypes.add(v.getResolvedType()); //resolve and collect argument types
			}
			if (!OperationDefinitionManager.getInstance().containsOperation(od.getName().getName(), contextType, argTypes)) { //check if operation with the same name and arg list exists
				context.getOperationDefinitionManager().putOperationDefinition(od);
			}
			else {
				LogBook.getInstance().addError(od, "OperationDefinition with same signature already defined");
				///handle signature existence
			}
		}
		
		for(OperationDefinition od: evlModule.getOperations())
		{
			controller.visit(od, context);
		}
		
		for(NamedBlock pb: evlModule.getPreBlocks())
		{
			controller.visit(pb, context);
		}
		
		for(Context _context: evlModule.getContexts())
		{
			if (_context.getInvariants() != null) {
				for(Invariant inv: _context.getInvariants())
				{
					leContext.insertInv(_context, inv.getName().getName(), inv);
				}
			}
			controller.visit(_context, context);
		}
		
		for(NamedBlock pb: evlModule.getPostBlocks())
		{
			controller.visit(pb, context);
		}
		
		// TODO Auto-generated method stub
		return null;
	}

}
