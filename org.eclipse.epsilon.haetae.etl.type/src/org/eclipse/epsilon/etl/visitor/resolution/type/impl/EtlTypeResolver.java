package org.eclipse.epsilon.etl.visitor.resolution.type.impl;

import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolDefaultVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.AssignmentStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.CollectionExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.FOLMethodCallExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.ForStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.LogicalOperatorExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.MethodCallExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.ModelDeclarationStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.ModelElementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.NameExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.NegativeOperatorExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.NotOperatorExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.OperationDefinitionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.PropertyCallExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.ReturnStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.VariableDeclarationExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.BlockTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.EOLModuleTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.EnumerationLiteralExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.ExpressionOrStatementBlockTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.FormalParameterExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.IfStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.ImportTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.MinusOperatorExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.PlusOperatorExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.SimpleAnnotationStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.SwitchStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.WhileStatementTypeResolver;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.EtlTypeResolutionContext;


public class EtlTypeResolver{

	protected EtlVisitorController<TypeResolutionContext, Object> controller = new EtlVisitorController<TypeResolutionContext, Object>();
	protected EtlTypeResolutionContext context = new EtlTypeResolutionContext();
	
	public EtlTypeResolver(EolLibraryModule module)
	{
		controller.addImportVisitor(new ImportTypeResolver());
		controller.addDefaultVisitor(new EolDefaultVisitor<TypeResolutionContext, Object>());
		controller.addEOLModuleVisitor(new EOLModuleTypeResolver());
		controller.addBlockVisitor(new BlockTypeResolver());
		controller.addOperationDefinitionVisitor(new OperationDefinitionTypeResolver());
		controller.addReturnStatementVisitor(new ReturnStatementTypeResolver());

		controller.addAssignmentStatementVisitor(new AssignmentStatementTypeResolver());
		controller.addIfStatementVisitor(new IfStatementTypeResolver());
		controller.addForStatementVisitor(new ForStatementTypeResolver());
		controller.addWhileStatementVisitor(new WhileStatementTypeResolver());
		controller.addSwitchStatementVisitor(new SwitchStatementTypeResolver());
		controller.addModelDeclarationStatementVisitor(new ModelDeclarationStatementTypeResolver());

		controller.addEnumerationLiteralExpressionVisitor(new EnumerationLiteralExpressionTypeResolver());
		controller.addNameExpressionVisitor(new NameExpressionTypeResolver());
		controller.addPropertyCallExpressionVisitor(new PropertyCallExpressionTypeResolver());
		controller.addMethodCallExpressionVisitor(new MethodCallExpressionTypeResolver());
		controller.addBinaryOperatorExpressionVisitor(new LogicalOperatorExpressionTypeResolver());
		controller.addPlusOperatorExpressionVisitor(new PlusOperatorExpressionTypeResolver());
		controller.addMinusOperatorExpressionVisitor(new MinusOperatorExpressionTypeResolver());
		controller.addNotOperatorExpressionVisitor(new NotOperatorExpressionTypeResolver());
		controller.addNegativeOperatorExpressionVisitor(new NegativeOperatorExpressionTypeResolver());
		
		controller.addModelElementTypeVisitor(new ModelElementTypeResolver());
		controller.addFOLMethodCallExpressionVisitor(new FOLMethodCallExpressionTypeResolver());
		controller.addVariableDeclarationExpressionVisitor(new VariableDeclarationExpressionTypeResolver());
		controller.addFormalParameterExpressionVisitor(new FormalParameterExpressionTypeResolver());

		controller.addSimpleAnnotationStatementVisitor(new SimpleAnnotationStatementTypeResolver());
		
		controller.addCollectionExpressionVisitor(new CollectionExpressionTypeResolver());
		controller.addExpressionOrStatementBlockVisitor(new ExpressionOrStatementBlockTypeResolver());
		
		
		controller.addETLModuleVisitor(new EtlProgramTypeResolver());
		controller.addTransformationRuleVisitor(new TransformationRuleTypeResolver());
		controller.addNamedBlockVisitor(new NamedBlockTypeResolver());
		controller.addSpecialAssignmentStatementVisitor(new SpecialAssignmentStatementTypeResolver());

	}
	
	public void run(EOLElement eolElement)
	{
		controller.visit(eolElement, context);
	}
	
	public TypeResolutionContext getContext() {
		return context;
	}

}
