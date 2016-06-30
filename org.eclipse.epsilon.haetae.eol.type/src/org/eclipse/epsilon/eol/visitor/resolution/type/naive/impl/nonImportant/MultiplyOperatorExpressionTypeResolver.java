package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.MultiplyOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MultiplyOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class MultiplyOperatorExpressionTypeResolver extends MultiplyOperatorExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(MultiplyOperatorExpression multiplyOperatorExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//visit contents first
		controller.visitContents(multiplyOperatorExpression, context);
		 
		//get lhs and rhs
		Expression lhs = multiplyOperatorExpression.getLhs();
		Expression rhs = multiplyOperatorExpression.getRhs();
		
		//get lhstype and rhstype
		Type lhsType = lhs.getResolvedType();
		Type rhsType = rhs.getResolvedType();
		
		//create a real type and store it first
		Type type = EolFactory.eINSTANCE.createRealType();
		multiplyOperatorExpression.setResolvedType(type);
		context.setAssets(type, multiplyOperatorExpression);
		
		//if lhs does not have a type
		if(lhsType == null){
			LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			return null;
		}
		
		//if rhs does not have a type
		if(rhsType == null){
			LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			return null;
		}
		
		//get the type util
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
				multiplyOperatorExpression.setResolvedType(type);
				context.setAssets(type, multiplyOperatorExpression);
				return null;
			}
			else if (rhsType instanceof RealType) {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
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
			type = EolFactory.eINSTANCE.createAnyType();
			multiplyOperatorExpression.setResolvedType(type);
			context.setAssets(type, multiplyOperatorExpression);
			return null;
		}		
		

		if (rhsType instanceof IntegerType) {
			if (lhsType instanceof IntegerType) {
				type = EolFactory.eINSTANCE.createIntegerType();
				multiplyOperatorExpression.setResolvedType(type);
				context.setAssets(type, multiplyOperatorExpression);
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
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
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
