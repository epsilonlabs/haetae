package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.ExpressionList;
import org.eclipse.epsilon.eol.metamodel.SetExpression;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ExpressionListImpl;
import org.eclipse.epsilon.eol.metamodel.impl.SetExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class SetExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = Set{1,2,3,4,5};");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		Statement statement = program.getBlock().getStatements().get(0);
		
		assertEquals(statement.getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) statement;
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		assertEquals(assignmentStatement.getRhs().getClass(), SetExpressionImpl.class);
		SetExpression setExpression = (SetExpression) assignmentStatement.getRhs();
		assertEquals(setExpression.getParameterList().getClass(), ExpressionListImpl.class);
		ExpressionList exprList = (ExpressionList) setExpression.getParameterList();
		assertEquals(exprList.getExpressions().size(), 5);
	}

}
