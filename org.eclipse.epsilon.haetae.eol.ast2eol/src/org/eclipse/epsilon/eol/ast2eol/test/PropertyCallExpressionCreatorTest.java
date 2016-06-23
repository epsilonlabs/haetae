package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.PropertyCallExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class PropertyCallExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = A!B.all.first;");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		EOLModule program = (EOLModule) eolElement;
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) assignmentStatement.getLhs();
		assertEquals(variableDeclarationExpression.getName().getName(), "a");
		
		assertEquals(assignmentStatement.getRhs().getClass(), PropertyCallExpressionImpl.class);
		PropertyCallExpression propertyCallExpression = (PropertyCallExpression) assignmentStatement.getRhs();
		assertEquals(propertyCallExpression.getTarget().getClass(), PropertyCallExpressionImpl.class);
		
		PropertyCallExpression innerPropertyCallExpression = (PropertyCallExpression) propertyCallExpression.getTarget();
		assertEquals(innerPropertyCallExpression.getTarget().getClass(), NameExpressionImpl.class);
		NameExpression nameExpression = (NameExpression) innerPropertyCallExpression.getTarget();
		assertEquals(nameExpression.getName(), "A!B");
		
		assertEquals(innerPropertyCallExpression.getProperty().getName(), "all");
		
		assertEquals(propertyCallExpression.getProperty().getName(), "first");
	}

}
