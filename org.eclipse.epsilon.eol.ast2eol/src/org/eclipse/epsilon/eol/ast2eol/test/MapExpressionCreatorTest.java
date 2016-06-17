package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.KeyValueExpression;
import org.eclipse.epsilon.eol.metamodel.MapExpression;
import org.eclipse.epsilon.eol.metamodel.NewExpression;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.MapExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.MapTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NewExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.StringExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class MapExpressionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = Map{'k1' = 1};");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().size(), 1);
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression lhs = (VariableDeclarationExpression) assignmentStatement.getLhs();
		assertEquals(lhs.getName().getName(), "a");
		
		assertEquals(assignmentStatement.getRhs().getClass(), MapExpressionImpl.class);
		
		MapExpression mapExpression = (MapExpression) assignmentStatement.getRhs();
		
		assertEquals(mapExpression.getKeyValues().size(), 1);
		
		KeyValueExpression keyValue1 = mapExpression.getKeyValues().get(0);
		assertEquals(keyValue1.getKey().getClass(), StringExpressionImpl.class);
		StringExpression key1 = (StringExpression) keyValue1.getKey();
		assertEquals(key1.getValue(), "k1");
		assertEquals(keyValue1.getValue().getClass(), IntegerExpressionImpl.class);
		IntegerExpression value1 = (IntegerExpression) keyValue1.getValue();
		assertEquals(value1.getValue(), 1);
		
	}

	@Test
	public void test2() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = new Map;");
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().size(), 1);
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression lhs = (VariableDeclarationExpression) assignmentStatement.getLhs();
		assertEquals(lhs.getName().getName(), "a");
		
		assertEquals(assignmentStatement.getRhs().getClass(), NewExpressionImpl.class);
		
		NewExpression newExpression = (NewExpression) assignmentStatement.getRhs();
		
		assertEquals(newExpression.getResolvedType().getClass(), MapTypeImpl.class);
			
//		KeyValueExpression keyValue1 = mapExpression.getKeyValues().get(0);
//		assertEquals(keyValue1.getKey().getClass(), StringExpressionImpl.class);
//		StringExpression key1 = (StringExpression) keyValue1.getKey();
//		assertEquals(key1.getValue(), "k1");
//		assertEquals(keyValue1.getValue().getClass(), IntegerExpressionImpl.class);
//		IntegerExpression value1 = (IntegerExpression) keyValue1.getValue();
//		assertEquals(value1.getValue(), 1);
		
	}
}
