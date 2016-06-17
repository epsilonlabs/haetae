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

public class MapClearHandler extends MapOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("clear") && argTypes.size() == 0) {
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
		
		OperationDefinition result = null;
		
		if (contextType instanceof MapType) {
			result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), contextType, argTypes);

		}
		else if (TypeUtil.getInstance().isInstanceofAnyType(contextType)) {
			if (TypeInferenceManager.getInstance().containsDynamicType((AnyType) contextType, EolPackage.eINSTANCE.getMapType())) {
				ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) contextType, EolPackage.eINSTANCE.getMapType());
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
				
				//if target type is null, report and return (this will not happend)
				if (targetType == null) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
					MapType returnType = EolFactory.eINSTANCE.createMapType();
					returnType.setKeyType(EolFactory.eINSTANCE.createAnyType());
					returnType.setValueType(EolFactory.eINSTANCE.createAnyType());
					TypeResolutionContext.getInstance().setAssets(returnType.getKeyType(), returnType);
					TypeResolutionContext.getInstance().setAssets(returnType.getValueType(), returnType);
					result.setReturnType(returnType);
					return result;
				}
				//if target type is collection type
				if (targetType instanceof MapType) {
					MapType _targetType = (MapType) EcoreUtil.copy(targetType);
					AnyType keyType = _targetType.getKeyType();
					AnyType valueType = _targetType.getValueType();
					keyType.getDynamicTypes().clear();
					valueType.getDynamicTypes().clear();
					
					result.setContextType(EcoreUtil.copy(_targetType));
					result.setReturnType(_targetType);
					
					if (target instanceof NameExpression) {
						TypeResolutionContext.getInstance().registerNameExpression(target, _targetType);
					}
					return result;
				}
				//else if target type is an instance of any
				else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					
					//get dynamic types that are of type collection
					ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getMapType());
					if (dyntypes.size() == 0) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
						MapType returnType = EolFactory.eINSTANCE.createMapType();
						returnType.setKeyType(EolFactory.eINSTANCE.createAnyType());
						returnType.setValueType(EolFactory.eINSTANCE.createAnyType());
						TypeResolutionContext.getInstance().setAssets(returnType.getKeyType(), returnType);
						TypeResolutionContext.getInstance().setAssets(returnType.getValueType(), returnType);
						result.setReturnType(returnType);
						return result;
					}
					else {
						
						for(Type t: dyntypes)
						{
							MapType _targetType = (MapType) EcoreUtil.copy(t);
							AnyType keyType = _targetType.getKeyType();
							AnyType valueType = _targetType.getValueType();
							keyType.getDynamicTypes().clear();
							valueType.getDynamicTypes().clear();
						}
						result.setReturnType(EcoreUtil.copy(targetType));
						if (target instanceof NameExpression) {
							TypeResolutionContext.getInstance().registerNameExpression(target, EcoreUtil.copy(targetType));
						}
						return result;
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
					MapType returnType = EolFactory.eINSTANCE.createMapType();
					returnType.setKeyType(EolFactory.eINSTANCE.createAnyType());
					returnType.setValueType(EolFactory.eINSTANCE.createAnyType());
					TypeResolutionContext.getInstance().setAssets(returnType.getKeyType(), returnType);
					TypeResolutionContext.getInstance().setAssets(returnType.getValueType(), returnType);
					result.setReturnType(returnType);
					return result;
				}
			}
		}
		return result;
	}

}
