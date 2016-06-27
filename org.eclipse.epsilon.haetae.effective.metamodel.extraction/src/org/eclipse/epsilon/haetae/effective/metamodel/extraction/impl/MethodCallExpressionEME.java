package org.eclipse.epsilon.haetae.effective.metamodel.extraction.impl;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.MethodCallExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.extraction.context.EffectiveMetamodelExtractionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveMetamodel;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveType;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class MethodCallExpressionEME extends MethodCallExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(MethodCallExpression methodCallExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//visit the contents first
		if (methodCallExpression.getTarget() != null) {
			controller.visit(methodCallExpression.getTarget(), context);
		}
		
		//get the method name
		String methodString = methodCallExpression.getMethod().getName();
		
		//get the target
		Expression target = methodCallExpression.getTarget();
		
		//get the context
		EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;
		
		//if target is name expression
		if (target instanceof NameExpression) {
			
			//get the target
			NameExpression nameExpression = (NameExpression) target;
			
			//if resolved type is model element type;
			if (target.getResolvedType() instanceof ModelElementType) {
				
				//get the target type
				ModelElementType targetType = (ModelElementType) target.getResolvedType();
				
				//get the model string
				String modelString = targetType.getModelName();
				
				//get the element string
				String elementString = targetType.getElementName();
				
				IPackageDriver iPackageDriver = (IPackageDriver) targetType.getResolvedIPackage();
				
				//if there is no resolved content, it should be a Model Element name
				if (nameExpression.getResolvedContent() == null) {
					
					//if property is keyword(all or allInstances)
					if (isKeyword(methodString)) {
						
						//get the target name
						String targetString = nameExpression.getName();
						
						//if target contains "!" get the type name only
						if (targetString.contains("!")) {
							targetString = targetString.substring(targetString.indexOf("!")+1, targetString.length());
						}
						
						//if driver is not null
						if (iPackageDriver != null) {
							
							//if driver contains the type
							if (iPackageDriver.containsMetaElement(elementString)) {
								
								//add the effective metamodel
								EffectiveMetamodel effectiveMetamodel = leContext.addEffectiveMetamodel(modelString, iPackageDriver.getPackageNSURI());
								
								EffectiveType effectiveType = null;
								
								if (methodString.equals("allOfType")) {
									//add the effective type
									effectiveType = effectiveMetamodel.addToAllOfType(targetString);
								}
								else {
									//add the effective type
									effectiveType = effectiveMetamodel.addToAllOfKind(targetString);
								}
								
								//register effectiveType
								leContext.registerEffectiveTypeWithObject(nameExpression, effectiveType);
								leContext.registerEffectiveTypeWithObject(methodCallExpression, effectiveType);
							}
						}
					}
				}
				else {
					//if expression has an effective type associated to it
					if (leContext.getEffectiveTypeFromRegistry(nameExpression.getResolvedContent()) != null) {
						EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(nameExpression.getResolvedContent());
						//type info should be propagated for certian method calls
						if (shouldPropagateType(methodString)) {
							leContext.registerEffectiveTypeWithObject(nameExpression, effectiveType);
							leContext.registerEffectiveTypeWithObject(methodCallExpression, effectiveType);
						}
					}
					//this should happen when user creates dynamic EClasses, we are not interested in these situations
				}
			}
		}
		else {
			//check if effective type should be propagated
			EffectiveType et = leContext.getEffectiveTypeFromRegistry(target);
			if (et != null && shouldPropagateType(methodString)) {
				leContext.registerEffectiveTypeWithObject(methodCallExpression, et);
			}
		}
		
		for(Expression arg: methodCallExpression.getArguments())
		{
			controller.visit(arg, context);
		}
		
		//get resolved method
		Object obj = methodCallExpression.getMethod().getResolvedContent();
		if (obj instanceof OperationDefinition) {
			//get operation definition
			OperationDefinition operationDefinition = (OperationDefinition) obj;
			//get et
			EffectiveType et = leContext.getEffectiveTypeFromRegistry(target);
			
			//if et is null
			if (et == null) {
				//if target is name expression
				if (target instanceof NameExpression) {
					NameExpression name = (NameExpression) target;
					//if resolved content is not null
					if (name.getResolvedContent() != null) {
						//get resolved content
						EOLElement resolvedContent = (EOLElement) name.getResolvedContent();
						//get effective type of the content
						et = leContext.getEffectiveTypeFromRegistry(resolvedContent);
					}
				}
			}
			
			//if et is not null
			if (et != null) {
				//check if the call is a recursive call to the operation definition
				if (!isRecursive(methodCallExpression, operationDefinition)) {
					//register effective type
					leContext.registerEffectiveType(operationDefinition.getSelf(), et);
					controller.visit(operationDefinition, leContext);
				}
			}
		}
		
		return null;
	}

	//check if a method call is a recursive call to the operation 
	public boolean isRecursive(MethodCallExpression methodCallExpression, OperationDefinition operationDefinition)
	{
		EOLElement container = methodCallExpression.getContainer();
		while(container != null)
		{
			if (container.equals(operationDefinition)) {
				return true;
			}
			container = container.getContainer();
		}
		return false;
	}
	
	//key words like this should be brought to attention
	public boolean isKeyword(String s)
	{
		if (s.equals("all") ||
				s.equals("allOfType") ||
				s.equals("allOfKind") ||
				s.equals("allInstances")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//effective type should be propagated to these method calls
	public boolean shouldPropagateType(String s)
	{
		if (s.equals("asBag") ||
				s.equals("asSet") ||
				s.equals("asSequence") ||
				s.equals("asOrderedSet") ||
				s.equals("println()") ||
				s.equals("print") ||
				s.equals("errln") ||
				s.equals("err") ||
				s.equals("add") ||
				s.equals("addAll") ||
				s.equals("clone") ||
				s.equals("flatten") ||
				s.equals("including") ||
				s.equals("includingAll")) {
			return true;
		}
		else {
			return false;
		}
	}
}
