/**
 */
package org.eclipse.epsilon.etl.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.epsilon.eol.metamodel.EolPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.etl.metamodel.EtlFactory
 * @model kind="package"
 *        annotation="emf.gen classPackageSuffix='metamodel.impl' utilityPackageSuffix='metamodel.util' metaDataPackageSuffix='metamodel' interfacePackageSuffix='metamodel' basePackage='org.eclipse.epsilon'"
 *        annotation="emf.gen.usedGenPackage name='eol' genModel='platform:/resource/org.eclipse.epsilon.eol.metamodel/model/EOL.genmodel'"
 *        annotation="emf.gen.annotation source='emf.gen' key='extends' value='eol'"
 * @generated
 */
public interface EtlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "etl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/epsilon/etl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "etl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EtlPackage eINSTANCE = org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.etl.metamodel.impl.ETLElementImpl <em>ETL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.etl.metamodel.impl.ETLElementImpl
	 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getETLElement()
	 * @generated
	 */
	int ETL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_ELEMENT__CONTAINER = EolPackage.EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_ELEMENT__URI = EolPackage.EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_ELEMENT__REGION = EolPackage.EOL_ELEMENT__REGION;

	/**
	 * The number of structural features of the '<em>ETL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_ELEMENT_FEATURE_COUNT = EolPackage.EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.etl.metamodel.impl.NamedBlockImpl <em>Named Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.etl.metamodel.impl.NamedBlockImpl
	 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getNamedBlock()
	 * @generated
	 */
	int NAMED_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__CONTAINER = ETL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__URI = ETL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__REGION = ETL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__NAME = ETL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__BODY = ETL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK_FEATURE_COUNT = ETL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.etl.metamodel.impl.ETLModuleImpl <em>ETL Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.etl.metamodel.impl.ETLModuleImpl
	 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getETLModule()
	 * @generated
	 */
	int ETL_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__CONTAINER = EolPackage.EOL_LIBRARY_MODULE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__URI = EolPackage.EOL_LIBRARY_MODULE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__REGION = EolPackage.EOL_LIBRARY_MODULE__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__NAME = EolPackage.EOL_LIBRARY_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__IMPORTS = EolPackage.EOL_LIBRARY_MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Model Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__MODEL_DECLARATIONS = EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__OPERATIONS = EolPackage.EOL_LIBRARY_MODULE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Transformation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__TRANSFORMATION_RULES = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__PRE_BLOCKS = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__POST_BLOCKS = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ETL Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE_FEATURE_COUNT = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.etl.metamodel.impl.TransformationRuleImpl <em>Transformation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.etl.metamodel.impl.TransformationRuleImpl
	 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getTransformationRule()
	 * @generated
	 */
	int TRANSFORMATION_RULE = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__CONTAINER = ETL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__URI = ETL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__REGION = ETL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__NAME = ETL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__SOURCE = ETL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__TARGETS = ETL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__BODY = ETL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotation Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__ANNOTATION_BLOCK = ETL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__EXTENDS = ETL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolved Parent Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__RESOLVED_PARENT_RULES = ETL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolved Rule Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__RESOLVED_RULE_DEPENDENCIES = ETL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__GUARD = ETL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__ABSTRACT = ETL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__LAZY = ETL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__PRIMARY = ETL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__GREEDY = ETL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE_FEATURE_COUNT = ETL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.etl.metamodel.impl.RuleDependencyImpl <em>Rule Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.etl.metamodel.impl.RuleDependencyImpl
	 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getRuleDependency()
	 * @generated
	 */
	int RULE_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEPENDENCY__CONTAINER = ETL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEPENDENCY__URI = ETL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEPENDENCY__REGION = ETL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Depending Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEPENDENCY__DEPENDING_RULE = ETL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEPENDENCY__SOURCE_ELEMENT = ETL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEPENDENCY_FEATURE_COUNT = ETL_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.etl.metamodel.ETLElement <em>ETL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETL Element</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.ETLElement
	 * @generated
	 */
	EClass getETLElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.etl.metamodel.NamedBlock <em>Named Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Block</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.NamedBlock
	 * @generated
	 */
	EClass getNamedBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.etl.metamodel.NamedBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.NamedBlock#getName()
	 * @see #getNamedBlock()
	 * @generated
	 */
	EReference getNamedBlock_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.etl.metamodel.NamedBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.NamedBlock#getBody()
	 * @see #getNamedBlock()
	 * @generated
	 */
	EReference getNamedBlock_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.etl.metamodel.ETLModule <em>ETL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETL Module</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.ETLModule
	 * @generated
	 */
	EClass getETLModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.etl.metamodel.ETLModule#getTransformationRules <em>Transformation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Rules</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.ETLModule#getTransformationRules()
	 * @see #getETLModule()
	 * @generated
	 */
	EReference getETLModule_TransformationRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.etl.metamodel.ETLModule#getPreBlocks <em>Pre Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Blocks</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.ETLModule#getPreBlocks()
	 * @see #getETLModule()
	 * @generated
	 */
	EReference getETLModule_PreBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.etl.metamodel.ETLModule#getPostBlocks <em>Post Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Blocks</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.ETLModule#getPostBlocks()
	 * @see #getETLModule()
	 * @generated
	 */
	EReference getETLModule_PostBlocks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule <em>Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Rule</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule
	 * @generated
	 */
	EClass getTransformationRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getName()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getSource()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getTargets()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getBody()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getAnnotationBlock <em>Annotation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Block</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getAnnotationBlock()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_AnnotationBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extends</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getExtends()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Extends();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getResolvedParentRules <em>Resolved Parent Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Parent Rules</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getResolvedParentRules()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_ResolvedParentRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getResolvedRuleDependencies <em>Resolved Rule Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolved Rule Dependencies</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getResolvedRuleDependencies()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_ResolvedRuleDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#getGuard()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Guard();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#isAbstract()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#isLazy()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#isPrimary()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Primary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.etl.metamodel.TransformationRule#isGreedy <em>Greedy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greedy</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.TransformationRule#isGreedy()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Greedy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.etl.metamodel.RuleDependency <em>Rule Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Dependency</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.RuleDependency
	 * @generated
	 */
	EClass getRuleDependency();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.etl.metamodel.RuleDependency#getDependingRule <em>Depending Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depending Rule</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.RuleDependency#getDependingRule()
	 * @see #getRuleDependency()
	 * @generated
	 */
	EReference getRuleDependency_DependingRule();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.etl.metamodel.RuleDependency#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Element</em>'.
	 * @see org.eclipse.epsilon.etl.metamodel.RuleDependency#getSourceElement()
	 * @see #getRuleDependency()
	 * @generated
	 */
	EReference getRuleDependency_SourceElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EtlFactory getEtlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.etl.metamodel.impl.ETLElementImpl <em>ETL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.etl.metamodel.impl.ETLElementImpl
		 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getETLElement()
		 * @generated
		 */
		EClass ETL_ELEMENT = eINSTANCE.getETLElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.etl.metamodel.impl.NamedBlockImpl <em>Named Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.etl.metamodel.impl.NamedBlockImpl
		 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getNamedBlock()
		 * @generated
		 */
		EClass NAMED_BLOCK = eINSTANCE.getNamedBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_BLOCK__NAME = eINSTANCE.getNamedBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_BLOCK__BODY = eINSTANCE.getNamedBlock_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.etl.metamodel.impl.ETLModuleImpl <em>ETL Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.etl.metamodel.impl.ETLModuleImpl
		 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getETLModule()
		 * @generated
		 */
		EClass ETL_MODULE = eINSTANCE.getETLModule();

		/**
		 * The meta object literal for the '<em><b>Transformation Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__TRANSFORMATION_RULES = eINSTANCE.getETLModule_TransformationRules();

		/**
		 * The meta object literal for the '<em><b>Pre Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__PRE_BLOCKS = eINSTANCE.getETLModule_PreBlocks();

		/**
		 * The meta object literal for the '<em><b>Post Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__POST_BLOCKS = eINSTANCE.getETLModule_PostBlocks();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.etl.metamodel.impl.TransformationRuleImpl <em>Transformation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.etl.metamodel.impl.TransformationRuleImpl
		 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getTransformationRule()
		 * @generated
		 */
		EClass TRANSFORMATION_RULE = eINSTANCE.getTransformationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__NAME = eINSTANCE.getTransformationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__SOURCE = eINSTANCE.getTransformationRule_Source();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__TARGETS = eINSTANCE.getTransformationRule_Targets();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__BODY = eINSTANCE.getTransformationRule_Body();

		/**
		 * The meta object literal for the '<em><b>Annotation Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__ANNOTATION_BLOCK = eINSTANCE.getTransformationRule_AnnotationBlock();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__EXTENDS = eINSTANCE.getTransformationRule_Extends();

		/**
		 * The meta object literal for the '<em><b>Resolved Parent Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__RESOLVED_PARENT_RULES = eINSTANCE.getTransformationRule_ResolvedParentRules();

		/**
		 * The meta object literal for the '<em><b>Resolved Rule Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__RESOLVED_RULE_DEPENDENCIES = eINSTANCE.getTransformationRule_ResolvedRuleDependencies();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__GUARD = eINSTANCE.getTransformationRule_Guard();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__ABSTRACT = eINSTANCE.getTransformationRule_Abstract();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__LAZY = eINSTANCE.getTransformationRule_Lazy();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__PRIMARY = eINSTANCE.getTransformationRule_Primary();

		/**
		 * The meta object literal for the '<em><b>Greedy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__GREEDY = eINSTANCE.getTransformationRule_Greedy();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.etl.metamodel.impl.RuleDependencyImpl <em>Rule Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.etl.metamodel.impl.RuleDependencyImpl
		 * @see org.eclipse.epsilon.etl.metamodel.impl.EtlPackageImpl#getRuleDependency()
		 * @generated
		 */
		EClass RULE_DEPENDENCY = eINSTANCE.getRuleDependency();

		/**
		 * The meta object literal for the '<em><b>Depending Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEPENDENCY__DEPENDING_RULE = eINSTANCE.getRuleDependency_DependingRule();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEPENDENCY__SOURCE_ELEMENT = eINSTANCE.getRuleDependency_SourceElement();

	}

} //EtlPackage
