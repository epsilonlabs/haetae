package org.eclipse.epsilon.etl.ast2etl.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URL;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.PropertyCallExpressionImpl;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.ast2etl.Ast2EtlContext;
import org.eclipse.epsilon.etl.metamodel.ETLModule;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.metamodel.impl.ETLModuleImpl;
import org.junit.Test;

public class ImportCreatorTest {

	@Test
	public void test() {
		
		URL url = getClass().getResource("test_import.etl");
		System.out.println(url.toString());
		EtlModule etlModule = new EtlModule();
		try {
			etlModule.parse(new File(url.getPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Ast2EtlContext context = new Ast2EtlContext(etlModule);
		
		EOLElement eolElement = context.getEtlElementCreatorFactory().createEOLElement(etlModule.getAst(), null, context);

		assertEquals(eolElement.getClass(), ETLModuleImpl.class);
		
		ETLModule etlProgram = (ETLModule) eolElement;
		assertEquals(etlProgram.getModelDeclarations().size(), 0);
		assertEquals(etlProgram.getPreBlocks().size(), 0);
		assertEquals(etlProgram.getPostBlocks().size(), 0);
		assertEquals(etlProgram.getTransformationRules().size(), 1);
		assertEquals(etlProgram.getOperations().size(), 0);
		
		assertEquals(etlProgram.getImports().size(), 1);
		Import import1 = etlProgram.getImports().get(0);
		assertEquals(import1.getImportedModule().getClass(), EOLModuleImpl.class);
		assertEquals(import1.getImported(), "loadModels.eol");
		
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
		
		ExpressionOrStatementBlock guard = rule1.getGuard();
		assertEquals(guard.getBlock(), null);
		NotEqualsOperatorExpression notEqualsOperatorExpression = (NotEqualsOperatorExpression) guard.getExpression();
		NameExpression conditionLhs = (NameExpression) notEqualsOperatorExpression.getLhs();
		assertEquals(conditionLhs.getName(), "a");
		NameExpression conditionRhs = (NameExpression) notEqualsOperatorExpression.getRhs();
		assertEquals(conditionRhs.getName(), "null");
		
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
	}

	@Test
	public void test1() {
		
		URL url = getClass().getResource("test_import2.etl");
		System.out.println(url.toString());
		EtlModule etlModule = new EtlModule();
		try {
			etlModule.parse(new File(url.getPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Ast2EtlContext context = new Ast2EtlContext(etlModule);
		
		EOLElement eolElement = context.getEtlElementCreatorFactory().createEOLElement(etlModule.getAst(), null, context);

		assertEquals(eolElement.getClass(), ETLModuleImpl.class);
		
		ETLModule etlProgram = (ETLModule) eolElement;
		assertEquals(etlProgram.getModelDeclarations().size(), 0);
		assertEquals(etlProgram.getPreBlocks().size(), 0);
		assertEquals(etlProgram.getPostBlocks().size(), 0);
		assertEquals(etlProgram.getTransformationRules().size(), 1);
		assertEquals(etlProgram.getOperations().size(), 0);
		
		assertEquals(etlProgram.getImports().size(), 1);
		Import import1 = etlProgram.getImports().get(0);
		assertEquals(import1.getImportedModule().getClass(), ETLModuleImpl.class);
		assertEquals(import1.getImported(), "imported_etl.etl");
		
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
		
		ExpressionOrStatementBlock guard = rule1.getGuard();
		assertEquals(guard.getBlock(), null);
		NotEqualsOperatorExpression notEqualsOperatorExpression = (NotEqualsOperatorExpression) guard.getExpression();
		NameExpression conditionLhs = (NameExpression) notEqualsOperatorExpression.getLhs();
		assertEquals(conditionLhs.getName(), "a");
		NameExpression conditionRhs = (NameExpression) notEqualsOperatorExpression.getRhs();
		assertEquals(conditionRhs.getName(), "null");
		
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
	}

}
