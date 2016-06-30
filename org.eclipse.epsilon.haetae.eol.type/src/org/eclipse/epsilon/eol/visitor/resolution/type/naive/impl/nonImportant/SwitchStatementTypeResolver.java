package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.SwitchStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SwitchStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class SwitchStatementTypeResolver extends SwitchStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(SwitchStatement switchStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {

		controller.visit(switchStatement.getExpression(), context);
		for(SwitchCaseExpressionStatement stmt: switchStatement.getCases())
		{
			controller.visit(stmt, context);
		}
		controller.visit(switchStatement.getDefault(), context);
		
		return null;
	}

}
