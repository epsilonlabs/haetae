package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.NegativeOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.NegativeOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class NegativeOperatorExpressionTypeResolver extends NegativeOperatorExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(NegativeOperatorExpression negativeOperatorExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//get expression
		Expression expression = negativeOperatorExpression.getExpression();
		
		//resolve expression
		controller.visit(expression, context);
		 
		//get resolved type
		Type expressionType = expression.getResolvedType();
		
		//set type first, this allows minor-error in expressions n statements
		Type type = EolFactory.eINSTANCE.createRealType(); 
		negativeOperatorExpression.setResolvedType(type);
		context.setAssets(type, negativeOperatorExpression); //set the type to the notOperatorExpression
		
		if (expressionType == null) {
			LogBook.getInstance().addError(expression, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			return null;
		}
		
		if (expressionType instanceof IntegerType) {
			type = EolFactory.eINSTANCE.createIntegerType();
			negativeOperatorExpression.setResolvedType(type);
			context.setAssets(type, negativeOperatorExpression);
			return null;
		}
		else if (expressionType instanceof RealType) {
			return null;
		}
		else if (TypeUtil.getInstance().isInstanceofAnyType(expressionType)) {
			LogBook.getInstance().addWarning(expression, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			return null;
		}
		else {
			LogBook.getInstance().addError(expression, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_NUMERAL);
			return null;
		}
	}
}
