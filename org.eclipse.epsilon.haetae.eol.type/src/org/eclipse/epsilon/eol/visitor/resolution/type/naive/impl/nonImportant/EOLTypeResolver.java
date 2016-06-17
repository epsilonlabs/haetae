package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolDefaultVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.AssignmentStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.CollectionExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.FOLMethodCallExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.ForStatementTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.LogicalOperatorExpressionTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.MapExpressionTypeResolver;
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

public class EOLTypeResolver {

	protected EolVisitorController<TypeResolutionContext, Object> controller = new EolVisitorController<TypeResolutionContext, Object>();
	protected TypeResolutionContext context = new TypeResolutionContext();
	protected boolean debug = false;
	
	public EOLTypeResolver()
	{
		controller.addDefaultVisitor(new EolDefaultVisitor<TypeResolutionContext, Object>());
		
		controller.addExpressionStatementVisitor(new ExpressionStatementTypeResolver());
		controller.addImportVisitor(new ImportTypeResolver());
		
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
		controller.addFOLMethodCallExpressionVisitor(new FOLMethodCallExpressionTypeResolver());
		
		controller.addBinaryOperatorExpressionVisitor(new LogicalOperatorExpressionTypeResolver());
		controller.addPlusOperatorExpressionVisitor(new PlusOperatorExpressionTypeResolver());
		controller.addMinusOperatorExpressionVisitor(new MinusOperatorExpressionTypeResolver());
		controller.addMultiplyOperatorExpressionVisitor(new MultiplyOperatorExpressionTypeResolver());
		controller.addDivideOperatorExpressionVisitor(new DivideOperatorExpressionTypeResolver());
		controller.addNotOperatorExpressionVisitor(new NotOperatorExpressionTypeResolver());
		controller.addNegativeOperatorExpressionVisitor(new NegativeOperatorExpressionTypeResolver());
		
		controller.addSimpleAnnotationStatementVisitor(new SimpleAnnotationStatementTypeResolver());
		
		controller.addModelElementTypeVisitor(new ModelElementTypeResolver());
		controller.addVariableDeclarationExpressionVisitor(new VariableDeclarationExpressionTypeResolver());
		controller.addFormalParameterExpressionVisitor(new FormalParameterExpressionTypeResolver());
		controller.addTransactionStatementVisitor(new TransactionStatementTypeResolver());

		controller.addCollectionExpressionVisitor(new CollectionExpressionTypeResolver());
		controller.addExpressionOrStatementBlockVisitor(new ExpressionOrStatementBlockTypeResolver());
		controller.addMapExpressionVisitor(new MapExpressionTypeResolver());
		controller.addNewExpressionVisitor(new NewExpressionTypeResolver());
	}
	
	public void run(EOLElement eolElement)
	{
		if (debug) {
			controller.visit(eolElement, context);
		}
		else {
			try{
				controller.visit(eolElement, context);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if (!(e instanceof AnalysisInterruptException)) {
					//e.printStackTrace();
				}
			}
		}
	}
	
	public TypeResolutionContext getTypeResolutionContext()
	{
		return context;
	}
}
