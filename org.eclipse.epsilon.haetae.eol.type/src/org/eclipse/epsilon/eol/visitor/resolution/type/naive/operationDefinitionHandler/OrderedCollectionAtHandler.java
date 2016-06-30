package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.OrderedCollectionType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class OrderedCollectionAtHandler extends CollectionOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if ((name.equals("at") || name.equals("removeAt") || name.equals("get")) && argTypes.size() == 1 ) {
			if (contextType instanceof OrderedCollectionType) {
				return true;
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getOrderedCollectionType())) {
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
			ArrayList<Type> argTypes) throws AnalysisInterruptException {
		
		//get the manager
		StandardLibraryOperationDefinitionContainer manager = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		OperationDefinition result = null;
		
		if (contextType instanceof OrderedCollectionType) {
			result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), contextType, argTypes);

		}
		else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
			if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getOrderedCollectionType())) {
				ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) contextType, EolPackage.eINSTANCE.getOrderedCollectionType());
				result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), dyntypes.get(0), argTypes);
			}
		}		
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
				Type argType = argTypes.get(0);

				//if target type is null, report and return (this will not happend)
				if (targetType == null) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
					result.setReturnType(EolFactory.eINSTANCE.createAnyType());
					return result;
				}
				
				if (argType instanceof IntegerType) {
					
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
					if (!TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getIntegerType())) {
						LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MUST_BE_INTEGER);
					}
				}
				else {
					LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MUST_BE_INTEGER);
				}
				
				
				//if target type is collection type
				if (targetType instanceof CollectionType) {
					if (targetType instanceof OrderedCollectionType) {
						//get the content type and arg type
						Type contentType = ((CollectionType)targetType).getContentType();
						if (contentType != null) {
							result.setReturnType(EcoreUtil.copy(contentType));
							return result;
						}
						else {
							result.setReturnType(EolFactory.eINSTANCE.createAnyType());
							return result;
						}
					}
					else {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_ORDERED_COLLECTION_TYPE);
						Type contentType = ((CollectionType)targetType).getContentType();
						if (contentType != null) {
							result.setReturnType(EcoreUtil.copy(contentType));
							return result;
						}
					}
				}
				//else if target type is an instance of any
				else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					//get dynamic types that are of type collection
					ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getOrderedCollectionType());
					//if size is 0, no collection type is found, report and return
					if (dyntypes.size() == 0) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_ORDERED_COLLECTION_TYPE);
						AnyType returnType = EolFactory.eINSTANCE.createAnyType();
						result.setReturnType(returnType);
						return result;
					}
					else {
						//if size is 1, a collection type is found
						if (dyntypes.size() == 1) {
							
							//get the collection type and the content type and the arg type
							CollectionType collectionType = (CollectionType) dyntypes.get(0);
							Type contentType = collectionType.getContentType();
							
							if (contentType != null) {
								result.setReturnType(EcoreUtil.copy(contentType));
								return result;
							}
						}
						else {
							AnyType returnType = EolFactory.eINSTANCE.createAnyType();
							for(Type t: dyntypes)
							{
								CollectionType _targetType = (CollectionType) t;
								Type _contentType = EcoreUtil.copy(_targetType.getContentType());
								if (TypeUtil.getInstance().isInstanceofAnyType(_contentType)) {
									returnType.getDynamicTypes().addAll(((AnyType)_contentType).getDynamicTypes());
								}
								else {
									returnType.getDynamicTypes().add(_contentType);
								}
							}
							result.setReturnType(returnType);
							return result;
						}
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_ORDERED_COLLECTION_TYPE);
					AnyType returnType = EolFactory.eINSTANCE.createAnyType();
					result.setReturnType(returnType);
					return result;
				}
			}
		}
		return result;
	}



}
