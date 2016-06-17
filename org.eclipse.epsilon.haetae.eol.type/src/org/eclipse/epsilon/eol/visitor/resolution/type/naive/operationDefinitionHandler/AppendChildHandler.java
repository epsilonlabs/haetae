package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.analysis.model.driver.IMetamodelDriver;
import org.eclipse.epsilon.analysis.model.driver.plainxml.PlainXMLIMetamodelDriver;
import org.eclipse.epsilon.analysis.model.driver.plainxml.PlainXMLIpackageDriver;
import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.ForStatement;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.WhileStatement;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;

public class AppendChildHandler extends AnyOperationDefinitionHandler{

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		if (name.equals("appendChild") && argTypes.size() == 1)
		{
			if (contextType instanceof ModelElementType) {
				return true;
			}
		}
		return false;
	}

	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) throws AnalysisInterruptException {//get the manager
		StandardLibraryOperationDefinitionContainer manager = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
				
		//get the result
		OperationDefinition result = manager.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		
		if (result != null) {
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);

			Expression target = featureCallExpression.getTarget();
			
			if (target == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.OPERATION_REQUIRES_TARGET);
				AnyType anyType = EolFactory.eINSTANCE.createAnyType();
				result.setReturnType(anyType);
				TypeResolutionContext.getInstance().setAssets(anyType, result);
				return result;
			}
			
			AnyType targetType = (AnyType) EcoreUtil.copy(target.getResolvedType());
			
			if (targetType == null) {
				LogBook.getInstance().addError(featureCallExpression, IMessage_TypeResolution.EXPRESSION_DOES_NOT_HAVE_A_TYPE);
				AnyType anyType = EolFactory.eINSTANCE.createAnyType();
				result.setReturnType(anyType);
				TypeResolutionContext.getInstance().setAssets(anyType, result);
				return result;
			}
			
			if (targetType instanceof ModelElementType) {
				ModelElementType type = (ModelElementType) targetType;
				PlainXMLIpackageDriver ipackageDriver = (PlainXMLIpackageDriver) type.getResolvedIPackage().getIPackageDriver();
				
				EClass eClass = (EClass) type.getModelType();
				
				AnyType argType = (AnyType) argTypes.get(0);
				if (argType instanceof ModelElementType) {
					ModelElementType _argType = (ModelElementType) argType;
					if (_argType.getResolvedIPackage().getIPackageDriver().equals(ipackageDriver)) {
						EClass argTypeEClass = (EClass) _argType.getModelType();
						
						String argTypeName = argTypeEClass.getName();
						String escapedArgTypeName = removeTag(argTypeName);
						
						EStructuralFeature feature = eClass.getEStructuralFeature(escapedArgTypeName);
						if (feature != null) {
							feature.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
						}
						else {
							
							feature = ipackageDriver.getFeature(eClass.getName(), escapedArgTypeName);
							if (inLoop(featureCallExpression)) {
								feature.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
							}
						}
					}
					else {
						LogBook.getInstance().addError(argType, IMessage_TypeResolution.ARG_NOT_IN_THE_SAME_PACKAGE);
						AnyType anyType = EolFactory.eINSTANCE.createAnyType();
						result.setReturnType(anyType);
						TypeResolutionContext.getInstance().setAssets(anyType, result);
						return result;
					}
					
				}
			}
			
			return result;
		}
		return null;
	}
	
	public boolean inLoop(FeatureCallExpression featureCallExpression)
	{
		boolean result = false;
		EOLElement container = featureCallExpression;
		while(container != null)
		{
			if ((container instanceof ForStatement) || (container instanceof WhileStatement)) {
				return true;
			}
			container = container.getContainer();
		}
		return false;
	}
	
	public boolean isXMLSyntax(String fullName)
	{
		if (fullName.startsWith("t_")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String removeTag(String fullName)
	{
		if (isXMLSyntax(fullName)) {
			return fullName.substring(2, fullName.length());
		}
		else {
			return fullName;
		}
	}

}


