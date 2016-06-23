package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class VariableDeclarationExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 10;");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		Block block = program.getBlock();
		
		Statement statement1 = block.getStatements().get(0);
		assertEquals(statement1.getClass(), AssignmentStatementImpl.class);
		AssignmentStatement assignmentStatement1 = (AssignmentStatement) statement1;
		assertEquals(assignmentStatement1.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) assignmentStatement1.getLhs();
		assertEquals(variableDeclarationExpression.getName().getName(), "a");
		assertEquals(assignmentStatement1.getRhs().getClass(), IntegerExpressionImpl.class);
	}
	
	@Test
	public void test1() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a : Integer;");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		Block block = program.getBlock();
		
		Statement statement1 = block.getStatements().get(0);
		assertEquals(statement1.getClass(), ExpressionStatementImpl.class);
		
		ExpressionStatement expressionStatement = (ExpressionStatement) statement1;
		assertEquals(expressionStatement.getExpression().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) expressionStatement.getExpression();
		assertEquals(variableDeclarationExpression.getName().getName(), "a");
		assertEquals(variableDeclarationExpression.getResolvedType().getClass(), IntegerTypeImpl.class);
		
	}

}
