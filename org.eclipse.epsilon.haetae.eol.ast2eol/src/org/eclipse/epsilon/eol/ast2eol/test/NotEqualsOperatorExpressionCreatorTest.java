package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NotEqualsOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class NotEqualsOperatorExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 1 <> 5; ");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		
		assertEquals(assignmentStatement.getRhs().getClass(), NotEqualsOperatorExpressionImpl.class);
		
		NotEqualsOperatorExpression notEqualsOperatorExpression = (NotEqualsOperatorExpression) assignmentStatement.getRhs();
		
		assertEquals(notEqualsOperatorExpression.getLhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression lhs = (IntegerExpression) notEqualsOperatorExpression.getLhs();
		assertEquals(lhs.getValue(), 1);
		
		assertEquals(notEqualsOperatorExpression.getRhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression rhs = (IntegerExpression) notEqualsOperatorExpression.getRhs();
		assertEquals(rhs.getValue(), 5);
	}

}
