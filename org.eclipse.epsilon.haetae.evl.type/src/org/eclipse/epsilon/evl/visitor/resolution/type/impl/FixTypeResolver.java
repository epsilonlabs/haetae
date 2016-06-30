package org.eclipse.epsilon.evl.visitor.resolution.type.impl;

import org.eclipse.epsilon.eol.metamodel.ReturnStatement;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.metamodel.visitor.EvlVisitorController;
import org.eclipse.epsilon.evl.metamodel.visitor.FixVisitor;

public class FixTypeResolver extends FixVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(Fix fix, TypeResolutionContext context,
			EvlVisitorController<TypeResolutionContext, Object> controller) {
		
		if (fix.getTitle()!=null) {
			controller.visit(fix.getTitle(), context);
		}
		
		if (fix.getDo()!=null) {
			controller.visit(fix.getDo(), context);
			for(Statement stmt: fix.getDo().getStatements())
			{
				if (stmt instanceof ReturnStatement) {
					LogBook.getInstance().addError(stmt, IMessage_TypeResolution.RETURN_STMT_NOT_ALLOWED);
				}
			}
		}
		return null;
	}

}
