package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import org.eclipse.epsilon.eol.metamodel.AndOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.GreaterThanOrEqualToOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.ImpliesOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.LessThanOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.LessThanOrEqualToOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.OrOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.XorOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.BinaryOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class LogicalOperatorExpressionTypeResolver extends BinaryOperatorExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public boolean appliesTo(BinaryOperatorExpression binaryOperatorExpression,
			TypeResolutionContext context) {
		return binaryOperatorExpression instanceof AndOperatorExpression ||
				binaryOperatorExpression instanceof OrOperatorExpression ||
				binaryOperatorExpression instanceof ImpliesOperatorExpression ||
				binaryOperatorExpression instanceof XorOperatorExpression ||
				binaryOperatorExpression instanceof GreaterThanOperatorExpression ||
				binaryOperatorExpression instanceof GreaterThanOrEqualToOperatorExpression ||
				binaryOperatorExpression instanceof EqualsOperatorExpression ||
				binaryOperatorExpression instanceof NotEqualsOperatorExpression ||
				binaryOperatorExpression instanceof LessThanOperatorExpression ||
				binaryOperatorExpression instanceof LessThanOrEqualToOperatorExpression;				
	} 

	@Override
	public Object visit(BinaryOperatorExpression binaryOperatorExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {

		//visit lhs and rhs first
		controller.visit(binaryOperatorExpression.getLhs(), context);
		controller.visit(binaryOperatorExpression.getRhs(), context);
		
		//set the type first
		BooleanType type = EolFactory.eINSTANCE.createBooleanType(); 
		binaryOperatorExpression.setResolvedType(type);
		context.setAssets(type, binaryOperatorExpression);
		
		//get the lhs and rhs
		Expression lhs = binaryOperatorExpression.getLhs();
		Expression rhs = binaryOperatorExpression.getRhs();
		
		//get the lhsType and rhsType
		Type lhsType = lhs.getResolvedType();
		Type rhsType = rhs.getResolvedType();
		
		//get typeUtil
		TypeUtil typeUtil = TypeUtil.getInstance();
		
		//report if type is null
		if (lhsType == null) {
			LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			return null;
		}
		
		if (rhsType == null) {
			LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
			return null;
		}
		
		//if is logical operator
		if (isLogicalOperator(binaryOperatorExpression)) {
			
			if (lhsType instanceof BooleanType) {
				
			}
			else if (typeUtil.isInstanceofAnyType(lhsType)) {
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_BOOLEAN);
			}
			
			if (rhsType instanceof BooleanType) {
				
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_BOOLEAN);
			}
			
			return null;

		}

		
		//if is comparativeOperator
		else if (isComparativeOperator(binaryOperatorExpression)) {
			
			if (!(lhsType instanceof RealType) && (!typeUtil.isInstanceofAnyType(lhsType))) {
				LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_NUMERAL);
			}
			
			if (!(rhsType instanceof RealType) && (!typeUtil.isInstanceofAnyType(rhsType))) {
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_NUMERAL);
			}
			
			//if lhstype is real
			if (lhsType instanceof IntegerType) {
				if (rhsType instanceof IntegerType) {
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
		else if(isEqualityComparisonOperator(binaryOperatorExpression))
		{
			
			if (typeUtil.isInstanceofAnyType(lhsType)) {
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			}
			
			if (typeUtil.isInstanceofAnyType(rhsType)) {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			}
			return null;
		}
	
		
		return null;
	}	
	
	public boolean isLogicalOperator(BinaryOperatorExpression op)
	{
		boolean result = false;
		if (op instanceof AndOperatorExpression ||
				op instanceof OrOperatorExpression ||
				op instanceof ImpliesOperatorExpression ||
				op instanceof XorOperatorExpression) {
			result = true;
		}
		return result;
	}
	
	public boolean isComparativeOperator(BinaryOperatorExpression op)
	{
		boolean result = false;
		if (op instanceof GreaterThanOperatorExpression ||
				op instanceof GreaterThanOrEqualToOperatorExpression ||
				op instanceof LessThanOperatorExpression ||
				op instanceof LessThanOrEqualToOperatorExpression) {
			result = true;
		}
		return result;
	}
	
	public boolean isEqualityComparisonOperator(BinaryOperatorExpression op)
	{
		boolean result = false;
		if (op instanceof EqualsOperatorExpression ||
				op instanceof NotEqualsOperatorExpression) {
			result = true;
		}
		return result;
	}

}
