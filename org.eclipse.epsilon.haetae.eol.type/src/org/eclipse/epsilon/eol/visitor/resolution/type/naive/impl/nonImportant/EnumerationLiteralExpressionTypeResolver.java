package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression;
import org.eclipse.epsilon.eol.metamodel.EolFactory;
import org.eclipse.epsilon.eol.metamodel.IntegerType;
import org.eclipse.epsilon.eol.metamodel.visitor.EnumerationLiteralExpressionVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.problem.imessages.IMessage_TypeResolution;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.haetae.model.connectivity.IMetamodelDriver;
import org.eclipse.epsilon.haetae.model.connectivity.IPackageDriver;

public class EnumerationLiteralExpressionTypeResolver extends EnumerationLiteralExpressionVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(
			EnumerationLiteralExpression enumerationLiteralExpression,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		
		String modelName = enumerationLiteralExpression.getModel().getName(); //get model name
		String enumName = enumerationLiteralExpression.getEnumeration().getName(); //get enumName
		String literalName = enumerationLiteralExpression.getLiteral().getName(); //get literalname
		
		IntegerType resolvedType = EolFactory.eINSTANCE.createIntegerType();
		context.setAssets(resolvedType, enumerationLiteralExpression);
		enumerationLiteralExpression.setResolvedType(resolvedType);

		if (context.getTypeUtil().getIMetamodelDriverByName(modelName).size() == 0) {
			LogBook.getInstance().addError(enumerationLiteralExpression, IMessage_TypeResolution.bindMessage(IMessage_TypeResolution.MODEL_NOT_FOUND, modelName));
		}
		else {
			ArrayList<IMetamodelDriver> iMetamodelDrivers = context.getTypeUtil().getIMetamodelDrivers(modelName, enumName);
			if (iMetamodelDrivers.size() == 0) {
				LogBook.getInstance().addError(enumerationLiteralExpression, IMessage_TypeResolution.ENUM_CANNOT_BE_RESOLVED);
			}
			else if (iMetamodelDrivers.size() == 1) {
				IMetamodelDriver iMetamodelDriver = iMetamodelDrivers.get(0);
				ArrayList<IPackageDriver> iPackageDrivers = context.getTypeUtil().getIPackageDrivers(iMetamodelDriver, modelName, enumName);
				if (iPackageDrivers.size() == 0) {
					LogBook.getInstance().addError(enumerationLiteralExpression, IMessage_TypeResolution.ENUM_CANNOT_BE_RESOLVED);	
				}
				else if (iPackageDrivers.size() == 1) {
					IPackageDriver iPackageDriver = iPackageDrivers.get(0);
					if (iPackageDriver.containsEnumeration(enumName)) {
						EEnum enum1 = iPackageDriver.getEnumeration(enumName);
						if (enum1.getEEnumLiteral(literalName) == null) {
							LogBook.getInstance().addError(enumerationLiteralExpression, IMessage_TypeResolution.ENUM_LITERAL_CANNOT_BE_RESLVED);
						}
						else {
							return null;
						}
					}
				}
				else if (iPackageDrivers.size() > 1) {
					LogBook.getInstance().addError(enumerationLiteralExpression, IMessage_TypeResolution.ENUM_DUPLICATE);
				}
			}
		}
		
		return null;
	}
	
}
