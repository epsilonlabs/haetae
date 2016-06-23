package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.ThrowStatement;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ThrowStatementImpl;
import org.junit.Test;

public class ThrowStatementCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("throw 1;");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().size(), 1);
		assertEquals(program.getBlock().getStatements().get(0).getClass(), ThrowStatementImpl.class);
		ThrowStatement throwStatement = (ThrowStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(throwStatement.getExpression().getClass(), IntegerExpressionImpl.class);
		IntegerExpression thrown = (IntegerExpression) throwStatement.getExpression();
		
		assertEquals(thrown.getValue(), 1);
	}

}
