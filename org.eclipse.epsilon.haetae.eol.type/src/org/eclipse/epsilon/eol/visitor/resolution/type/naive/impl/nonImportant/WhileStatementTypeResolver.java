package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.WhileStatementVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class WhileStatementTypeResolver extends WhileStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(WhileStatement whileStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {

		context.getTypeRegistry().pushScope(whileStatement.getBody());
		controller.visit(whileStatement.getCondition(), context);
		controller.visit(whileStatement.getBody(), context);
		
		Expression condition = whileStatement.getCondition();
		Type conditionType = condition.getResolvedType();

		if (!(conditionType instanceof BooleanType)) {
			if (TypeUtil.getInstance().isInstanceofAnyType(conditionType)) {
				if (!TypeInferenceManager.getInstance().containsDynamicType((AnyType) conditionType, EolFactory.eINSTANCE.createBooleanType().eClass())) {
					LogBook.getInstance().addError(condition, IMessage_TypeResolution.EXPRESSION_NOT_BOOLEAN);
				}
			}
			else {
				LogBook.getInstance().addError(condition, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, "Boolean"));
			}
		}
		context.getTypeRegistry().popScope();
		
		return null;
	}

}
