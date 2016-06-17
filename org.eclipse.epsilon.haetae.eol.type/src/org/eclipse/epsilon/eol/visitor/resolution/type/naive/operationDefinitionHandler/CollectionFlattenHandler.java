package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.CollectionType;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.SequenceType;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeInferenceManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;

public class CollectionFlattenHandler extends CollectionOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("flatten") && argTypes.size() == 0 ) {
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
			
			//register handler
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);
			
			//get target first
			Expression target = featureCallExpression.getTarget();
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				return result;
			}
			
			//get the target type
			Type targetType = target.getResolvedType();
			
			//if target type is a collection
			if (targetType instanceof CollectionType) {
				
				//convert target type, get innermost type, get return type
				CollectionType _targetType = (CollectionType) EcoreUtil.copy(targetType);	
				Type innermostType = getInnermosTypeRecursively(_targetType);
				Type returnType = result.getReturnType();
				
				//if return type is sequence, which it should be
				if (returnType instanceof SequenceType) {
					
					//convert return type and copy
					SequenceType rt = (SequenceType) returnType;
					SequenceType _rt = EcoreUtil.copy(rt);
					
					//get the innermost type copy, set the content to the return type and set assets
					Type innerMostTypeCopy = EcoreUtil.copy(innermostType);
					_rt.setContentType(innerMostTypeCopy);
					TypeResolutionContext.getInstance().setAssets(innerMostTypeCopy, _rt);

					result.setReturnType(EcoreUtil.copy(_rt));
					TypeResolutionContext.getInstance().setAssets(_rt, result);
					
					//get return type and set assets
					featureCallExpression.setResolvedType(_rt);
					TypeResolutionContext.getInstance().setAssets(_rt, featureCallExpression);
					
					return result;
				}
			}
			//if the target type is any
			else if (TypeUtil.getInstance().isInstanceofAnyType(targetType)) {
				//get all dynamic types that are of collection type
				ArrayList<Type> dynTypes = TypeInferenceManager.getInstance().getDynamicTypes((AnyType) targetType, EolPackage.eINSTANCE.getCollectionType());
				//if size is 0
				if (dynTypes.size() == 0) {
					LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_MAY_NOT_BE_COLLECTION_TYPE);
					return result;
				}
				else {
					Type returnType = result.getReturnType();
					AnyType contentType = EolFactory.eINSTANCE.createAnyType();
					
					
					SequenceType rt = (SequenceType) returnType;
					SequenceType _rt = EcoreUtil.copy(rt);
					
					_rt.setContentType(contentType);

					//boolean found = false;
					for(Type t : dynTypes)
					{
						CollectionType _t = (CollectionType) t;	
						Type innermostType = getInnermosTypeRecursively(_t);
						
						if (TypeUtil.getInstance().isInstanceofAnyType(innermostType)) {
							AnyType _innermostType = (AnyType) EcoreUtil.copy(innermostType);
							contentType.getDynamicTypes().addAll(_innermostType.getDynamicTypes());
						}
						else {
							contentType.getDynamicTypes().add(EcoreUtil.copy(innermostType));
						}
					}
					
					result.setReturnType(EcoreUtil.copy(_rt));
					TypeResolutionContext.getInstance().setAssets(_rt, result);
					
					//get return type and set assets
					featureCallExpression.setResolvedType(_rt);
					TypeResolutionContext.getInstance().setAssets(_rt, featureCallExpression);
				}
			}
			else {
				LogBook.getInstance().addError(target, IMessage_TypeResolution.EXPRESSION_SHOULD_BE_COLLECTION_TYPE);
				return result;
			}
		}
		
		return result;
	}
	
	public Type getInnermosTypeRecursively(Type t)
	{
		Type result = null;
		if(t instanceof CollectionType)
		{
			CollectionType _t = (CollectionType) t;
			Type ct = _t.getContentType();
			if (ct instanceof CollectionType) {
				return getInnermosTypeRecursively(ct);
			}
			else if (TypeUtil.getInstance().isInstanceofAnyType(ct)) {
				result = EolFactory.eINSTANCE.createAnyType();
				AnyType _result = (AnyType) result;
				_result.getDynamicTypes().addAll(getAllDynamicTypesRecursively((AnyType) ct));
				return _result;
			}
			else {
				return EcoreUtil.copy(ct);
			}
		}
		else if (TypeUtil.getInstance().isInstanceofAnyType(t)) {
			AnyType _t = (AnyType) t;
			result = EolFactory.eINSTANCE.createAnyType();
			AnyType _result = (AnyType) result;

			for(Type __t: _t.getDynamicTypes())
			{
				if (__t instanceof CollectionType) {
					CollectionType ___t = (CollectionType) __t;
					_result.getDynamicTypes().add(getInnermosTypeRecursively(___t.getContentType()));
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(__t)) {
					_result.getDynamicTypes().addAll(getAllDynamicTypesRecursively((AnyType) __t));
				}
			}
			return _result;
		}
		return EcoreUtil.copy(t);
	}
	
	private ArrayList<Type> getAllDynamicTypesRecursively(AnyType anyType)
	{
		ArrayList<Type> result = new ArrayList<Type>();
		if(TypeUtil.getInstance().isInstanceofAnyType(anyType))
		{
			for(Type t: anyType.getDynamicTypes())
			{
				if (t instanceof CollectionType) {
					result.addAll(getAllDynamicTypesRecursively((AnyType) ((CollectionType)t).getContentType()));
				}
				else if (TypeUtil.getInstance().isInstanceofAnyType(t)) {
					result.addAll(getAllDynamicTypesRecursively((AnyType) t));
				}
				else{
					result.add(t);
				}
			}
		}
		else {
			result.add(anyType);
		}
		
		return result;
	}




}
