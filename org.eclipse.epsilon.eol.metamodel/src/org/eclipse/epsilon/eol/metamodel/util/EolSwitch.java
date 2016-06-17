/**
 */
package org.eclipse.epsilon.eol.metamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.epsilon.eol.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage
 * @generated
 */
public class EolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolSwitch() {
		if (modelPackage == null) {
			modelPackage = EolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EolPackage.EOL_ELEMENT: {
				EOLElement eolElement = (EOLElement)theEObject;
				T result = caseEOLElement(eolElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.TEXT_REGION: {
				TextRegion textRegion = (TextRegion)theEObject;
				T result = caseTextRegion(textRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.TEXT_POSITION: {
				TextPosition textPosition = (TextPosition)theEObject;
				T result = caseTextPosition(textPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.IMETAMODEL: {
				IMetamodel iMetamodel = (IMetamodel)theEObject;
				T result = caseIMetamodel(iMetamodel);
				if (result == null) result = caseEOLElement(iMetamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.IPACKAGE: {
				IPackage iPackage = (IPackage)theEObject;
				T result = caseIPackage(iPackage);
				if (result == null) result = caseEOLElement(iPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EOL_LIBRARY_MODULE: {
				EOLLibraryModule eolLibraryModule = (EOLLibraryModule)theEObject;
				T result = caseEOLLibraryModule(eolLibraryModule);
				if (result == null) result = caseEOLElement(eolLibraryModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EOL_MODULE: {
				EOLModule eolModule = (EOLModule)theEObject;
				T result = caseEOLModule(eolModule);
				if (result == null) result = caseEOLLibraryModule(eolModule);
				if (result == null) result = caseEOLElement(eolModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseEOLElement(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseEOLElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ANNOTATION_BLOCK: {
				AnnotationBlock annotationBlock = (AnnotationBlock)theEObject;
				T result = caseAnnotationBlock(annotationBlock);
				if (result == null) result = caseBlock(annotationBlock);
				if (result == null) result = caseEOLElement(annotationBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EXPRESSION_OR_STATEMENT_BLOCK: {
				ExpressionOrStatementBlock expressionOrStatementBlock = (ExpressionOrStatementBlock)theEObject;
				T result = caseExpressionOrStatementBlock(expressionOrStatementBlock);
				if (result == null) result = caseEOLElement(expressionOrStatementBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.OPERATION_DEFINITION: {
				OperationDefinition operationDefinition = (OperationDefinition)theEObject;
				T result = caseOperationDefinition(operationDefinition);
				if (result == null) result = caseEOLElement(operationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseEOLElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.OPERATOR_EXPRESSION: {
				OperatorExpression operatorExpression = (OperatorExpression)theEObject;
				T result = caseOperatorExpression(operatorExpression);
				if (result == null) result = caseExpression(operatorExpression);
				if (result == null) result = caseEOLElement(operatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.UNARY_OPERATOR_EXPRESSION: {
				UnaryOperatorExpression unaryOperatorExpression = (UnaryOperatorExpression)theEObject;
				T result = caseUnaryOperatorExpression(unaryOperatorExpression);
				if (result == null) result = caseOperatorExpression(unaryOperatorExpression);
				if (result == null) result = caseExpression(unaryOperatorExpression);
				if (result == null) result = caseEOLElement(unaryOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.NOT_OPERATOR_EXPRESSION: {
				NotOperatorExpression notOperatorExpression = (NotOperatorExpression)theEObject;
				T result = caseNotOperatorExpression(notOperatorExpression);
				if (result == null) result = caseUnaryOperatorExpression(notOperatorExpression);
				if (result == null) result = caseOperatorExpression(notOperatorExpression);
				if (result == null) result = caseExpression(notOperatorExpression);
				if (result == null) result = caseEOLElement(notOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.NEGATIVE_OPERATOR_EXPRESSION: {
				NegativeOperatorExpression negativeOperatorExpression = (NegativeOperatorExpression)theEObject;
				T result = caseNegativeOperatorExpression(negativeOperatorExpression);
				if (result == null) result = caseUnaryOperatorExpression(negativeOperatorExpression);
				if (result == null) result = caseOperatorExpression(negativeOperatorExpression);
				if (result == null) result = caseExpression(negativeOperatorExpression);
				if (result == null) result = caseEOLElement(negativeOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BINARY_OPERATOR_EXPRESSION: {
				BinaryOperatorExpression binaryOperatorExpression = (BinaryOperatorExpression)theEObject;
				T result = caseBinaryOperatorExpression(binaryOperatorExpression);
				if (result == null) result = caseOperatorExpression(binaryOperatorExpression);
				if (result == null) result = caseExpression(binaryOperatorExpression);
				if (result == null) result = caseEOLElement(binaryOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.LOGICAL_OPERATOR_EXPRESSION: {
				LogicalOperatorExpression logicalOperatorExpression = (LogicalOperatorExpression)theEObject;
				T result = caseLogicalOperatorExpression(logicalOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(logicalOperatorExpression);
				if (result == null) result = caseOperatorExpression(logicalOperatorExpression);
				if (result == null) result = caseExpression(logicalOperatorExpression);
				if (result == null) result = caseEOLElement(logicalOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.AND_OPERATOR_EXPRESSION: {
				AndOperatorExpression andOperatorExpression = (AndOperatorExpression)theEObject;
				T result = caseAndOperatorExpression(andOperatorExpression);
				if (result == null) result = caseLogicalOperatorExpression(andOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(andOperatorExpression);
				if (result == null) result = caseOperatorExpression(andOperatorExpression);
				if (result == null) result = caseExpression(andOperatorExpression);
				if (result == null) result = caseEOLElement(andOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.XOR_OPERATOR_EXPRESSION: {
				XorOperatorExpression xorOperatorExpression = (XorOperatorExpression)theEObject;
				T result = caseXorOperatorExpression(xorOperatorExpression);
				if (result == null) result = caseLogicalOperatorExpression(xorOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(xorOperatorExpression);
				if (result == null) result = caseOperatorExpression(xorOperatorExpression);
				if (result == null) result = caseExpression(xorOperatorExpression);
				if (result == null) result = caseEOLElement(xorOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.OR_OPERATOR_EXPRESSION: {
				OrOperatorExpression orOperatorExpression = (OrOperatorExpression)theEObject;
				T result = caseOrOperatorExpression(orOperatorExpression);
				if (result == null) result = caseLogicalOperatorExpression(orOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(orOperatorExpression);
				if (result == null) result = caseOperatorExpression(orOperatorExpression);
				if (result == null) result = caseExpression(orOperatorExpression);
				if (result == null) result = caseEOLElement(orOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.IMPLIES_OPERATOR_EXPRESSION: {
				ImpliesOperatorExpression impliesOperatorExpression = (ImpliesOperatorExpression)theEObject;
				T result = caseImpliesOperatorExpression(impliesOperatorExpression);
				if (result == null) result = caseLogicalOperatorExpression(impliesOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(impliesOperatorExpression);
				if (result == null) result = caseOperatorExpression(impliesOperatorExpression);
				if (result == null) result = caseExpression(impliesOperatorExpression);
				if (result == null) result = caseEOLElement(impliesOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ARITHMETIC_OPERATOR_EXPRESSION: {
				ArithmeticOperatorExpression arithmeticOperatorExpression = (ArithmeticOperatorExpression)theEObject;
				T result = caseArithmeticOperatorExpression(arithmeticOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(arithmeticOperatorExpression);
				if (result == null) result = caseOperatorExpression(arithmeticOperatorExpression);
				if (result == null) result = caseExpression(arithmeticOperatorExpression);
				if (result == null) result = caseEOLElement(arithmeticOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.DIVIDE_OPERATOR_EXPRESSION: {
				DivideOperatorExpression divideOperatorExpression = (DivideOperatorExpression)theEObject;
				T result = caseDivideOperatorExpression(divideOperatorExpression);
				if (result == null) result = caseArithmeticOperatorExpression(divideOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(divideOperatorExpression);
				if (result == null) result = caseOperatorExpression(divideOperatorExpression);
				if (result == null) result = caseExpression(divideOperatorExpression);
				if (result == null) result = caseEOLElement(divideOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MULTIPLY_OPERATOR_EXPRESSION: {
				MultiplyOperatorExpression multiplyOperatorExpression = (MultiplyOperatorExpression)theEObject;
				T result = caseMultiplyOperatorExpression(multiplyOperatorExpression);
				if (result == null) result = caseArithmeticOperatorExpression(multiplyOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(multiplyOperatorExpression);
				if (result == null) result = caseOperatorExpression(multiplyOperatorExpression);
				if (result == null) result = caseExpression(multiplyOperatorExpression);
				if (result == null) result = caseEOLElement(multiplyOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MINUS_OPERATOR_EXPRESSION: {
				MinusOperatorExpression minusOperatorExpression = (MinusOperatorExpression)theEObject;
				T result = caseMinusOperatorExpression(minusOperatorExpression);
				if (result == null) result = caseArithmeticOperatorExpression(minusOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(minusOperatorExpression);
				if (result == null) result = caseOperatorExpression(minusOperatorExpression);
				if (result == null) result = caseExpression(minusOperatorExpression);
				if (result == null) result = caseEOLElement(minusOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.PLUS_OPERATOR_EXPRESSION: {
				PlusOperatorExpression plusOperatorExpression = (PlusOperatorExpression)theEObject;
				T result = casePlusOperatorExpression(plusOperatorExpression);
				if (result == null) result = caseArithmeticOperatorExpression(plusOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(plusOperatorExpression);
				if (result == null) result = caseOperatorExpression(plusOperatorExpression);
				if (result == null) result = caseExpression(plusOperatorExpression);
				if (result == null) result = caseEOLElement(plusOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.COMPARISON_OPERATOR_EXPRESSION: {
				ComparisonOperatorExpression comparisonOperatorExpression = (ComparisonOperatorExpression)theEObject;
				T result = caseComparisonOperatorExpression(comparisonOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(comparisonOperatorExpression);
				if (result == null) result = caseOperatorExpression(comparisonOperatorExpression);
				if (result == null) result = caseExpression(comparisonOperatorExpression);
				if (result == null) result = caseEOLElement(comparisonOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION: {
				GreaterThanOrEqualToOperatorExpression greaterThanOrEqualToOperatorExpression = (GreaterThanOrEqualToOperatorExpression)theEObject;
				T result = caseGreaterThanOrEqualToOperatorExpression(greaterThanOrEqualToOperatorExpression);
				if (result == null) result = caseComparisonOperatorExpression(greaterThanOrEqualToOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(greaterThanOrEqualToOperatorExpression);
				if (result == null) result = caseOperatorExpression(greaterThanOrEqualToOperatorExpression);
				if (result == null) result = caseExpression(greaterThanOrEqualToOperatorExpression);
				if (result == null) result = caseEOLElement(greaterThanOrEqualToOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.GREATER_THAN_OPERATOR_EXPRESSION: {
				GreaterThanOperatorExpression greaterThanOperatorExpression = (GreaterThanOperatorExpression)theEObject;
				T result = caseGreaterThanOperatorExpression(greaterThanOperatorExpression);
				if (result == null) result = caseComparisonOperatorExpression(greaterThanOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(greaterThanOperatorExpression);
				if (result == null) result = caseOperatorExpression(greaterThanOperatorExpression);
				if (result == null) result = caseExpression(greaterThanOperatorExpression);
				if (result == null) result = caseEOLElement(greaterThanOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION: {
				LessThanOrEqualToOperatorExpression lessThanOrEqualToOperatorExpression = (LessThanOrEqualToOperatorExpression)theEObject;
				T result = caseLessThanOrEqualToOperatorExpression(lessThanOrEqualToOperatorExpression);
				if (result == null) result = caseComparisonOperatorExpression(lessThanOrEqualToOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(lessThanOrEqualToOperatorExpression);
				if (result == null) result = caseOperatorExpression(lessThanOrEqualToOperatorExpression);
				if (result == null) result = caseExpression(lessThanOrEqualToOperatorExpression);
				if (result == null) result = caseEOLElement(lessThanOrEqualToOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.LESS_THAN_OPERATOR_EXPRESSION: {
				LessThanOperatorExpression lessThanOperatorExpression = (LessThanOperatorExpression)theEObject;
				T result = caseLessThanOperatorExpression(lessThanOperatorExpression);
				if (result == null) result = caseComparisonOperatorExpression(lessThanOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(lessThanOperatorExpression);
				if (result == null) result = caseOperatorExpression(lessThanOperatorExpression);
				if (result == null) result = caseExpression(lessThanOperatorExpression);
				if (result == null) result = caseEOLElement(lessThanOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.NOT_EQUALS_OPERATOR_EXPRESSION: {
				NotEqualsOperatorExpression notEqualsOperatorExpression = (NotEqualsOperatorExpression)theEObject;
				T result = caseNotEqualsOperatorExpression(notEqualsOperatorExpression);
				if (result == null) result = caseComparisonOperatorExpression(notEqualsOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(notEqualsOperatorExpression);
				if (result == null) result = caseOperatorExpression(notEqualsOperatorExpression);
				if (result == null) result = caseExpression(notEqualsOperatorExpression);
				if (result == null) result = caseEOLElement(notEqualsOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EQUALS_OPERATOR_EXPRESSION: {
				EqualsOperatorExpression equalsOperatorExpression = (EqualsOperatorExpression)theEObject;
				T result = caseEqualsOperatorExpression(equalsOperatorExpression);
				if (result == null) result = caseComparisonOperatorExpression(equalsOperatorExpression);
				if (result == null) result = caseBinaryOperatorExpression(equalsOperatorExpression);
				if (result == null) result = caseOperatorExpression(equalsOperatorExpression);
				if (result == null) result = caseExpression(equalsOperatorExpression);
				if (result == null) result = caseEOLElement(equalsOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.VARIABLE_DECLARATION_EXPRESSION: {
				VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression)theEObject;
				T result = caseVariableDeclarationExpression(variableDeclarationExpression);
				if (result == null) result = caseExpression(variableDeclarationExpression);
				if (result == null) result = caseEOLElement(variableDeclarationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.FORMAL_PARAMETER_EXPRESSION: {
				FormalParameterExpression formalParameterExpression = (FormalParameterExpression)theEObject;
				T result = caseFormalParameterExpression(formalParameterExpression);
				if (result == null) result = caseVariableDeclarationExpression(formalParameterExpression);
				if (result == null) result = caseExpression(formalParameterExpression);
				if (result == null) result = caseEOLElement(formalParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.NAME_EXPRESSION: {
				NameExpression nameExpression = (NameExpression)theEObject;
				T result = caseNameExpression(nameExpression);
				if (result == null) result = caseExpression(nameExpression);
				if (result == null) result = caseEOLElement(nameExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.FEATURE_CALL_EXPRESSION: {
				FeatureCallExpression featureCallExpression = (FeatureCallExpression)theEObject;
				T result = caseFeatureCallExpression(featureCallExpression);
				if (result == null) result = caseExpression(featureCallExpression);
				if (result == null) result = caseEOLElement(featureCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.METHOD_CALL_EXPRESSION: {
				MethodCallExpression methodCallExpression = (MethodCallExpression)theEObject;
				T result = caseMethodCallExpression(methodCallExpression);
				if (result == null) result = caseFeatureCallExpression(methodCallExpression);
				if (result == null) result = caseExpression(methodCallExpression);
				if (result == null) result = caseEOLElement(methodCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.PROPERTY_CALL_EXPRESSION: {
				PropertyCallExpression propertyCallExpression = (PropertyCallExpression)theEObject;
				T result = casePropertyCallExpression(propertyCallExpression);
				if (result == null) result = caseFeatureCallExpression(propertyCallExpression);
				if (result == null) result = caseExpression(propertyCallExpression);
				if (result == null) result = caseEOLElement(propertyCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.FOL_METHOD_CALL_EXPRESSION: {
				FOLMethodCallExpression folMethodCallExpression = (FOLMethodCallExpression)theEObject;
				T result = caseFOLMethodCallExpression(folMethodCallExpression);
				if (result == null) result = caseFeatureCallExpression(folMethodCallExpression);
				if (result == null) result = caseExpression(folMethodCallExpression);
				if (result == null) result = caseEOLElement(folMethodCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.KEY_VALUE_EXPRESSION: {
				KeyValueExpression keyValueExpression = (KeyValueExpression)theEObject;
				T result = caseKeyValueExpression(keyValueExpression);
				if (result == null) result = caseExpression(keyValueExpression);
				if (result == null) result = caseEOLElement(keyValueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MODEL_DECLARATION_PARAMETER: {
				ModelDeclarationParameter modelDeclarationParameter = (ModelDeclarationParameter)theEObject;
				T result = caseModelDeclarationParameter(modelDeclarationParameter);
				if (result == null) result = caseKeyValueExpression(modelDeclarationParameter);
				if (result == null) result = caseExpression(modelDeclarationParameter);
				if (result == null) result = caseEOLElement(modelDeclarationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.NEW_EXPRESSION: {
				NewExpression newExpression = (NewExpression)theEObject;
				T result = caseNewExpression(newExpression);
				if (result == null) result = caseExpression(newExpression);
				if (result == null) result = caseEOLElement(newExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MAP_EXPRESSION: {
				MapExpression mapExpression = (MapExpression)theEObject;
				T result = caseMapExpression(mapExpression);
				if (result == null) result = caseExpression(mapExpression);
				if (result == null) result = caseEOLElement(mapExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.COLLECTION_EXPRESSION: {
				CollectionExpression collectionExpression = (CollectionExpression)theEObject;
				T result = caseCollectionExpression(collectionExpression);
				if (result == null) result = caseExpression(collectionExpression);
				if (result == null) result = caseEOLElement(collectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.PRIMITIVE_EXPRESSION: {
				PrimitiveExpression primitiveExpression = (PrimitiveExpression)theEObject;
				T result = casePrimitiveExpression(primitiveExpression);
				if (result == null) result = caseExpression(primitiveExpression);
				if (result == null) result = caseEOLElement(primitiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.COMPARABLE_EXPRESSION: {
				ComparableExpression comparableExpression = (ComparableExpression)theEObject;
				T result = caseComparableExpression(comparableExpression);
				if (result == null) result = casePrimitiveExpression(comparableExpression);
				if (result == null) result = caseExpression(comparableExpression);
				if (result == null) result = caseEOLElement(comparableExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SUMMABLE_EXPRESSION: {
				SummableExpression summableExpression = (SummableExpression)theEObject;
				T result = caseSummableExpression(summableExpression);
				if (result == null) result = casePrimitiveExpression(summableExpression);
				if (result == null) result = caseExpression(summableExpression);
				if (result == null) result = caseEOLElement(summableExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseComparableExpression(stringExpression);
				if (result == null) result = caseSummableExpression(stringExpression);
				if (result == null) result = casePrimitiveExpression(stringExpression);
				if (result == null) result = caseExpression(stringExpression);
				if (result == null) result = caseEOLElement(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = casePrimitiveExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = caseEOLElement(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.REAL_EXPRESSION: {
				RealExpression realExpression = (RealExpression)theEObject;
				T result = caseRealExpression(realExpression);
				if (result == null) result = caseComparableExpression(realExpression);
				if (result == null) result = caseSummableExpression(realExpression);
				if (result == null) result = casePrimitiveExpression(realExpression);
				if (result == null) result = caseExpression(realExpression);
				if (result == null) result = caseEOLElement(realExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.INTEGER_EXPRESSION: {
				IntegerExpression integerExpression = (IntegerExpression)theEObject;
				T result = caseIntegerExpression(integerExpression);
				if (result == null) result = caseComparableExpression(integerExpression);
				if (result == null) result = caseSummableExpression(integerExpression);
				if (result == null) result = casePrimitiveExpression(integerExpression);
				if (result == null) result = caseExpression(integerExpression);
				if (result == null) result = caseEOLElement(integerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BAG_EXPRESSION: {
				BagExpression bagExpression = (BagExpression)theEObject;
				T result = caseBagExpression(bagExpression);
				if (result == null) result = caseCollectionExpression(bagExpression);
				if (result == null) result = caseExpression(bagExpression);
				if (result == null) result = caseEOLElement(bagExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SET_EXPRESSION: {
				SetExpression setExpression = (SetExpression)theEObject;
				T result = caseSetExpression(setExpression);
				if (result == null) result = caseUniqueCollection(setExpression);
				if (result == null) result = caseCollectionExpression(setExpression);
				if (result == null) result = caseExpression(setExpression);
				if (result == null) result = caseEOLElement(setExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ORDERED_SET_EXPRESSION: {
				OrderedSetExpression orderedSetExpression = (OrderedSetExpression)theEObject;
				T result = caseOrderedSetExpression(orderedSetExpression);
				if (result == null) result = caseOrderedCollection(orderedSetExpression);
				if (result == null) result = caseUniqueCollection(orderedSetExpression);
				if (result == null) result = caseCollectionExpression(orderedSetExpression);
				if (result == null) result = caseExpression(orderedSetExpression);
				if (result == null) result = caseEOLElement(orderedSetExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SEQUENCE_EXPRESSION: {
				SequenceExpression sequenceExpression = (SequenceExpression)theEObject;
				T result = caseSequenceExpression(sequenceExpression);
				if (result == null) result = caseOrderedCollection(sequenceExpression);
				if (result == null) result = caseCollectionExpression(sequenceExpression);
				if (result == null) result = caseExpression(sequenceExpression);
				if (result == null) result = caseEOLElement(sequenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ORDERED_COLLECTION: {
				OrderedCollection orderedCollection = (OrderedCollection)theEObject;
				T result = caseOrderedCollection(orderedCollection);
				if (result == null) result = caseCollectionExpression(orderedCollection);
				if (result == null) result = caseExpression(orderedCollection);
				if (result == null) result = caseEOLElement(orderedCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.UNIQUE_COLLECTION: {
				UniqueCollection uniqueCollection = (UniqueCollection)theEObject;
				T result = caseUniqueCollection(uniqueCollection);
				if (result == null) result = caseCollectionExpression(uniqueCollection);
				if (result == null) result = caseExpression(uniqueCollection);
				if (result == null) result = caseEOLElement(uniqueCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION: {
				EnumerationLiteralExpression enumerationLiteralExpression = (EnumerationLiteralExpression)theEObject;
				T result = caseEnumerationLiteralExpression(enumerationLiteralExpression);
				if (result == null) result = caseExpression(enumerationLiteralExpression);
				if (result == null) result = caseEOLElement(enumerationLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.COLLECTION_INITIALISATION_EXPRESSION: {
				CollectionInitialisationExpression collectionInitialisationExpression = (CollectionInitialisationExpression)theEObject;
				T result = caseCollectionInitialisationExpression(collectionInitialisationExpression);
				if (result == null) result = caseExpression(collectionInitialisationExpression);
				if (result == null) result = caseEOLElement(collectionInitialisationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EXPRESSION_RANGE: {
				ExpressionRange expressionRange = (ExpressionRange)theEObject;
				T result = caseExpressionRange(expressionRange);
				if (result == null) result = caseCollectionInitialisationExpression(expressionRange);
				if (result == null) result = caseExpression(expressionRange);
				if (result == null) result = caseEOLElement(expressionRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EXPRESSION_LIST: {
				ExpressionList expressionList = (ExpressionList)theEObject;
				T result = caseExpressionList(expressionList);
				if (result == null) result = caseCollectionInitialisationExpression(expressionList);
				if (result == null) result = caseExpression(expressionList);
				if (result == null) result = caseEOLElement(expressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseEOLElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.TRANSACTION_STATEMENT: {
				TransactionStatement transactionStatement = (TransactionStatement)theEObject;
				T result = caseTransactionStatement(transactionStatement);
				if (result == null) result = caseStatement(transactionStatement);
				if (result == null) result = caseEOLElement(transactionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseEOLElement(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SWITCH_STATEMENT: {
				SwitchStatement switchStatement = (SwitchStatement)theEObject;
				T result = caseSwitchStatement(switchStatement);
				if (result == null) result = caseStatement(switchStatement);
				if (result == null) result = caseEOLElement(switchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SWITCH_CASE_STATEMENT: {
				SwitchCaseStatement switchCaseStatement = (SwitchCaseStatement)theEObject;
				T result = caseSwitchCaseStatement(switchCaseStatement);
				if (result == null) result = caseStatement(switchCaseStatement);
				if (result == null) result = caseEOLElement(switchCaseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SWITCH_CASE_DEFAULT_STATEMENT: {
				SwitchCaseDefaultStatement switchCaseDefaultStatement = (SwitchCaseDefaultStatement)theEObject;
				T result = caseSwitchCaseDefaultStatement(switchCaseDefaultStatement);
				if (result == null) result = caseSwitchCaseStatement(switchCaseDefaultStatement);
				if (result == null) result = caseStatement(switchCaseDefaultStatement);
				if (result == null) result = caseEOLElement(switchCaseDefaultStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SWITCH_CASE_EXPRESSION_STATEMENT: {
				SwitchCaseExpressionStatement switchCaseExpressionStatement = (SwitchCaseExpressionStatement)theEObject;
				T result = caseSwitchCaseExpressionStatement(switchCaseExpressionStatement);
				if (result == null) result = caseSwitchCaseStatement(switchCaseExpressionStatement);
				if (result == null) result = caseStatement(switchCaseExpressionStatement);
				if (result == null) result = caseEOLElement(switchCaseExpressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = caseEOLElement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.FOR_STATEMENT: {
				ForStatement forStatement = (ForStatement)theEObject;
				T result = caseForStatement(forStatement);
				if (result == null) result = caseStatement(forStatement);
				if (result == null) result = caseEOLElement(forStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T result = caseWhileStatement(whileStatement);
				if (result == null) result = caseStatement(whileStatement);
				if (result == null) result = caseEOLElement(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T result = caseReturnStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = caseEOLElement(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.THROW_STATEMENT: {
				ThrowStatement throwStatement = (ThrowStatement)theEObject;
				T result = caseThrowStatement(throwStatement);
				if (result == null) result = caseStatement(throwStatement);
				if (result == null) result = caseEOLElement(throwStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.DELETE_STATEMENT: {
				DeleteStatement deleteStatement = (DeleteStatement)theEObject;
				T result = caseDeleteStatement(deleteStatement);
				if (result == null) result = caseStatement(deleteStatement);
				if (result == null) result = caseEOLElement(deleteStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ASSIGNMENT_STATEMENT: {
				AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
				T result = caseAssignmentStatement(assignmentStatement);
				if (result == null) result = caseStatement(assignmentStatement);
				if (result == null) result = caseEOLElement(assignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SPECIAL_ASSIGNMENT_STATEMENT: {
				SpecialAssignmentStatement specialAssignmentStatement = (SpecialAssignmentStatement)theEObject;
				T result = caseSpecialAssignmentStatement(specialAssignmentStatement);
				if (result == null) result = caseAssignmentStatement(specialAssignmentStatement);
				if (result == null) result = caseStatement(specialAssignmentStatement);
				if (result == null) result = caseEOLElement(specialAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.CONTINUE_STATEMENT: {
				ContinueStatement continueStatement = (ContinueStatement)theEObject;
				T result = caseContinueStatement(continueStatement);
				if (result == null) result = caseStatement(continueStatement);
				if (result == null) result = caseEOLElement(continueStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ABORT_STATEMENT: {
				AbortStatement abortStatement = (AbortStatement)theEObject;
				T result = caseAbortStatement(abortStatement);
				if (result == null) result = caseStatement(abortStatement);
				if (result == null) result = caseEOLElement(abortStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BREAK_STATEMENT: {
				BreakStatement breakStatement = (BreakStatement)theEObject;
				T result = caseBreakStatement(breakStatement);
				if (result == null) result = caseStatement(breakStatement);
				if (result == null) result = caseEOLElement(breakStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BREAK_ALL_STATEMENT: {
				BreakAllStatement breakAllStatement = (BreakAllStatement)theEObject;
				T result = caseBreakAllStatement(breakAllStatement);
				if (result == null) result = caseStatement(breakAllStatement);
				if (result == null) result = caseEOLElement(breakAllStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ANNOTATION_STATEMENT: {
				AnnotationStatement annotationStatement = (AnnotationStatement)theEObject;
				T result = caseAnnotationStatement(annotationStatement);
				if (result == null) result = caseStatement(annotationStatement);
				if (result == null) result = caseEOLElement(annotationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SIMPLE_ANNOTATION_STATEMENT: {
				SimpleAnnotationStatement simpleAnnotationStatement = (SimpleAnnotationStatement)theEObject;
				T result = caseSimpleAnnotationStatement(simpleAnnotationStatement);
				if (result == null) result = caseAnnotationStatement(simpleAnnotationStatement);
				if (result == null) result = caseStatement(simpleAnnotationStatement);
				if (result == null) result = caseEOLElement(simpleAnnotationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.EXECUTABLE_ANNOTATION_STATEMENT: {
				ExecutableAnnotationStatement executableAnnotationStatement = (ExecutableAnnotationStatement)theEObject;
				T result = caseExecutableAnnotationStatement(executableAnnotationStatement);
				if (result == null) result = caseAnnotationStatement(executableAnnotationStatement);
				if (result == null) result = caseStatement(executableAnnotationStatement);
				if (result == null) result = caseEOLElement(executableAnnotationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MODEL_DECLARATION_STATEMENT: {
				ModelDeclarationStatement modelDeclarationStatement = (ModelDeclarationStatement)theEObject;
				T result = caseModelDeclarationStatement(modelDeclarationStatement);
				if (result == null) result = caseStatement(modelDeclarationStatement);
				if (result == null) result = caseEOLElement(modelDeclarationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseEOLElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ANY_TYPE: {
				AnyType anyType = (AnyType)theEObject;
				T result = caseAnyType(anyType);
				if (result == null) result = caseType(anyType);
				if (result == null) result = caseEOLElement(anyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseAnyType(modelType);
				if (result == null) result = caseType(modelType);
				if (result == null) result = caseEOLElement(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MODEL_ELEMENT_TYPE: {
				ModelElementType modelElementType = (ModelElementType)theEObject;
				T result = caseModelElementType(modelElementType);
				if (result == null) result = caseAnyType(modelElementType);
				if (result == null) result = caseType(modelElementType);
				if (result == null) result = caseEOLElement(modelElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.PSEUDO_TYPE: {
				PseudoType pseudoType = (PseudoType)theEObject;
				T result = casePseudoType(pseudoType);
				if (result == null) result = caseAnyType(pseudoType);
				if (result == null) result = caseType(pseudoType);
				if (result == null) result = caseEOLElement(pseudoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SELF_TYPE: {
				SelfType selfType = (SelfType)theEObject;
				T result = caseSelfType(selfType);
				if (result == null) result = casePseudoType(selfType);
				if (result == null) result = caseAnyType(selfType);
				if (result == null) result = caseType(selfType);
				if (result == null) result = caseEOLElement(selfType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SELF_CONTENT_TYPE: {
				SelfContentType selfContentType = (SelfContentType)theEObject;
				T result = caseSelfContentType(selfContentType);
				if (result == null) result = casePseudoType(selfContentType);
				if (result == null) result = caseAnyType(selfContentType);
				if (result == null) result = caseType(selfContentType);
				if (result == null) result = caseEOLElement(selfContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.MAP_TYPE: {
				MapType mapType = (MapType)theEObject;
				T result = caseMapType(mapType);
				if (result == null) result = caseAnyType(mapType);
				if (result == null) result = caseType(mapType);
				if (result == null) result = caseEOLElement(mapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.NATIVE_TYPE: {
				NativeType nativeType = (NativeType)theEObject;
				T result = caseNativeType(nativeType);
				if (result == null) result = caseAnyType(nativeType);
				if (result == null) result = caseType(nativeType);
				if (result == null) result = caseEOLElement(nativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				T result = caseVoidType(voidType);
				if (result == null) result = caseAnyType(voidType);
				if (result == null) result = caseType(voidType);
				if (result == null) result = caseEOLElement(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.INVALID_TYPE: {
				InvalidType invalidType = (InvalidType)theEObject;
				T result = caseInvalidType(invalidType);
				if (result == null) result = caseAnyType(invalidType);
				if (result == null) result = caseType(invalidType);
				if (result == null) result = caseEOLElement(invalidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = caseAnyType(collectionType);
				if (result == null) result = caseType(collectionType);
				if (result == null) result = caseEOLElement(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BAG_TYPE: {
				BagType bagType = (BagType)theEObject;
				T result = caseBagType(bagType);
				if (result == null) result = caseCollectionType(bagType);
				if (result == null) result = caseAnyType(bagType);
				if (result == null) result = caseType(bagType);
				if (result == null) result = caseEOLElement(bagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ORDERED_COLLECTION_TYPE: {
				OrderedCollectionType orderedCollectionType = (OrderedCollectionType)theEObject;
				T result = caseOrderedCollectionType(orderedCollectionType);
				if (result == null) result = caseCollectionType(orderedCollectionType);
				if (result == null) result = caseAnyType(orderedCollectionType);
				if (result == null) result = caseType(orderedCollectionType);
				if (result == null) result = caseEOLElement(orderedCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.UNIQUE_COLLECTION_TYPE: {
				UniqueCollectionType uniqueCollectionType = (UniqueCollectionType)theEObject;
				T result = caseUniqueCollectionType(uniqueCollectionType);
				if (result == null) result = caseCollectionType(uniqueCollectionType);
				if (result == null) result = caseAnyType(uniqueCollectionType);
				if (result == null) result = caseType(uniqueCollectionType);
				if (result == null) result = caseEOLElement(uniqueCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				T result = caseSetType(setType);
				if (result == null) result = caseUniqueCollectionType(setType);
				if (result == null) result = caseCollectionType(setType);
				if (result == null) result = caseAnyType(setType);
				if (result == null) result = caseType(setType);
				if (result == null) result = caseEOLElement(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.ORDERED_SET_TYPE: {
				OrderedSetType orderedSetType = (OrderedSetType)theEObject;
				T result = caseOrderedSetType(orderedSetType);
				if (result == null) result = caseUniqueCollectionType(orderedSetType);
				if (result == null) result = caseOrderedCollectionType(orderedSetType);
				if (result == null) result = caseCollectionType(orderedSetType);
				if (result == null) result = caseAnyType(orderedSetType);
				if (result == null) result = caseType(orderedSetType);
				if (result == null) result = caseEOLElement(orderedSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = caseOrderedCollectionType(sequenceType);
				if (result == null) result = caseCollectionType(sequenceType);
				if (result == null) result = caseAnyType(sequenceType);
				if (result == null) result = caseType(sequenceType);
				if (result == null) result = caseEOLElement(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseAnyType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseEOLElement(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.COMPARABLE_PRIMITIVE_TYPE: {
				ComparablePrimitiveType comparablePrimitiveType = (ComparablePrimitiveType)theEObject;
				T result = caseComparablePrimitiveType(comparablePrimitiveType);
				if (result == null) result = casePrimitiveType(comparablePrimitiveType);
				if (result == null) result = caseAnyType(comparablePrimitiveType);
				if (result == null) result = caseType(comparablePrimitiveType);
				if (result == null) result = caseEOLElement(comparablePrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.SUMMABLE_PRIMITIVE_TYPE: {
				SummablePrimitiveType summablePrimitiveType = (SummablePrimitiveType)theEObject;
				T result = caseSummablePrimitiveType(summablePrimitiveType);
				if (result == null) result = casePrimitiveType(summablePrimitiveType);
				if (result == null) result = caseAnyType(summablePrimitiveType);
				if (result == null) result = caseType(summablePrimitiveType);
				if (result == null) result = caseEOLElement(summablePrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = casePrimitiveType(booleanType);
				if (result == null) result = caseAnyType(booleanType);
				if (result == null) result = caseType(booleanType);
				if (result == null) result = caseEOLElement(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				T result = caseRealType(realType);
				if (result == null) result = caseComparablePrimitiveType(realType);
				if (result == null) result = caseSummablePrimitiveType(realType);
				if (result == null) result = casePrimitiveType(realType);
				if (result == null) result = caseAnyType(realType);
				if (result == null) result = caseType(realType);
				if (result == null) result = caseEOLElement(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = caseRealType(integerType);
				if (result == null) result = caseComparablePrimitiveType(integerType);
				if (result == null) result = caseSummablePrimitiveType(integerType);
				if (result == null) result = casePrimitiveType(integerType);
				if (result == null) result = caseAnyType(integerType);
				if (result == null) result = caseType(integerType);
				if (result == null) result = caseEOLElement(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EolPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = caseComparablePrimitiveType(stringType);
				if (result == null) result = caseSummablePrimitiveType(stringType);
				if (result == null) result = casePrimitiveType(stringType);
				if (result == null) result = caseAnyType(stringType);
				if (result == null) result = caseType(stringType);
				if (result == null) result = caseEOLElement(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOL Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOL Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOLElement(EOLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMetamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMetamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMetamodel(IMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPackage(IPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextRegion(TextRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPosition(TextPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOL Library Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOL Library Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOLLibraryModule(EOLLibraryModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EOL Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EOL Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEOLModule(EOLModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationBlock(AnnotationBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Or Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Or Statement Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionOrStatementBlock(ExpressionOrStatementBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinition(OperationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorExpression(OperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperatorExpression(UnaryOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotOperatorExpression(NotOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeOperatorExpression(NegativeOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperatorExpression(BinaryOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperatorExpression(LogicalOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndOperatorExpression(AndOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXorOperatorExpression(XorOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrOperatorExpression(OrOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliesOperatorExpression(ImpliesOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticOperatorExpression(ArithmeticOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivideOperatorExpression(DivideOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplyOperatorExpression(MultiplyOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinusOperatorExpression(MinusOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlusOperatorExpression(PlusOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOperatorExpression(ComparisonOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Or Equal To Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Or Equal To Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOrEqualToOperatorExpression(GreaterThanOrEqualToOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOperatorExpression(GreaterThanOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Or Equal To Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Or Equal To Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOrEqualToOperatorExpression(LessThanOrEqualToOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOperatorExpression(LessThanOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equals Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equals Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqualsOperatorExpression(NotEqualsOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualsOperatorExpression(EqualsOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationExpression(VariableDeclarationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterExpression(FormalParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameExpression(NameExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCallExpression(FeatureCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCallExpression(MethodCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCallExpression(PropertyCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FOL Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FOL Method Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFOLMethodCallExpression(FOLMethodCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueExpression(KeyValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Declaration Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Declaration Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelDeclarationParameter(ModelDeclarationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewExpression(NewExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapExpression(MapExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpression(CollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveExpression(PrimitiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparableExpression(ComparableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Summable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Summable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummableExpression(SummableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealExpression(RealExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression(IntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagExpression(BagExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExpression(SetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Set Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedSetExpression(OrderedSetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceExpression(SequenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedCollection(OrderedCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueCollection(UniqueCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteralExpression(EnumerationLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Initialisation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Initialisation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionInitialisationExpression(CollectionInitialisationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionRange(ExpressionRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionList(ExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionStatement(TransactionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement(SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCaseStatement(SwitchCaseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case Default Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case Default Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCaseDefaultStatement(SwitchCaseDefaultStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCaseExpressionStatement(SwitchCaseExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowStatement(ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteStatement(DeleteStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentStatement(AssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialAssignmentStatement(SpecialAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueStatement(ContinueStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbortStatement(AbortStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatement(BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break All Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break All Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakAllStatement(BreakAllStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationStatement(AnnotationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Annotation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Annotation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAnnotationStatement(SimpleAnnotationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Annotation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Annotation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableAnnotationStatement(ExecutableAnnotationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Declaration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelDeclarationStatement(ModelDeclarationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyType(AnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementType(ModelElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudoType(PseudoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfType(SelfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfContentType(SelfContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapType(MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeType(NativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidType(InvalidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagType(BagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedCollectionType(OrderedCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueCollectionType(UniqueCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedSetType(OrderedSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparablePrimitiveType(ComparablePrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Summable Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Summable Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSummablePrimitiveType(SummablePrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EolSwitch
