package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.junit.Test;

public class BlockCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		assertTrue(program.getBlock() != null);
	}

}
