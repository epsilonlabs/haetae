package org.eclipse.epsilon.eol.ast2eol.context;


import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.AbortStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.AndOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.AnnotationBlockCreator;
import org.eclipse.epsilon.eol.ast2eol.AnnotationStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.AnyTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.AssignmentStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.BagExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.BagTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.BlockCreator;
import org.eclipse.epsilon.eol.ast2eol.BooleanExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.BooleanTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.BreakAllStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.BreakStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.CollectionInitValueExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.CollectionTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.ContinueStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.DeleteStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.DivideOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.EOLElementCreator;
import org.eclipse.epsilon.eol.ast2eol.EOLModuleCreator;
import org.eclipse.epsilon.eol.ast2eol.EnumerationLiteralExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.EqualsOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.ExecutableAnnotationStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.ExprListCreator;
import org.eclipse.epsilon.eol.ast2eol.ExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.ExpressionOrStatementBlockCreator;
import org.eclipse.epsilon.eol.ast2eol.ExpressionRangeCreator;
import org.eclipse.epsilon.eol.ast2eol.ExpressionStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.FOLMethodCallExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.FeatureCallExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.ForStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.FormalParameterExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.GreaterThanOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.GreaterThanOrEqualToOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.IfStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.ImpliesOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.ImportCreator;
import org.eclipse.epsilon.eol.ast2eol.IntegerExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.IntegerTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.KeyValueExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.LessThanOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.LessThanOrEqualToOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.MapExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.MapTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.MethodCallExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.MinusOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.ModelDeclarationParameterCreator;
import org.eclipse.epsilon.eol.ast2eol.ModelDeclarationStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.ModelElementTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.MultiplyOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.NameExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.NativeTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.NegativeOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.NewExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.NotEqualsOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.NotOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.OperationDefinitionCreator;
import org.eclipse.epsilon.eol.ast2eol.OperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.OrOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.OrderedSetExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.OrderedSetTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.PlusOperatorExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.PropertyCallExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.RealExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.RealTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.ReturnStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.SelfTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.SequenceExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.SequenceTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.SetExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.SetTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.SimpleAnnotationCreator;
import org.eclipse.epsilon.eol.ast2eol.SpecialAssignmentStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.StatementCreator;
import org.eclipse.epsilon.eol.ast2eol.StringExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.StringTypeCreator;
import org.eclipse.epsilon.eol.ast2eol.SwitchCaseDefaultStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.SwitchCaseExpressionStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.SwitchStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.ThrowStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.TransactionStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.TypeCreator;
import org.eclipse.epsilon.eol.ast2eol.VariableDeclarationExpressionCreator;
import org.eclipse.epsilon.eol.ast2eol.WhileStatementCreator;
import org.eclipse.epsilon.eol.ast2eol.XorOperatorExpressionCreator;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.parse.EolParser;

public class EolElementCreatorFactory {
	
	protected ArrayList<EOLElement> createdEolElements;
	protected ArrayList<EOLElementCreator> eolElementCreators;

	public EolElementCreatorFactory()
	{
		createdEolElements = new ArrayList<EOLElement>();
		eolElementCreators = new ArrayList<EOLElementCreator>();
		initialiseEOLElementCreators();
	}
	
	public void initialiseEOLElementCreators()
	{
		 eolElementCreators.addAll(this.initiateEOLElementPool());
	}
	
	public EOLElement createEOLElement(AST ast, EOLElement container, Ast2EolContext context)
	{
		EOLElement result = null;
		for(EOLElementCreator dec: eolElementCreators)
		{
			if(dec.appliesTo(ast))
			{
				result = dec.create(ast, container, context);
				break;
			}
		}
		
		if(result == null)
		{
			throw new RuntimeException("Cannot create eol element for " + ast.getText() + "->" + ast.getType() + ": " + ast.getLine() + "-" + ast.getColumn());
		}
		else {
			context.getTrace().put(result, ast);
			this.addCreatedEOLElements(result);
			return result;
		}
	}
	
	public EOLElement createEOLElement(AST ast, EOLElement container, Ast2EolContext context, Class<? extends EOLElementCreator> ofCreatorClass)
	{
		EOLElement result = null;
		for(EOLElementCreator dec: eolElementCreators)
		{
			if(ofCreatorClass == dec.getClass())
			{
				result = dec.create(ast, container, context);
				break;
			}
		}
		if(result == null)
		{
			throw new RuntimeException("Cannot fetch creator for class: " + ofCreatorClass.toString());
		}
		else {
			this.addCreatedEOLElements(result);
			return result;
		}
	}
	
	public Statement createStatement(AST ast, EOLElement container, Ast2EolContext context) {
		Statement statement = null;
		
		if(ast.getText().equals("="))
		{
			AssignmentStatementCreator asc = fetchAssignmentStatementCreator();
			
			statement = (Statement) asc.create(ast, container, context);
		}
		
		else {
			if (isStatement(ast)) {
				return (Statement)createEOLElement(ast, container, context);
			}
			else {
				ExpressionStatementCreator esc = fetchExpressionStatementCreator();
				statement = (Statement) esc.create(ast, container, context);
			}
		}
		
		return statement;
	}
	
	public ArrayList<TypeCreator> initiateTypePool()
	{
		ArrayList<TypeCreator> result = new ArrayList<TypeCreator>();
		result.add(new TypeCreator());
		result.add(new CollectionTypeCreator());
		result.add(new AnyTypeCreator());
		
		result.add(new BagTypeCreator());
		result.add(new OrderedSetTypeCreator());
		result.add(new SequenceTypeCreator());
		result.add(new SetTypeCreator());
		
		result.add(new MapTypeCreator());
		
		result.add(new ModelElementTypeCreator());
		
		result.add(new NativeTypeCreator());
		
		result.add(new BooleanTypeCreator());
		result.add(new IntegerTypeCreator());
		result.add(new RealTypeCreator());
		result.add(new StringTypeCreator());
		
		result.add(new SelfTypeCreator());
	
		return result;
	}
	
	public ArrayList<EOLElementCreator> initiateEOLElementPool()
	{
		ArrayList<EOLElementCreator> result = new ArrayList<EOLElementCreator>();
		result.add(new AnnotationBlockCreator());
		result.addAll(this.initiateAnnotationPool());
		result.add(new BlockCreator());
		result.addAll(initiateCollectionInitValuePool());
		result.addAll(initiateExpressionPool());
		result.add(new ImportCreator());
		result.add(new KeyValueExpressionCreator());
		result.add(new ModelDeclarationParameterCreator());
		result.add(new EOLModuleCreator());
		result.add(new OperationDefinitionCreator());
		result.addAll(this.initiateStatementPool());
		result.addAll(this.initiateTypePool());
		result.add(new ExpressionOrStatementBlockCreator());
		
		return result;
	}
	
	public ArrayList<AnnotationStatementCreator> initiateAnnotationPool()
	{
		ArrayList<AnnotationStatementCreator> result = new ArrayList<AnnotationStatementCreator>();
		result.add(new ExecutableAnnotationStatementCreator());
		result.add(new SimpleAnnotationCreator());
		
		return result;
	}
	
	
	public ArrayList<ExpressionCreator> initiateExpressionPool()
	{
		ArrayList<ExpressionCreator> result = new ArrayList<ExpressionCreator>();
		result.add(new EnumerationLiteralExpressionCreator());
		result.addAll(this.initiateFeatureCallPool());
		result.add(new FormalParameterExpressionCreator());
		result.addAll(this.initiateLiteralExpressionPool());
		result.add(new NameExpressionCreator());
		result.add(new NewExpressionCreator());
		result.addAll(this.initiateOperatorExpressionPool());
		result.add(new VariableDeclarationExpressionCreator());
		//result.add(new NativeExpressionCreator());
		
		return result;
	}
	
	public ArrayList<CollectionInitValueExpressionCreator> initiateCollectionInitValuePool()
	{
		ArrayList<CollectionInitValueExpressionCreator> result = new ArrayList<CollectionInitValueExpressionCreator>();
		result.add(new ExpressionRangeCreator());
		result.add(new ExprListCreator());
		
		return result;
	}
	
	public ArrayList<FeatureCallExpressionCreator> initiateFeatureCallPool()
	{
		ArrayList<FeatureCallExpressionCreator> result = new ArrayList<FeatureCallExpressionCreator>();
		result.add(new MethodCallExpressionCreator());
		result.add(new FOLMethodCallExpressionCreator());
		result.add(new PropertyCallExpressionCreator());
		
		return result;
	}

	public ArrayList<ExpressionCreator> initiateLiteralExpressionPool()
	{
		ArrayList<ExpressionCreator> result = new ArrayList<ExpressionCreator>();
		result.add(new BagExpressionCreator());
		result.add(new OrderedSetExpressionCreator());
		result.add(new SequenceExpressionCreator());
		result.add(new SetExpressionCreator());
		
		result.add(new MapExpressionCreator());
		
		result.add(new BooleanExpressionCreator());
		result.add(new IntegerExpressionCreator());
		result.add(new RealExpressionCreator());
		result.add(new StringExpressionCreator());
		
		return result;
	}

	
	public ArrayList<OperatorExpressionCreator> initiateOperatorExpressionPool()
	{
		ArrayList<OperatorExpressionCreator> result = new ArrayList<OperatorExpressionCreator>();
		
		result.add(new AndOperatorExpressionCreator());
		result.add(new DivideOperatorExpressionCreator());
		result.add(new EqualsOperatorExpressionCreator());
		result.add(new GreaterThanOperatorExpressionCreator());
		result.add(new GreaterThanOrEqualToOperatorExpressionCreator());
		result.add(new ImpliesOperatorExpressionCreator());
		result.add(new LessThanOperatorExpressionCreator());
		result.add(new LessThanOrEqualToOperatorExpressionCreator());
		result.add(new MinusOperatorExpressionCreator());
		result.add(new MultiplyOperatorExpressionCreator());
		result.add(new NotEqualsOperatorExpressionCreator());
		result.add(new OrOperatorExpressionCreator());
		result.add(new PlusOperatorExpressionCreator());
		result.add(new XorOperatorExpressionCreator());		
		
		result.add(new NegativeOperatorExpressionCreator());
		result.add(new NotOperatorExpressionCreator());
		return result;
	}
	
	public ArrayList<StatementCreator> initiateStatementPool()
	{
		ArrayList<StatementCreator> result = new ArrayList<StatementCreator>();
		result.add(new AbortStatementCreator());
		result.add(new AssignmentStatementCreator());
		result.add(new BreakAllStatementCreator());
		result.add(new BreakStatementCreator());
		result.add(new ContinueStatementCreator());
		result.add(new DeleteStatementCreator());
		result.add(new ExpressionStatementCreator());
		result.add(new ForStatementCreator());
		result.add(new IfStatementCreator());
		result.add(new ModelDeclarationStatementCreator());
		result.add(new ReturnStatementCreator());
		result.add(new SwitchStatementCreator());
		result.add(new SwitchCaseDefaultStatementCreator());
		result.add(new SwitchCaseExpressionStatementCreator());
		result.add(new ThrowStatementCreator());
		result.add(new TransactionStatementCreator());
		result.add(new WhileStatementCreator());
		result.add(new SpecialAssignmentStatementCreator());
		return result;
	}
	
	public AssignmentStatementCreator fetchAssignmentStatementCreator()
	{
		AssignmentStatementCreator result = null;
		for(EOLElementCreator dec: eolElementCreators)
		{
			if(dec instanceof AssignmentStatementCreator)
			{
				 result = (AssignmentStatementCreator) dec;
				 break;
			}
		}
		return result;
	}
	
	public ExpressionStatementCreator fetchExpressionStatementCreator()
	{
		ExpressionStatementCreator result = null;
		for(EOLElementCreator dec: eolElementCreators)
		{
			if(dec instanceof ExpressionStatementCreator)
			{
				 result = (ExpressionStatementCreator) dec;
				 break;
			}
		}
		return result;
	}

	
	
	
	public void addCreatedEOLElements(EOLElement e)
	{
		this.createdEolElements.add(e);
	}
	
	public boolean isProperlyContained()
	{
		boolean result = false;
		for(EOLElement de: createdEolElements)
		{
			EOLElement trace = de;
			while(!(trace instanceof EOLModule) && trace.getContainer() != null)
			{
				trace = trace.getContainer();
			}
			
			if(trace.equals(this.fetchProgram()))
			{
				result = true;
			}
			else {
				result = false;
				System.err.println("The EOLElement is: " + trace.getClass());
				break;
			}
		}
		return result;
	}
	
	public EOLElement fetchProgram()
	{
		EOLElement result = null;
		for(EOLElement de: createdEolElements)
		{
			if (de instanceof EOLElement) {
				result = (EOLElement) de;
			}
		}
		return result;
			
	}
	
	public ArrayList<Integer> getStatementKeywords()
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(EolParser.ABORT);
		result.add(EolParser.ASSIGNMENT);
		result.add(EolParser.SPECIAL_ASSIGNMENT);
		result.add(EolParser.BREAK);
		result.add(EolParser.BREAKALL);
		result.add(EolParser.CONTINUE);
		result.add(EolParser.DELETE);
		result.add(EolParser.FOR);
		result.add(EolParser.IF);
		result.add(EolParser.MODELDECLARATION);
		result.add(EolParser.RETURN);
		result.add(EolParser.SWITCH);
		result.add(EolParser.THROW);
		result.add(EolParser.DEFAULT);
		result.add(EolParser.CASE);
		result.add(EolParser.TRANSACTION);
		result.add(EolParser.WHILE);
		return result;
	}
	
	//returns true if the ast is a statementAST
	public boolean isStatement(AST ast)
	{
		ArrayList<Integer> pool = getStatementKeywords();
		return pool.contains(ast.getType());
	}
	
	public void discardEolElement(EOLElement eolElement)
	{
		this.createdEolElements.remove(eolElement);
	}
	
}
