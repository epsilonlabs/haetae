package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.BooleanExpression;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.ImpliesOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.BooleanExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ImpliesOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class ImpliesOperatorExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = true; \n" +
				"var b = false; \n" +
				"var c = a implies b;");
		
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
		
		assertEquals(assignmentStatement2.getRhs().getClass(), BooleanExpressionImpl.class);
		BooleanExpression rhs2 = (BooleanExpression) assignmentStatement2.getRhs();
		assertEquals(rhs2.isValue(), false);
		
		AssignmentStatement assignmentStatement3 = (AssignmentStatement) program.getBlock().getStatements().get(2);
		
		assertEquals(assignmentStatement3.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression lhs3 = (VariableDeclarationExpression) assignmentStatement3.getLhs();
		assertEquals(lhs3.getName().getName(), "c");
		
		assertEquals(assignmentStatement3.getRhs().getClass(), ImpliesOperatorExpressionImpl.class);
		ImpliesOperatorExpression impliesOperatorExpression = (ImpliesOperatorExpression) assignmentStatement3.getRhs();
		
		assertEquals(impliesOperatorExpression.getLhs().getClass(), NameExpressionImpl.class);
		NameExpression lhs4 = (NameExpression) impliesOperatorExpression.getLhs();
		assertEquals(lhs4.getName(), "a");
		
		assertEquals(impliesOperatorExpression.getRhs().getClass(), NameExpressionImpl.class);
		NameExpression rhs4 = (NameExpression) impliesOperatorExpression.getRhs();
		assertEquals(rhs4.getName(), "b");
	}

}
