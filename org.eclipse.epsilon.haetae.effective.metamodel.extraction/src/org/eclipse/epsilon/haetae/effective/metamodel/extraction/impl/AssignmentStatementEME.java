package org.eclipse.epsilon.haetae.effective.metamodel.extraction.impl;

import org.eclipse.epsilon.eol.metamodel.AssignmentStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.AssignmentStatementVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.extraction.context.EffectiveMetamodelExtractionContext;



public class AssignmentStatementEME extends AssignmentStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(AssignmentStatement assignmentStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//cast context
		EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;
		
		//set current assignment statement
		leContext.setCurrentAssignmentStatement(assignmentStatement);
		
		//visit contents
		controller.visitContents(assignmentStatement, context);
		
		return null;
	}

}
