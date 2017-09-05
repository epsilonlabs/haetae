/**
 */
package org.eclipse.epsilon.evl.metamodel;

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
 * @see org.eclipse.epsilon.evl.metamodel.EvlFactory
 * @model kind="package"
 *        annotation="emf.gen classPackageSuffix='metamodel.impl' utilityPackageSuffix='metamodel.util' metaDataPackageSuffix='metamodel' interfacePackageSuffix='metamodel' basePackage='org.eclipse.epsilon'"
 *        annotation="emf.gen.usedGenPackage name='eol' genModel='platform:/resource/org.eclipse.epsilon.haetae.eol.metamodel/model/EOL.genmodel'"
 *        annotation="emf.gen.annotation source='emf.gen' key='extends' value='eol'"
 * @generated
 */
public interface EvlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/epsilon/evl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvlPackage eINSTANCE = org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.EvlElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlElementImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getEvlElement()
	 * @generated
	 */
	int EVL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_ELEMENT__CONTAINER = EolPackage.EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_ELEMENT__URI = EolPackage.EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_ELEMENT__REGION = EolPackage.EOL_ELEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_ELEMENT_FEATURE_COUNT = EolPackage.EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.EVLModuleImpl <em>EVL Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EVLModuleImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getEVLModule()
	 * @generated
	 */
	int EVL_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__CONTAINER = EolPackage.EOL_LIBRARY_MODULE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__URI = EolPackage.EOL_LIBRARY_MODULE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__REGION = EolPackage.EOL_LIBRARY_MODULE__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__NAME = EolPackage.EOL_LIBRARY_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__IMPORTS = EolPackage.EOL_LIBRARY_MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Model Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__MODEL_DECLARATIONS = EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__OPERATIONS = EolPackage.EOL_LIBRARY_MODULE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__CONTEXTS = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__PRE_BLOCKS = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE__POST_BLOCKS = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EVL Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVL_MODULE_FEATURE_COUNT = EolPackage.EOL_LIBRARY_MODULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.GuardedElementImpl <em>Guarded Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.GuardedElementImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getGuardedElement()
	 * @generated
	 */
	int GUARDED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_ELEMENT__CONTAINER = EVL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_ELEMENT__URI = EVL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_ELEMENT__REGION = EVL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_ELEMENT__GUARD = EVL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_ELEMENT_FEATURE_COUNT = EVL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.ContextImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTAINER = GUARDED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__URI = GUARDED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__REGION = GUARDED_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GUARD = GUARDED_ELEMENT__GUARD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TYPE = GUARDED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INVARIANTS = GUARDED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SELF = GUARDED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = GUARDED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.FixImpl <em>Fix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.FixImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getFix()
	 * @generated
	 */
	int FIX = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX__CONTAINER = EVL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX__URI = EVL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX__REGION = EVL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX__TITLE = EVL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX__DO = EVL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_FEATURE_COUNT = EVL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl <em>Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getInvariant()
	 * @generated
	 */
	int INVARIANT = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__CONTAINER = GUARDED_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__URI = GUARDED_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__REGION = GUARDED_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__GUARD = GUARDED_ELEMENT__GUARD;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__SATISFIES = GUARDED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__NAME = GUARDED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__FIXES = GUARDED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__CHECK = GUARDED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__MESSAGE = GUARDED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_FEATURE_COUNT = GUARDED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.ConstraintImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTAINER = INVARIANT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__URI = INVARIANT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REGION = INVARIANT__REGION;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__GUARD = INVARIANT__GUARD;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SATISFIES = INVARIANT__SATISFIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = INVARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Fixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__FIXES = INVARIANT__FIXES;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CHECK = INVARIANT__CHECK;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__MESSAGE = INVARIANT__MESSAGE;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = INVARIANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.CritiqueImpl <em>Critique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.CritiqueImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getCritique()
	 * @generated
	 */
	int CRITIQUE = 7;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__CONTAINER = INVARIANT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__URI = INVARIANT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__REGION = INVARIANT__REGION;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__GUARD = INVARIANT__GUARD;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__SATISFIES = INVARIANT__SATISFIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__NAME = INVARIANT__NAME;

	/**
	 * The feature id for the '<em><b>Fixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__FIXES = INVARIANT__FIXES;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__CHECK = INVARIANT__CHECK;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE__MESSAGE = INVARIANT__MESSAGE;

	/**
	 * The number of structural features of the '<em>Critique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITIQUE_FEATURE_COUNT = INVARIANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.evl.metamodel.impl.NamedBlockImpl <em>Named Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.evl.metamodel.impl.NamedBlockImpl
	 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getNamedBlock()
	 * @generated
	 */
	int NAMED_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__CONTAINER = EVL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__URI = EVL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__REGION = EVL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__NAME = EVL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK__BODY = EVL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_BLOCK_FEATURE_COUNT = EVL_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.EvlElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.EvlElement
	 * @generated
	 */
	EClass getEvlElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.EVLModule <em>EVL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EVL Module</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.EVLModule
	 * @generated
	 */
	EClass getEVLModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.evl.metamodel.EVLModule#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.EVLModule#getContexts()
	 * @see #getEVLModule()
	 * @generated
	 */
	EReference getEVLModule_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.evl.metamodel.EVLModule#getPreBlocks <em>Pre Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Blocks</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.EVLModule#getPreBlocks()
	 * @see #getEVLModule()
	 * @generated
	 */
	EReference getEVLModule_PreBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.evl.metamodel.EVLModule#getPostBlocks <em>Post Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Blocks</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.EVLModule#getPostBlocks()
	 * @see #getEVLModule()
	 * @generated
	 */
	EReference getEVLModule_PostBlocks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.GuardedElement <em>Guarded Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Element</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.GuardedElement
	 * @generated
	 */
	EClass getGuardedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.GuardedElement#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.GuardedElement#getGuard()
	 * @see #getGuardedElement()
	 * @generated
	 */
	EReference getGuardedElement_Guard();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.Context#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Context#getType()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.evl.metamodel.Context#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Context#getInvariants()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Invariants();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.Context#getSelf <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Context#getSelf()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Self();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.Fix <em>Fix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fix</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Fix
	 * @generated
	 */
	EClass getFix();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.Fix#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Fix#getTitle()
	 * @see #getFix()
	 * @generated
	 */
	EReference getFix_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.Fix#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Fix#getDo()
	 * @see #getFix()
	 * @generated
	 */
	EReference getFix_Do();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Invariant
	 * @generated
	 */
	EClass getInvariant();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Invariant#getSatisfies()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Satisfies();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Invariant#getName()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getFixes <em>Fixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixes</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Invariant#getFixes()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Fixes();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Check</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Invariant#getCheck()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Check();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Invariant#getMessage()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_Message();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.Critique <em>Critique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critique</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.Critique
	 * @generated
	 */
	EClass getCritique();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.evl.metamodel.NamedBlock <em>Named Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Block</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.NamedBlock
	 * @generated
	 */
	EClass getNamedBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.NamedBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.NamedBlock#getName()
	 * @see #getNamedBlock()
	 * @generated
	 */
	EReference getNamedBlock_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.evl.metamodel.NamedBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.evl.metamodel.NamedBlock#getBody()
	 * @see #getNamedBlock()
	 * @generated
	 */
	EReference getNamedBlock_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvlFactory getEvlFactory();

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
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.EvlElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlElementImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getEvlElement()
		 * @generated
		 */
		EClass EVL_ELEMENT = eINSTANCE.getEvlElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.EVLModuleImpl <em>EVL Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EVLModuleImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getEVLModule()
		 * @generated
		 */
		EClass EVL_MODULE = eINSTANCE.getEVLModule();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVL_MODULE__CONTEXTS = eINSTANCE.getEVLModule_Contexts();

		/**
		 * The meta object literal for the '<em><b>Pre Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVL_MODULE__PRE_BLOCKS = eINSTANCE.getEVLModule_PreBlocks();

		/**
		 * The meta object literal for the '<em><b>Post Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVL_MODULE__POST_BLOCKS = eINSTANCE.getEVLModule_PostBlocks();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.GuardedElementImpl <em>Guarded Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.GuardedElementImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getGuardedElement()
		 * @generated
		 */
		EClass GUARDED_ELEMENT = eINSTANCE.getGuardedElement();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARDED_ELEMENT__GUARD = eINSTANCE.getGuardedElement_Guard();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.ContextImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TYPE = eINSTANCE.getContext_Type();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__INVARIANTS = eINSTANCE.getContext_Invariants();

		/**
		 * The meta object literal for the '<em><b>Self</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__SELF = eINSTANCE.getContext_Self();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.FixImpl <em>Fix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.FixImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getFix()
		 * @generated
		 */
		EClass FIX = eINSTANCE.getFix();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIX__TITLE = eINSTANCE.getFix_Title();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIX__DO = eINSTANCE.getFix_Do();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl <em>Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getInvariant()
		 * @generated
		 */
		EClass INVARIANT = eINSTANCE.getInvariant();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__SATISFIES = eINSTANCE.getInvariant_Satisfies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__NAME = eINSTANCE.getInvariant_Name();

		/**
		 * The meta object literal for the '<em><b>Fixes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__FIXES = eINSTANCE.getInvariant_Fixes();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__CHECK = eINSTANCE.getInvariant_Check();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__MESSAGE = eINSTANCE.getInvariant_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.ConstraintImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.CritiqueImpl <em>Critique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.CritiqueImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getCritique()
		 * @generated
		 */
		EClass CRITIQUE = eINSTANCE.getCritique();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.evl.metamodel.impl.NamedBlockImpl <em>Named Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.evl.metamodel.impl.NamedBlockImpl
		 * @see org.eclipse.epsilon.evl.metamodel.impl.EvlPackageImpl#getNamedBlock()
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

	}

} //EvlPackage
