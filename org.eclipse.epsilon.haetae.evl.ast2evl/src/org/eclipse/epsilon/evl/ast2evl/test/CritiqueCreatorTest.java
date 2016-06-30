package org.eclipse.epsilon.evl.ast2evl.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URL;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.ast2evl.Ast2EvlContext;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Critique;
import org.eclipse.epsilon.evl.metamodel.EVLModule;
import org.eclipse.epsilon.evl.metamodel.impl.EVLModuleImpl;
import org.junit.Test;

public class CritiqueCreatorTest {

	@Test
	public void test() {
		URL url = getClass().getResource("test_critique.evl");
		EvlModule module = new EvlModule();
		try {
			module.parse(new File(url.getPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Ast2EvlContext context = new Ast2EvlContext(module);
		EOLElement eolElement = context.getEvlElementCreatorFactory().createEOLElement(module.getAst(), null, context);

		assertEquals(eolElement.getClass(), EVLModuleImpl.class);
		EVLModule evlProgram = (EVLModule) eolElement;
		
		assertEquals(evlProgram.getModelDeclarations().size(), 0);
		assertEquals(evlProgram.getImports().size(), 0);
		assertEquals(evlProgram.getContexts().size(), 1);
		assertEquals(evlProgram.getOperations().size(), 0);
		assertEquals(evlProgram.getPreBlocks().size(), 0);
		assertEquals(evlProgram.getPostBlocks().size(), 0);
		
		Context leContext = evlProgram.getContexts().get(0);
		ModelElementType leContextType = leContext.getType();
		assertEquals(leContextType.getModelName(), "OO");
		assertEquals(leContextType.getElementName(), "Feature");
		
		assertEquals(leContext.getGuard(), null);
		assertEquals(leContext.getInvariants().size(), 1);
	
		Critique critique = (Critique) leContext.getInvariants().get(0);
		assertEquals(critique.getName().getName(), "NameMustStartWithLowerCase");
		
		ExpressionOrStatementBlock guard = critique.getGuard();
		assertEquals(guard.getBlock(), null);
		MethodCallExpression guardExpr = (MethodCallExpression) guard.getExpression();
		NameExpression guarExprTarget = (NameExpression) guardExpr.getTarget();
		assertEquals(guarExprTarget.getName(), "self");
		assertEquals(guardExpr.getMethod().getName(), "satisfies");
		StringExpression arg = (StringExpression) guardExpr.getArguments().get(0);
		assertEquals(arg.getValue(), "HasName");
		
		ExpressionOrStatementBlock check = critique.getCheck();
		assertEquals(check.getBlock(), null);
		
		EqualsOperatorExpression equalsOperatorExpression = (EqualsOperatorExpression) check.getExpression();
		MethodCallExpression lhs = (MethodCallExpression) equalsOperatorExpression.getLhs();
		PropertyCallExpression lhsTarget = (PropertyCallExpression) lhs.getTarget();
		NameExpression lhsTargetTarget = (NameExpression) lhsTarget.getTarget();
		assertEquals(lhsTargetTarget.getName(), "self");
		assertEquals(lhsTarget.getProperty().getName(), "name");
		assertEquals(lhs.getMethod().getName(), "substring");
		assertEquals(lhs.getArguments().size(), 2);
		
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
