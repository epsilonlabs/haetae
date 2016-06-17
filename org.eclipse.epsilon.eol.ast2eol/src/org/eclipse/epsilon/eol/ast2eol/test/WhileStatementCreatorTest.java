package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.WhileStatement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.WhileStatementImpl;
import org.junit.Test;

public class WhileStatementCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 15;\n" +
				"while(a > 10)" +
				"	a = a - 1;");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		VariableDeclarationExpression lhs = (VariableDeclarationExpression) assignmentStatement.getLhs();
		assertEquals(lhs.getName().getName(), "a");
		
		IntegerExpression rhs = (IntegerExpression) assignmentStatement.getRhs();
		assertEquals(rhs.getValue(), 15);
		
		assertEquals(program.getBlock().getStatements().get(1).getClass(), WhileStatementImpl.class);
		WhileStatement whileStatement = (WhileStatement) program.getBlock().getStatements().get(1);
		
		assertEquals(whileStatement.getCondition().getClass(), GreaterThanOperatorExpressionImpl.class);
		
		GreaterThanOperatorExpression greaterThanOperatorExpression = (GreaterThanOperatorExpression) whileStatement.getCondition();
		assertEquals(greaterThanOperatorExpression.getLhs().getClass(), NameExpressionImpl.class);
		NameExpression conditionLhs = (NameExpression) greaterThanOperatorExpression.getLhs();
		assertEquals(conditionLhs.getName(), "a");
		
		assertEquals(greaterThanOperatorExpression.getRhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression conditionRhs = (IntegerExpression) greaterThanOperatorExpression.getRhs();
		assertEquals(conditionRhs.getValue(), 10);
		
		ExpressionOrStatementBlock expressionOrStatementBlock = whileStatement.getBody();
		assertEquals(expressionOrStatementBlock.getExpression(), null);
		
	}

}
