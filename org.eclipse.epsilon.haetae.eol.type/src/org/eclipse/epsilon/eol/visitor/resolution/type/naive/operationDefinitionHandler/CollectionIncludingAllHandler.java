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

public class CollectionIncludingAllHandler extends CollectionOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("includingAll") && argTypes.size() == 1 ) {
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
			
			//register result as it has been handled
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			//get the target
			Expression target = featureCallExpression.getTarget();
			
			//if target is null, report and return
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				return result;
			}
			

			//if target is collection type
			Type targetType = EcoreUtil.copy(target.getResolvedType());
			
			//if target type is collection
			if (targetType instanceof CollectionType) {
				//get collection type and get content type
				CollectionType _targetType = (CollectionType) EcoreUtil.copy(targetType);	
				Type contentType = _targetType.getContentType();
				
				//get the arg type
				Type argType = argTypes.get(0);
				Type argContentType = null;
				
				//if argument is collection
				if (argType instanceof CollectionType) {
					CollectionType _argType = (CollectionType) EcoreUtil.copy(argType);
					argContentType = _argType.getContentType();
					
					//if content type is any, add the argtype to the content type
					if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
						AnyType _contentType = (AnyType) contentType;
						AnyType _argContentType = (AnyType) EcoreUtil.copy(argContentType);

						if (TypeUtil.getInstance().isInstanceofAnyType(argContentType)) {
							_contentType.getDynamicTypes().addAll(_argContentType.getDynamicTypes());
						}
						else {
							_contentType.getDynamicTypes().add(_argContentType);
						}
						
						result.setReturnType(_targetType);
					}
					//if content type is not any, compare with the arg type (argtype is collection now, dont forget)
					else {
						if (TypeUtil.getInstance().isTypeEqualOrGeneric(argContentType, contentType)) {
							
							result.setReturnType(_targetType);
							return result;
						}
						else {
							LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.POTENTIAL_TYPE_MISMATCH, contentType.getClass().getSimpleName()));
							result.setReturnType(_targetType);
							return result;
						}
					}
				}
				//if arg type is any
				else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
					//get all dyn types that are of type collection
					if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getCollectionType())) {
						ArrayList<Type> dynTypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) argType, EolPackage.eINSTANCE.getCollectionType());
						if (dynTypes.size() > 0) {
							boolean found = false;
							//for all the dynamic types
							for(Type t: dynTypes)
							{
								//cast to collection type and get the arg content type
								CollectionType collectionType2 = (CollectionType) t;
								argContentType = collectionType2.getContentType();
								
								//if target content type is any, add to dynamic types
								if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
									found = true;
									
									AnyType _contentType = (AnyType) contentType;
									AnyType _argContentType = (AnyType) EcoreUtil.copy(argContentType);

									if (TypeUtil.getInstance().isInstanceofAnyType(argContentType)) {
										_contentType.getDynamicTypes().addAll(_argContentType.getDynamicTypes());
									}
									else {
										_contentType.getDynamicTypes().add(_argContentType);
									}
								}
								else {
									if (TypeUtil.getInstance().isTypeEqualOrGeneric(argContentType, contentType)) {
										found = true;
									}
								}
							}
							if (!found) {
								LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.POTENTIAL_ARGUMENT_MISMATCH, "addAll(" + TypeUtil.getInstance().getTypeName(targetType) + ")"));
								result.setReturnType(_targetType);
								return result;
							}
							result.setReturnType(_targetType);
							return result;
						}
						else {
							LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.POTENTIAL_ARGUMENT_MISMATCH, "addAll(" + TypeUtil.getInstance().getTypeName(targetType) + ")"));
							result.setReturnType(_targetType);
							return result;
						}
					}
					else {
						LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
						result.setReturnType(_targetType);
						return result;
					}
				}
				else {
					LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
					result.setReturnType(_targetType);
					return result;
				}
			}
			
			//if target is any type
			else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				//get dynamic types that are collection
				ArrayList<Type> dynTypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getCollectionType());
				//if no collection type found, report and return
				if (dynTypes.size() == 0) {
					LogBook.getInstance().addWarning(targetType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
					return null;
				}
				else if (dynTypes.size() == 1) {
					//get collection type and get content type
					CollectionType _targetType = (CollectionType) EcoreUtil.copy(dynTypes.get(0));	
					Type contentType = _targetType.getContentType();
					
					//get the arg type
					Type argType = argTypes.get(0);
					Type argContentType = null;
					
					//if argument is collection
					if (argType instanceof CollectionType) {
						CollectionType _argType = (CollectionType) EcoreUtil.copy(argType);
						argContentType = _argType.getContentType();
						
						//if content type is any, add the argtype to the content type
						if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
							AnyType _contentType = (AnyType) contentType;
							AnyType _argContentType = (AnyType) EcoreUtil.copy(argContentType);

							if (TypeUtil.getInstance().isInstanceofAnyType(argContentType)) {
								_contentType.getDynamicTypes().addAll(_argContentType.getDynamicTypes());
							}
							else {
								_contentType.getDynamicTypes().add(_argContentType);
							}
							
							result.setReturnType(_targetType);
						}
						//if content type is not any, compare with the arg type (argtype is collection now, dont forget)
						else {
							if (TypeUtil.getInstance().isTypeEqualOrGeneric(argContentType, contentType)) {
								
								result.setReturnType(_targetType);
								return result;
							}
							else {
								LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.POTENTIAL_TYPE_MISMATCH, contentType.getClass().getSimpleName()));
								result.setReturnType(_targetType);
								return result;
							}
						}
					}
					//if arg type is any
					else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
						//get all dyn types that are of type collection
						if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getCollectionType())) {
							ArrayList<Type> _dynTypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) argType, EolPackage.eINSTANCE.getCollectionType());
							if (_dynTypes.size() > 0) {
								boolean found = false;
								//for all the dynamic types
								for(Type t: _dynTypes)
								{
									//cast to collection type and get the arg content type
									CollectionType collectionType2 = (CollectionType) t;
									argContentType = collectionType2.getContentType();
									
									//if target content type is any, add to dynamic types
									if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
										found = true;
										
										AnyType _contentType = (AnyType) contentType;
										AnyType _argContentType = (AnyType) EcoreUtil.copy(argContentType);

										if (TypeUtil.getInstance().isInstanceofAnyType(argContentType)) {
											_contentType.getDynamicTypes().addAll(_argContentType.getDynamicTypes());
										}
										else {
											_contentType.getDynamicTypes().add(_argContentType);
										}
									}
									else {
										if (TypeUtil.getInstance().isTypeEqualOrGeneric(argContentType, contentType)) {
											found = true;
										}
									}
								}
								if (!found) {
									LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.POTENTIAL_ARGUMENT_MISMATCH, "addAll(" + TypeUtil.getInstance().getTypeName(targetType) + ")"));
									result.setReturnType(_targetType);
									return result;
								}
								result.setReturnType(_targetType);
								return result;
							}
							else {
								LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.POTENTIAL_ARGUMENT_MISMATCH, "addAll(" + TypeUtil.getInstance().getTypeName(targetType) + ")"));
								result.setReturnType(_targetType);
								return result;
							}
						}
						else {
							LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
							result.setReturnType(_targetType);
							return result;
						}
					}
					else {
						LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
						result.setReturnType(_targetType);
						return result;
					}
				}
				//if found collection type
				else if (dynTypes.size() > 1) {
					Type _targetType = EcoreUtil.copy(targetType);
					Type argType = argTypes.get(0);
					//for all types found
					for(Type t: dynTypes)
					{
						//get collection type and get content type
						CollectionType __targetType = (CollectionType) t;	
						Type contentType = __targetType.getContentType();
						
						//get the arg type
						Type argContentType = null;
						
						if (argType instanceof CollectionType) {
							
							CollectionType _argType = (CollectionType) EcoreUtil.copy(argType);
							argContentType = _argType.getContentType();
							//if content type is any, add the argtype to the content type
							if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
								AnyType _contentType = (AnyType) contentType;

								if (TypeUtil.getInstance().isInstanceofAnyType(argContentType)) {
									AnyType _argContentType = (AnyType) argContentType;
									_contentType.getDynamicTypes().addAll(_argContentType.getDynamicTypes());
								}
								else {
									_contentType.getDynamicTypes().add(argContentType);
								}
							}
						}
						else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
							if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) argType, EolPackage.eINSTANCE.getCollectionType())) {
								ArrayList<Type> _dynTypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) argType, EolPackage.eINSTANCE.getCollectionType());
								if (_dynTypes.size() > 0) {
									boolean found = false;
									for(Type _t: _dynTypes)
									{
										CollectionType __argType = (CollectionType) _t;
										argContentType = __argType.getContentType();
										//if target content type is any, add to dynamic types
										if (TypeUtil.getInstance().isInstanceofAnyType(contentType)) {
											AnyType _contentType = (AnyType) contentType;
											if (TypeUtil.getInstance().isInstanceofAnyType(argContentType)) {
												AnyType _argContentType = (AnyType) argContentType;
												_contentType.getDynamicTypes().addAll(_argContentType.getDynamicTypes());
											}
											else {
												_contentType.getDynamicTypes().add(argContentType);
											}
											found = true;
										}
										else {
											if (TypeUtil.getInstance().isTypeEqualOrGeneric(argContentType, contentType)) {
												found = true;
											}
										}
									}
									if (!found) {
									}
								}
								else {
								}
							}
							else {
							}
						}
						else {
							
						}
					}
					LogBook.getInstance().addWarning(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
					result.setReturnType(_targetType);
					return result;
				}
			}
			else {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_COLLECTION_TYPE);
				Type targetTypeCopy = EcoreUtil.copy(targetType);
				result.setReturnType(targetTypeCopy);
			}
		}
		return result;
	}


}
