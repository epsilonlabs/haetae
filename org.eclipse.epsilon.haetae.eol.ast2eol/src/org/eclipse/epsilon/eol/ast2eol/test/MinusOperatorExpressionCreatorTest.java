package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.MinusOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.MinusOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class MinusOperatorExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 5 - 3;");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) assignmentStatement.getLhs();
		assertEquals(variableDeclarationExpression.getName().getName(), "a");
		
		assertEquals(assignmentStatement.getRhs().getClass(), MinusOperatorExpressionImpl.class);
		MinusOperatorExpression minusOperatorExpression = (MinusOperatorExpression) assignmentStatement.getRhs();
		assertEquals(minusOperatorExpression.getLhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression lhs = (IntegerExpression) minusOperatorExpression.getLhs();
		assertEquals(lhs.getValue(), 5);
		assertEquals(minusOperatorExpression.getRhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression rhs = (IntegerExpression) minusOperatorExpression.getRhs();
		assertEquals(rhs.getValue(), 3);
	}

}
