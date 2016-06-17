/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage
 * @generated
 */
public interface EolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EolFactory eINSTANCE = org.eclipse.epsilon.eol.metamodel.impl.EolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EOL Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOL Element</em>'.
	 * @generated
	 */
	EOLElement createEOLElement();

	/**
	 * Returns a new object of class '<em>IMetamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IMetamodel</em>'.
	 * @generated
	 */
	IMetamodel createIMetamodel();

	/**
	 * Returns a new object of class '<em>IPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPackage</em>'.
	 * @generated
	 */
	IPackage createIPackage();

	/**
	 * Returns a new object of class '<em>Text Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Region</em>'.
	 * @generated
	 */
	TextRegion createTextRegion();

	/**
	 * Returns a new object of class '<em>Text Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Position</em>'.
	 * @generated
	 */
	TextPosition createTextPosition();

	/**
	 * Returns a new object of class '<em>EOL Library Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOL Library Module</em>'.
	 * @generated
	 */
	EOLLibraryModule createEOLLibraryModule();

	/**
	 * Returns a new object of class '<em>EOL Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOL Module</em>'.
	 * @generated
	 */
	EOLModule createEOLModule();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Annotation Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Block</em>'.
	 * @generated
	 */
	AnnotationBlock createAnnotationBlock();

	/**
	 * Returns a new object of class '<em>Expression Or Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Or Statement Block</em>'.
	 * @generated
	 */
	ExpressionOrStatementBlock createExpressionOrStatementBlock();

	/**
	 * Returns a new object of class '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition</em>'.
	 * @generated
	 */
	OperationDefinition createOperationDefinition();

	/**
	 * Returns a new object of class '<em>Not Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Operator Expression</em>'.
	 * @generated
	 */
	NotOperatorExpression createNotOperatorExpression();

	/**
	 * Returns a new object of class '<em>Negative Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Operator Expression</em>'.
	 * @generated
	 */
	NegativeOperatorExpression createNegativeOperatorExpression();

	/**
	 * Returns a new object of class '<em>And Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Operator Expression</em>'.
	 * @generated
	 */
	AndOperatorExpression createAndOperatorExpression();

	/**
	 * Returns a new object of class '<em>Xor Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor Operator Expression</em>'.
	 * @generated
	 */
	XorOperatorExpression createXorOperatorExpression();

	/**
	 * Returns a new object of class '<em>Or Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Operator Expression</em>'.
	 * @generated
	 */
	OrOperatorExpression createOrOperatorExpression();

	/**
	 * Returns a new object of class '<em>Implies Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Operator Expression</em>'.
	 * @generated
	 */
	ImpliesOperatorExpression createImpliesOperatorExpression();

	/**
	 * Returns a new object of class '<em>Divide Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divide Operator Expression</em>'.
	 * @generated
	 */
	DivideOperatorExpression createDivideOperatorExpression();

	/**
	 * Returns a new object of class '<em>Multiply Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiply Operator Expression</em>'.
	 * @generated
	 */
	MultiplyOperatorExpression createMultiplyOperatorExpression();

	/**
	 * Returns a new object of class '<em>Minus Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus Operator Expression</em>'.
	 * @generated
	 */
	MinusOperatorExpression createMinusOperatorExpression();

	/**
	 * Returns a new object of class '<em>Plus Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Operator Expression</em>'.
	 * @generated
	 */
	PlusOperatorExpression createPlusOperatorExpression();

	/**
	 * Returns a new object of class '<em>Greater Than Or Equal To Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Or Equal To Operator Expression</em>'.
	 * @generated
	 */
	GreaterThanOrEqualToOperatorExpression createGreaterThanOrEqualToOperatorExpression();

	/**
	 * Returns a new object of class '<em>Greater Than Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Operator Expression</em>'.
	 * @generated
	 */
	GreaterThanOperatorExpression createGreaterThanOperatorExpression();

	/**
	 * Returns a new object of class '<em>Less Than Or Equal To Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Or Equal To Operator Expression</em>'.
	 * @generated
	 */
	LessThanOrEqualToOperatorExpression createLessThanOrEqualToOperatorExpression();

	/**
	 * Returns a new object of class '<em>Less Than Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Operator Expression</em>'.
	 * @generated
	 */
	LessThanOperatorExpression createLessThanOperatorExpression();

	/**
	 * Returns a new object of class '<em>Not Equals Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Equals Operator Expression</em>'.
	 * @generated
	 */
	NotEqualsOperatorExpression createNotEqualsOperatorExpression();

	/**
	 * Returns a new object of class '<em>Equals Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equals Operator Expression</em>'.
	 * @generated
	 */
	EqualsOperatorExpression createEqualsOperatorExpression();

	/**
	 * Returns a new object of class '<em>Variable Declaration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Expression</em>'.
	 * @generated
	 */
	VariableDeclarationExpression createVariableDeclarationExpression();

	/**
	 * Returns a new object of class '<em>Formal Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Parameter Expression</em>'.
	 * @generated
	 */
	FormalParameterExpression createFormalParameterExpression();

	/**
	 * Returns a new object of class '<em>Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Expression</em>'.
	 * @generated
	 */
	NameExpression createNameExpression();

	/**
	 * Returns a new object of class '<em>Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call Expression</em>'.
	 * @generated
	 */
	MethodCallExpression createMethodCallExpression();

	/**
	 * Returns a new object of class '<em>Property Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Call Expression</em>'.
	 * @generated
	 */
	PropertyCallExpression createPropertyCallExpression();

	/**
	 * Returns a new object of class '<em>FOL Method Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FOL Method Call Expression</em>'.
	 * @generated
	 */
	FOLMethodCallExpression createFOLMethodCallExpression();

	/**
	 * Returns a new object of class '<em>Key Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Expression</em>'.
	 * @generated
	 */
	KeyValueExpression createKeyValueExpression();

	/**
	 * Returns a new object of class '<em>Model Declaration Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Declaration Parameter</em>'.
	 * @generated
	 */
	ModelDeclarationParameter createModelDeclarationParameter();

	/**
	 * Returns a new object of class '<em>New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Expression</em>'.
	 * @generated
	 */
	NewExpression createNewExpression();

	/**
	 * Returns a new object of class '<em>Map Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Expression</em>'.
	 * @generated
	 */
	MapExpression createMapExpression();

	/**
	 * Returns a new object of class '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Expression</em>'.
	 * @generated
	 */
	StringExpression createStringExpression();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>Real Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Expression</em>'.
	 * @generated
	 */
	RealExpression createRealExpression();

	/**
	 * Returns a new object of class '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Expression</em>'.
	 * @generated
	 */
	IntegerExpression createIntegerExpression();

	/**
	 * Returns a new object of class '<em>Bag Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Expression</em>'.
	 * @generated
	 */
	BagExpression createBagExpression();

	/**
	 * Returns a new object of class '<em>Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Expression</em>'.
	 * @generated
	 */
	SetExpression createSetExpression();

	/**
	 * Returns a new object of class '<em>Ordered Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Set Expression</em>'.
	 * @generated
	 */
	OrderedSetExpression createOrderedSetExpression();

	/**
	 * Returns a new object of class '<em>Sequence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Expression</em>'.
	 * @generated
	 */
	SequenceExpression createSequenceExpression();

	/**
	 * Returns a new object of class '<em>Enumeration Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal Expression</em>'.
	 * @generated
	 */
	EnumerationLiteralExpression createEnumerationLiteralExpression();

	/**
	 * Returns a new object of class '<em>Expression Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Range</em>'.
	 * @generated
	 */
	ExpressionRange createExpressionRange();

	/**
	 * Returns a new object of class '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression List</em>'.
	 * @generated
	 */
	ExpressionList createExpressionList();

	/**
	 * Returns a new object of class '<em>Transaction Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Statement</em>'.
	 * @generated
	 */
	TransactionStatement createTransactionStatement();

	/**
	 * Returns a new object of class '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Statement</em>'.
	 * @generated
	 */
	ExpressionStatement createExpressionStatement();

	/**
	 * Returns a new object of class '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Statement</em>'.
	 * @generated
	 */
	SwitchStatement createSwitchStatement();

	/**
	 * Returns a new object of class '<em>Switch Case Default Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Case Default Statement</em>'.
	 * @generated
	 */
	SwitchCaseDefaultStatement createSwitchCaseDefaultStatement();

	/**
	 * Returns a new object of class '<em>Switch Case Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Case Expression Statement</em>'.
	 * @generated
	 */
	SwitchCaseExpressionStatement createSwitchCaseExpressionStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Statement</em>'.
	 * @generated
	 */
	ForStatement createForStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throw Statement</em>'.
	 * @generated
	 */
	ThrowStatement createThrowStatement();

	/**
	 * Returns a new object of class '<em>Delete Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Statement</em>'.
	 * @generated
	 */
	DeleteStatement createDeleteStatement();

	/**
	 * Returns a new object of class '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Statement</em>'.
	 * @generated
	 */
	AssignmentStatement createAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Special Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special Assignment Statement</em>'.
	 * @generated
	 */
	SpecialAssignmentStatement createSpecialAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue Statement</em>'.
	 * @generated
	 */
	ContinueStatement createContinueStatement();

	/**
	 * Returns a new object of class '<em>Abort Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abort Statement</em>'.
	 * @generated
	 */
	AbortStatement createAbortStatement();

	/**
	 * Returns a new object of class '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Statement</em>'.
	 * @generated
	 */
	BreakStatement createBreakStatement();

	/**
	 * Returns a new object of class '<em>Break All Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break All Statement</em>'.
	 * @generated
	 */
	BreakAllStatement createBreakAllStatement();

	/**
	 * Returns a new object of class '<em>Simple Annotation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Annotation Statement</em>'.
	 * @generated
	 */
	SimpleAnnotationStatement createSimpleAnnotationStatement();

	/**
	 * Returns a new object of class '<em>Executable Annotation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable Annotation Statement</em>'.
	 * @generated
	 */
	ExecutableAnnotationStatement createExecutableAnnotationStatement();

	/**
	 * Returns a new object of class '<em>Model Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Declaration Statement</em>'.
	 * @generated
	 */
	ModelDeclarationStatement createModelDeclarationStatement();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Type</em>'.
	 * @generated
	 */
	AnyType createAnyType();

	/**
	 * Returns a new object of class '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Type</em>'.
	 * @generated
	 */
	ModelType createModelType();

	/**
	 * Returns a new object of class '<em>Model Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Type</em>'.
	 * @generated
	 */
	ModelElementType createModelElementType();

	/**
	 * Returns a new object of class '<em>Self Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Type</em>'.
	 * @generated
	 */
	SelfType createSelfType();

	/**
	 * Returns a new object of class '<em>Self Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Content Type</em>'.
	 * @generated
	 */
	SelfContentType createSelfContentType();

	/**
	 * Returns a new object of class '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Type</em>'.
	 * @generated
	 */
	MapType createMapType();

	/**
	 * Returns a new object of class '<em>Native Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Native Type</em>'.
	 * @generated
	 */
	NativeType createNativeType();

	/**
	 * Returns a new object of class '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Type</em>'.
	 * @generated
	 */
	VoidType createVoidType();

	/**
	 * Returns a new object of class '<em>Invalid Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Type</em>'.
	 * @generated
	 */
	InvalidType createInvalidType();

	/**
	 * Returns a new object of class '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type</em>'.
	 * @generated
	 */
	CollectionType createCollectionType();

	/**
	 * Returns a new object of class '<em>Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bag Type</em>'.
	 * @generated
	 */
	BagType createBagType();

	/**
	 * Returns a new object of class '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Type</em>'.
	 * @generated
	 */
	SetType createSetType();

	/**
	 * Returns a new object of class '<em>Ordered Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Set Type</em>'.
	 * @generated
	 */
	OrderedSetType createOrderedSetType();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
	BooleanType createBooleanType();

	/**
	 * Returns a new object of class '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Type</em>'.
	 * @generated
	 */
	RealType createRealType();

	/**
	 * Returns a new object of class '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Type</em>'.
	 * @generated
	 */
	IntegerType createIntegerType();

	/**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
	StringType createStringType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EolPackage getEolPackage();

} //EolFactory
