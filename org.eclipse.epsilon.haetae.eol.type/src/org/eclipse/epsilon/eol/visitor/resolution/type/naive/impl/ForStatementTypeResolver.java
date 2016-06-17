package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ForStatement;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ForStatementVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class ForStatementTypeResolver extends ForStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ForStatement forStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {

		context.getTypeRegistry().pushScope(forStatement);//////////
		
		
		controller.visit(forStatement.getIterator(), context);
		controller.visit(forStatement.getCondition(), context);
		
		FormalParameterExpression iterator = forStatement.getIterator();
		Expression condition = forStatement.getCondition();
		
		//if condition is collection type
		if (condition.getResolvedType() instanceof CollectionType) {
			CollectionType conditionType = (CollectionType) condition.getResolvedType();
			Type contentType = null;
			//if content typs is not null
			if (conditionType.getContentType() != null) {
				//copy content type
				contentType = EcoreUtil.copy(conditionType.getContentType());
				//if iterator does not have a type, assign type and report error
				
				AnyType iteratorType = (AnyType) iterator.getResolvedType();
				
				if (iteratorType == null) {
					LogBook.getInstance().addError(forStatement.getIterator(), IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
					iterator.setResolvedType(contentType);
					context.setAssets(contentType, iterator);	
				}
				
				if (TypeUtil.getInstance().isInstanceofAnyType(iteratorType)) {
					iteratorType = (AnyType) EcoreUtil.copy(contentType);	
					context.getTypeRegistry().assignType(iterator, contentType);
				}
				else {
					if (TypeUtil.getInstance().isTypeEqualOrGeneric(iteratorType, contentType)) {
						
					}
					else {
						LogBook.getInstance().addError(forStatement.getIterator(), IMessage_TypeResolution.POTENTIAL_TYPE_MISMATCH);
						iterator.setResolvedType(contentType);
						context.setAssets(contentType, iterator);	
					}
				}
			}
			else {
				//if conditon does not have a content type, report error
				LogBook.getInstance().addError(forStatement.getContainer(), IMessage_TypeResolution.COLLECTION_EXPRESSION_NO_CONTENT_TYPE);
				iterator.setResolvedType(EolFactory.eINSTANCE.createAnyType());
			}
		}
		else {
			//if condition is AnyType, check dynamic type, report error if necessary
			if (TypeUtil.getInstance().isInstanceofAnyType(condition.getResolvedType())) {
				LogBook.getInstance().addWarning(condition, IMessage_TypeResolution.EXPRESSION_IS_ANYTYPE);
			}
			//LogBook.getInstance().addError(condition, IMessage_TypeResolution.FOR_STMT_CONDITION_NOT_COLLECTION_TYPE);
			iterator.setResolvedType(EolFactory.eINSTANCE.createAnyType());
		}
		
		
		controller.visit(forStatement.getBody(), context);
		
		context.getTypeRegistry().popScope();//////////
		

		return null;
	}
}
