package org.eclipse.epsilon.haetae.effective.metamodel.extraction.impl;

import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.FOLMethodCallExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.extraction.context.EffectiveMetamodelExtractionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveMetamodel;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveType;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class FOLMethodCallExpressionEME extends FOLMethodCallExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(FOLMethodCallExpression fOLMethodCallExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//get the context
		EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;
		
		//visit the target first
		controller.visit(fOLMethodCallExpression.getTarget(), context);

		//get the target
		Expression target = fOLMethodCallExpression.getTarget();
		
		if (isKeyword(fOLMethodCallExpression.getMethod().getName())) {
			//if target is a name expression
			if (target instanceof NameExpression) {
				
				//get the name expression
				NameExpression nameExpression = (NameExpression) target;
				
				//if the target is a collection
				if (target.getResolvedType() instanceof CollectionType) {
					
					//name expression has a resolved content and it is a variable declaration
					if (nameExpression.getResolvedContent() instanceof VariableDeclarationExpression) {
						
						//get the variable declaration
						VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) nameExpression.getResolvedContent();
						
						//get the effective type if it the variable declaration is registered
						EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(variableDeclarationExpression);
						
						//if registered
						if (effectiveType != null) {
							leContext.registerEffectiveTypeWithObject(fOLMethodCallExpression.getIterator(), effectiveType);
							leContext.registerEffectiveTypeWithObject(fOLMethodCallExpression, effectiveType);
						}
					}
				}
			}
			
			else {
				EffectiveType et = leContext.getEffectiveTypeFromRegistry(target);
				if (et != null) {
					leContext.registerEffectiveTypeWithObject(fOLMethodCallExpression.getIterator(), et);
					leContext.registerEffectiveTypeWithObject(fOLMethodCallExpression, et);
				}
			}
			
			//get iterator
			FormalParameterExpression iterator = fOLMethodCallExpression.getIterator();
			
			//if iterator has a type and it is not any, this deals with the situation where a type is actually declared for an iterator in a FOL method call
			if (iterator.getResolvedType() != null && (!(iterator.getResolvedType() instanceof AnyType))) {
				//get iterator type
				Type iteratorType = iterator.getResolvedType();
				
				//if iterator type is model element type
				if (iteratorType instanceof ModelElementType) {
					
					//get the target type
					ModelElementType targetType = (ModelElementType) iteratorType;
					
					//get the model string
					String modelString = targetType.getModelName();
					
					//get the element string
					String elementString = targetType.getElementName();
					
					//get the driver
					IPackageDriver iPackageDriver = (IPackageDriver) targetType.getResolvedIPackage();
					
					EffectiveType et = leContext.getEffectiveTypeFromRegistry(iterator);
					if (et != null && !et.getName().equals(elementString)) {
						EffectiveMetamodel em = et.getEffectiveMetamodel();
						
						EffectiveType newET = em.addToTypes(elementString);
						leContext.registerEffectiveTypeWithObject(iterator, newET);
						leContext.registerEffectiveTypeWithObject(fOLMethodCallExpression, newET);
					}
				}
			}

			for(Expression condition: fOLMethodCallExpression.getConditions())
			{
				controller.visit(condition, context);
			}
		}
		return null;
	}
	
	public boolean isKeyword(String str)
	{
		if (str.equals("select") || 
				str.equals("collect") ||
				str.equals("reject") ||
				str.equals("selectOne") ||
				str.equals("sortBy")) {
			return true;
		}
		return false;
	}
	
}
