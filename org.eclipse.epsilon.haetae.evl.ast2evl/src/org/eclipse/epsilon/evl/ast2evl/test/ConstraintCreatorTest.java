package org.eclipse.epsilon.evl.ast2evl.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URL;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.PlusOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.ast2evl.Ast2EvlContext;
import org.eclipse.epsilon.evl.metamodel.Constraint;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.EVLModule;
import org.eclipse.epsilon.evl.metamodel.impl.EVLModuleImpl;
import org.junit.Test;

public class ConstraintCreatorTest {

	@Test
	public void test() {
		URL url = getClass().getResource("test_constraint.evl");
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
		assertEquals(leContext.getInvariants().size(), 1);
		
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
		
		ExpressionOrStatementBlock message = constraint.getMessage();
		assertEquals(message.getBlock(), null);
		PlusOperatorExpression plusOperatorExpression = (PlusOperatorExpression) message.getExpression();
		PlusOperatorExpression innerPlusOperatorExpression = (PlusOperatorExpression) plusOperatorExpression.getLhs();
		StringExpression innerLhs = (StringExpression) innerPlusOperatorExpression.getLhs();
		assertEquals(innerLhs.getValue(), "Element ");
		NameExpression innerRhs = (NameExpression) innerPlusOperatorExpression.getRhs();
		assertEquals(innerRhs.getName(), "self");
		StringExpression plusRhs = (StringExpression) plusOperatorExpression.getRhs();
		assertEquals(plusRhs.getValue(), " must define a name");
		
	}

}
