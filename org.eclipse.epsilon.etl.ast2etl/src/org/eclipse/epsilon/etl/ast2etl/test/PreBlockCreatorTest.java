package org.eclipse.epsilon.etl.ast2etl.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl;
import org.eclipse.epsilon.etl.metamodel.ETLModule;
import org.eclipse.epsilon.etl.metamodel.NamedBlock;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.metamodel.impl.ETLModuleImpl;
import org.junit.Test;

public class PreBlockCreatorTest {

	@Test
	public void test() {
		EOLElement element = AST2EtlElementProducer.parseAST("" +
				"pre { \n" +
				"	'beginning transformation...'.println();\n" +
				"}\n" +
				"" +
				"rule A2D \n" +
				"transform a: Source!A\n" +
				"to e: Target!E\n {" +
				"} \n" +
				"post {\n" +
				"	'transformation complete'.println();\n" +
				"}");
		
		assertEquals(element.getClass(), ETLModuleImpl.class);
		
		ETLModule etlProgram = (ETLModule) element;
		assertEquals(etlProgram.getImports().size(), 0);
		assertEquals(etlProgram.getModelDeclarations().size(), 0);
		assertEquals(etlProgram.getPreBlocks().size(), 1);
		assertEquals(etlProgram.getPostBlocks().size(), 1);
		assertEquals(etlProgram.getTransformationRules().size(), 1);
		assertEquals(etlProgram.getOperations().size(), 0);
		
		NamedBlock preBlock = etlProgram.getPreBlocks().get(0);
		assertEquals(preBlock.getBody().getStatements().size(), 1);
		ExpressionStatement preBlockStatement = (ExpressionStatement) preBlock.getBody().getStatements().get(0);
		MethodCallExpression preBlockStatementExpression = (MethodCallExpression) preBlockStatement.getExpression();
		StringExpression target0 = (StringExpression) preBlockStatementExpression.getTarget();
		assertEquals(target0.getValue(), "beginning transformation...");
		assertEquals(preBlockStatementExpression.getMethod().getName(), "println");
				
		TransformationRule rule1 = etlProgram.getTransformationRules().get(0);
		assertEquals(rule1.getName().getName(), "A2D");
		assertEquals(rule1.getSource().getName().getName(), "a");
		assertEquals(rule1.getSource().getResolvedType().getClass(), ModelElementTypeImpl.class);
		ModelElementType source1Type = (ModelElementType) rule1.getSource().getResolvedType();
		assertEquals(source1Type.getModelName(), "Source");
		assertEquals(source1Type.getElementName(), "A");
		
		assertEquals(rule1.getTargets().size(), 1);
		FormalParameterExpression rule1target = rule1.getTargets().get(0);
		assertEquals(rule1target.getName().getName(), "e");
		assertEquals(rule1target.getResolvedType().getClass(), ModelElementTypeImpl.class);
		ModelElementType rule1targetType = (ModelElementType) rule1target.getResolvedType();
		assertEquals(rule1targetType.getModelName(), "Target");
		assertEquals(rule1targetType.getElementName(), "E");
		
		NamedBlock postBlock1 = etlProgram.getPostBlocks().get(0);
		assertEquals(postBlock1.getBody().getStatements().size(), 1);
		ExpressionStatement expressionStatement = (ExpressionStatement) postBlock1.getBody().getStatements().get(0);
		MethodCallExpression methodCallExpression = (MethodCallExpression) expressionStatement.getExpression();
		StringExpression target = (StringExpression) methodCallExpression.getTarget();
		assertEquals(target.getValue(), "transformation complete");
		assertEquals(methodCallExpression.getMethod().getName(), "println");
		
	}

}
