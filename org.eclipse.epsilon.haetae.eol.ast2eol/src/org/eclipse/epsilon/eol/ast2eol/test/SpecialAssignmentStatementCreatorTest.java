package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.SpecialAssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.SpecialAssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class SpecialAssignmentStatementCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = A!B; \n" +
				"var b ::= a;");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().size(), 2);
		
		Block block = program.getBlock();
		
		Statement statement1 = block.getStatements().get(0);
		assertEquals(statement1.getClass(), AssignmentStatementImpl.class);
		AssignmentStatement assignmentStatement1 = (AssignmentStatement) statement1;
		assertEquals(assignmentStatement1.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		assertEquals(assignmentStatement1.getRhs().getClass(), NameExpressionImpl.class);
		
		
		Statement statement2 = block.getStatements().get(1);
		assertEquals(statement2.getClass(), SpecialAssignmentStatementImpl.class);
		SpecialAssignmentStatement assignmentStatement2 = (SpecialAssignmentStatement) statement2;
		assertEquals(assignmentStatement2.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		assertEquals(assignmentStatement2.getRhs().getClass(), NameExpressionImpl.class);
		
	}

}
