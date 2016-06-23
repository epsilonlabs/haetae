package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.GreaterThanOrEqualToOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOrEqualToOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class GreaterThanOrEqualToOperatorExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = b >= c; ");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		
		assertEquals(assignmentStatement.getRhs().getClass(), GreaterThanOrEqualToOperatorExpressionImpl.class);
		
		GreaterThanOrEqualToOperatorExpression greaterThanOrEqualToOperatorExpression = (GreaterThanOrEqualToOperatorExpression) assignmentStatement.getRhs();
		
		assertEquals(greaterThanOrEqualToOperatorExpression.getLhs().getClass(), NameExpressionImpl.class);
		NameExpression lhs = (NameExpression) greaterThanOrEqualToOperatorExpression.getLhs();
		assertEquals(lhs.getName(), "b");
		
		assertEquals(greaterThanOrEqualToOperatorExpression.getRhs().getClass(), NameExpressionImpl.class);
		NameExpression rhs = (NameExpression) greaterThanOrEqualToOperatorExpression.getRhs();
		assertEquals(rhs.getName(), "c");
	}

}
