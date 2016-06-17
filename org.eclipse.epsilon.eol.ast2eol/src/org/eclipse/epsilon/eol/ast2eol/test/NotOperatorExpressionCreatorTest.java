package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.BooleanExpression;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.NotOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.BooleanExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NotOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class NotOperatorExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = true; \n" +
				"var b = not a;");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement1 = (AssignmentStatement) program.getBlock().getStatements().get(0);
		assertEquals(assignmentStatement1.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression lhs1 = (VariableDeclarationExpression) assignmentStatement1.getLhs();
		assertEquals(lhs1.getName().getName(), "a");
		assertEquals(assignmentStatement1.getRhs().getClass(), BooleanExpressionImpl.class);
		BooleanExpression rhs1 = (BooleanExpression) assignmentStatement1.getRhs();
		assertEquals(rhs1.isValue(), true);
		
		AssignmentStatement assignmentStatement2 = (AssignmentStatement) program.getBlock().getStatements().get(1);
		assertEquals(assignmentStatement2.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression lhs2 = (VariableDeclarationExpression) assignmentStatement2.getLhs();
		assertEquals(lhs2.getName().getName(), "b");
		assertEquals(assignmentStatement2.getRhs().getClass(), NotOperatorExpressionImpl.class);
		NotOperatorExpression rhs2 = (NotOperatorExpression) assignmentStatement2.getRhs();
		assertEquals(rhs2.getExpression().getClass(), NameExpressionImpl.class);
		NameExpression expr = (NameExpression) rhs2.getExpression();
		assertEquals(expr.getName(), "a");
	}

}
