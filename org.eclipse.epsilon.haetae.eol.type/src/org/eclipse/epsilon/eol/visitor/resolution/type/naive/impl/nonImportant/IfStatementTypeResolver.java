package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.IfStatement;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.IfStatementVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class IfStatementTypeResolver extends IfStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(IfStatement ifStatement, TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		context.getTypeRegistry().pushScope(ifStatement.getIfBody());//////////
		
		context.setHandlingBranchCondition(true);
		controller.visit(ifStatement.getCondition(), context);
		Type t = ifStatement.getCondition().getResolvedType();
		if (!(t instanceof BooleanType)) {
			LogBook.getInstance().addError(ifStatement.getCondition(), IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_BOOLEAN);
		}
		context.setHandlingBranchCondition(false);
		
		controller.visit(ifStatement.getIfBody(), context);
		context.getTypeRegistry().popScope();//////////
		
		for(ExpressionOrStatementBlock eosb: ifStatement.getElseIfBodies())
		{
			context.getTypeRegistry().pushScope(eosb);
			controller.visit(eosb, context);
			context.getTypeRegistry().popScope();
		}
		
		if (ifStatement.getElseBody() != null) {
			context.getTypeRegistry().pushScope(ifStatement.getElseBody());
			controller.visit(ifStatement.getElseBody(), context);
			context.getTypeRegistry().popScope();
		}
		return null;
	}

}
