package org.eclipse.epsilon.haetae.effective.metamodel.extraction.impl;

import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.OperationDefinitionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class OperationDefinitionEME extends OperationDefinitionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(OperationDefinition operationDefinition,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
//		controller.visit(operationDefinition.getContextType(), context);
//		controller.visit(operationDefinition.getReturnType(), context);
//		Type contextType = operationDefinition.getContextType();
//		if (contextType instanceof ModelElementType) {
//			ModelElementType modelElementType = (ModelElementType) contextType;
//			EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;
//			EffectiveMetamodel em = leContext.getEffectiveMetamodel(modelElementType.getModelName());
//			if (em == null) {
//				em = leContext.addEffectiveMetamodel(modelElementType.getModelName(), "");
//			}
//			em.addToAllOfType(modelElementType.getElementName());
//		}
		controller.visitContents(operationDefinition, context);
		
//		Type returnType = operationDefinition.getReturnType();
//		if (returnType instanceof ModelElementType) {
//			ModelElementType modelElementType = (ModelElementType) returnType;
//			EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;
//			EffectiveMetamodel em = leContext.getEffectiveMetamodel(modelElementType.getModelName());
//			if (em == null) {
//				em = leContext.addEffectiveMetamodel(modelElementType.getModelName(), "");
//			}
//			em.addToAllOfKind(modelElementType.getElementName());
//		}
		return null;
	}
	
}
