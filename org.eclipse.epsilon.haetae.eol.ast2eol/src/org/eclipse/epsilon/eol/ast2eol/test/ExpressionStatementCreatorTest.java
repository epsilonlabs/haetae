package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.junit.Test;

public class ExpressionStatementCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("a.println();");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), ExpressionStatementImpl.class);
		
		ExpressionStatementImpl expressionStatementImpl = (ExpressionStatementImpl) program.getBlock().getStatements().get(0);
		
		Expression expression = expressionStatementImpl.getExpression();
		
		assertEquals(expression.getClass(), MethodCallExpressionImpl.class);
		
		MethodCallExpression methodCallExpression = (MethodCallExpression) expression;
		
		assertEquals(methodCallExpression.getTarget().getClass(), NameExpressionImpl.class);
		assertEquals(methodCallExpression.getMethod().getName(), "println");
		assertEquals(methodCallExpression.getArguments().size(), 0);
	}

}
