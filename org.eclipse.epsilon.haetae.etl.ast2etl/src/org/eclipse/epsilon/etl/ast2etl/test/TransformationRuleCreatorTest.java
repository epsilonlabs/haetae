package org.eclipse.epsilon.etl.ast2etl.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.PropertyCallExpressionImpl;
import org.eclipse.epsilon.etl.metamodel.ETLModule;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.metamodel.impl.ETLModuleImpl;
import org.junit.Test;

public class TransformationRuleCreatorTest {

	@Test
	public void test() {
		EOLElement element = AST2EtlElementProducer.parseAST("rule A2D \n" +
				"transform a: Source!A\n" +
				"to e: Target!E\n {" +
				"	e.f = a.b.equivalents();\n" +
				"} \n" +
				"rule B2F \n" +
				"	transform b: Source!B \n" +
				"	to f: Target!F {} ");
		
		assertEquals(element.getClass(), ETLModuleImpl.class);
		
		ETLModule etlProgram = (ETLModule) element;
		assertEquals(etlProgram.getImports().size(), 0);
		assertEquals(etlProgram.getModelDeclarations().size(), 0);
		assertEquals(etlProgram.getPreBlocks().size(), 0);
		assertEquals(etlProgram.getPostBlocks().size(), 0);
		assertEquals(etlProgram.getTransformationRules().size(), 2);
		assertEquals(etlProgram.getOperations().size(), 0);
		
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
		
		assertEquals(rule1.getBody().getStatements().size(), 1);
		Statement statement1 = rule1.getBody().getStatements().get(0);
		assertEquals(statement1.getClass(), AssignmentStatementImpl.class);
		AssignmentStatement assignmentStatement = (AssignmentStatement) statement1;
		assertEquals(assignmentStatement.getLhs().getClass(), PropertyCallExpressionImpl.class);
		PropertyCallExpression lhs = (PropertyCallExpression) assignmentStatement.getLhs();
		assertEquals(lhs.getTarget().getClass(), NameExpressionImpl.class);
		NameExpression target = (NameExpression) lhs.getTarget();
		assertEquals(target.getName(), "e");
		NameExpression property = lhs.getProperty();
		assertEquals(property.getName(), "f");
		
		MethodCallExpression rhs = (MethodCallExpression) assignmentStatement.getRhs();
		PropertyCallExpression rhsTarget = (PropertyCallExpression) rhs.getTarget();
		NameExpression rhsTargetTarget = (NameExpression) rhsTarget.getTarget();
		assertEquals(rhsTargetTarget.getName(), "a");
		assertEquals(rhsTarget.getProperty().getName(), "b");
		assertEquals(rhs.getMethod().getName(), "equivalents");
			
		TransformationRule rule2 = etlProgram.getTransformationRules().get(1);
		assertEquals(rule2.getName().getName(), "B2F");
		assertEquals(rule2.getSource().getName().getName(), "b");
		ModelElementType rule2SourceType = (ModelElementType) rule2.getSource().getResolvedType();
		assertEquals(rule2SourceType.getModelName(), "Source");
		assertEquals(rule2SourceType.getElementName(), "B");
		assertEquals(rule2.getTargets().size(), 1);
		FormalParameterExpression rule2target = rule2.getTargets().get(0);
		ModelElementType rule2TargetType = (ModelElementType) rule2target.getResolvedType();
		assertEquals(rule2TargetType.getModelName(), "Target");
		assertEquals(rule2TargetType.getElementName(), "F");
		
	}

}
