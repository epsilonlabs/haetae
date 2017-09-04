package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.AssignmentStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class AssignmentStatementTypeResolver extends AssignmentStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(AssignmentStatement assignmentStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		Expression lhs = assignmentStatement.getLhs(); //get lhs expression
		Expression rhs = assignmentStatement.getRhs(); //get rhs expression
		
		if(lhs instanceof PropertyCallExpression)
		{
			//visit rhs to resolve type
			controller.visit(rhs, context); 
			//visit lhs to resolve type
			controller.visit(lhs, context); 
			
			Type lhsType = lhs.getResolvedType(); //get the resolved type of the lhs 
			Type rhsType = rhs.getResolvedType(); //get the resolved type of the rhs
			
			if (lhsType == null) {
				//this should not happen as all expressions should have types
				LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}
			
			if (rhsType == null) {
				//this should not happen as all expressions should have types
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}
			
			//if lhs is of type Any, allow 
			if (TypeUtil.getInstance().isInstanceofAnyType(lhsType)) {
				
			}
			else {
				//if rhs is of any type
				if (TypeUtil.getInstance().isInstanceofAnyType(rhsType)) {
					
				}
				else if (lhsType instanceof CollectionType && rhsType instanceof CollectionType) {
					Type lhsContentType = getInnermostType((CollectionType) lhsType);
					Type rhsContentType = getInnermostType((CollectionType) rhsType);
					if (lhsContentType != null && rhsContentType != null) {
						if (!TypeUtil.getInstance().isTypeEqualOrGeneric(rhsContentType, lhsContentType)) {
							LogBook.getInstance().addError(rhs, IMessage_TypeResolution.TYPE_MISMATCH);
						}
					}
					else {
						LogBook.getInstance().addError(rhs, IMessage_TypeResolution.TYPE_MISMATCH);
					}
				}
				else if (!context.getTypeUtil().isTypeEqualOrGeneric(rhsType, lhsType)) { //if the types are not related at all
						LogBook.getInstance().addError(rhs, IMessage_TypeResolution.TYPE_MISMATCH);
				}
			}
			return null;
		}
		else if (lhs instanceof NameExpression) {
			
			//visit rhs to resolve type
			controller.visit(rhs, context); 
			//visit lhs to resolve type
			controller.visit(lhs, context); 
			
			Type lhsType = lhs.getResolvedType(); //get the resolved type of the lhs 
			Type rhsType = rhs.getResolvedType(); //get the resolved type of the rhs
			
			if (lhsType == null) {
				//this should not happen as all expressions should have types
				LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}
			
			if (rhsType == null) {
				//this should not happen as all expressions should have types
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}
			
			if (((NameExpression) lhs).getResolvedContent() instanceof VariableDeclarationExpression) {
				VariableDeclarationExpression vde = (VariableDeclarationExpression) ((NameExpression) lhs).getResolvedContent();
				if (TypeUtil.getInstance().isInstanceofAnyType(vde.getResolvedType())) {
					context.getTypeRegistry().assignType(vde, rhsType);
					return null;
				}
			}	
			
			//if lhs is of type Any, allow 
			if (TypeUtil.getInstance().isInstanceofAnyType(lhsType)) {
				if (TypeUtil.getInstance().isInstanceofAnyType(rhsType)) {
					
				}
				else {
				}
			}
			else {
				
				//if rhs is of any type
				if (TypeUtil.getInstance().isInstanceofAnyType(rhsType)) {
					
				}
				else if (!context.getTypeUtil().isTypeEqualOrGeneric(rhsType, lhsType)) { //if the types are not related at all
						LogBook.getInstance().addError(rhs, IMessage_TypeResolution.TYPE_MISMATCH);
				}
			}
			
			if (((NameExpression) lhs).getResolvedContent() instanceof VariableDeclarationExpression) {
				VariableDeclarationExpression vde = (VariableDeclarationExpression) ((NameExpression) lhs).getResolvedContent();
				if (TypeUtil.getInstance().isInstanceofAnyType(vde.getResolvedType())) {
					context.getTypeRegistry().assignType(vde, rhsType);
				}
			}	
			return null;
		}
		else if (lhs instanceof VariableDeclarationExpression) {
			//visit rhs to resolve type
			controller.visit(rhs, context); 
			//visit lhs to resolve type
			controller.visit(lhs, context); 
			
			Type lhsType = lhs.getResolvedType(); //get the resolved type of the lhs 
			Type rhsType = rhs.getResolvedType(); //get the resolved type of the rhs
			
			if (lhsType == null) {
				//this should not happen as all expressions should have types
				LogBook.getInstance().addError(lhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}
			
			if (rhsType == null) {
				//this should not happen as all expressions should have types
				LogBook.getInstance().addError(rhs, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				return null;
			}
			if (TypeUtil.getInstance().isInstanceofAnyType(rhsType)) {
				
			}
			else {
				context.getTypeRegistry().assignType((VariableDeclarationExpression) lhs, rhsType);
			}
			return null;
		}
		else {
			LogBook.getInstance().addError(lhs, IMessage_TypeResolution.INVALID_ASSIGNMENT_TARGET);
		}
		return null;
	}
	
	public Type getInnermostType(CollectionType collectionType)
	{
		AnyType contentType = (AnyType) collectionType.getContentType();
		while (contentType != null && !TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
			if (contentType instanceof CollectionType) {
				CollectionType _contentType = (CollectionType) contentType;
				contentType = (AnyType) _contentType.getContentType();
			}
			else {
				return contentType;
			}
		}
		return contentType;
	}
}
