package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.SwitchStatement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.StringExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.SwitchStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class SwitchCaseDefaultCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 2; \n" +
				"switch(a)" +
				"{\n" +
				"	case 1: 1.println();\n" +
				"	case 2: 2.println();\n" +
				"	default: \"default\".println();\n" +
				"}");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		
		assertEquals(assignmentStatement.getRhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression rhs = (IntegerExpression) assignmentStatement.getRhs();
		assertEquals(rhs.getValue(), 2);
		
		assertEquals(program.getBlock().getStatements().get(1).getClass(), SwitchStatementImpl.class);
		SwitchStatement switchStatement = (SwitchStatement) program.getBlock().getStatements().get(1);
		assertEquals(switchStatement.getExpression().getClass(), NameExpressionImpl.class);
		NameExpression expression = (NameExpression) switchStatement.getExpression();
		assertEquals(expression.getName(), "a");
		
		ExpressionOrStatementBlock block = switchStatement.getDefault().getBody();
		assertEquals(block.getExpression(), null);
		assertEquals(block.getBlock().getStatements().size(), 1);
		Block leBlock = block.getBlock();
		assertEquals(leBlock.getStatements().get(0).getClass(), ExpressionStatementImpl.class);
		ExpressionStatement expressionStatement = (ExpressionStatement) leBlock.getStatements().get(0);
		
		assertEquals(expressionStatement.getExpression().getClass(), MethodCallExpressionImpl.class);
		MethodCallExpression methodCallExpression = (MethodCallExpression) expressionStatement.getExpression();
		
		assertEquals(methodCallExpression.getTarget().getClass(), StringExpressionImpl.class);
		StringExpression target = (StringExpression) methodCallExpression.getTarget();
		assertEquals(target.getValue(), "default");
		
		assertEquals(methodCallExpression.getMethod().getName(), "println");
		assertEquals(methodCallExpression.getArguments().size(), 0);
	}

}
