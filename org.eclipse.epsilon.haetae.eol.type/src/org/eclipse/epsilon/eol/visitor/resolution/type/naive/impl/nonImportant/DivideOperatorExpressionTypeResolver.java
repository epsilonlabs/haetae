package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.DivideOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.IntegerExpression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.RealExpression;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.DivideOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class DivideOperatorExpressionTypeResolver extends DivideOperatorExpressionVisitor<TypeResolutionContext, Object>{
 
	@Override
	public Object visit(DivideOperatorExpression divideOperatorExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//visit contents first
		controller.visitContents(divideOperatorExpression, context);
		
		//get lhs and rhs
		Expression lhs = divideOperatorExpression.getLhs();
		Expression rhs = divideOperatorExpression.getRhs();
		
		//get lhstype and rhstype
		Type lhsType = lhs.getResolvedType();
		Type rhsType = rhs.getResolvedType();
		
		//create a real type and store it first
		Type type = EolFactory.eINSTANCE.createRealType();
		divideOperatorExpression.setResolvedType(type);
		context.setAssets(type, divideOperatorExpression);
		
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

		
		//check deivision by zero
		if (rhs instanceof RealExpression) {
			if (((RealExpression) rhs).getValue() == 0.0) {
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.DIVISION_BY_ZERO);
				return null;
			}
		}
		
		//check division be zero
		if (rhs instanceof IntegerExpression) {
			if (((IntegerExpression) rhs).getValue() == 0) {
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.DIVISION_BY_ZERO);
				return null;
			}
		}
		
		//if lhstype is real
		if (lhsType instanceof IntegerType) {
			if (rhsType instanceof IntegerType) {
				type = EolFactory.eINSTANCE.createIntegerType();
				divideOperatorExpression.setResolvedType(type);
				context.setAssets(type, divideOperatorExpression);
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
			if (rhsType instanceof IntegerType) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) lhsType, EolPackage.eINSTANCE.getIntegerType())) {
					type = EolFactory.eINSTANCE.createIntegerType();
					divideOperatorExpression.setResolvedType(type);
					context.setAssets(type, divideOperatorExpression);
					return null;
				}
				else if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) lhsType, EolPackage.eINSTANCE.getRealType())) {
					return null;
				}
				else {
					LogBook.getInstance().addError(rhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, rhsType.getClass().getName()));
				}
			}
			else if (rhsType instanceof RealType) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) lhsType, EolPackage.eINSTANCE.getRealType())) {
					return null;
				}
				else {
					LogBook.getInstance().addError(rhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, rhsType.getClass().getName()));
				}
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_NUMERAL);
			}
			return null;
		}		
		

		if (rhsType instanceof IntegerType) {
			if (lhsType instanceof IntegerType) {
				type = EolFactory.eINSTANCE.createIntegerType();
				divideOperatorExpression.setResolvedType(type);
				context.setAssets(type, divideOperatorExpression);
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
