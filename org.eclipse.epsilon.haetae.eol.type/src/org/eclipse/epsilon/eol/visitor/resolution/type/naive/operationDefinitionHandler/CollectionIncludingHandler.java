package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class CollectionIncludingHandler extends CollectionOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("including") && argTypes.size() == 1 ) {
			if (contextType instanceof CollectionType) {
				return true;
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getCollectionType())) {
					return true;
				}
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) {
		
		//get the manager
		StandardLibraryOperationDefinitionContainer manager = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		//get the result
		OperationDefinition result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		
		//if result is not null
		if (result != null) {
			
			//register the result as it has been handled
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			//get the target
			Expression target = featureCallExpression.getTarget();
			
			//if target is null, report and return
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				return null;
			}
			else {
				//get the target type copy
				Type targetType = EcoreUtil.copy(target.getResolvedType());
				
				//if target type is null, report and return (this will not happend)
				if (targetType == null) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
					result.setReturnType(targetType);
					return result;
				}
				//if target type is collection type
				if (targetType instanceof CollectionType) {
					
					//get the content type and arg type
					Type contentType = ((CollectionType)targetType).getContentType();
					Type argType = argTypes.get(0);
					
					//if content type is any
					if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
						//get the copy of the content type
						AnyType ct = (AnyType) contentType;
						
						if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
							ct.getDynamicTypes().addAll(TypeUtil.getInstance().getAllDynamicTypes((AnyType) argType));
							result.setReturnType(targetType);
							return result;
						}
						else {
							ct.getDynamicTypes().add(EcoreUtil.copy(argType));
							result.setReturnType(targetType);
							return result;
						}
					}
					//if content type is not any, compare content type with the arg type and report if necessary
					else {
						if(!TypeUtil.getInstance().isTypeEqualOrGeneric(argType, contentType))
						{
							LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.POTENTIAL_TYPE_MISMATCH, contentType.getClass().getSimpleName()));
							result.setReturnType(targetType);
							return null;
						}
						else {
							result.setReturnType(targetType);
							return null;
						}
					}
				}
				//else if target type is an instance of any
				else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					//get dynamic types that are of type collection
					ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getCollectionType());
					//if size is 0, no collection type is found, report and return
					if (dyntypes.size() == 0) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_COLLECTION_TYPE);
						result.setReturnType(targetType);
						return result;
					}
					else {
						for(Type t: dyntypes)
						{
							//get the collection type and the content type and the arg type
							CollectionType collectionType = (CollectionType) t;
							Type contentType = collectionType.getContentType();
							Type argType = EcoreUtil.copy(argTypes.get(0));
							
							//if contenttype is any and arg type is any, check if there are any common types
							if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
								AnyType ct = (AnyType)contentType;
								if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
									ct.getDynamicTypes().addAll(TypeUtil.getInstance().getAllDynamicTypes((AnyType) argType));
								}
								else {
									ct.getDynamicTypes().add(EcoreUtil.copy(argType));
								}
							}
						}
						//if size is 1, a collection type is found
						result.setReturnType(targetType);
						return result;					
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_COLLECTION_TYPE);
					result.setReturnType(targetType);
					return result;
				}
			}
		}
		return result;
	}



}
