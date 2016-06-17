package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.ExpressionStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ExpressionStatementVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class ExpressionStatementTypeResolver extends ExpressionStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ExpressionStatement expressionStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		if (expressionStatement.getExpression() != null) {
			controller.visit(expressionStatement.getExpression(), context);
		}
		else {
			LogBook.getInstance().addError(expressionStatement, IMessage_TypeResolution.EXPRESSION_CANNOT_BE_NULL);
		}
		return null;
	}
 
}
