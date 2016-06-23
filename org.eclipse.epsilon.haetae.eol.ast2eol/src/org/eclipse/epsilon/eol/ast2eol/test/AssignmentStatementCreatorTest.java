package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.PlusOperatorExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class AssignmentStatementCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = 10; \n" +
				"var b = 20;\n" +
				"var c = a + b;");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().size(), 3);
		
		Block block = program.getBlock();
		
		Statement statement1 = block.getStatements().get(0);
		assertEquals(statement1.getClass(), AssignmentStatementImpl.class);
		AssignmentStatement assignmentStatement1 = (AssignmentStatement) statement1;
		assertEquals(assignmentStatement1.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		assertEquals(assignmentStatement1.getRhs().getClass(), IntegerExpressionImpl.class);
		
		
		Statement statement2 = block.getStatements().get(1);
		assertEquals(statement2.getClass(), AssignmentStatementImpl.class);
		AssignmentStatement assignmentStatement2 = (AssignmentStatement) statement2;
		assertEquals(assignmentStatement2.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		assertEquals(assignmentStatement2.getRhs().getClass(), IntegerExpressionImpl.class);
		
		
		Statement statement3 = block.getStatements().get(2);
		assertEquals(statement3.getClass(), AssignmentStatementImpl.class);
		AssignmentStatement assignmentStatement3 = (AssignmentStatement) statement3;
		assertEquals(assignmentStatement3.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		assertEquals(assignmentStatement3.getRhs().getClass(), PlusOperatorExpressionImpl.class);
		
		
		
	}

}
