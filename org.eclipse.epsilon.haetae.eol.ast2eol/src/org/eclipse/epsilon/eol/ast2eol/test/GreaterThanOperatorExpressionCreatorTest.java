package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class GreaterThanOperatorExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = b > c; ");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		
		assertEquals(assignmentStatement.getRhs().getClass(), GreaterThanOperatorExpressionImpl.class);
		
		GreaterThanOperatorExpression greaterThanOperatorExpression = (GreaterThanOperatorExpression) assignmentStatement.getRhs();
		
		assertEquals(greaterThanOperatorExpression.getLhs().getClass(), NameExpressionImpl.class);
		NameExpression lhs = (NameExpression) greaterThanOperatorExpression.getLhs();
		assertEquals(lhs.getName(), "b");
		
		assertEquals(greaterThanOperatorExpression.getRhs().getClass(), NameExpressionImpl.class);
		NameExpression rhs = (NameExpression) greaterThanOperatorExpression.getRhs();
		assertEquals(rhs.getName(), "c");
	}

}
