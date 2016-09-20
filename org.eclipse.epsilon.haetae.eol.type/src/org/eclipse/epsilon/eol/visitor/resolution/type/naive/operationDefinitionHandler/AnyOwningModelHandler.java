package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.ModelType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;

public class AnyOwningModelHandler extends AnyOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("owningModel") && argTypes.size() == 0) {
			if (contextType instanceof AnyType) {
				return true;
			}
		}
		return false;
	}

	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) {
		
		StandardLibraryOperationDefinitionContainer manager = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		OperationDefinition result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		
		if (result != null) {
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			Expression target = (Expression) featureCallExpression.getTarget(); //may not be only a name expression
			
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				result.setReturnType(EolFactory.eINSTANCE.createAnyType());
				return result;
			}

			AnyType targetType = (AnyType) EcoreUtil.copy(target.getResolvedType());
			
			if (targetType == null) {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				result.setReturnType(EolFactory.eINSTANCE.createAnyType());
				return result;
			}
			
			if (targetType instanceof ModelElementType) {
				ModelElementType _targetType = (ModelElementType) targetType;
				IMetamodelDriver iMetamodel = (IMetamodelDriver) _targetType.getResolvedIMetamodel();
				if (iMetamodel != null) {
					ModelType returnType = EolFactory.eINSTANCE.createModelType();
					returnType.setResolvedIMetamodel(iMetamodel);
					returnType.setModelName(iMetamodel.getName());
					TypeResolutionContext.getInstance().copyLocation(returnType, featureCallExpression);
					featureCallExpression.setResolvedType(EcoreUtil.copy(returnType));
					result.setReturnType(EcoreUtil.copy(returnType));
					return result;
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.TYPE_CANNOT_BE_RESOLVED);
				}
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				if (TypeInferenceManager.getInstance().containsDynamicType(targetType, EolPackage.eINSTANCE.getModelElementType())) {
					ArrayList<Type> dyntypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getModelElementType());
					if (dyntypes.size() == 1) {
						ModelElementType _targetType = (ModelElementType) dyntypes.get(0);
						IMetamodelDriver iMetamodel = (IMetamodelDriver) _targetType.getResolvedIMetamodel();
						if (iMetamodel != null) {
							ModelType returnType = EolFactory.eINSTANCE.createModelType();
							returnType.setResolvedIMetamodel(iMetamodel);
							returnType.setModelName(iMetamodel.getName());
							TypeResolutionContext.getInstance().copyLocation(returnType, featureCallExpression);
							featureCallExpression.setResolvedType(EcoreUtil.copy(returnType));
							result.setReturnType(EcoreUtil.copy(returnType));
							return result;
						}
						else {
							LogBook.getInstance().addError(target, IMessage_TypeResolution.OBJECT_NOT_DEFINED_IN_MODEL);
							result.setReturnType(EolFactory.eINSTANCE.createAnyType());
							return result;
						}
					}
					else {
						AnyType returnType = EolFactory.eINSTANCE.createAnyType();
						for(Type t: dyntypes)
						{
							ModelElementType _targetType = (ModelElementType) t;
							IMetamodelDriver iMetamodel = (IMetamodelDriver) _targetType.getResolvedIMetamodel();
							if (iMetamodel != null) {
								ModelType modelType = EolFactory.eINSTANCE.createModelType();
								modelType.setResolvedIMetamodel(iMetamodel);
								returnType.getDynamicTypes().add(modelType);
							}
						}
						result.setReturnType(returnType);
						return result;
					}
				}
				else {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.OBJECT_NOT_DEFINED_IN_MODEL);
					result.setReturnType(EolFactory.eINSTANCE.createAnyType());
					return result;

				}
			}
			else {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.OBJECT_NOT_DEFINED_IN_MODEL);
				result.setReturnType(EolFactory.eINSTANCE.createAnyType());
				return result;

			}
		}
		return result;
	}



}
