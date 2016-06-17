package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EOLModuleVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class EOLModuleTypeResolver extends EOLModuleVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(EOLModule program, TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		if (context.getTypeRegistry().getBaseEntry() == null) {
			context.getTypeRegistry().pushScope(program);
		}
		
		for(Import import1: program.getImports())
		{
			controller.visit(import1, context);
		}
		
		for(ModelDeclarationStatement mds: program.getModelDeclarations()) //process each model declaration statement
		{
			controller.visit(mds, context);
		}
		
		context.generateKeyWordsFromModelDeclarations();
		
		for(OperationDefinition od: program.getOperations()) //process each operation
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
			if (!context.getOperationDefinitionManager().containsOperation(od.getName().getName(), contextType, argTypes)) { //check if operation with the same name and arg list exists
				context.getOperationDefinitionManager().putOperationDefinition(od);
			}
			else {
				LogBook.getInstance().addError(od, IMessage_TypeResolution.OPERATION_SIGNATURE_EXISTS);
			}
		}
		
		context.getTypeRegistry().pushScope(program.getBlock());
		controller.visitContents(program.getBlock(), context); //process statement block
		context.getTypeRegistry().popScope();

		for(OperationDefinition od: program.getOperations())
		{
			controller.visit(od, context);
		}
		
		if (context.getTypeRegistry().getCurrentEntry().getPreviousEntry() != null) {
			context.getTypeRegistry().popScope();
		}
		return null;
	}

}
