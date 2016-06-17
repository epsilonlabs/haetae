package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.ReturnStatement;
import org.eclipse.epsilon.eol.metamodel.TransactionStatement;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ReturnStatementVisitor;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class ReturnStatementTypeResolver extends ReturnStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ReturnStatement returnStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		controller.visit(returnStatement.getExpression(), context);
		EOLElement rawContainer = returnStatement.getContainer(); //get the container
		while((!(rawContainer instanceof OperationDefinition) && !(rawContainer instanceof TransactionStatement))&& rawContainer != null) //get all the way to OperationDefinition
		{
			rawContainer = rawContainer.getContainer();
		}
		
		if (rawContainer == null) {
			LogBook.getInstance().addError(returnStatement, IMessage_TypeResolution.RETURN_STATEMENT_NOT_IN_OP);
		}
		
		else {

			OperationDefinition container = (OperationDefinition) rawContainer; //cast 
			Type returnType = container.getReturnType(); //get return type of the operation
			
			if (returnType == null) {
				
			}
			else {
				Type returnedType = returnStatement.getExpression().getResolvedType();
				if (returnedType == null) {
					LogBook.getInstance().addError(returnStatement.getExpression(), IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				}
				else {
					OperationDefinition op = (OperationDefinition) rawContainer;

//					if (TypeUtil.getInstance().isInstanceofAnyType(op.getReturnType())) {
//						op.setReturnType(EcoreUtil.copy(returnedType));
//					}
//					else {
						if (!TypeUtil.getInstance().isTypeEqualOrGeneric(returnedType, op.getReturnType())) {
							LogBook.getInstance().addError(returnStatement.getExpression(), IMessage_TypeResolution.TYPE_MISMATCH);
						}
//					}
				}
			}
		}
		return null;
	}
	
}
