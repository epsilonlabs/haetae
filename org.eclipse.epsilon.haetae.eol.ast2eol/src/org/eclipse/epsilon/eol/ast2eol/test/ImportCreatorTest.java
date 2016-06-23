package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URL;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class ImportCreatorTest {

	@Test
	public void test() {
		
		URL url = getClass().getResource("import.eol");
		System.out.println(url.toString());
		EolModule eolModule = new EolModule();
		try {
			eolModule.parse(new File(url.getPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Ast2EolContext context = new Ast2EolContext(eolModule);
		
		EOLElement eolElement = context.getEolElementCreatorFactory().createEOLElement(eolModule.getAst(), null, context);

		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getImports().size(), 1);
		
		Import import1 = program.getImports().get(0);
		assertEquals(import1.getImported(), "test_import.eol");
		
		EOLModule program2 = (EOLModule) import1.getImportedModule();
		assertEquals(program2.getBlock().getStatements().size(), 1);
		Statement statement = program2.getBlock().getStatements().get(0);
		assertEquals(statement.getClass(), AssignmentStatementImpl.class);
		AssignmentStatement assignmentStatement = (AssignmentStatement) statement;
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) assignmentStatement.getLhs();
		assertEquals(variableDeclarationExpression.getName().getName(), "a");
		
		assertEquals(assignmentStatement.getRhs().getClass(), IntegerExpressionImpl.class);
		IntegerExpressionImpl integerExpressionImpl = (IntegerExpressionImpl) assignmentStatement.getRhs();
		assertEquals(integerExpressionImpl.getValue(), 10);
	}

}
