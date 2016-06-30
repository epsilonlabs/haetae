package org.eclipse.epsilon.haetae.effective.metamodel.extraction.impl;

import org.eclipse.epsilon.eol.metamodel.ForStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.ForStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.extraction.context.EffectiveMetamodelExtractionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveType;

public class ForStatementEME extends ForStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ForStatement forStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;
		leContext.setCurrentAssignmentStatement(null);
		controller.visit(forStatement.getIterator(), context);
		controller.visit(forStatement.getCondition(), context);
		
		EffectiveType et = leContext.getEffectiveTypeFromRegistry(forStatement.getCondition());
		if (et != null) {
			leContext.registerEffectiveType(forStatement.getIterator(), et);
		}
		
		controller.visit(forStatement.getBody(), leContext);
		return null;
	}

}
