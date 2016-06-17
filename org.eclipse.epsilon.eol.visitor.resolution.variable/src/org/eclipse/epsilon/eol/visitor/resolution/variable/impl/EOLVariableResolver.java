package org.eclipse.epsilon.eol.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolDefaultVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;

public class EOLVariableResolver {
	

	protected EolVisitorController<VariableResolutionContext, Object> controller = new EolVisitorController<VariableResolutionContext, Object>();
	protected VariableResolutionContext context = new VariableResolutionContext();
	
	public EOLVariableResolver()
	{
		controller.addAbortStatementVisitor(new AbortStatementVariableResolver());
		controller.addAssignmentStatementVisitor(new AssignmentStatementVariableResolver());
		controller.addImportVisitor(new ImportVariableResolver());
		controller.addEOLModuleVisitor(new EOLModuleVariableResolver());
		controller.addDefaultVisitor(new EolDefaultVisitor<VariableResolutionContext, Object>());
		controller.addVariableDeclarationExpressionVisitor(new VariableDeclarationExpressionVariableResolver());
		controller.addFormalParameterExpressionVisitor(new FormalParameterExpressionVariableResolver());
		controller.addNameExpressionVisitor(new NameExpressionVariableResolver());
		controller.addForStatementVisitor(new ForStatementVariableResolver());
		controller.addIfStatementVisitor(new IfStatementVariableResolver());
		controller.addSwitchCaseDefaultStatementVisitor(new SwitchCaseDefaultStatementVariableResolver());
		controller.addSwitchStatementVisitor(new SwitchStatementVariableResolver());
		controller.addSwitchCaseExpressionStatementVisitor(new SwitchCaseExpressionStatementVariableResolver());
		controller.addWhileStatementVisitor(new WhileStatementVariableResolver());
		controller.addOperationDefinitionVisitor(new OperationDefinitionVariableResolver());
		
		controller.addPropertyCallExpressionVisitor(new PropertyCallExpressionVariableResolver());
		controller.addMethodCallExpressionVisitor(new MethodCallExpressionVariableResolver());
		controller.addFOLMethodCallExpressionVisitor(new FOLMethodCallExpressionVariableResolver());
		
		controller.addExpressionOrStatementBlockVisitor(new ExpressionOrStatementBlockVariableResolver());
		controller.addTransactionStatementVisitor(new TransactionStatementVariableResolver());
		controller.addModelDeclarationStatementVisitor(new ModelDeclarationStatementVariableResolver());
		controller.addEnumerationLiteralExpressionVisitor(new EnumerationLiteralExpressionVariableResolver());
		
		controller.addNewExpressionVisitor(new NewExpressionVariableResolver());
	}
	
	public void run(EOLElement dom)
	{
		controller.visit(dom, context);
	}
	
	public VariableResolutionContext getVariableResolutionContext()
	{
		return context;
	}
	
}
