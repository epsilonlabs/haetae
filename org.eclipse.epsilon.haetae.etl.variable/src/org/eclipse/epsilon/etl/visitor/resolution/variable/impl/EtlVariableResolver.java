package org.eclipse.epsilon.etl.visitor.resolution.variable.impl;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolDefaultVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.EOLModuleVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.ExpressionOrStatementBlockVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.FOLMethodCallExpressionVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.ForStatementVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.FormalParameterExpressionVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.IfStatementVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.ImportVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.MethodCallExpressionVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.ModelDeclarationStatementVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.NameExpressionVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.OperationDefinitionVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.PropertyCallExpressionVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.SwitchCaseDefaultStatementVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.SwitchCaseExpressionStatementVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.SwitchStatementVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.VariableDeclarationExpressionVariableResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.WhileStatementVariableResolver;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;

public class EtlVariableResolver{
	
	protected EtlVisitorController<VariableResolutionContext, Object> controller = new EtlVisitorController<VariableResolutionContext, Object>();
	protected VariableResolutionContext context = new VariableResolutionContext();
	
	public EtlVariableResolver() {
		
		controller.addEOLModuleVisitor(new EOLModuleVariableResolver());
		controller.addModelDeclarationStatementVisitor(new ModelDeclarationStatementVariableResolver());
		controller.addImportVisitor(new ImportVariableResolver());
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
		controller.addFOLMethodCallExpressionVisitor(new FOLMethodCallExpressionVariableResolver());
		controller.addExpressionOrStatementBlockVisitor(new ExpressionOrStatementBlockVariableResolver());
		controller.addPropertyCallExpressionVisitor(new PropertyCallExpressionVariableResolver());
		controller.addMethodCallExpressionVisitor(new MethodCallExpressionVariableResolver());
		
		controller.addETLModuleVisitor(new EtlProgramVariableResolver());
		controller.addNamedBlockVisitor(new NamedBlockVariableResolver());
		controller.addTransformationRuleVisitor(new TransformationRuleVariableResolver());
	}
	
	public void run(EOLElement eolElement)
	{
		controller.visit(eolElement, context);
	}
	
	
	public VariableResolutionContext getContext() {
		return context;
	}
	

}
