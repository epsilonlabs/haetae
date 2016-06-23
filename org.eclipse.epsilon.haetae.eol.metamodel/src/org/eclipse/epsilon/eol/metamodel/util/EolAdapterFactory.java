/**
 */
package org.eclipse.epsilon.eol.metamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.epsilon.eol.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage
 * @generated
 */
public class EolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EolSwitch<Adapter> modelSwitch =
		new EolSwitch<Adapter>() {
			@Override
			public Adapter caseEOLElement(EOLElement object) {
				return createEOLElementAdapter();
			}
			@Override
			public Adapter caseTextRegion(TextRegion object) {
				return createTextRegionAdapter();
			}
			@Override
			public Adapter caseTextPosition(TextPosition object) {
				return createTextPositionAdapter();
			}
			@Override
			public Adapter caseEOLLibraryModule(EOLLibraryModule object) {
				return createEOLLibraryModuleAdapter();
			}
			@Override
			public Adapter caseEOLModule(EOLModule object) {
				return createEOLModuleAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseAnnotationBlock(AnnotationBlock object) {
				return createAnnotationBlockAdapter();
			}
			@Override
			public Adapter caseExpressionOrStatementBlock(ExpressionOrStatementBlock object) {
				return createExpressionOrStatementBlockAdapter();
			}
			@Override
			public Adapter caseOperationDefinition(OperationDefinition object) {
				return createOperationDefinitionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseOperatorExpression(OperatorExpression object) {
				return createOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryOperatorExpression(UnaryOperatorExpression object) {
				return createUnaryOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseNotOperatorExpression(NotOperatorExpression object) {
				return createNotOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseNegativeOperatorExpression(NegativeOperatorExpression object) {
				return createNegativeOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryOperatorExpression(BinaryOperatorExpression object) {
				return createBinaryOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseLogicalOperatorExpression(LogicalOperatorExpression object) {
				return createLogicalOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseAndOperatorExpression(AndOperatorExpression object) {
				return createAndOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseXorOperatorExpression(XorOperatorExpression object) {
				return createXorOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseOrOperatorExpression(OrOperatorExpression object) {
				return createOrOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseImpliesOperatorExpression(ImpliesOperatorExpression object) {
				return createImpliesOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseArithmeticOperatorExpression(ArithmeticOperatorExpression object) {
				return createArithmeticOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseDivideOperatorExpression(DivideOperatorExpression object) {
				return createDivideOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseMultiplyOperatorExpression(MultiplyOperatorExpression object) {
				return createMultiplyOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseMinusOperatorExpression(MinusOperatorExpression object) {
				return createMinusOperatorExpressionAdapter();
			}
			@Override
			public Adapter casePlusOperatorExpression(PlusOperatorExpression object) {
				return createPlusOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseComparisonOperatorExpression(ComparisonOperatorExpression object) {
				return createComparisonOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseGreaterThanOrEqualToOperatorExpression(GreaterThanOrEqualToOperatorExpression object) {
				return createGreaterThanOrEqualToOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseGreaterThanOperatorExpression(GreaterThanOperatorExpression object) {
				return createGreaterThanOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseLessThanOrEqualToOperatorExpression(LessThanOrEqualToOperatorExpression object) {
				return createLessThanOrEqualToOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseLessThanOperatorExpression(LessThanOperatorExpression object) {
				return createLessThanOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseNotEqualsOperatorExpression(NotEqualsOperatorExpression object) {
				return createNotEqualsOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseEqualsOperatorExpression(EqualsOperatorExpression object) {
				return createEqualsOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationExpression(VariableDeclarationExpression object) {
				return createVariableDeclarationExpressionAdapter();
			}
			@Override
			public Adapter caseFormalParameterExpression(FormalParameterExpression object) {
				return createFormalParameterExpressionAdapter();
			}
			@Override
			public Adapter caseNameExpression(NameExpression object) {
				return createNameExpressionAdapter();
			}
			@Override
			public Adapter caseFeatureCallExpression(FeatureCallExpression object) {
				return createFeatureCallExpressionAdapter();
			}
			@Override
			public Adapter caseMethodCallExpression(MethodCallExpression object) {
				return createMethodCallExpressionAdapter();
			}
			@Override
			public Adapter casePropertyCallExpression(PropertyCallExpression object) {
				return createPropertyCallExpressionAdapter();
			}
			@Override
			public Adapter caseFOLMethodCallExpression(FOLMethodCallExpression object) {
				return createFOLMethodCallExpressionAdapter();
			}
			@Override
			public Adapter caseKeyValueExpression(KeyValueExpression object) {
				return createKeyValueExpressionAdapter();
			}
			@Override
			public Adapter caseModelDeclarationParameter(ModelDeclarationParameter object) {
				return createModelDeclarationParameterAdapter();
			}
			@Override
			public Adapter caseNewExpression(NewExpression object) {
				return createNewExpressionAdapter();
			}
			@Override
			public Adapter caseMapExpression(MapExpression object) {
				return createMapExpressionAdapter();
			}
			@Override
			public Adapter caseCollectionExpression(CollectionExpression object) {
				return createCollectionExpressionAdapter();
			}
			@Override
			public Adapter casePrimitiveExpression(PrimitiveExpression object) {
				return createPrimitiveExpressionAdapter();
			}
			@Override
			public Adapter caseComparableExpression(ComparableExpression object) {
				return createComparableExpressionAdapter();
			}
			@Override
			public Adapter caseSummableExpression(SummableExpression object) {
				return createSummableExpressionAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseRealExpression(RealExpression object) {
				return createRealExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseBagExpression(BagExpression object) {
				return createBagExpressionAdapter();
			}
			@Override
			public Adapter caseSetExpression(SetExpression object) {
				return createSetExpressionAdapter();
			}
			@Override
			public Adapter caseOrderedSetExpression(OrderedSetExpression object) {
				return createOrderedSetExpressionAdapter();
			}
			@Override
			public Adapter caseSequenceExpression(SequenceExpression object) {
				return createSequenceExpressionAdapter();
			}
			@Override
			public Adapter caseOrderedCollection(OrderedCollection object) {
				return createOrderedCollectionAdapter();
			}
			@Override
			public Adapter caseUniqueCollection(UniqueCollection object) {
				return createUniqueCollectionAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteralExpression(EnumerationLiteralExpression object) {
				return createEnumerationLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseCollectionInitialisationExpression(CollectionInitialisationExpression object) {
				return createCollectionInitialisationExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionRange(ExpressionRange object) {
				return createExpressionRangeAdapter();
			}
			@Override
			public Adapter caseExpressionList(ExpressionList object) {
				return createExpressionListAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseTransactionStatement(TransactionStatement object) {
				return createTransactionStatementAdapter();
			}
			@Override
			public Adapter caseExpressionStatement(ExpressionStatement object) {
				return createExpressionStatementAdapter();
			}
			@Override
			public Adapter caseSwitchStatement(SwitchStatement object) {
				return createSwitchStatementAdapter();
			}
			@Override
			public Adapter caseSwitchCaseStatement(SwitchCaseStatement object) {
				return createSwitchCaseStatementAdapter();
			}
			@Override
			public Adapter caseSwitchCaseDefaultStatement(SwitchCaseDefaultStatement object) {
				return createSwitchCaseDefaultStatementAdapter();
			}
			@Override
			public Adapter caseSwitchCaseExpressionStatement(SwitchCaseExpressionStatement object) {
				return createSwitchCaseExpressionStatementAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseForStatement(ForStatement object) {
				return createForStatementAdapter();
			}
			@Override
			public Adapter caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			@Override
			public Adapter caseReturnStatement(ReturnStatement object) {
				return createReturnStatementAdapter();
			}
			@Override
			public Adapter caseThrowStatement(ThrowStatement object) {
				return createThrowStatementAdapter();
			}
			@Override
			public Adapter caseDeleteStatement(DeleteStatement object) {
				return createDeleteStatementAdapter();
			}
			@Override
			public Adapter caseAssignmentStatement(AssignmentStatement object) {
				return createAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseSpecialAssignmentStatement(SpecialAssignmentStatement object) {
				return createSpecialAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseContinueStatement(ContinueStatement object) {
				return createContinueStatementAdapter();
			}
			@Override
			public Adapter caseAbortStatement(AbortStatement object) {
				return createAbortStatementAdapter();
			}
			@Override
			public Adapter caseBreakStatement(BreakStatement object) {
				return createBreakStatementAdapter();
			}
			@Override
			public Adapter caseBreakAllStatement(BreakAllStatement object) {
				return createBreakAllStatementAdapter();
			}
			@Override
			public Adapter caseAnnotationStatement(AnnotationStatement object) {
				return createAnnotationStatementAdapter();
			}
			@Override
			public Adapter caseSimpleAnnotationStatement(SimpleAnnotationStatement object) {
				return createSimpleAnnotationStatementAdapter();
			}
			@Override
			public Adapter caseExecutableAnnotationStatement(ExecutableAnnotationStatement object) {
				return createExecutableAnnotationStatementAdapter();
			}
			@Override
			public Adapter caseModelDeclarationStatement(ModelDeclarationStatement object) {
				return createModelDeclarationStatementAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseAnyType(AnyType object) {
				return createAnyTypeAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseModelElementType(ModelElementType object) {
				return createModelElementTypeAdapter();
			}
			@Override
			public Adapter casePseudoType(PseudoType object) {
				return createPseudoTypeAdapter();
			}
			@Override
			public Adapter caseSelfType(SelfType object) {
				return createSelfTypeAdapter();
			}
			@Override
			public Adapter caseSelfContentType(SelfContentType object) {
				return createSelfContentTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseNativeType(NativeType object) {
				return createNativeTypeAdapter();
			}
			@Override
			public Adapter caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			@Override
			public Adapter caseInvalidType(InvalidType object) {
				return createInvalidTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseBagType(BagType object) {
				return createBagTypeAdapter();
			}
			@Override
			public Adapter caseOrderedCollectionType(OrderedCollectionType object) {
				return createOrderedCollectionTypeAdapter();
			}
			@Override
			public Adapter caseUniqueCollectionType(UniqueCollectionType object) {
				return createUniqueCollectionTypeAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseOrderedSetType(OrderedSetType object) {
				return createOrderedSetTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseComparablePrimitiveType(ComparablePrimitiveType object) {
				return createComparablePrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseSummablePrimitiveType(SummablePrimitiveType object) {
				return createSummablePrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.EOLElement <em>EOL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLElement
	 * @generated
	 */
	public Adapter createEOLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.TextRegion <em>Text Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.TextRegion
	 * @generated
	 */
	public Adapter createTextRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.TextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.TextPosition
	 * @generated
	 */
	public Adapter createTextPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.EOLLibraryModule <em>EOL Library Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLLibraryModule
	 * @generated
	 */
	public Adapter createEOLLibraryModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.EOLModule <em>EOL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLModule
	 * @generated
	 */
	public Adapter createEOLModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.AnnotationBlock <em>Annotation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.AnnotationBlock
	 * @generated
	 */
	public Adapter createAnnotationBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock <em>Expression Or Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock
	 * @generated
	 */
	public Adapter createExpressionOrStatementBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition <em>Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition
	 * @generated
	 */
	public Adapter createOperationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.OperatorExpression <em>Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.OperatorExpression
	 * @generated
	 */
	public Adapter createOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.UnaryOperatorExpression <em>Unary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.UnaryOperatorExpression
	 * @generated
	 */
	public Adapter createUnaryOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.NotOperatorExpression <em>Not Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.NotOperatorExpression
	 * @generated
	 */
	public Adapter createNotOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.NegativeOperatorExpression <em>Negative Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.NegativeOperatorExpression
	 * @generated
	 */
	public Adapter createNegativeOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression <em>Binary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression
	 * @generated
	 */
	public Adapter createBinaryOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.LogicalOperatorExpression <em>Logical Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.LogicalOperatorExpression
	 * @generated
	 */
	public Adapter createLogicalOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.AndOperatorExpression <em>And Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.AndOperatorExpression
	 * @generated
	 */
	public Adapter createAndOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.XorOperatorExpression <em>Xor Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.XorOperatorExpression
	 * @generated
	 */
	public Adapter createXorOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.OrOperatorExpression <em>Or Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.OrOperatorExpression
	 * @generated
	 */
	public Adapter createOrOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ImpliesOperatorExpression <em>Implies Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ImpliesOperatorExpression
	 * @generated
	 */
	public Adapter createImpliesOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ArithmeticOperatorExpression <em>Arithmetic Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ArithmeticOperatorExpression
	 * @generated
	 */
	public Adapter createArithmeticOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.DivideOperatorExpression <em>Divide Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.DivideOperatorExpression
	 * @generated
	 */
	public Adapter createDivideOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.MultiplyOperatorExpression <em>Multiply Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.MultiplyOperatorExpression
	 * @generated
	 */
	public Adapter createMultiplyOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.MinusOperatorExpression <em>Minus Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.MinusOperatorExpression
	 * @generated
	 */
	public Adapter createMinusOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.PlusOperatorExpression <em>Plus Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.PlusOperatorExpression
	 * @generated
	 */
	public Adapter createPlusOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ComparisonOperatorExpression <em>Comparison Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ComparisonOperatorExpression
	 * @generated
	 */
	public Adapter createComparisonOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.GreaterThanOrEqualToOperatorExpression <em>Greater Than Or Equal To Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.GreaterThanOrEqualToOperatorExpression
	 * @generated
	 */
	public Adapter createGreaterThanOrEqualToOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression <em>Greater Than Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression
	 * @generated
	 */
	public Adapter createGreaterThanOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.LessThanOrEqualToOperatorExpression <em>Less Than Or Equal To Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.LessThanOrEqualToOperatorExpression
	 * @generated
	 */
	public Adapter createLessThanOrEqualToOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.LessThanOperatorExpression <em>Less Than Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.LessThanOperatorExpression
	 * @generated
	 */
	public Adapter createLessThanOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression <em>Not Equals Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression
	 * @generated
	 */
	public Adapter createNotEqualsOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression <em>Equals Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression
	 * @generated
	 */
	public Adapter createEqualsOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression
	 * @generated
	 */
	public Adapter createVariableDeclarationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.FormalParameterExpression <em>Formal Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.FormalParameterExpression
	 * @generated
	 */
	public Adapter createFormalParameterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.NameExpression
	 * @generated
	 */
	public Adapter createNameExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression <em>Feature Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.FeatureCallExpression
	 * @generated
	 */
	public Adapter createFeatureCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression <em>Method Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.MethodCallExpression
	 * @generated
	 */
	public Adapter createMethodCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression <em>Property Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.PropertyCallExpression
	 * @generated
	 */
	public Adapter createPropertyCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression <em>FOL Method Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression
	 * @generated
	 */
	public Adapter createFOLMethodCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.KeyValueExpression <em>Key Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.KeyValueExpression
	 * @generated
	 */
	public Adapter createKeyValueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationParameter <em>Model Declaration Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationParameter
	 * @generated
	 */
	public Adapter createModelDeclarationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.NewExpression <em>New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.NewExpression
	 * @generated
	 */
	public Adapter createNewExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.MapExpression <em>Map Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.MapExpression
	 * @generated
	 */
	public Adapter createMapExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionExpression
	 * @generated
	 */
	public Adapter createCollectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.PrimitiveExpression <em>Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.PrimitiveExpression
	 * @generated
	 */
	public Adapter createPrimitiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ComparableExpression <em>Comparable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ComparableExpression
	 * @generated
	 */
	public Adapter createComparableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SummableExpression <em>Summable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SummableExpression
	 * @generated
	 */
	public Adapter createSummableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.RealExpression <em>Real Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.RealExpression
	 * @generated
	 */
	public Adapter createRealExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.BagExpression <em>Bag Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.BagExpression
	 * @generated
	 */
	public Adapter createBagExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SetExpression
	 * @generated
	 */
	public Adapter createSetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.OrderedSetExpression <em>Ordered Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedSetExpression
	 * @generated
	 */
	public Adapter createOrderedSetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SequenceExpression <em>Sequence Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SequenceExpression
	 * @generated
	 */
	public Adapter createSequenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.OrderedCollection <em>Ordered Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedCollection
	 * @generated
	 */
	public Adapter createOrderedCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.UniqueCollection <em>Unique Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.UniqueCollection
	 * @generated
	 */
	public Adapter createUniqueCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression <em>Enumeration Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression
	 * @generated
	 */
	public Adapter createEnumerationLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.CollectionInitialisationExpression <em>Collection Initialisation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionInitialisationExpression
	 * @generated
	 */
	public Adapter createCollectionInitialisationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange <em>Expression Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionRange
	 * @generated
	 */
	public Adapter createExpressionRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionList
	 * @generated
	 */
	public Adapter createExpressionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.TransactionStatement <em>Transaction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.TransactionStatement
	 * @generated
	 */
	public Adapter createTransactionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionStatement
	 * @generated
	 */
	public Adapter createExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement <em>Switch Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement
	 * @generated
	 */
	public Adapter createSwitchCaseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseDefaultStatement <em>Switch Case Default Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseDefaultStatement
	 * @generated
	 */
	public Adapter createSwitchCaseDefaultStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement <em>Switch Case Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement
	 * @generated
	 */
	public Adapter createSwitchCaseExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ThrowStatement
	 * @generated
	 */
	public Adapter createThrowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.DeleteStatement <em>Delete Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.DeleteStatement
	 * @generated
	 */
	public Adapter createDeleteStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.AssignmentStatement
	 * @generated
	 */
	public Adapter createAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SpecialAssignmentStatement <em>Special Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SpecialAssignmentStatement
	 * @generated
	 */
	public Adapter createSpecialAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ContinueStatement
	 * @generated
	 */
	public Adapter createContinueStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.AbortStatement <em>Abort Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.AbortStatement
	 * @generated
	 */
	public Adapter createAbortStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.BreakStatement
	 * @generated
	 */
	public Adapter createBreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.BreakAllStatement <em>Break All Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.BreakAllStatement
	 * @generated
	 */
	public Adapter createBreakAllStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.AnnotationStatement <em>Annotation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.AnnotationStatement
	 * @generated
	 */
	public Adapter createAnnotationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement <em>Simple Annotation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement
	 * @generated
	 */
	public Adapter createSimpleAnnotationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ExecutableAnnotationStatement <em>Executable Annotation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ExecutableAnnotationStatement
	 * @generated
	 */
	public Adapter createExecutableAnnotationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement <em>Model Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement
	 * @generated
	 */
	public Adapter createModelDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.AnyType
	 * @generated
	 */
	public Adapter createAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType <em>Model Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType
	 * @generated
	 */
	public Adapter createModelElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.PseudoType <em>Pseudo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.PseudoType
	 * @generated
	 */
	public Adapter createPseudoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SelfType <em>Self Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SelfType
	 * @generated
	 */
	public Adapter createSelfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SelfContentType <em>Self Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SelfContentType
	 * @generated
	 */
	public Adapter createSelfContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.NativeType
	 * @generated
	 */
	public Adapter createNativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.VoidType
	 * @generated
	 */
	public Adapter createVoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.InvalidType <em>Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.InvalidType
	 * @generated
	 */
	public Adapter createInvalidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.OrderedCollectionType <em>Ordered Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedCollectionType
	 * @generated
	 */
	public Adapter createOrderedCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.UniqueCollectionType <em>Unique Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.UniqueCollectionType
	 * @generated
	 */
	public Adapter createUniqueCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedSetType
	 * @generated
	 */
	public Adapter createOrderedSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.ComparablePrimitiveType <em>Comparable Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.ComparablePrimitiveType
	 * @generated
	 */
	public Adapter createComparablePrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.SummablePrimitiveType <em>Summable Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.SummablePrimitiveType
	 * @generated
	 */
	public Adapter createSummablePrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.epsilon.eol.metamodel.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.epsilon.eol.metamodel.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EolAdapterFactory
