package org.eclipse.epsilon.eol.ast2eol.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl;
import org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl;
import org.eclipse.epsilon.eol.metamodel.impl.FormalParameterExpressionImpl;
import org.eclipse.epsilon.eol.metamodel.impl.IntegerTypeImpl;
import org.junit.Test;

public class OperationDefinitionCreatorTest {

	@Test
	public void test() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("operation foo(bar:Integer) {}");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getOperations().size(), 1);
		
		OperationDefinition op = program.getOperations().get(0);
		
		assertEquals(op.getParameters().size(), 1);
		assertEquals(op.getParameters().get(0).getClass(), FormalParameterExpressionImpl.class);
		
		FormalParameterExpression formalParameterExpression = op.getParameters().get(0);
		
		assertEquals(formalParameterExpression.getName().getName(), "bar");
		assertEquals(formalParameterExpression.getResolvedType().getClass(), IntegerTypeImpl.class);
		
		assertEquals(op.getContextType().getClass(), AnyTypeImpl.class);
		assertEquals(op.getReturnType().getClass(), AnyTypeImpl.class);
	}
	
	@Test
	public void test1() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("operation Integer foo(bar:Integer) {}");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getOperations().size(), 1);
		
		OperationDefinition op = program.getOperations().get(0);
		
		
		assertEquals(op.getParameters().size(), 1);
		assertEquals(op.getParameters().get(0).getClass(), FormalParameterExpressionImpl.class);
		
		FormalParameterExpression formalParameterExpression = op.getParameters().get(0);
		
		assertEquals(formalParameterExpression.getName().getName(), "bar");
		assertEquals(formalParameterExpression.getResolvedType().getClass(), IntegerTypeImpl.class);
		
		assertEquals(op.getContextType().getClass(), IntegerTypeImpl.class);
		assertEquals(op.getReturnType().getClass(), AnyTypeImpl.class);
	}
	
	@Test
	public void test2() {
		EOLElement eolElement = AST2EolElementProducer.parseAST("operation Integer foo(bar:Integer) : Integer {}");
		
		assertEquals(eolElement.getClass(), EOLModuleImpl.class);
		
		EOLModule program = (EOLModule) eolElement;
		
		assertEquals(program.getOperations().size(), 1);
		
		OperationDefinition op = program.getOperations().get(0);
		
		
		assertEquals(op.getParameters().size(), 1);
		assertEquals(op.getParameters().get(0).getClass(), FormalParameterExpressionImpl.class);
		
		FormalParameterExpression formalParameterExpression = op.getParameters().get(0);
		
		assertEquals(formalParameterExpression.getName().getName(), "bar");
		assertEquals(formalParameterExpression.getResolvedType().getClass(), IntegerTypeImpl.class);
		
		assertEquals(op.getContextType().getClass(), IntegerTypeImpl.class);
		assertEquals(op.getReturnType().getClass(), IntegerTypeImpl.class);

	}

}
