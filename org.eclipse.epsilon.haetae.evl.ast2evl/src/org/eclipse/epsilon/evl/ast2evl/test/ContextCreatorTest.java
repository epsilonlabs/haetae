package org.eclipse.epsilon.evl.ast2evl.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URL;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.ast2evl.Ast2EvlContext;
import org.eclipse.epsilon.evl.metamodel.Constraint;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Critique;
import org.eclipse.epsilon.evl.metamodel.EVLModule;
import org.eclipse.epsilon.evl.metamodel.impl.EVLModuleImpl;
import org.junit.Test;

public class ContextCreatorTest {

	@Test
	public void test() {
		URL url = getClass().getResource("test_context.evl");
		EvlModule module = new EvlModule();
		try {
			module.parse(new File(url.getPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Ast2EvlContext context = new Ast2EvlContext(module);
		EOLElement EOLElement = context.getEvlElementCreatorFactory().createEOLElement(module.getAst(), null, context);

		assertEquals(EOLElement.getClass(), EVLModuleImpl.class);
		EVLModule evlProgram = (EVLModule) EOLElement;
		
		assertEquals(evlProgram.getModelDeclarations().size(), 0);
		assertEquals(evlProgram.getImports().size(), 0);
		assertEquals(evlProgram.getContexts().size(), 1);
		assertEquals(evlProgram.getOperations().size(), 0);
		assertEquals(evlProgram.getPreBlocks().size(), 0);
		assertEquals(evlProgram.getPostBlocks().size(), 0);
		
		Context leContext = evlProgram.getContexts().get(0);
		ModelElementType leContextType = leContext.getType();
		assertEquals(leContextType.getModelName(), "OO");
		assertEquals(leContextType.getElementName(), "NamedElement");
		
		assertEquals(leContext.getGuard(), null);
		assertEquals(leContext.getInvariants().size(), 2);
		
		Constraint constraint = (Constraint) leContext.getInvariants().get(0);
		assertEquals(constraint.getName().getName(), "HasName");
		ExpressionOrStatementBlock check = constraint.getCheck();
		assertEquals(check.getBlock(), null);
		NotEqualsOperatorExpression notEqualsOperatorExpression = (NotEqualsOperatorExpression) check.getExpression();
		PropertyCallExpression lhs = (PropertyCallExpression) notEqualsOperatorExpression.getLhs();
		NameExpression target = (NameExpression) lhs.getTarget();
		assertEquals(target.getName(), "self");
		assertEquals(lhs.getProperty().getName(), "name");
		StringExpression rhs = (StringExpression) notEqualsOperatorExpression.getRhs();
		assertEquals(rhs.getValue(), "");
		
		Critique critique = (Critique) leContext.getInvariants().get(1);
		assertEquals(critique.getName().getName(), "NameMustStartWithLowerCase");
		ExpressionOrStatementBlock check1 = critique.getCheck();
		assertEquals(check1.getBlock(), null);
		EqualsOperatorExpression equalsOperatorExpression = (EqualsOperatorExpression) check1.getExpression();
		MethodCallExpression equalsLhs = (MethodCallExpression) equalsOperatorExpression.getLhs();
		PropertyCallExpression equalsLhsTarget = (PropertyCallExpression) equalsLhs.getTarget();
		NameExpression equalsLhsTargetTarget = (NameExpression) equalsLhsTarget.getTarget();
		assertEquals(equalsLhsTargetTarget.getName(), "self");
		assertEquals(equalsLhsTarget.getProperty().getName(), "name");
		assertEquals(equalsLhs.getMethod().getName(), "substring");
		assertEquals(equalsLhs.getArguments().size(), 2);
		IntegerExpression arg1 = (IntegerExpression) equalsLhs.getArguments().get(0);
		assertEquals(arg1.getValue(), 0);
		IntegerExpression arg2 = (IntegerExpression) equalsLhs.getArguments().get(1);
		assertEquals(arg2.getValue(), 1);
		
		MethodCallExpression equalsRhs = (MethodCallExpression) equalsOperatorExpression.getRhs();
		MethodCallExpression equalsRhsTarget = (MethodCallExpression) equalsRhs.getTarget();
		PropertyCallExpression equalsRhsTargetTarget = (PropertyCallExpression) equalsRhsTarget.getTarget();
		NameExpression equalsRhsTargetTargetTarget = (NameExpression) equalsRhsTargetTarget.getTarget();
		assertEquals(equalsRhsTargetTargetTarget.getName(), "self");
		assertEquals(equalsRhsTargetTarget.getProperty().getName(), "name");
		assertEquals(equalsRhsTarget.getMethod().getName(), "substring");
		assertEquals(equalsRhs.getMethod().getName(), "toLowerCase");
		
	}

}
