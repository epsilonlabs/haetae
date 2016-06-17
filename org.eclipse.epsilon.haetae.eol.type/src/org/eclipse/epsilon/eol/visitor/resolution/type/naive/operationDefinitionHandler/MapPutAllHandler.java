package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MapType;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class MapPutAllHandler extends MapOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("putAll")  && argTypes.size() == 1) {
			if (contextType instanceof MapType) {
				return true;
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
				if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getMapType())) {
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
				Type targetType = target.getResolvedType();
 
				//if target type is null, report and return (this will not happend)
				if (targetType == null) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
					AnyType returnType = EolFactory.eINSTANCE.createAnyType();
					result.setReturnType(returnType);
					return result;
				}
				//if target type is collection type
				if (targetType instanceof MapType) {
					
					MapType _targetType = (MapType) targetType;
					AnyType argType = (AnyType) argTypes.get(0);
					
					if (argType instanceof MapType) {
						MapType _argType = (MapType) argType;
						_targetType.getKeyType().getDynamicTypes().addAll(_argType.getKeyType().getDynamicTypes());
						_targetType.getValueType().getDynamicTypes().addAll(_argType.getValueType().getDynamicTypes());
					}
					else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
						ArrayList<Type> dynTypes = TypeInferenceManager.getInstance().getDynamicTypes(argType, EolPackage.eINSTANCE.getMapType());
						if (dynTypes.size() <= 0) {
							LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
						}
						else {
							for(Type t: dynTypes)
							{
								MapType _argType = (MapType) t;
								_targetType.getKeyType().getDynamicTypes().addAll(_argType.getKeyType().getDynamicTypes());
								_targetType.getValueType().getDynamicTypes().addAll(_argType.getValueType().getDynamicTypes());
							}	
						}
					}
					else {
						LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
					}
					
					if (target instanceof NameExpression) {
						TypeResolutionContext.getInstance().registerNameExpression(target, EcoreUtil.copy(targetType));	
					}
					
					result.setReturnType(EcoreUtil.copy(_targetType));
					return result;
				}
				//else if target type is an instance of any
				else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					
					AnyType argType = (AnyType) argTypes.get(0);
					//get dynamic types that are of type collection
					ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getMapType());
					//if size is 0, no collection type is found, report and return
					if (dyntypes.size() <= 0) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
						result.setReturnType(EcoreUtil.copy(targetType));
						return result;
					}
					else {
						if (dyntypes.size() == 1) {
							MapType _targetType = (MapType) dyntypes.get(0);

							if (argType instanceof MapType) {
								MapType _argType = (MapType) argType;
								_targetType.getKeyType().getDynamicTypes().addAll(_argType.getKeyType().getDynamicTypes());
								_targetType.getValueType().getDynamicTypes().addAll(_argType.getValueType().getDynamicTypes());
							}
							else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
								ArrayList<Type> dynTypes = TypeInferenceManager.getInstance().getDynamicTypes(argType, EolPackage.eINSTANCE.getMapType());
								if (dynTypes.size() <= 0) {
									LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
								}
								else {
									for(Type t: dynTypes)
									{
										MapType _argType = (MapType) t;
										_targetType.getKeyType().getDynamicTypes().addAll(_argType.getKeyType().getDynamicTypes());
										_targetType.getValueType().getDynamicTypes().addAll(_argType.getValueType().getDynamicTypes());
									}	
								}
							}
							else {
								LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
							}
							
							if (target instanceof NameExpression) {
								TypeResolutionContext.getInstance().registerNameExpression(target, EcoreUtil.copy(targetType));	
							}
							
							result.setReturnType(EcoreUtil.copy(_targetType));
							return result;
						}
						else {
							for(Type t: dyntypes)
							{
								MapType _targetType = (MapType) t;
								if (argTypes instanceof MapType) {
									MapType _argType = (MapType) argType;
									_targetType.getKeyType().getDynamicTypes().addAll(_argType.getKeyType().getDynamicTypes());
									_targetType.getValueType().getDynamicTypes().addAll(_argType.getValueType().getDynamicTypes());
								}
								else if (TypeUtil.getInstance().isInstanceofAnyType(argType)) {
									ArrayList<Type> dynTypes = TypeInferenceManager.getInstance().getDynamicTypes(argType, EolPackage.eINSTANCE.getMapType());
									if (dynTypes.size() == 0) {
										LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
									}
									else {
										for(Type _t: dynTypes)
										{
											MapType _argType = (MapType) _t;
											_targetType.getKeyType().getDynamicTypes().addAll(_argType.getKeyType().getDynamicTypes());
											_targetType.getValueType().getDynamicTypes().addAll(_argType.getValueType().getDynamicTypes());
										}	
									}
								}
								else {
									LogBook.getInstance().addError(argType, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
								}
								
							}
							
							if (target instanceof NameExpression) {
								TypeResolutionContext.getInstance().registerNameExpression(target, EcoreUtil.copy(targetType));	
							}
							
							result.setReturnType(EcoreUtil.copy(targetType));
							return result;		
						}
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_COLLECTION_TYPE);
					result.setReturnType(EcoreUtil.copy(targetType));
					return result;
				}
			}
		}
		return result;
	}


}
