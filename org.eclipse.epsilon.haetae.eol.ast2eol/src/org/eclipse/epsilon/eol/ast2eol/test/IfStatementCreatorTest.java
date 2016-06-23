package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.IfStatement;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.LessThanOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.LessThanOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.StringExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class IfStatementCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 10; \n" +
				"if(a < 15)\n" +
				"{\n" +
				"	\"less than 15\".println();\n" +
				"}");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		
		assertEquals(assignmentStatement.getRhs().getClass(), IntegerExpressionImpl.class);
		
		assertEquals(program.getBlock().getStatements().get(1).getClass(), IfStatementImpl.class);
		
		IfStatement ifStatement = (IfStatement) program.getBlock().getStatements().get(1);
		
		assertEquals(ifStatement.getCondition().getClass(), LessThanOperatorExpressionImpl.class);
		
		LessThanOperatorExpression lessThanOperatorExpression = (LessThanOperatorExpression) ifStatement.getCondition();
		
		assertEquals(lessThanOperatorExpression.getLhs().getClass(), NameExpressionImpl.class);
		NameExpression lhs = (NameExpression) lessThanOperatorExpression.getLhs();
		assertEquals(lhs.getName(), "a");
		
		assertEquals(lessThanOperatorExpression.getRhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression rhs = (IntegerExpression) lessThanOperatorExpression.getRhs();
		assertEquals(rhs.getValue(), 15);
		
		assertTrue(ifStatement.getElseBody() == null);
		
		ExpressionOrStatementBlock ifBody = ifStatement.getIfBody();
		assertTrue(ifBody.getExpression() == null);
		assertEquals(ifBody.getBlock().getStatements().size(), 1);
		
		Statement statement = ifBody.getBlock().getStatements().get(0);
		assertEquals(statement.getClass(), ExpressionStatementImpl.class);
		
		ExpressionStatement expressionStatement = (ExpressionStatement) statement;
		assertEquals(expressionStatement.getExpression().getClass(), MethodCallExpressionImpl.class);
		
		MethodCallExpression methodCallExpression = (MethodCallExpression) expressionStatement.getExpression();
		
		assertEquals(methodCallExpression.getTarget().getClass(), StringExpressionImpl.class);
		StringExpression stringExpression = (StringExpression) methodCallExpression.getTarget();
		assertEquals(stringExpression.getValue(), "less than 15");
		assertEquals(methodCallExpression.getMethod().getName(), "println");
		assertEquals(methodCallExpression.getArguments().size(), 0);
	}

}
