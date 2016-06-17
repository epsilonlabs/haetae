package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.MinusOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MinusOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class MinusOperatorExpressionTypeResolver extends MinusOperatorExpressionVisitor<TypeResolutionContext, Object>{
	

	@Override
	public Object visit(MinusOperatorExpression minusOperatorExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		controller.visitContents(minusOperatorExpression, context);
		
		//get lhs and rhs
		Expression lhs = minusOperatorExpression.getLhs();
		Expression rhs = minusOperatorExpression.getRhs();
 
		//get lhstype and rhstype
		Type lhsType = lhs.getResolvedType();
		Type rhsType = rhs.getResolvedType();
		
		//create Real for return type first
		Type type = EolFactory.eINSTANCE.createRealType();
		minusOperatorExpression.setResolvedType(type);
		context.setAssets(type, minusOperatorExpression);
		
		//if lhstype is null
		if(lhsType == null){
			LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			return null;
		}
		
		//if rhstype is null
		if(rhsType == null){
			LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			return null;
		}
		
		//get type util
		TypeUtil typeUtil = TypeUtil.getInstance();
		
		if (!(lhsType instanceof RealType) && (!typeUtil.isInstanceofAnyType(lhsType))) {
			LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_NUMERAL);
		}
		
		if (!(rhsType instanceof RealType) && (!typeUtil.isInstanceofAnyType(rhsType))) {
			LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_NUMERAL);
		}
		
		//if lhstype is real
		if (lhsType instanceof IntegerType) {
			if (rhsType instanceof IntegerType) {
				type = EolFactory.eINSTANCE.createIntegerType();
				minusOperatorExpression.setResolvedType(type);
				context.setAssets(type, minusOperatorExpression);
				return null;
			}
			else if (rhsType instanceof RealType) {
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, lhsType.getClass().getName()));
			}
			return null;
		}
		
		if (lhsType instanceof RealType) {
			if (rhsType instanceof RealType) {
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, lhsType.getClass().getName()));
			}
			return null;
		}
		
		if (typeUtil.isInstanceofAnyType(lhsType)) {
			LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			return null;
		}
		
		if (rhsType instanceof IntegerType) {
			if (lhsType instanceof IntegerType) {
				type = EolFactory.eINSTANCE.createIntegerType();
				minusOperatorExpression.setResolvedType(type);
				context.setAssets(type, minusOperatorExpression);
				return null;
			}
			else if (lhsType instanceof RealType) {
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(lhsType)) {
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addError(lhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, rhsType.getClass().getName()));
			}
			return null;
		}
		
		if (rhsType instanceof RealType) {
			if (lhsType instanceof RealType) {
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(lhsType)) {
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addError(lhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, rhsType.getClass().getName()));
			}
			return null;
		}
		
		if (typeUtil.isInstanceofAnyType(rhsType)) {
			LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			return null;
		}
		
		return null;
	}

}
