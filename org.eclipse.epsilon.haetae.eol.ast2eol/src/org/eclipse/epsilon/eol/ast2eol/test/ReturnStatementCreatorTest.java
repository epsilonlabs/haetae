package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.ReturnStatement;
import org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.FormalParameterExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ReturnStatementImpl;
import org.junit.Test;

public class ReturnStatementCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("operation foo(bar:Integer) { return; }");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getOperations().size(), 1);
		
		OperationDefinition op = program.getOperations().get(0);
		
		assertEquals(op.getParameters().size(), 1);
		assertEquals(op.getParameters().get(0).getClass(), FormalParameterExpressionImpl.class);
		
		FormalParameterExpression formalParameterExpression = op.getParameters().get(0);
		
		assertEquals(formalParameterExpression.getName().getName(), "bar");
		assertEquals(formalParameterExpression.getResolvedType().getClass(), IntegerTypeImpl.class);
		
		assertEquals(op.getContextType().getClass(), AnyTypeImpl.class);
		assertEquals(op.getReturnType().getClass(), AnyTypeImpl.class);
		
		Block block = op.getBody();
		assertEquals(block.getStatements().size(), 1);
		assertEquals(block.getStatements().get(0).getClass(), ReturnStatementImpl.class);
		ReturnStatement returnStatement = (ReturnStatement) block.getStatements().get(0);
		assertEquals(returnStatement.getExpression(), null);
	}
	
	@Test
	public void test1() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("operation foo(bar:Integer) { return 1; }");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getOperations().size(), 1);
		
		OperationDefinition op = program.getOperations().get(0);
		
		assertEquals(op.getParameters().size(), 1);
		assertEquals(op.getParameters().get(0).getClass(), FormalParameterExpressionImpl.class);
		
		FormalParameterExpression formalParameterExpression = op.getParameters().get(0);
		
		assertEquals(formalParameterExpression.getName().getName(), "bar");
		assertEquals(formalParameterExpression.getResolvedType().getClass(), IntegerTypeImpl.class);
		
		assertEquals(op.getContextType().getClass(), AnyTypeImpl.class);
		assertEquals(op.getReturnType().getClass(), AnyTypeImpl.class);
		
		Block block = op.getBody();
		assertEquals(block.getStatements().size(), 1);
		assertEquals(block.getStatements().get(0).getClass(), ReturnStatementImpl.class);
		ReturnStatement returnStatement = (ReturnStatement) block.getStatements().get(0);
		assertEquals(returnStatement.getExpression().getClass(), IntegerExpressionImpl.class);
		IntegerExpression integerExpression = (IntegerExpression) returnStatement.getExpression();
		assertEquals(integerExpression.getValue(), 1);
	}
	
	@Test
	public void test2() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("return;");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().size(), 1);
		assertEquals(program.getBlock().getStatements().get(0).getClass(), ReturnStatementImpl.class);
		ReturnStatement returnStatement = (ReturnStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(returnStatement.getExpression(), null);
	}

}
