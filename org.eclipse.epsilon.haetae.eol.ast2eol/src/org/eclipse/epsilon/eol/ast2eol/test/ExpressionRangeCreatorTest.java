package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.ExpressionRange;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.SequenceExpression;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ExpressionRangeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.SequenceExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class ExpressionRangeCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = Sequence{1..5};");
		
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		Statement statement = program.getBlock().getStatements().get(0);
		
		assertEquals(statement.getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) statement;
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		assertEquals(assignmentStatement.getRhs().getClass(), SequenceExpressionImpl.class);
		
		SequenceExpression sequenceExpression = (SequenceExpression) assignmentStatement.getRhs();
		assertEquals(sequenceExpression.getParameterList().getClass(), ExpressionRangeImpl.class);
		
		ExpressionRange expressionRange = (ExpressionRange) sequenceExpression.getParameterList();
		assertEquals(expressionRange.getStart().getClass(), IntegerExpressionImpl.class);
		IntegerExpression start = (IntegerExpression) expressionRange.getStart();
		assertEquals(start.getValue(), 1);
		
		assertEquals(expressionRange.getEnd().getClass(), IntegerExpressionImpl.class);
		IntegerExpression end = (IntegerExpression) expressionRange.getEnd();
		assertEquals(end.getValue(), 5);
		
	}

}
