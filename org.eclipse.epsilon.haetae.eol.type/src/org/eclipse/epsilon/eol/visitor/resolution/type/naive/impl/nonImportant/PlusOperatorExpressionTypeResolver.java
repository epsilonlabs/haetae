package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.PlusOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.metamodel.SummablePrimitiveType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.PlusOperatorExpressionVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;
 
public class PlusOperatorExpressionTypeResolver extends PlusOperatorExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(PlusOperatorExpression plusOperatorExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		controller.visitContents(plusOperatorExpression, context);
		
		//get lhs and rhs
		Expression lhs = plusOperatorExpression.getLhs();
		Expression rhs = plusOperatorExpression.getRhs();

		//get lhstype and rhstype
		Type lhsType = lhs.getResolvedType();
		Type rhsType = rhs.getResolvedType();
		
		//create Real for return type first
		Type type = EolFactory.eINSTANCE.createRealType();
		plusOperatorExpression.setResolvedType(type);
		context.setAssets(type, plusOperatorExpression);
		
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
		
		if (lhsType instanceof CollectionType && rhsType instanceof CollectionType) {
			type = EcoreUtil.copy(lhsType);
			plusOperatorExpression.setResolvedType(type);
			context.setAssets(type, plusOperatorExpression);
			return null;
		}
		
		//get type util
		TypeUtil typeUtil = TypeUtil.getInstance();
		
		if (!(lhsType instanceof SummablePrimitiveType) && (!typeUtil.isInstanceofAnyType(lhsType))) {
			LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_SUMMABLE);
		}
		
		if (!(rhsType instanceof SummablePrimitiveType) && (!typeUtil.isInstanceofAnyType(rhsType))) {
			LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_SUMMABLE);
		}
		
		//if lhstype is real
		if (lhsType instanceof IntegerType) {
			if (rhsType instanceof IntegerType) {
				type = EolFactory.eINSTANCE.createIntegerType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (rhsType instanceof RealType) {
				return null;
			}
			else if (rhsType instanceof StringType) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, lhsType.getClass().getName()));
				return null;
			}
		}
		
		if (lhsType instanceof RealType) {
			if (rhsType instanceof RealType) {
				return null;
			}
			else if (rhsType instanceof StringType) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, lhsType.getClass().getName()));
			}
			return null;
		}
		
		if (lhsType instanceof StringType) {
			if (rhsType instanceof SummablePrimitiveType) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(rhsType)) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addWarning(rhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, lhsType.getClass().getName()));
			}
			return null;
		}
		
		
		if (typeUtil.isInstanceofAnyType(lhsType)) {
			type = EolFactory.eINSTANCE.createStringType();
			plusOperatorExpression.setResolvedType(type);
			context.setAssets(type, plusOperatorExpression);
			LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			return null;
		}
		
		if (rhsType instanceof IntegerType) {
			if (lhsType instanceof IntegerType) {
				type = EolFactory.eINSTANCE.createIntegerType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (lhsType instanceof RealType) {
				return null;
			}
			else if (lhsType instanceof StringType) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(lhsType)) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, rhsType.getClass().getName()));
			}
			return null;
		}
		
		if (rhsType instanceof RealType) {
			if (lhsType instanceof RealType) {
				return null;
			}
			else if (lhsType instanceof StringType) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(lhsType)) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			else {
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.EXPECTED_TYPE, rhsType.getClass().getName()));
			}
			return null;
		}
		
		if (rhsType instanceof StringType) {
			if (lhsType instanceof SummablePrimitiveType) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				return null;
			}
			else if (typeUtil.isInstanceofAnyType(lhsType)) {
				type = EolFactory.eINSTANCE.createStringType();
				plusOperatorExpression.setResolvedType(type);
				context.setAssets(type, plusOperatorExpression);
				LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
				return null;
			}
			return null;
		}
		
		if (typeUtil.isInstanceofAnyType(rhsType)) {
			type = EolFactory.eINSTANCE.createStringType();
			plusOperatorExpression.setResolvedType(type);
			context.setAssets(type, plusOperatorExpression);
			LogBook.getInstance().addWarning(lhs, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			return null;
		}
		
		return null;
	}
}
