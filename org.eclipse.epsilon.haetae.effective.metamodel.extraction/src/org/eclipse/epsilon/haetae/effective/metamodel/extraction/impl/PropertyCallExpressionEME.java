package org.eclipse.epsilon.haetae.effective.metamodel.extraction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.ComparisonOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.PropertyCallExpressionVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.extraction.context.EffectiveMetamodelExtractionContext;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveFeature;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveMetamodel;
import org.eclipse.epsilon.haetae.effective.metamodel.impl.EffectiveType;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class PropertyCallExpressionEME extends PropertyCallExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(
			PropertyCallExpression propertyCallExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		//visit target first
		controller.visit(propertyCallExpression.getTarget(), context);
		
		//get the name of the property
		String propertyString = propertyCallExpression.getProperty().getName();
		
		//get the target expression
		Expression target = propertyCallExpression.getTarget();
		
		//cast context
		EffectiveMetamodelExtractionContext leContext = (EffectiveMetamodelExtractionContext) context;
		
		//if target is name expression
		if (target instanceof NameExpression) {
			
			//get target
			NameExpression nameExpression = (NameExpression) target;
			
			//if target is "self"
			if (nameExpression.getName().equals("self")) {
				//get et
				EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(nameExpression.getResolvedContent());
				//if et is not null
				if (effectiveType != null) {
					//get imetamodel driver
					IMetamodelDriver iMetamodel = leContext.getiMetamodelManager().getIMetamodelDriverWithName(effectiveType.getEffectiveMetamodel().getName());
					//if imetamodel is not null
					if (iMetamodel != null) {
						//get package driver
						IPackageDriver iPackageDriver = iMetamodel.getIPackageDriver(effectiveType.getEffectiveMetamodel().getName());
						//if package driver found
						if (iPackageDriver != null) {
							
							//if meta class contains attributes
							if (iPackageDriver.containsAttribute(effectiveType.getName(), propertyString)) {
								effectiveType.addToAttributes(propertyString);
							}
							else if (iPackageDriver.containsReference(effectiveType.getName(), propertyString)) {
								effectiveType.addToReferences(propertyString);
								
								EffectiveType sur_type = null;
								
								//get the eType of the reference
								EClass eClass = (EClass) iPackageDriver.getReference(effectiveType.getName(), propertyString).getEType();
								
								//get the effective metamodel under question
								EffectiveMetamodel effectiveMetamodel = effectiveType.getEffectiveMetamodel();
								
								sur_type = effectiveMetamodel.addToTypes(eClass.getName());
								
								if (sur_type != null) {
									leContext.registerEffectiveTypeWithObject(propertyCallExpression, effectiveType);	
								}
							}
						}
					}
				}
			}
			
			//check if target type is model element type
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
					if (isKeyword(propertyString)) {
						
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
								
								//add the effective type
								EffectiveType effectiveType = effectiveMetamodel.addToAllOfKind(targetString);
								
								//register effectiveType
								leContext.registerEffectiveTypeWithObject(propertyCallExpression, effectiveType);
							}
						}
					}
				}
				
				//if resolved content is detected
				else {
					//if resolved content is a formal parameter expression (as an iterator in an FOLMethodCallExpression)
					if (nameExpression.getResolvedContent() instanceof FormalParameterExpression) {
						
						//get the resolved content
						FormalParameterExpression iterator = (FormalParameterExpression) nameExpression.getResolvedContent();
						
						//if the resolved contennt is the current iterator
						//if (leContext.getCurrentIterator().equals(iterator)) {}

						//get the effective type
						EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(iterator);
						
						if (effectiveType != null) {
							
							//if driver is not null
							if (iPackageDriver != null) {
								
								//prepare surtype
								EffectiveType sur_type = null;
								
								//prepare effective feature
								EffectiveFeature effectiveFeature = null;
								
								//if meta class contains attributes
								if (iPackageDriver.containsAttribute(elementString, propertyString)) {
									
									//add effective feature
									effectiveFeature = effectiveType.addToAttributes(propertyString);
								}
								
								//if driver contains reference, add reference
								else if (iPackageDriver.containsReference(elementString, propertyString)) {
									effectiveFeature = effectiveType.addToReferences(propertyString);
																		
									//get the eType of the reference
									EClass eClass = (EClass) iPackageDriver.getReference(elementString, propertyString).getEType();
									
									//get the effective metamodel under question
									EffectiveMetamodel effectiveMetamodel = effectiveType.getEffectiveMetamodel();
									
									sur_type = effectiveMetamodel.addToTypes(eClass.getName());	
								}
								
								leContext.putToMap(propertyCallExpression, effectiveFeature);
								if (sur_type != null) {
									leContext.registerEffectiveTypeWithObject(propertyCallExpression, sur_type);	
								}
							}
						}
					}
					else {
						
					}
					//this should happen when user creates dynamic EClasses, we are not interested in these situations
				}
			}
			//if the target is a collection
			else if (target.getResolvedType() instanceof CollectionType) {
				
				//get the collection type
				CollectionType collectionType = (CollectionType) target.getResolvedType();
				
				//if the content type of the collection is model element type
				if (collectionType.getContentType() != null && getInnermostType(collectionType) instanceof ModelElementType) {
					
					//get the model element type
					ModelElementType modelElementType = (ModelElementType) getInnermostType(collectionType);
					
					//get the model string
					String modelString = modelElementType.getModelName();
					
					//get the element string
					String elementString = modelElementType.getElementName();
					
					//get package driver
					IPackageDriver iPackageDriver = (IPackageDriver) modelElementType.getResolvedIPackage();
					
					//name expression has a resolved content and it is a variable declaration
					if (nameExpression.getResolvedContent() instanceof VariableDeclarationExpression) {
						
						//get the variable declaration
						VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression) nameExpression.getResolvedContent();
						
						//get the effective type if it the variable declaration is registered
						EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(variableDeclarationExpression);
						
						//if registered
						if (effectiveType != null) {
							//if driver is not null
							if (iPackageDriver != null) {
								
								EffectiveType sur_type = null;
								//if driver contains attribute, add attribute
								if (iPackageDriver.containsAttribute(elementString, propertyString)) {
									EffectiveFeature effectiveFeature = effectiveType.addToAttributes(propertyString);
								}
								
								//if driver contains reference, add reference
								else if (iPackageDriver.containsReference(elementString, propertyString)) {
									EffectiveFeature effectiveFeature = effectiveType.addToReferences(propertyString);
									
									//get the eType of the reference
									EClass eClass = (EClass) iPackageDriver.getReference(elementString, propertyString).getEType();
									
									//get the effective metamodel under question
									EffectiveMetamodel effectiveMetamodel = effectiveType.getEffectiveMetamodel();
									
									sur_type = effectiveMetamodel.addToTypes(eClass.getName());	
																		
								}
								if (sur_type != null) {
									leContext.registerEffectiveTypeWithObject(propertyCallExpression, sur_type);	
								}
							}
						}
					}
				}
			}
		}
		//if target is a property call
		else if (target instanceof PropertyCallExpression) {
			//get target
			PropertyCallExpression targetPropertyCallExpression = (PropertyCallExpression) target;
			
			//if target is collection type
			if (targetPropertyCallExpression.getResolvedType() instanceof CollectionType) {
				//get collection type
				CollectionType targetType = (CollectionType) targetPropertyCallExpression.getResolvedType();
				//if collection contains model elements
				if (getInnermostType(targetType) instanceof ModelElementType) {
					
					//get the model element type
					ModelElementType modelElementType = (ModelElementType) getInnermostType(targetType);
					
					//get the model string
					String modelString = modelElementType.getModelName();
					
					//get the element string
					String elementString = modelElementType.getElementName();
					
					IPackageDriver iPackageDriver = (IPackageDriver) modelElementType.getResolvedIPackage();
					
					if (iPackageDriver != null) {
						
						//get et by target
						EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(targetPropertyCallExpression);
						
						if (effectiveType != null) {
							EffectiveType sur_type = null;

							if (iPackageDriver.containsAttribute(elementString, propertyString)) {
								EffectiveFeature effectiveFeature = effectiveType.addToAttributes(propertyString);
							}
							else if (iPackageDriver.containsReference(elementString, propertyString)) {
								EffectiveFeature effectiveFeature = effectiveType.addToReferences(propertyString);
								
								//get the eType of the reference
								EClass eClass = (EClass) iPackageDriver.getReference(elementString, propertyString).getEType();
								
								//get the effective metamodel under question
								EffectiveMetamodel effectiveMetamodel = effectiveType.getEffectiveMetamodel();
								
								sur_type = effectiveMetamodel.addToTypes(eClass.getName());	
							}
							if (sur_type != null) {
								leContext.registerEffectiveTypeWithObject(propertyCallExpression, sur_type);	
							}
						}
					}
				}
			}
			else {
				if (targetPropertyCallExpression.getResolvedType() instanceof ModelElementType) {
					
					//get the model element type
					ModelElementType modelElementType = (ModelElementType) targetPropertyCallExpression.getResolvedType();
					
					//get the model string
					String modelString = modelElementType.getModelName();
					
					//get the element string
					String elementString = modelElementType.getElementName();
					
					IPackageDriver iPackageDriver = (IPackageDriver) modelElementType.getResolvedIPackage();
					
					if (iPackageDriver != null) {
						//get the effective type by target
						EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(targetPropertyCallExpression);
						
						if (effectiveType != null) {
							elementString = effectiveType.getName();

							EffectiveType sur_type = null;

							if (iPackageDriver.containsAttribute(elementString, propertyString)) {
								EffectiveFeature effectiveFeature = effectiveType.addToAttributes(propertyString);
							}
							else if (iPackageDriver.containsReference(elementString, propertyString)) {
								EffectiveFeature effectiveFeature = effectiveType.addToReferences(propertyString);
								
								//get the eType of the reference
								EClass eClass = (EClass) iPackageDriver.getReference(elementString, propertyString).getEType();
								
								//get the effective metamodel under question
								EffectiveMetamodel effectiveMetamodel = effectiveType.getEffectiveMetamodel();
								
								sur_type = effectiveMetamodel.addToTypes(eClass.getName());	
							}
							if (sur_type != null) {
								leContext.registerEffectiveTypeWithObject(propertyCallExpression, sur_type);	
							}
						}
					}
				}
			}
		}
		
		else if (target instanceof MethodCallExpression) {
			MethodCallExpression methodCallExpression = (MethodCallExpression) target;
			
			if (methodCallExpression.getResolvedType() instanceof CollectionType) {
				
				//get target type
				CollectionType targetType = (CollectionType) methodCallExpression.getResolvedType();
				
				if (getInnermostType(targetType) instanceof ModelElementType) {
					
					//get the model element type
					ModelElementType modelElementType = (ModelElementType) targetType.getContentType();
					
					//get the model string
					String modelString = modelElementType.getModelName();
					
					//get the element string
					String elementString = modelElementType.getElementName();
					
					IPackageDriver iPackageDriver = (IPackageDriver) modelElementType.getResolvedIPackage();
					
					if (iPackageDriver != null) {
						EffectiveType effectiveType = leContext.getEffectiveTypeFromRegistry(methodCallExpression);
						if (effectiveType != null) {
							EffectiveType sur_type = null;

							if (iPackageDriver.containsAttribute(elementString, propertyString)) {
								EffectiveFeature effectiveFeature = effectiveType.addToAttributes(propertyString);
							}
							else if (iPackageDriver.containsReference(elementString, propertyString)) {
								EffectiveFeature effectiveFeature = effectiveType.addToReferences(propertyString);
								
								//get the eType of the reference
								EClass eClass = (EClass) iPackageDriver.getReference(elementString, propertyString).getEType();
								
								//get the effective metamodel under question
								EffectiveMetamodel effectiveMetamodel = effectiveType.getEffectiveMetamodel();
								
								sur_type = effectiveMetamodel.addToTypes(eClass.getName());	
							}
							if (sur_type != null) {
								leContext.registerEffectiveTypeWithObject(propertyCallExpression, sur_type);	
							}
						}
					}
				}
			}
		}
		return null;
	}
	
	//these key words should be brought to attention
	public boolean isKeyword(String s)
	{
		if (s.equals("all") ||
				s.equals("allInstances")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//get inner most type
	public Type getInnermostType(Type t)
	{
		if (t instanceof CollectionType) {
			CollectionType collectionType = (CollectionType) t;
			Type contentType = collectionType.getContentType();
			while(contentType instanceof CollectionType)
			{
				contentType = ((CollectionType)contentType).getContentType();
			}
			return EcoreUtil.copy(contentType);
		}
		else {
			return EcoreUtil.copy(t);
		}
	}

}
