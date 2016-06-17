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
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class MapGetHandler extends MapOperationDefinitionHandler {

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("get")  && argTypes.size() == 1) {
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
					AnyType returnType = EolFactory.eINSTANCE.createAnyType();
					result.setReturnType(returnType);
					return result;
				}
				//if target type is collection type
				if (targetType instanceof MapType) {
					MapType _targetType = (MapType) targetType;
					AnyType valueType = _targetType.getValueType();
					result.setReturnType(EcoreUtil.copy(valueType));
					return result;
				}
				//else if target type is an instance of any
				else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
					//get dynamic types that are of type collection
					ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getMapType());
					//if size is 0, no collection type is found, report and return
					if (dyntypes.size() == 0) {
						LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_MAP);
						AnyType returnType = EolFactory.eINSTANCE.createAnyType();
						result.setReturnType(returnType);
						return result;
					}
					else {
						if (dyntypes.size() == 1) {
							MapType _targetType = (MapType) dyntypes.get(0);
							AnyType valueType = _targetType.getValueType();
							result.setReturnType(EcoreUtil.copy(valueType));
							return result;				
						}
						else {
							AnyType returnType = EolFactory.eINSTANCE.createAnyType();
							for(Type t: dyntypes)
							{
								MapType _targetType = (MapType) EcoreUtil.copy(t);
								AnyType valueType = _targetType.getValueType();
								returnType.getDynamicTypes().add(valueType);
							}
							result.setReturnType(returnType);
							return result;
						}
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_COLLECTION_TYPE);
					AnyType returnType = EolFactory.eINSTANCE.createAnyType();
					result.setReturnType(returnType);
					return result;
				}
			}
		}
		return result;
	}


}
