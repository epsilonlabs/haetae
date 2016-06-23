package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.NativeType;
import org.eclipse.epsilon.eol.metamodel.NewExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NativeTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NewExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl;
import org.junit.Test;

public class NativeTypeCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("var a = new Native(\"java.lang.String\");");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getBlock().getStatements().get(0).getClass(), AssignmentStatementImpl.class);
		
		AssignmentStatement assignmentStatement = (AssignmentStatement) program.getBlock().getStatements().get(0);
		
		assertEquals(assignmentStatement.getLhs().getClass(), VariableDeclarationExpressionImpl.class);
		VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) assignmentStatement.getLhs();
		assertEquals(variableDeclarationExpression.getName().getName(), "a");
		
		assertEquals(assignmentStatement.getRhs().getClass(), NewExpressionImpl.class);
		NewExpression newExpression = (NewExpression) assignmentStatement.getRhs();
		
		
		assertEquals(newExpression.getResolvedType().getClass(), NativeTypeImpl.class);
		NativeType nativeType = (NativeType) newExpression.getResolvedType();
		
		assertEquals(nativeType.getExpression(), "java.lang.String");
	}

}
