package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.NegativeOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NegativeOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class NegativeOperatorExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 5; \n" +
				"var b = -a;");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement1 = (AssignmentStatement) program.getBlock().getStatements().get(0);
		assertEquals(assignmentStatement1.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression lhs1 = (VariableDeclarationExpression) assignmentStatement1.getLhs();
		assertEquals(lhs1.getName().getName(), "a");
		assertEquals(assignmentStatement1.getRhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpression rhs1 = (IntegerExpression) assignmentStatement1.getRhs();
		assertEquals(rhs1.getValue(), 5);
		
		AssignmentStatement assignmentStatement2 = (AssignmentStatement) program.getBlock().getStatements().get(1);
		assertEquals(assignmentStatement2.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression lhs2 = (VariableDeclarationExpression) assignmentStatement2.getLhs();
		assertEquals(lhs2.getName().getName(), "b");
		assertEquals(assignmentStatement2.getRhs().getClass(), NegativeOperatorExpressionImpl.class);
		NegativeOperatorExpression rhs2 = (NegativeOperatorExpression) assignmentStatement2.getRhs();
		assertEquals(rhs2.getExpression().getClass(), NameExpressionImpl.class);
		NameExpression expr = (NameExpression) rhs2.getExpression();
		assertEquals(expr.getName(), "a");
		
		
	}

}
