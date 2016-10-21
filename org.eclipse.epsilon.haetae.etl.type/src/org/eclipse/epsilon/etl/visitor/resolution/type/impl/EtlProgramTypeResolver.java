package org.eclipse.epsilon.etl.visitor.resolution.type.impl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.etl.metamodel.ETLModule;
import org.eclipse.epsilon.etl.metamodel.NamedBlock;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.metamodel.visitor.ETLModuleVisitor;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.EtlTypeResolutionContext;
import org.eclipse.epsilon.etl.visitor.resolution.type.context.TraceUnitContainer;

public class EtlProgramTypeResolver extends ETLModuleVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(ETLModule etlProgram, TypeResolutionContext context,
			EtlVisitorController<TypeResolutionContext, Object> controller) {
		for(Import _import: etlProgram.getImports())
		{
			controller.visit(_import, context);
		}
		
		for(ModelDeclarationStatement mds: etlProgram.getModelDeclarations()) //process each model declaration statement
		{
			controller.visit(mds, context);
		}
		
		context.generateKeyWordsFromModelDeclarations();

		
		for(OperationDefinition od: etlProgram.getOperations()) //process each operation
		{
			
			if (od.getContextType() != null) {
				controller.visit(od.getContextType(), context); //resolve context type	
			}
			controller.visit(od.getReturnType(), context); //resolve return type
			if (od.getSelf() != null) {
				od.getSelf().setResolvedType(EcoreUtil.copy(od.getContextType()));	
				od.getSelf().getName().setResolvedType(EcoreUtil.copy(od.getContextType()));
			}
			Type contextType = od.getContextType(); //get the contextType
			ArrayList<Type> argTypes = new ArrayList<Type>(); //prepare argTypes
			
			for(VariableDeclarationExpression v: od.getParameters()) //process each arg type
			{
				controller.visit(v, context);
				argTypes.add(v.getResolvedType()); //resolve and collect argument types
			}
			if (!OperationDefinitionManager.getInstance().containsOperation(od.getName().getName(), contextType, argTypes)) { //check if operation with the same name and arg list exists
				context.getOperationDefinitionManager().putOperationDefinition(od);
//				controller.visit(od.getBody(), context);
			}
			else {
				LogBook.getInstance().addError(od, "OperationDefinition with same signature already defined");
				///handle signature existence
			}
		}
		//the following implementation is NOT stupid.
		for(OperationDefinition od: etlProgram.getOperations())
		{
			controller.visit(od, context);
		}
		
		for(NamedBlock pb: etlProgram.getPreBlocks())
		{
			controller.visit(pb, context);
		}
		
		for(TransformationRule tr: etlProgram.getTransformationRules())
		{
			//create a new container
			TraceUnitContainer container = new TraceUnitContainer(tr);
			//get the source of the transformation rule
			FormalParameterExpression source = tr.getSource();
			//if source is not null
			if (source != null) {
				//visit the source first
				controller.visit(source, context);
				//if the resolved type is an instance of model element type (which it fucking should be)
				if (source.getResolvedType() instanceof ModelElementType) {
					//get the eClass
					EClass eClass = getEcoreType(source);
					if (eClass != null) {
						//set the source
						container.setSource(eClass);
					}
					else {
						LogBook.getInstance().addError(source, "type is not properly resolved");
					}
				}
			}
			//iterate through targets
			for(FormalParameterExpression target: tr.getTargets())
			{
				//if target is not null
				if(target != null)
				{
					//visit the target first
					controller.visit(target, context);
					
					//if the resolved type is model element type
					if (target.getResolvedType() instanceof ModelElementType) {
						//get the ecore type
						EClass eClass = getEcoreType(target);
						//add to targets
						if (eClass != null) {
							container.addTarget(eClass);
						}
						else {
							LogBook.getInstance().addError(target, "type is not properly resolved");
						}
					}
				}
			}
			
			//cast to etl type resolution context
			EtlTypeResolutionContext leContext = (EtlTypeResolutionContext) context;
			
			//if source is model element type
			if (source.getResolvedType() instanceof ModelElementType) {
				leContext.addTraceUnitContainer(container);
			}
		}
		
		EtlTypeResolutionContext leContext = (EtlTypeResolutionContext) context;
		leContext.printTraceUnitContainers();
		
		for(TransformationRule tr: etlProgram.getTransformationRules())
		{
			controller.visit(tr, context);
		}
		
		//deals with equivalent()/equivalents() and special assignments outside transformation rules
		leContext.setCurrentRule(null);
		
		for(NamedBlock pb: etlProgram.getPostBlocks())
		{
			controller.visit(pb, context);
		}
		
		//leContext.supressErrors();
		
		return null;
	}
	
	public EClass getEcoreType(FormalParameterExpression fpe)
	{
		ModelElementType met = (ModelElementType) fpe.getResolvedType();
		if (met != null) {
			EClass eClass = (EClass) met.getModelElementType();
			return eClass;
		}
		else {
			return null;
		}
	}


}
