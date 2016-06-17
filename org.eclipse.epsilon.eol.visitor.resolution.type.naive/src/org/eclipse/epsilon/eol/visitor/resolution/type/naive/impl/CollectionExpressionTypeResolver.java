package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.BooleanType;
import org.eclipse.epsilon.eol.metamodel.CollectionExpression;
import org.eclipse.epsilon.eol.metamodel.CollectionInitialisationExpression;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionList;
import org.eclipse.epsilon.eol.metamodel.ExpressionRange;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.RealType;
import org.eclipse.epsilon.eol.metamodel.StringType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.CollectionExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class CollectionExpressionTypeResolver extends CollectionExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(CollectionExpression collectionExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//get the init value
		CollectionInitialisationExpression initValue = collectionExpression.getParameterList();
		
		//if there's no initValue, content type should be Any
		
		CollectionType type = (CollectionType) collectionExpression.getResolvedType();
		Type contentType = EolFactory.eINSTANCE.createAnyType();
		type.setContentType(contentType);
		context.setAssets(contentType, type);
		collectionExpression.setResolvedType(type);
		context.setAssets(type, collectionExpression);
		
		if (initValue == null) {
			return null;
		}
		
		TypeUtil typeUtil = TypeUtil.getInstance();
		
		//if the init value is expRange
		if (initValue instanceof ExpressionRange) {
			
			contentType = EolFactory.eINSTANCE.createIntegerType();
			type.setContentType(contentType);
			context.setAssets(contentType, type);
			collectionExpression.setResolvedType(type);
			context.setAssets(type, collectionExpression);
			
			
			ExpressionRange range = (ExpressionRange) initValue;
			Expression start = range.getStart();
			Expression end = range.getEnd();
			
			controller.visit(start, context);
			controller.visit(end, context);
			
			Type startType = start.getResolvedType();
			Type endType = end.getResolvedType();
			
			if (startType == null) {
				LogBook.getInstance().addError(start, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}

			if(endType == null){
				LogBook.getInstance().addError(end, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}
			
			if (startType instanceof IntegerType) {
				
			}
			else if (typeUtil.isInstanceofAnyType(startType)) {
				if (!TypeInferenceManager.getInstance().containsDynamicType((AnyType) startType, EolPackage.eINSTANCE.getIntegerType())) {
					LogBook.getInstance().addError(start, IMessage_TypeResolution.EXPRESSION_MUST_BE_INTEGER);
				}
			}
			else {
				LogBook.getInstance().addError(start, IMessage_TypeResolution.EXPRESSION_MUST_BE_INTEGER);
			}
			
			if (endType instanceof IntegerType) {
				
			}
			else if (typeUtil.isInstanceofAnyType(endType)) {
				if (!TypeInferenceManager.getInstance().containsDynamicType((AnyType) endType, EolPackage.eINSTANCE.getIntegerType())) {
					LogBook.getInstance().addError(end, IMessage_TypeResolution.EXPRESSION_MUST_BE_INTEGER);
				}
			}
			else {
				LogBook.getInstance().addError(end, IMessage_TypeResolution.EXPRESSION_MUST_BE_INTEGER);
			}
		}
		//if initvalue is exprlist
		if (initValue instanceof ExpressionList) {
			
			ExpressionList list = (ExpressionList) initValue;
			contentType = null;
			
			if (allBoolean(list, controller, context)) {
				contentType = EcoreUtil.copy(EolFactory.eINSTANCE.createBooleanType());
				type.setContentType(contentType);
				context.setAssets(contentType, type);
				collectionExpression.setResolvedType(type);
				context.setAssets(type, collectionExpression);
				return null;
			}
			else if (allInteger(list, controller, context)) {
				contentType = EcoreUtil.copy(EolFactory.eINSTANCE.createIntegerType());
				type.setContentType(contentType);
				context.setAssets(contentType, type);
				collectionExpression.setResolvedType(type);
				context.setAssets(type, collectionExpression);
				return null;
			}
			else if (allReal(list, controller, context)) {
				contentType = EcoreUtil.copy(EolFactory.eINSTANCE.createRealType());
				type.setContentType(contentType);
				context.setAssets(contentType, type);
				collectionExpression.setResolvedType(type);
				context.setAssets(type, collectionExpression);
				return null;
			}
			else if (allString(list, controller, context)) {
				contentType = EcoreUtil.copy(EolFactory.eINSTANCE.createStringType());
				type.setContentType(contentType);
				context.setAssets(contentType, type);
				collectionExpression.setResolvedType(type);
				context.setAssets(type, collectionExpression);
				return null;
			}
			else {
				contentType = EolFactory.eINSTANCE.createAnyType();
				context.setAssets(contentType, type);
				collectionExpression.setResolvedType(type);
				context.setAssets(type, collectionExpression);
				return null;
			}
		}
		
		return null;
	}
	
	public boolean allBoolean (ExpressionList list, EolVisitorController<TypeResolutionContext, Object> controller, TypeResolutionContext context)
	{
		boolean result = true;
		for(Expression expr: list.getExpressions())
		{
			controller.visit(expr, context);
			Type type = expr.getResolvedType();
			if (type instanceof BooleanType) {
				continue;
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(type)) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) type, EolPackage.eINSTANCE.getBooleanType())) {
					continue;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return result;
	}
	
	public boolean allInteger(ExpressionList list, EolVisitorController<TypeResolutionContext, Object> controller, TypeResolutionContext context)
	{
		for(Expression expr: list.getExpressions())
		{
			controller.visit(expr, context);
			Type t = expr.getResolvedType();
			if (t instanceof IntegerType) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public boolean allReal(ExpressionList list, EolVisitorController<TypeResolutionContext, Object> controller, TypeResolutionContext context)
	{
		for(Expression expr: list.getExpressions())
		{
			controller.visit(expr, context);
			Type t = expr.getResolvedType();

			if (t instanceof RealType) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public boolean allString(ExpressionList list, EolVisitorController<TypeResolutionContext, Object> controller, TypeResolutionContext context)
	{
		for(Expression expr: list.getExpressions())
		{
			controller.visit(expr, context);
			Type t = expr.getResolvedType();

			if (t instanceof StringType) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
