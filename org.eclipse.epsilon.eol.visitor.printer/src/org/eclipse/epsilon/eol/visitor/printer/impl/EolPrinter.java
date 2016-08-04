package org.eclipse.epsilon.eol.visitor.printer.impl;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolDefaultVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.printer.context.EOLPrinterContext;

public class EolPrinter {

	protected EolVisitorController<EOLPrinterContext, Object> controller = new EolVisitorController<EOLPrinterContext, Object>();
	protected EOLPrinterContext context = new EOLPrinterContext();
	protected String printedProgram = "";
	
	public EolPrinter()
	{
		controller.addDefaultVisitor(new EolDefaultVisitor<EOLPrinterContext, Object>());
		controller.addAbortStatementVisitor(new AbortStatementPrinter());
		controller.addAndOperatorExpressionVisitor(new AndOperatorExpressionPrinter());
		controller.addAnnotationBlockVisitor(new AnnotationBlockPrinter());
		controller.addAnyTypeVisitor(new AnyTypePrinter());
		controller.addAssignmentStatementVisitor(new AssignmentStatementPrinter());
		controller.addBagExpressionVisitor(new BagExpressionPrinter());
		controller.addBagTypeVisitor(new BagTypePrinter());
		controller.addBlockVisitor(new BlockPrinter());
		controller.addBooleanExpressionVisitor(new BooleanExpressionPrinter());
		controller.addBooleanTypeVisitor(new BooleanTypePrinter());
		controller.addBreakAllStatementVisitor(new BreakAllStatementPrinter());
		controller.addBreakStatementVisitor(new BreakStatementPrinter());
		controller.addContinueStatementVisitor(new ContinueStatementPrinter());
		controller.addDeleteStatementVisitor(new DeleteStatementPrinter());
		controller.addDivideOperatorExpressionVisitor(new DivideOperatorExpressionPrinter());
		controller.addEnumerationLiteralExpressionVisitor(new EnumerationLiteralExpressionPrinter());
		controller.addEOLModuleVisitor(new EOLModulePrinter());
		controller.addEqualsOperatorExpressionVisitor(new EqualsOperatorExpressionPrinter());
		controller.addExecutableAnnotationStatementVisitor(new ExecutableAnnotationPrinter());
		controller.addExpressionRangeVisitor(new ExpressionRangePrinter());
		controller.addExpressionStatementVisitor(new ExpressionStatementPrinter());
		controller.addExpressionListVisitor(new ExpressionListPrinter());
		controller.addExpressionOrStatementBlockVisitor(new ExpressionOrStatementBlockPrinter());
		controller.addFOLMethodCallExpressionVisitor(new FOLMethodCallExpressionPrinter());
		controller.addFormalParameterExpressionVisitor(new FormalParameterExpressionPrinter());
		controller.addForStatementVisitor(new ForStatementPrinter());
		controller.addGreaterThanOperatorExpressionVisitor(new GreaterThanOperatorExpressionPrinter());
		controller.addGreaterThanOrEqualToOperatorExpressionVisitor(new GreaterThanOrEqualToOperatorExpressionPrinter());
		controller.addIfStatementVisitor(new IfStatementPrinter());
		controller.addImpliesOperatorExpressionVisitor(new ImpliesOperatorExpressionPrinter());
		controller.addImportVisitor(new ImportPrinter());
		controller.addIntegerExpressionVisitor(new IntegerExpressionPrinter());
		controller.addIntegerTypeVisitor(new IntegerTypePrinter());
		controller.addKeyValueExpressionVisitor(new KeyValueExpressionPrinter());
		controller.addLessThanOperatorExpressionVisitor(new LessThanOperatorExpressionPrinter());
		controller.addLessThanOrEqualToOperatorExpressionVisitor(new LessThanOrEqualToOperatorExpressionPrinter());
		controller.addMapExpressionVisitor(new MapExpressionPrinter());
		controller.addMapTypeVisitor(new MapTypePrinter());
		controller.addMethodCallExpressionVisitor(new MethodCallExpressionPrinter());
		controller.addMinusOperatorExpressionVisitor(new MinusOperatorExpressionPrinter());
		controller.addModelDeclarationParameterVisitor(new ModelDeclarationParameterPrinter());
		controller.addModelDeclarationStatementVisitor(new ModelDeclarationStatementPrinter());
		controller.addModelElementTypeVisitor(new ModelElementTypePrinter());
		controller.addMultiplyOperatorExpressionVisitor(new MultiplyOperatorExpressionPrinter());
		controller.addNameExpressionVisitor(new NameExpressionPrinter());
		controller.addNativeTypeVisitor(new NativeTypePrinter());
		controller.addNegativeOperatorExpressionVisitor(new NegativeOperatorExpressionPrinter());
		controller.addNewExpressionVisitor(new NewExpressionPrinter());
		controller.addNotEqualsOperatorExpressionVisitor(new NotEqualsOperatorExpressionPrinter());
		controller.addNotOperatorExpressionVisitor(new NotOperatorExpressionPrinter());
		controller.addOperationDefinitionVisitor(new OperationDefinitionPrinter());
		controller.addOrderedSetExpressionVisitor(new OrderedSetExpressionPrinter());
		controller.addOrderedSetTypeVisitor(new OrderedSetTypePrinter());
		controller.addOrOperatorExpressionVisitor(new OrOperatorExpressionPrinter());
		controller.addPlusOperatorExpressionVisitor(new PlusOperatorExpressionPrinter());
		controller.addPropertyCallExpressionVisitor(new PropertyCallExpressionPrinter());
		controller.addRealExpressionVisitor(new RealExpressionPrinter());
		controller.addRealTypeVisitor(new RealTypePrinter());
		controller.addReturnStatementVisitor(new ReturnStatementPrinter());
		controller.addSequenceExpressionVisitor(new SequenceExpressionPrinter());
		controller.addSequenceTypeVisitor(new SequenceTypePrinter());
		controller.addSetExpressionVisitor(new SetExpressionPrinter());
		controller.addSetTypeVisitor(new SetTypePrinter());
		controller.addSimpleAnnotationStatementVisitor(new SimpleAnnotationStatementPrinter());
		controller.addStringExpressionVisitor(new StringExpressionPrinter());
		controller.addStringTypeVisitor(new StringTypePrinter());
		controller.addSwitchCaseDefaultStatementVisitor(new SwitchCaseDefaultStatementPrinter());
		controller.addSwitchCaseExpressionStatementVisitor(new SwitchCaseExpressionStatementPrinter());
		controller.addSwitchStatementVisitor(new SwitchStatementPrinter());
		controller.addThrowStatementVisitor(new ThrowStatementPrinter());
		controller.addTransactionStatementVisitor(new TransactionStatementPrinter());
		controller.addVariableDeclarationExpressionVisitor(new VariableDeclarationExpressionPrinter());
		controller.addWhileStatementVisitor(new WhileStatementPrinter());
		controller.addXorOperatorExpressionVisitor(new XorOperatorExpressionPrinter());
	}
	
	public void run(EOLElement EOLElement)
	{
		printedProgram = (String) controller.visit(EOLElement, context);
	}
	
	public String print(EOLElement EOLElement)
	{
		return (String) controller.visit(EOLElement, context);
	}
	
	public String getPrintedProgram() {
		return printedProgram;
	}
}
