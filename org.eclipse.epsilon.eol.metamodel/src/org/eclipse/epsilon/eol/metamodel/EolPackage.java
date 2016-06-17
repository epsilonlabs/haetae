/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.epsilon.eol.metamodel.EolFactory
 * @model kind="package"
 *        annotation="emf.gen classPackageSuffix='metamodel.impl' utilityPackageSuffix='metamodel.util' metaDataPackageSuffix='metamodel' interfacePackageSuffix='metamodel' basePackage='org.eclipse.epsilon'"
 * @generated
 */
public interface EolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/epsilon/eol";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EolPackage eINSTANCE = org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EOLElementImpl <em>EOL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EOLElementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEOLElement()
	 * @generated
	 */
	int EOL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ELEMENT__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ELEMENT__URI = 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ELEMENT__REGION = 2;

	/**
	 * The number of structural features of the '<em>EOL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl <em>IMetamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIMetamodel()
	 * @generated
	 */
	int IMETAMODEL = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl <em>IPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIPackage()
	 * @generated
	 */
	int IPACKAGE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TextRegionImpl <em>Text Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.TextRegionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getTextRegion()
	 * @generated
	 */
	int TEXT_REGION = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REGION__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REGION__END = 1;

	/**
	 * The number of structural features of the '<em>Text Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REGION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TextPositionImpl <em>Text Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.TextPositionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getTextPosition()
	 * @generated
	 */
	int TEXT_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_POSITION__LINE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_POSITION__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Text Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_POSITION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__NAME = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__ALIASES = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__DRIVER = EOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IMetamodel Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__IMETAMODEL_DRIVER = EOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>IPackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__IPACKAGES = EOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ns UR Ior Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL__NS_UR_IOR_PATH = EOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>IMetamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMETAMODEL_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>IPackage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__IPACKAGE_DRIVER = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__NAME = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__NS_URI = EOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__NS_PREFIX = EOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE__SUB_PACKAGES = EOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>IPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPACKAGE_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl <em>EOL Library Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEOLLibraryModule()
	 * @generated
	 */
	int EOL_LIBRARY_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__NAME = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__IMPORTS = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IModels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__IMODELS = EOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__MODEL_DECLARATIONS = EOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE__OPERATIONS = EOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EOL Library Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_LIBRARY_MODULE_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl <em>EOL Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEOLModule()
	 * @generated
	 */
	int EOL_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__CONTAINER = EOL_LIBRARY_MODULE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__URI = EOL_LIBRARY_MODULE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__REGION = EOL_LIBRARY_MODULE__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__NAME = EOL_LIBRARY_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__IMPORTS = EOL_LIBRARY_MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>IModels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__IMODELS = EOL_LIBRARY_MODULE__IMODELS;

	/**
	 * The feature id for the '<em><b>Model Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__MODEL_DECLARATIONS = EOL_LIBRARY_MODULE__MODEL_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__OPERATIONS = EOL_LIBRARY_MODULE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE__BLOCK = EOL_LIBRARY_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EOL Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_MODULE_FEATURE_COUNT = EOL_LIBRARY_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ImportImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 7;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Imported Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_MODULE = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BlockImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AnnotationBlockImpl <em>Annotation Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.AnnotationBlockImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAnnotationBlock()
	 * @generated
	 */
	int ANNOTATION_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BLOCK__CONTAINER = BLOCK__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BLOCK__URI = BLOCK__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BLOCK__REGION = BLOCK__REGION;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BLOCK__STATEMENTS = BLOCK__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Annotation Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionOrStatementBlockImpl <em>Expression Or Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionOrStatementBlockImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionOrStatementBlock()
	 * @generated
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK__BLOCK = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK__EXPRESSION = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK__CONDITION = EOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression Or Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_STATEMENT_BLOCK_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOperationDefinition()
	 * @generated
	 */
	int OPERATION_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__CONTEXT_TYPE = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__RETURN_TYPE = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__ANNOTATION_BLOCK = EOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__BODY = EOL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__NAME = EOL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__PARAMETERS = EOL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__SELF = EOL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__RESULT = EOL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Depending Operation Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__DEPENDING_OPERATION_DEFINITIONS = EOL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Operation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__REGION = EOL_ELEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RESOLVED_TYPE = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IN_BRACKETS = EOL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.OperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOperatorExpression()
	 * @generated
	 */
	int OPERATOR_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The number of structural features of the '<em>Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.UnaryOperatorExpressionImpl <em>Unary Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.UnaryOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getUnaryOperatorExpression()
	 * @generated
	 */
	int UNARY_OPERATOR_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_EXPRESSION__CONTAINER = OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_EXPRESSION__URI = OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_EXPRESSION__REGION = OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_EXPRESSION__RESOLVED_TYPE = OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_EXPRESSION__IN_BRACKETS = OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_EXPRESSION__EXPRESSION = OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_EXPRESSION_FEATURE_COUNT = OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NotOperatorExpressionImpl <em>Not Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.NotOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNotOperatorExpression()
	 * @generated
	 */
	int NOT_OPERATOR_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_EXPRESSION__CONTAINER = UNARY_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_EXPRESSION__URI = UNARY_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_EXPRESSION__REGION = UNARY_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_EXPRESSION__RESOLVED_TYPE = UNARY_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_EXPRESSION__IN_BRACKETS = UNARY_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_EXPRESSION__EXPRESSION = UNARY_OPERATOR_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Not Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_EXPRESSION_FEATURE_COUNT = UNARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NegativeOperatorExpressionImpl <em>Negative Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.NegativeOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNegativeOperatorExpression()
	 * @generated
	 */
	int NEGATIVE_OPERATOR_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATOR_EXPRESSION__CONTAINER = UNARY_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATOR_EXPRESSION__URI = UNARY_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATOR_EXPRESSION__REGION = UNARY_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATOR_EXPRESSION__RESOLVED_TYPE = UNARY_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATOR_EXPRESSION__IN_BRACKETS = UNARY_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATOR_EXPRESSION__EXPRESSION = UNARY_OPERATOR_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Negative Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OPERATOR_EXPRESSION_FEATURE_COUNT = UNARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BinaryOperatorExpressionImpl <em>Binary Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BinaryOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBinaryOperatorExpression()
	 * @generated
	 */
	int BINARY_OPERATOR_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__CONTAINER = OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__URI = OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__REGION = OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__RESOLVED_TYPE = OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__IN_BRACKETS = OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__LHS = OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION__RHS = OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT = OPERATOR_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.LogicalOperatorExpressionImpl <em>Logical Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.LogicalOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getLogicalOperatorExpression()
	 * @generated
	 */
	int LOGICAL_OPERATOR_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION__CONTAINER = BINARY_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION__URI = BINARY_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION__REGION = BINARY_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION__RESOLVED_TYPE = BINARY_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION__IN_BRACKETS = BINARY_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION__LHS = BINARY_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION__RHS = BINARY_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Logical Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_EXPRESSION_FEATURE_COUNT = BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AndOperatorExpressionImpl <em>And Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.AndOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAndOperatorExpression()
	 * @generated
	 */
	int AND_OPERATOR_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION__CONTAINER = LOGICAL_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION__URI = LOGICAL_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION__REGION = LOGICAL_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION__RESOLVED_TYPE = LOGICAL_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION__IN_BRACKETS = LOGICAL_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION__LHS = LOGICAL_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION__RHS = LOGICAL_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>And Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_EXPRESSION_FEATURE_COUNT = LOGICAL_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.XorOperatorExpressionImpl <em>Xor Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.XorOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getXorOperatorExpression()
	 * @generated
	 */
	int XOR_OPERATOR_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION__CONTAINER = LOGICAL_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION__URI = LOGICAL_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION__REGION = LOGICAL_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION__RESOLVED_TYPE = LOGICAL_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION__IN_BRACKETS = LOGICAL_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION__LHS = LOGICAL_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION__RHS = LOGICAL_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Xor Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATOR_EXPRESSION_FEATURE_COUNT = LOGICAL_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrOperatorExpressionImpl <em>Or Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.OrOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrOperatorExpression()
	 * @generated
	 */
	int OR_OPERATOR_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION__CONTAINER = LOGICAL_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION__URI = LOGICAL_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION__REGION = LOGICAL_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION__RESOLVED_TYPE = LOGICAL_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION__IN_BRACKETS = LOGICAL_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION__LHS = LOGICAL_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION__RHS = LOGICAL_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Or Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_EXPRESSION_FEATURE_COUNT = LOGICAL_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ImpliesOperatorExpressionImpl <em>Implies Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ImpliesOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getImpliesOperatorExpression()
	 * @generated
	 */
	int IMPLIES_OPERATOR_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION__CONTAINER = LOGICAL_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION__URI = LOGICAL_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION__REGION = LOGICAL_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION__RESOLVED_TYPE = LOGICAL_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION__IN_BRACKETS = LOGICAL_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION__LHS = LOGICAL_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION__RHS = LOGICAL_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Implies Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_EXPRESSION_FEATURE_COUNT = LOGICAL_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ArithmeticOperatorExpressionImpl <em>Arithmetic Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ArithmeticOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getArithmeticOperatorExpression()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION__CONTAINER = BINARY_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION__URI = BINARY_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION__REGION = BINARY_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION__RESOLVED_TYPE = BINARY_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION__IN_BRACKETS = BINARY_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION__LHS = BINARY_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION__RHS = BINARY_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Arithmetic Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_EXPRESSION_FEATURE_COUNT = BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.DivideOperatorExpressionImpl <em>Divide Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.DivideOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getDivideOperatorExpression()
	 * @generated
	 */
	int DIVIDE_OPERATOR_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION__CONTAINER = ARITHMETIC_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION__URI = ARITHMETIC_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION__REGION = ARITHMETIC_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION__RESOLVED_TYPE = ARITHMETIC_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION__IN_BRACKETS = ARITHMETIC_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION__LHS = ARITHMETIC_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION__RHS = ARITHMETIC_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Divide Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATOR_EXPRESSION_FEATURE_COUNT = ARITHMETIC_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MultiplyOperatorExpressionImpl <em>Multiply Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.MultiplyOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMultiplyOperatorExpression()
	 * @generated
	 */
	int MULTIPLY_OPERATOR_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION__CONTAINER = ARITHMETIC_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION__URI = ARITHMETIC_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION__REGION = ARITHMETIC_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION__RESOLVED_TYPE = ARITHMETIC_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION__IN_BRACKETS = ARITHMETIC_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION__LHS = ARITHMETIC_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION__RHS = ARITHMETIC_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Multiply Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATOR_EXPRESSION_FEATURE_COUNT = ARITHMETIC_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MinusOperatorExpressionImpl <em>Minus Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.MinusOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMinusOperatorExpression()
	 * @generated
	 */
	int MINUS_OPERATOR_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION__CONTAINER = ARITHMETIC_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION__URI = ARITHMETIC_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION__REGION = ARITHMETIC_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION__RESOLVED_TYPE = ARITHMETIC_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION__IN_BRACKETS = ARITHMETIC_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION__LHS = ARITHMETIC_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION__RHS = ARITHMETIC_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Minus Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATOR_EXPRESSION_FEATURE_COUNT = ARITHMETIC_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PlusOperatorExpressionImpl <em>Plus Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.PlusOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPlusOperatorExpression()
	 * @generated
	 */
	int PLUS_OPERATOR_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION__CONTAINER = ARITHMETIC_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION__URI = ARITHMETIC_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION__REGION = ARITHMETIC_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION__RESOLVED_TYPE = ARITHMETIC_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION__IN_BRACKETS = ARITHMETIC_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION__LHS = ARITHMETIC_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION__RHS = ARITHMETIC_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Plus Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_EXPRESSION_FEATURE_COUNT = ARITHMETIC_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ComparisonOperatorExpressionImpl <em>Comparison Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ComparisonOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getComparisonOperatorExpression()
	 * @generated
	 */
	int COMPARISON_OPERATOR_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION__CONTAINER = BINARY_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION__URI = BINARY_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION__REGION = BINARY_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION__RESOLVED_TYPE = BINARY_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION__IN_BRACKETS = BINARY_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION__LHS = BINARY_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION__RHS = BINARY_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Comparison Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT = BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOrEqualToOperatorExpressionImpl <em>Greater Than Or Equal To Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOrEqualToOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getGreaterThanOrEqualToOperatorExpression()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__CONTAINER = COMPARISON_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__URI = COMPARISON_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__REGION = COMPARISON_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__RESOLVED_TYPE = COMPARISON_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__IN_BRACKETS = COMPARISON_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__LHS = COMPARISON_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__RHS = COMPARISON_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal To Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION_FEATURE_COUNT = COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOperatorExpressionImpl <em>Greater Than Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getGreaterThanOperatorExpression()
	 * @generated
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION__CONTAINER = COMPARISON_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION__URI = COMPARISON_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION__REGION = COMPARISON_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION__RESOLVED_TYPE = COMPARISON_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION__IN_BRACKETS = COMPARISON_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION__LHS = COMPARISON_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION__RHS = COMPARISON_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Greater Than Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_EXPRESSION_FEATURE_COUNT = COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.LessThanOrEqualToOperatorExpressionImpl <em>Less Than Or Equal To Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.LessThanOrEqualToOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getLessThanOrEqualToOperatorExpression()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__CONTAINER = COMPARISON_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__URI = COMPARISON_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__REGION = COMPARISON_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__RESOLVED_TYPE = COMPARISON_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__IN_BRACKETS = COMPARISON_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__LHS = COMPARISON_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION__RHS = COMPARISON_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal To Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION_FEATURE_COUNT = COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.LessThanOperatorExpressionImpl <em>Less Than Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.LessThanOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getLessThanOperatorExpression()
	 * @generated
	 */
	int LESS_THAN_OPERATOR_EXPRESSION = 32;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION__CONTAINER = COMPARISON_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION__URI = COMPARISON_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION__REGION = COMPARISON_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION__RESOLVED_TYPE = COMPARISON_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION__IN_BRACKETS = COMPARISON_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION__LHS = COMPARISON_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION__RHS = COMPARISON_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Less Than Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATOR_EXPRESSION_FEATURE_COUNT = COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NotEqualsOperatorExpressionImpl <em>Not Equals Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.NotEqualsOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNotEqualsOperatorExpression()
	 * @generated
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION__CONTAINER = COMPARISON_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION__URI = COMPARISON_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION__REGION = COMPARISON_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION__RESOLVED_TYPE = COMPARISON_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION__IN_BRACKETS = COMPARISON_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION__LHS = COMPARISON_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION__RHS = COMPARISON_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Not Equals Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_OPERATOR_EXPRESSION_FEATURE_COUNT = COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EqualsOperatorExpressionImpl <em>Equals Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EqualsOperatorExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEqualsOperatorExpression()
	 * @generated
	 */
	int EQUALS_OPERATOR_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION__CONTAINER = COMPARISON_OPERATOR_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION__URI = COMPARISON_OPERATOR_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION__REGION = COMPARISON_OPERATOR_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION__RESOLVED_TYPE = COMPARISON_OPERATOR_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION__IN_BRACKETS = COMPARISON_OPERATOR_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION__LHS = COMPARISON_OPERATOR_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION__RHS = COMPARISON_OPERATOR_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Equals Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATOR_EXPRESSION_FEATURE_COUNT = COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl <em>Variable Declaration Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getVariableDeclarationExpression()
	 * @generated
	 */
	int VARIABLE_DECLARATION_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__CREATE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__REFERENCES = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.FormalParameterExpressionImpl <em>Formal Parameter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.FormalParameterExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getFormalParameterExpression()
	 * @generated
	 */
	int FORMAL_PARAMETER_EXPRESSION = 36;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__CONTAINER = VARIABLE_DECLARATION_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__URI = VARIABLE_DECLARATION_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__REGION = VARIABLE_DECLARATION_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__RESOLVED_TYPE = VARIABLE_DECLARATION_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__IN_BRACKETS = VARIABLE_DECLARATION_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__CREATE = VARIABLE_DECLARATION_EXPRESSION__CREATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__NAME = VARIABLE_DECLARATION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION__REFERENCES = VARIABLE_DECLARATION_EXPRESSION__REFERENCES;

	/**
	 * The number of structural features of the '<em>Formal Parameter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_EXPRESSION_FEATURE_COUNT = VARIABLE_DECLARATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl <em>Name Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNameExpression()
	 * @generated
	 */
	int NAME_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__RESOLVED_CONTENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__IS_TYPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.FeatureCallExpressionImpl <em>Feature Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.FeatureCallExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getFeatureCallExpression()
	 * @generated
	 */
	int FEATURE_CALL_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION__ARROW = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl <em>Method Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMethodCallExpression()
	 * @generated
	 */
	int METHOD_CALL_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__CONTAINER = FEATURE_CALL_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__URI = FEATURE_CALL_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__REGION = FEATURE_CALL_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__RESOLVED_TYPE = FEATURE_CALL_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__IN_BRACKETS = FEATURE_CALL_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__TARGET = FEATURE_CALL_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Arrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__ARROW = FEATURE_CALL_EXPRESSION__ARROW;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__ARGUMENTS = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__METHOD = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolved Operation Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_EXPRESSION_FEATURE_COUNT = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.PropertyCallExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPropertyCallExpression()
	 * @generated
	 */
	int PROPERTY_CALL_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__CONTAINER = FEATURE_CALL_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__URI = FEATURE_CALL_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__REGION = FEATURE_CALL_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__RESOLVED_TYPE = FEATURE_CALL_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__IN_BRACKETS = FEATURE_CALL_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__TARGET = FEATURE_CALL_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Arrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__ARROW = FEATURE_CALL_EXPRESSION__ARROW;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__EXTENDED = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION__PROPERTY = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXPRESSION_FEATURE_COUNT = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl <em>FOL Method Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getFOLMethodCallExpression()
	 * @generated
	 */
	int FOL_METHOD_CALL_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__CONTAINER = FEATURE_CALL_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__URI = FEATURE_CALL_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__REGION = FEATURE_CALL_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__RESOLVED_TYPE = FEATURE_CALL_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__IN_BRACKETS = FEATURE_CALL_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__TARGET = FEATURE_CALL_EXPRESSION__TARGET;

	/**
	 * The feature id for the '<em><b>Arrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__ARROW = FEATURE_CALL_EXPRESSION__ARROW;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__ITERATOR = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__CONDITIONS = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__METHOD = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved FOL Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FOL Method Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_METHOD_CALL_EXPRESSION_FEATURE_COUNT = FEATURE_CALL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.KeyValueExpressionImpl <em>Key Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.KeyValueExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getKeyValueExpression()
	 * @generated
	 */
	int KEY_VALUE_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION__KEY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationParameterImpl <em>Model Declaration Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationParameterImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelDeclarationParameter()
	 * @generated
	 */
	int MODEL_DECLARATION_PARAMETER = 43;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER__CONTAINER = KEY_VALUE_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER__URI = KEY_VALUE_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER__REGION = KEY_VALUE_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER__RESOLVED_TYPE = KEY_VALUE_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER__IN_BRACKETS = KEY_VALUE_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER__KEY = KEY_VALUE_EXPRESSION__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER__VALUE = KEY_VALUE_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Model Declaration Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_PARAMETER_FEATURE_COUNT = KEY_VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NewExpressionImpl <em>New Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.NewExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNewExpression()
	 * @generated
	 */
	int NEW_EXPRESSION = 44;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__TYPE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MapExpressionImpl <em>Map Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.MapExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMapExpression()
	 * @generated
	 */
	int MAP_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Key Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION__KEY_VALUES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.CollectionExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getCollectionExpression()
	 * @generated
	 */
	int COLLECTION_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__CONTENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__PARAMETER_LIST = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PrimitiveExpressionImpl <em>Primitive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.PrimitiveExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPrimitiveExpression()
	 * @generated
	 */
	int PRIMITIVE_EXPRESSION = 47;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The number of structural features of the '<em>Primitive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ComparableExpressionImpl <em>Comparable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ComparableExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getComparableExpression()
	 * @generated
	 */
	int COMPARABLE_EXPRESSION = 48;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_EXPRESSION__CONTAINER = PRIMITIVE_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_EXPRESSION__URI = PRIMITIVE_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_EXPRESSION__REGION = PRIMITIVE_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_EXPRESSION__RESOLVED_TYPE = PRIMITIVE_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_EXPRESSION__IN_BRACKETS = PRIMITIVE_EXPRESSION__IN_BRACKETS;

	/**
	 * The number of structural features of the '<em>Comparable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_EXPRESSION_FEATURE_COUNT = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SummableExpressionImpl <em>Summable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SummableExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSummableExpression()
	 * @generated
	 */
	int SUMMABLE_EXPRESSION = 49;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_EXPRESSION__CONTAINER = PRIMITIVE_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_EXPRESSION__URI = PRIMITIVE_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_EXPRESSION__REGION = PRIMITIVE_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_EXPRESSION__RESOLVED_TYPE = PRIMITIVE_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_EXPRESSION__IN_BRACKETS = PRIMITIVE_EXPRESSION__IN_BRACKETS;

	/**
	 * The number of structural features of the '<em>Summable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_EXPRESSION_FEATURE_COUNT = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.StringExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__CONTAINER = COMPARABLE_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__URI = COMPARABLE_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__REGION = COMPARABLE_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__RESOLVED_TYPE = COMPARABLE_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__IN_BRACKETS = COMPARABLE_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BooleanExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 51;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__CONTAINER = PRIMITIVE_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__URI = PRIMITIVE_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__REGION = PRIMITIVE_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__RESOLVED_TYPE = PRIMITIVE_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__IN_BRACKETS = PRIMITIVE_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__VALUE = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.RealExpressionImpl <em>Real Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.RealExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getRealExpression()
	 * @generated
	 */
	int REAL_EXPRESSION = 52;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXPRESSION__CONTAINER = COMPARABLE_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXPRESSION__URI = COMPARABLE_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXPRESSION__REGION = COMPARABLE_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXPRESSION__RESOLVED_TYPE = COMPARABLE_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXPRESSION__IN_BRACKETS = COMPARABLE_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXPRESSION__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXPRESSION_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 53;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__CONTAINER = COMPARABLE_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__URI = COMPARABLE_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__REGION = COMPARABLE_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__RESOLVED_TYPE = COMPARABLE_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__IN_BRACKETS = COMPARABLE_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__VALUE = COMPARABLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = COMPARABLE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BagExpressionImpl <em>Bag Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BagExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBagExpression()
	 * @generated
	 */
	int BAG_EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION__CONTAINER = COLLECTION_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION__URI = COLLECTION_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION__REGION = COLLECTION_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION__RESOLVED_TYPE = COLLECTION_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION__IN_BRACKETS = COLLECTION_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION__CONTENTS = COLLECTION_EXPRESSION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION__PARAMETER_LIST = COLLECTION_EXPRESSION__PARAMETER_LIST;

	/**
	 * The number of structural features of the '<em>Bag Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXPRESSION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionImpl <em>Unique Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getUniqueCollection()
	 * @generated
	 */
	int UNIQUE_COLLECTION = 59;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__CONTAINER = COLLECTION_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__URI = COLLECTION_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__REGION = COLLECTION_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__RESOLVED_TYPE = COLLECTION_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__IN_BRACKETS = COLLECTION_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__CONTENTS = COLLECTION_EXPRESSION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__PARAMETER_LIST = COLLECTION_EXPRESSION__PARAMETER_LIST;

	/**
	 * The number of structural features of the '<em>Unique Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SetExpressionImpl <em>Set Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SetExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSetExpression()
	 * @generated
	 */
	int SET_EXPRESSION = 55;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__CONTAINER = UNIQUE_COLLECTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__URI = UNIQUE_COLLECTION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__REGION = UNIQUE_COLLECTION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__RESOLVED_TYPE = UNIQUE_COLLECTION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__IN_BRACKETS = UNIQUE_COLLECTION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__CONTENTS = UNIQUE_COLLECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__PARAMETER_LIST = UNIQUE_COLLECTION__PARAMETER_LIST;

	/**
	 * The number of structural features of the '<em>Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION_FEATURE_COUNT = UNIQUE_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionImpl <em>Ordered Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedCollection()
	 * @generated
	 */
	int ORDERED_COLLECTION = 58;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__CONTAINER = COLLECTION_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__URI = COLLECTION_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__REGION = COLLECTION_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__RESOLVED_TYPE = COLLECTION_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__IN_BRACKETS = COLLECTION_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__CONTENTS = COLLECTION_EXPRESSION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__PARAMETER_LIST = COLLECTION_EXPRESSION__PARAMETER_LIST;

	/**
	 * The number of structural features of the '<em>Ordered Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedSetExpressionImpl <em>Ordered Set Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedSetExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedSetExpression()
	 * @generated
	 */
	int ORDERED_SET_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION__CONTAINER = ORDERED_COLLECTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION__URI = ORDERED_COLLECTION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION__REGION = ORDERED_COLLECTION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION__RESOLVED_TYPE = ORDERED_COLLECTION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION__IN_BRACKETS = ORDERED_COLLECTION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION__CONTENTS = ORDERED_COLLECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION__PARAMETER_LIST = ORDERED_COLLECTION__PARAMETER_LIST;

	/**
	 * The number of structural features of the '<em>Ordered Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXPRESSION_FEATURE_COUNT = ORDERED_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SequenceExpressionImpl <em>Sequence Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SequenceExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSequenceExpression()
	 * @generated
	 */
	int SEQUENCE_EXPRESSION = 57;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__CONTAINER = ORDERED_COLLECTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__URI = ORDERED_COLLECTION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__REGION = ORDERED_COLLECTION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__RESOLVED_TYPE = ORDERED_COLLECTION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__IN_BRACKETS = ORDERED_COLLECTION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__CONTENTS = ORDERED_COLLECTION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION__PARAMETER_LIST = ORDERED_COLLECTION__PARAMETER_LIST;

	/**
	 * The number of structural features of the '<em>Sequence Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXPRESSION_FEATURE_COUNT = ORDERED_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl <em>Enumeration Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEnumerationLiteralExpression()
	 * @generated
	 */
	int ENUMERATION_LITERAL_EXPRESSION = 60;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__LITERAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__ENUMERATION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__IMODEL = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION__MODEL = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enumeration Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.CollectionInitialisationExpressionImpl <em>Collection Initialisation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.CollectionInitialisationExpressionImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getCollectionInitialisationExpression()
	 * @generated
	 */
	int COLLECTION_INITIALISATION_EXPRESSION = 61;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INITIALISATION_EXPRESSION__CONTAINER = EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INITIALISATION_EXPRESSION__URI = EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INITIALISATION_EXPRESSION__REGION = EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INITIALISATION_EXPRESSION__RESOLVED_TYPE = EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INITIALISATION_EXPRESSION__IN_BRACKETS = EXPRESSION__IN_BRACKETS;

	/**
	 * The number of structural features of the '<em>Collection Initialisation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_INITIALISATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionRangeImpl <em>Expression Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionRangeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionRange()
	 * @generated
	 */
	int EXPRESSION_RANGE = 62;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE__CONTAINER = COLLECTION_INITIALISATION_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE__URI = COLLECTION_INITIALISATION_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE__REGION = COLLECTION_INITIALISATION_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE__RESOLVED_TYPE = COLLECTION_INITIALISATION_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE__IN_BRACKETS = COLLECTION_INITIALISATION_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE__START = COLLECTION_INITIALISATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE__END = COLLECTION_INITIALISATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RANGE_FEATURE_COUNT = COLLECTION_INITIALISATION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionListImpl <em>Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionListImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionList()
	 * @generated
	 */
	int EXPRESSION_LIST = 63;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__CONTAINER = COLLECTION_INITIALISATION_EXPRESSION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__URI = COLLECTION_INITIALISATION_EXPRESSION__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__REGION = COLLECTION_INITIALISATION_EXPRESSION__REGION;

	/**
	 * The feature id for the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__RESOLVED_TYPE = COLLECTION_INITIALISATION_EXPRESSION__RESOLVED_TYPE;

	/**
	 * The feature id for the '<em><b>In Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__IN_BRACKETS = COLLECTION_INITIALISATION_EXPRESSION__IN_BRACKETS;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__EXPRESSIONS = COLLECTION_INITIALISATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_FEATURE_COUNT = COLLECTION_INITIALISATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.StatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 64;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__REGION = EOL_ELEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TransactionStatementImpl <em>Transaction Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.TransactionStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getTransactionStatement()
	 * @generated
	 */
	int TRANSACTION_STATEMENT = 65;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STATEMENT__NAMES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transaction Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 66;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 67;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__CASES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__DEFAULT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseStatementImpl <em>Switch Case Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchCaseStatement()
	 * @generated
	 */
	int SWITCH_CASE_STATEMENT = 68;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Case Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseDefaultStatementImpl <em>Switch Case Default Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseDefaultStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchCaseDefaultStatement()
	 * @generated
	 */
	int SWITCH_CASE_DEFAULT_STATEMENT = 69;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_DEFAULT_STATEMENT__CONTAINER = SWITCH_CASE_STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_DEFAULT_STATEMENT__URI = SWITCH_CASE_STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_DEFAULT_STATEMENT__REGION = SWITCH_CASE_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_DEFAULT_STATEMENT__BODY = SWITCH_CASE_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>Switch Case Default Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_DEFAULT_STATEMENT_FEATURE_COUNT = SWITCH_CASE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseExpressionStatementImpl <em>Switch Case Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseExpressionStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchCaseExpressionStatement()
	 * @generated
	 */
	int SWITCH_CASE_EXPRESSION_STATEMENT = 70;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_EXPRESSION_STATEMENT__CONTAINER = SWITCH_CASE_STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_EXPRESSION_STATEMENT__URI = SWITCH_CASE_STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_EXPRESSION_STATEMENT__REGION = SWITCH_CASE_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_EXPRESSION_STATEMENT__BODY = SWITCH_CASE_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_EXPRESSION_STATEMENT__EXPRESSION = SWITCH_CASE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Case Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_EXPRESSION_STATEMENT_FEATURE_COUNT = SWITCH_CASE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 71;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__IF_BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else If Bodies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_IF_BODIES = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_BODY = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ForStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 72;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ITERATOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.WhileStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 73;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ReturnStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 74;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ThrowStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 75;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.DeleteStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getDeleteStatement()
	 * @generated
	 */
	int DELETE_STATEMENT = 76;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAssignmentStatement()
	 * @generated
	 */
	int ASSIGNMENT_STATEMENT = 77;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__LHS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__RHS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SpecialAssignmentStatementImpl <em>Special Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SpecialAssignmentStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSpecialAssignmentStatement()
	 * @generated
	 */
	int SPECIAL_ASSIGNMENT_STATEMENT = 78;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ASSIGNMENT_STATEMENT__CONTAINER = ASSIGNMENT_STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ASSIGNMENT_STATEMENT__URI = ASSIGNMENT_STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ASSIGNMENT_STATEMENT__REGION = ASSIGNMENT_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ASSIGNMENT_STATEMENT__LHS = ASSIGNMENT_STATEMENT__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ASSIGNMENT_STATEMENT__RHS = ASSIGNMENT_STATEMENT__RHS;

	/**
	 * The number of structural features of the '<em>Special Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ASSIGNMENT_STATEMENT_FEATURE_COUNT = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ContinueStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 79;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AbortStatementImpl <em>Abort Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.AbortStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAbortStatement()
	 * @generated
	 */
	int ABORT_STATEMENT = 80;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Abort Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABORT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BreakStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 81;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BreakAllStatementImpl <em>Break All Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BreakAllStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBreakAllStatement()
	 * @generated
	 */
	int BREAK_ALL_STATEMENT = 82;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_ALL_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_ALL_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_ALL_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Break All Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_ALL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AnnotationStatementImpl <em>Annotation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.AnnotationStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAnnotationStatement()
	 * @generated
	 */
	int ANNOTATION_STATEMENT = 83;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SimpleAnnotationStatementImpl <em>Simple Annotation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SimpleAnnotationStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSimpleAnnotationStatement()
	 * @generated
	 */
	int SIMPLE_ANNOTATION_STATEMENT = 84;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_STATEMENT__CONTAINER = ANNOTATION_STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_STATEMENT__URI = ANNOTATION_STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_STATEMENT__REGION = ANNOTATION_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_STATEMENT__NAME = ANNOTATION_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_STATEMENT__VALUES = ANNOTATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Annotation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANNOTATION_STATEMENT_FEATURE_COUNT = ANNOTATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExecutableAnnotationStatementImpl <em>Executable Annotation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ExecutableAnnotationStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExecutableAnnotationStatement()
	 * @generated
	 */
	int EXECUTABLE_ANNOTATION_STATEMENT = 85;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ANNOTATION_STATEMENT__CONTAINER = ANNOTATION_STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ANNOTATION_STATEMENT__URI = ANNOTATION_STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ANNOTATION_STATEMENT__REGION = ANNOTATION_STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ANNOTATION_STATEMENT__NAME = ANNOTATION_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ANNOTATION_STATEMENT__EXPRESSION = ANNOTATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Annotation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ANNOTATION_STATEMENT_FEATURE_COUNT = ANNOTATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl <em>Model Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelDeclarationStatement()
	 * @generated
	 */
	int MODEL_DECLARATION_STATEMENT = 86;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__CONTAINER = STATEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__URI = STATEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__REGION = STATEMENT__REGION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__DRIVER = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__ALIASES = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IMetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__IMETAMODEL = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT__PARAMETERS = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.TypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 87;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONTAINER = EOL_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__URI = EOL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REGION = EOL_ELEMENT__REGION;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = EOL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl <em>Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__CONTAINER = TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__URI = TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__REGION = TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__DYNAMIC_TYPES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE__DECLARED = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Resolved IMetamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__RESOLVED_IMETAMODEL = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl <em>Model Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelElementType()
	 * @generated
	 */
	int MODEL_ELEMENT_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__MODEL_NAME = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__ELEMENT_NAME = ANY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolved IMetamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__RESOLVED_IMETAMODEL = ANY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved Model Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION = ANY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__MODEL_TYPE = ANY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resolved IPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE__RESOLVED_IPACKAGE = ANY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PseudoTypeImpl <em>Pseudo Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.PseudoTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPseudoType()
	 * @generated
	 */
	int PSEUDO_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Pseudo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SelfTypeImpl <em>Self Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SelfTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSelfType()
	 * @generated
	 */
	int SELF_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__CONTAINER = PSEUDO_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__URI = PSEUDO_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__REGION = PSEUDO_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__DYNAMIC_TYPES = PSEUDO_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE__DECLARED = PSEUDO_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Self Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_TYPE_FEATURE_COUNT = PSEUDO_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.MapTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__KEY_TYPE = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__VALUE_TYPE = ANY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NativeTypeImpl <em>Native Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.NativeTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__EXPRESSION = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Native Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.VoidTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.InvalidTypeImpl <em>Invalid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.InvalidTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getInvalidType()
	 * @generated
	 */
	int INVALID_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.CollectionTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__CONTENT_TYPE = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BagTypeImpl <em>Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BagTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBagType()
	 * @generated
	 */
	int BAG_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CONTAINER = COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__URI = COLLECTION_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__REGION = COLLECTION_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__DYNAMIC_TYPES = COLLECTION_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__DECLARED = COLLECTION_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CONTENT_TYPE = COLLECTION_TYPE__CONTENT_TYPE;

	/**
	 * The number of structural features of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionTypeImpl <em>Ordered Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedCollectionType()
	 * @generated
	 */
	int ORDERED_COLLECTION_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_TYPE__CONTAINER = COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_TYPE__URI = COLLECTION_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_TYPE__REGION = COLLECTION_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_TYPE__DYNAMIC_TYPES = COLLECTION_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_TYPE__DECLARED = COLLECTION_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_TYPE__CONTENT_TYPE = COLLECTION_TYPE__CONTENT_TYPE;

	/**
	 * The number of structural features of the '<em>Ordered Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionTypeImpl <em>Unique Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getUniqueCollectionType()
	 * @generated
	 */
	int UNIQUE_COLLECTION_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_TYPE__CONTAINER = COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_TYPE__URI = COLLECTION_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_TYPE__REGION = COLLECTION_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_TYPE__DYNAMIC_TYPES = COLLECTION_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_TYPE__DECLARED = COLLECTION_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_TYPE__CONTENT_TYPE = COLLECTION_TYPE__CONTENT_TYPE;

	/**
	 * The number of structural features of the '<em>Unique Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SetTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CONTAINER = UNIQUE_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__URI = UNIQUE_COLLECTION_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__REGION = UNIQUE_COLLECTION_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__DYNAMIC_TYPES = UNIQUE_COLLECTION_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__DECLARED = UNIQUE_COLLECTION_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CONTENT_TYPE = UNIQUE_COLLECTION_TYPE__CONTENT_TYPE;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = UNIQUE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedSetTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedSetType()
	 * @generated
	 */
	int ORDERED_SET_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__CONTAINER = UNIQUE_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__URI = UNIQUE_COLLECTION_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__REGION = UNIQUE_COLLECTION_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__DYNAMIC_TYPES = UNIQUE_COLLECTION_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__DECLARED = UNIQUE_COLLECTION_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__CONTENT_TYPE = UNIQUE_COLLECTION_TYPE__CONTENT_TYPE;

	/**
	 * The number of structural features of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE_FEATURE_COUNT = UNIQUE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SequenceTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CONTAINER = ORDERED_COLLECTION_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__URI = ORDERED_COLLECTION_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__REGION = ORDERED_COLLECTION_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DYNAMIC_TYPES = ORDERED_COLLECTION_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DECLARED = ORDERED_COLLECTION_TYPE__DECLARED;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CONTENT_TYPE = ORDERED_COLLECTION_TYPE__CONTENT_TYPE;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = ORDERED_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.PrimitiveTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 104;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__CONTAINER = ANY_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__URI = ANY_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__REGION = ANY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__DYNAMIC_TYPES = ANY_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__DECLARED = ANY_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = ANY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ComparablePrimitiveTypeImpl <em>Comparable Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.ComparablePrimitiveTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getComparablePrimitiveType()
	 * @generated
	 */
	int COMPARABLE_PRIMITIVE_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_PRIMITIVE_TYPE__CONTAINER = PRIMITIVE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_PRIMITIVE_TYPE__URI = PRIMITIVE_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_PRIMITIVE_TYPE__REGION = PRIMITIVE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_PRIMITIVE_TYPE__DYNAMIC_TYPES = PRIMITIVE_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_PRIMITIVE_TYPE__DECLARED = PRIMITIVE_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Comparable Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SummablePrimitiveTypeImpl <em>Summable Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.SummablePrimitiveTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSummablePrimitiveType()
	 * @generated
	 */
	int SUMMABLE_PRIMITIVE_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_PRIMITIVE_TYPE__CONTAINER = PRIMITIVE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_PRIMITIVE_TYPE__URI = PRIMITIVE_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_PRIMITIVE_TYPE__REGION = PRIMITIVE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_PRIMITIVE_TYPE__DYNAMIC_TYPES = PRIMITIVE_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_PRIMITIVE_TYPE__DECLARED = PRIMITIVE_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Summable Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMABLE_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.BooleanTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 107;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__CONTAINER = PRIMITIVE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__URI = PRIMITIVE_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__REGION = PRIMITIVE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DYNAMIC_TYPES = PRIMITIVE_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DECLARED = PRIMITIVE_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.RealTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 108;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__CONTAINER = COMPARABLE_PRIMITIVE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__URI = COMPARABLE_PRIMITIVE_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__REGION = COMPARABLE_PRIMITIVE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__DYNAMIC_TYPES = COMPARABLE_PRIMITIVE_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__DECLARED = COMPARABLE_PRIMITIVE_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = COMPARABLE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.IntegerTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 109;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__CONTAINER = REAL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__URI = REAL_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__REGION = REAL_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__DYNAMIC_TYPES = REAL_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__DECLARED = REAL_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = REAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.eol.metamodel.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.eol.metamodel.impl.StringTypeImpl
	 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 110;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CONTAINER = COMPARABLE_PRIMITIVE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__URI = COMPARABLE_PRIMITIVE_TYPE__URI;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__REGION = COMPARABLE_PRIMITIVE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DYNAMIC_TYPES = COMPARABLE_PRIMITIVE_TYPE__DYNAMIC_TYPES;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DECLARED = COMPARABLE_PRIMITIVE_TYPE__DECLARED;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = COMPARABLE_PRIMITIVE_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.EOLElement <em>EOL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOL Element</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLElement
	 * @generated
	 */
	EClass getEOLElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLElement#getContainer()
	 * @see #getEOLElement()
	 * @generated
	 */
	EReference getEOLElement_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLElement#getUri()
	 * @see #getEOLElement()
	 * @generated
	 */
	EAttribute getEOLElement_Uri();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLElement#getRegion()
	 * @see #getEOLElement()
	 * @generated
	 */
	EReference getEOLElement_Region();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel <em>IMetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMetamodel</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IMetamodel
	 * @generated
	 */
	EClass getIMetamodel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IMetamodel#getName()
	 * @see #getIMetamodel()
	 * @generated
	 */
	EReference getIMetamodel_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aliases</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IMetamodel#getAliases()
	 * @see #getIMetamodel()
	 * @generated
	 */
	EReference getIMetamodel_Aliases();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driver</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IMetamodel#getDriver()
	 * @see #getIMetamodel()
	 * @generated
	 */
	EReference getIMetamodel_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getIMetamodelDriver <em>IMetamodel Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IMetamodel Driver</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IMetamodel#getIMetamodelDriver()
	 * @see #getIMetamodel()
	 * @generated
	 */
	EAttribute getIMetamodel_IMetamodelDriver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getIPackages <em>IPackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IPackages</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IMetamodel#getIPackages()
	 * @see #getIMetamodel()
	 * @generated
	 */
	EReference getIMetamodel_IPackages();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getNsURIorPath <em>Ns UR Ior Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ns UR Ior Path</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IMetamodel#getNsURIorPath()
	 * @see #getIMetamodel()
	 * @generated
	 */
	EReference getIMetamodel_NsURIorPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.IPackage <em>IPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPackage</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IPackage
	 * @generated
	 */
	EClass getIPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getIPackageDriver <em>IPackage Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IPackage Driver</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IPackage#getIPackageDriver()
	 * @see #getIPackage()
	 * @generated
	 */
	EAttribute getIPackage_IPackageDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IPackage#getName()
	 * @see #getIPackage()
	 * @generated
	 */
	EAttribute getIPackage_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ns URI</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IPackage#getNsURI()
	 * @see #getIPackage()
	 * @generated
	 */
	EReference getIPackage_NsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IPackage#getNsPrefix()
	 * @see #getIPackage()
	 * @generated
	 */
	EAttribute getIPackage_NsPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IPackage#getSubPackages()
	 * @see #getIPackage()
	 * @generated
	 */
	EReference getIPackage_SubPackages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.TextRegion <em>Text Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Region</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TextRegion
	 * @generated
	 */
	EClass getTextRegion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.TextRegion#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TextRegion#getStart()
	 * @see #getTextRegion()
	 * @generated
	 */
	EReference getTextRegion_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.TextRegion#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TextRegion#getEnd()
	 * @see #getTextRegion()
	 * @generated
	 */
	EReference getTextRegion_End();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.TextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Position</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TextPosition
	 * @generated
	 */
	EClass getTextPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.TextPosition#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TextPosition#getLine()
	 * @see #getTextPosition()
	 * @generated
	 */
	EAttribute getTextPosition_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.TextPosition#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TextPosition#getColumn()
	 * @see #getTextPosition()
	 * @generated
	 */
	EAttribute getTextPosition_Column();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.EOLLibraryModule <em>EOL Library Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOL Library Module</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLLibraryModule
	 * @generated
	 */
	EClass getEOLLibraryModule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getName()
	 * @see #getEOLLibraryModule()
	 * @generated
	 */
	EAttribute getEOLLibraryModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getImports()
	 * @see #getEOLLibraryModule()
	 * @generated
	 */
	EReference getEOLLibraryModule_Imports();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getIModels <em>IModels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>IModels</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getIModels()
	 * @see #getEOLLibraryModule()
	 * @generated
	 */
	EReference getEOLLibraryModule_IModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getModelDeclarations <em>Model Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Declarations</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getModelDeclarations()
	 * @see #getEOLLibraryModule()
	 * @generated
	 */
	EReference getEOLLibraryModule_ModelDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLLibraryModule#getOperations()
	 * @see #getEOLLibraryModule()
	 * @generated
	 */
	EReference getEOLLibraryModule_Operations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.EOLModule <em>EOL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOL Module</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLModule
	 * @generated
	 */
	EClass getEOLModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.EOLModule#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EOLModule#getBlock()
	 * @see #getEOLModule()
	 * @generated
	 */
	EReference getEOLModule_Block();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.Import#getImportedModule <em>Imported Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Module</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Import#getImportedModule()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImportedModule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.Import#getImported <em>Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Import#getImported()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Imported();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.AnnotationBlock <em>Annotation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Block</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AnnotationBlock
	 * @generated
	 */
	EClass getAnnotationBlock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock <em>Expression Or Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Or Statement Block</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock
	 * @generated
	 */
	EClass getExpressionOrStatementBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock#getBlock()
	 * @see #getExpressionOrStatementBlock()
	 * @generated
	 */
	EReference getExpressionOrStatementBlock_Block();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock#getExpression()
	 * @see #getExpressionOrStatementBlock()
	 * @generated
	 */
	EReference getExpressionOrStatementBlock_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock#getCondition()
	 * @see #getExpressionOrStatementBlock()
	 * @generated
	 */
	EReference getExpressionOrStatementBlock_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition <em>Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Definition</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition
	 * @generated
	 */
	EClass getOperationDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getContextType()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_ContextType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getReturnType()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getAnnotationBlock <em>Annotation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Block</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getAnnotationBlock()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_AnnotationBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getBody()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getName()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getParameters()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getSelf <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getSelf()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_Self();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#get_result <em>result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>result</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#get_result()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition__result();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getDependingOperationDefinitions <em>Depending Operation Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depending Operation Definitions</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperationDefinition#getDependingOperationDefinitions()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_DependingOperationDefinitions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.Expression#getResolvedType <em>Resolved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolved Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Expression#getResolvedType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ResolvedType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.Expression#isInBrackets <em>In Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Brackets</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Expression#isInBrackets()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_InBrackets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.OperatorExpression <em>Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OperatorExpression
	 * @generated
	 */
	EClass getOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.UnaryOperatorExpression <em>Unary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.UnaryOperatorExpression
	 * @generated
	 */
	EClass getUnaryOperatorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.UnaryOperatorExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.UnaryOperatorExpression#getExpression()
	 * @see #getUnaryOperatorExpression()
	 * @generated
	 */
	EReference getUnaryOperatorExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.NotOperatorExpression <em>Not Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NotOperatorExpression
	 * @generated
	 */
	EClass getNotOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.NegativeOperatorExpression <em>Negative Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NegativeOperatorExpression
	 * @generated
	 */
	EClass getNegativeOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression <em>Binary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression
	 * @generated
	 */
	EClass getBinaryOperatorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getLhs()
	 * @see #getBinaryOperatorExpression()
	 * @generated
	 */
	EReference getBinaryOperatorExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getRhs()
	 * @see #getBinaryOperatorExpression()
	 * @generated
	 */
	EReference getBinaryOperatorExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.LogicalOperatorExpression <em>Logical Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.LogicalOperatorExpression
	 * @generated
	 */
	EClass getLogicalOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.AndOperatorExpression <em>And Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AndOperatorExpression
	 * @generated
	 */
	EClass getAndOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.XorOperatorExpression <em>Xor Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.XorOperatorExpression
	 * @generated
	 */
	EClass getXorOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.OrOperatorExpression <em>Or Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OrOperatorExpression
	 * @generated
	 */
	EClass getOrOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ImpliesOperatorExpression <em>Implies Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ImpliesOperatorExpression
	 * @generated
	 */
	EClass getImpliesOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ArithmeticOperatorExpression <em>Arithmetic Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ArithmeticOperatorExpression
	 * @generated
	 */
	EClass getArithmeticOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.DivideOperatorExpression <em>Divide Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.DivideOperatorExpression
	 * @generated
	 */
	EClass getDivideOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.MultiplyOperatorExpression <em>Multiply Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MultiplyOperatorExpression
	 * @generated
	 */
	EClass getMultiplyOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.MinusOperatorExpression <em>Minus Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MinusOperatorExpression
	 * @generated
	 */
	EClass getMinusOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.PlusOperatorExpression <em>Plus Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.PlusOperatorExpression
	 * @generated
	 */
	EClass getPlusOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ComparisonOperatorExpression <em>Comparison Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ComparisonOperatorExpression
	 * @generated
	 */
	EClass getComparisonOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.GreaterThanOrEqualToOperatorExpression <em>Greater Than Or Equal To Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal To Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.GreaterThanOrEqualToOperatorExpression
	 * @generated
	 */
	EClass getGreaterThanOrEqualToOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression <em>Greater Than Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.GreaterThanOperatorExpression
	 * @generated
	 */
	EClass getGreaterThanOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.LessThanOrEqualToOperatorExpression <em>Less Than Or Equal To Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal To Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.LessThanOrEqualToOperatorExpression
	 * @generated
	 */
	EClass getLessThanOrEqualToOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.LessThanOperatorExpression <em>Less Than Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.LessThanOperatorExpression
	 * @generated
	 */
	EClass getLessThanOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression <em>Not Equals Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equals Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NotEqualsOperatorExpression
	 * @generated
	 */
	EClass getNotEqualsOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression <em>Equals Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals Operator Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression
	 * @generated
	 */
	EClass getEqualsOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression
	 * @generated
	 */
	EClass getVariableDeclarationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression#isCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression#isCreate()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EAttribute getVariableDeclarationExpression_Create();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression#getName()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EReference getVariableDeclarationExpression_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression#getReferences()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EReference getVariableDeclarationExpression_References();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.FormalParameterExpression <em>Formal Parameter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FormalParameterExpression
	 * @generated
	 */
	EClass getFormalParameterExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NameExpression
	 * @generated
	 */
	EClass getNameExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.NameExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NameExpression#getName()
	 * @see #getNameExpression()
	 * @generated
	 */
	EAttribute getNameExpression_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.NameExpression#getResolvedContent <em>Resolved Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved Content</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NameExpression#getResolvedContent()
	 * @see #getNameExpression()
	 * @generated
	 */
	EAttribute getNameExpression_ResolvedContent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.NameExpression#isIsType <em>Is Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NameExpression#isIsType()
	 * @see #getNameExpression()
	 * @generated
	 */
	EAttribute getNameExpression_IsType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression <em>Feature Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Call Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FeatureCallExpression
	 * @generated
	 */
	EClass getFeatureCallExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#getTarget()
	 * @see #getFeatureCallExpression()
	 * @generated
	 */
	EReference getFeatureCallExpression_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#isArrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrow</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#isArrow()
	 * @see #getFeatureCallExpression()
	 * @generated
	 */
	EAttribute getFeatureCallExpression_Arrow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression <em>Method Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MethodCallExpression
	 * @generated
	 */
	EClass getMethodCallExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getArguments()
	 * @see #getMethodCallExpression()
	 * @generated
	 */
	EReference getMethodCallExpression_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getMethod()
	 * @see #getMethodCallExpression()
	 * @generated
	 */
	EReference getMethodCallExpression_Method();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getResolvedOperationDefinition <em>Resolved Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Operation Definition</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getResolvedOperationDefinition()
	 * @see #getMethodCallExpression()
	 * @generated
	 */
	EReference getMethodCallExpression_ResolvedOperationDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression <em>Property Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.PropertyCallExpression
	 * @generated
	 */
	EClass getPropertyCallExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#isExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#isExtended()
	 * @see #getPropertyCallExpression()
	 * @generated
	 */
	EAttribute getPropertyCallExpression_Extended();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#getProperty()
	 * @see #getPropertyCallExpression()
	 * @generated
	 */
	EReference getPropertyCallExpression_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression <em>FOL Method Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FOL Method Call Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression
	 * @generated
	 */
	EClass getFOLMethodCallExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getIterator()
	 * @see #getFOLMethodCallExpression()
	 * @generated
	 */
	EReference getFOLMethodCallExpression_Iterator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getConditions()
	 * @see #getFOLMethodCallExpression()
	 * @generated
	 */
	EReference getFOLMethodCallExpression_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getMethod()
	 * @see #getFOLMethodCallExpression()
	 * @generated
	 */
	EReference getFOLMethodCallExpression_Method();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getResolvedFOLDefinition <em>Resolved FOL Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved FOL Definition</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getResolvedFOLDefinition()
	 * @see #getFOLMethodCallExpression()
	 * @generated
	 */
	EReference getFOLMethodCallExpression_ResolvedFOLDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.KeyValueExpression <em>Key Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.KeyValueExpression
	 * @generated
	 */
	EClass getKeyValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.KeyValueExpression#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.KeyValueExpression#getKey()
	 * @see #getKeyValueExpression()
	 * @generated
	 */
	EReference getKeyValueExpression_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.KeyValueExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.KeyValueExpression#getValue()
	 * @see #getKeyValueExpression()
	 * @generated
	 */
	EReference getKeyValueExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationParameter <em>Model Declaration Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Declaration Parameter</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationParameter
	 * @generated
	 */
	EClass getModelDeclarationParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.NewExpression <em>New Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NewExpression
	 * @generated
	 */
	EClass getNewExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.NewExpression#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NewExpression#getTypeName()
	 * @see #getNewExpression()
	 * @generated
	 */
	EReference getNewExpression_TypeName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.NewExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NewExpression#getParameters()
	 * @see #getNewExpression()
	 * @generated
	 */
	EReference getNewExpression_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.MapExpression <em>Map Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MapExpression
	 * @generated
	 */
	EClass getMapExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.MapExpression#getKeyValues <em>Key Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Values</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MapExpression#getKeyValues()
	 * @see #getMapExpression()
	 * @generated
	 */
	EReference getMapExpression_KeyValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionExpression
	 * @generated
	 */
	EClass getCollectionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.CollectionExpression#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionExpression#getContents()
	 * @see #getCollectionExpression()
	 * @generated
	 */
	EReference getCollectionExpression_Contents();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.CollectionExpression#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionExpression#getParameterList()
	 * @see #getCollectionExpression()
	 * @generated
	 */
	EReference getCollectionExpression_ParameterList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.PrimitiveExpression <em>Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.PrimitiveExpression
	 * @generated
	 */
	EClass getPrimitiveExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ComparableExpression <em>Comparable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ComparableExpression
	 * @generated
	 */
	EClass getComparableExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SummableExpression <em>Summable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summable Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SummableExpression
	 * @generated
	 */
	EClass getSummableExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.StringExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.StringExpression#getValue()
	 * @see #getStringExpression()
	 * @generated
	 */
	EAttribute getStringExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.BooleanExpression#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BooleanExpression#isValue()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.RealExpression <em>Real Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.RealExpression
	 * @generated
	 */
	EClass getRealExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.RealExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.RealExpression#getValue()
	 * @see #getRealExpression()
	 * @generated
	 */
	EAttribute getRealExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.IntegerExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IntegerExpression#getValue()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EAttribute getIntegerExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.BagExpression <em>Bag Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BagExpression
	 * @generated
	 */
	EClass getBagExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SetExpression
	 * @generated
	 */
	EClass getSetExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.OrderedSetExpression <em>Ordered Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedSetExpression
	 * @generated
	 */
	EClass getOrderedSetExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SequenceExpression <em>Sequence Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SequenceExpression
	 * @generated
	 */
	EClass getSequenceExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.OrderedCollection <em>Ordered Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Collection</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedCollection
	 * @generated
	 */
	EClass getOrderedCollection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.UniqueCollection <em>Unique Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Collection</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.UniqueCollection
	 * @generated
	 */
	EClass getUniqueCollection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression <em>Enumeration Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression
	 * @generated
	 */
	EClass getEnumerationLiteralExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getLiteral()
	 * @see #getEnumerationLiteralExpression()
	 * @generated
	 */
	EReference getEnumerationLiteralExpression_Literal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getEnumeration()
	 * @see #getEnumerationLiteralExpression()
	 * @generated
	 */
	EReference getEnumerationLiteralExpression_Enumeration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getIModel <em>IModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IModel</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getIModel()
	 * @see #getEnumerationLiteralExpression()
	 * @generated
	 */
	EReference getEnumerationLiteralExpression_IModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression#getModel()
	 * @see #getEnumerationLiteralExpression()
	 * @generated
	 */
	EReference getEnumerationLiteralExpression_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.CollectionInitialisationExpression <em>Collection Initialisation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Initialisation Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionInitialisationExpression
	 * @generated
	 */
	EClass getCollectionInitialisationExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange <em>Expression Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Range</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionRange
	 * @generated
	 */
	EClass getExpressionRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionRange#getStart()
	 * @see #getExpressionRange()
	 * @generated
	 */
	EReference getExpressionRange_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionRange#getEnd()
	 * @see #getExpressionRange()
	 * @generated
	 */
	EReference getExpressionRange_End();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression List</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionList
	 * @generated
	 */
	EClass getExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.ExpressionList#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionList#getExpressions()
	 * @see #getExpressionList()
	 * @generated
	 */
	EReference getExpressionList_Expressions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.TransactionStatement <em>Transaction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TransactionStatement
	 * @generated
	 */
	EClass getTransactionStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.TransactionStatement#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Names</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TransactionStatement#getNames()
	 * @see #getTransactionStatement()
	 * @generated
	 */
	EReference getTransactionStatement_Names();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.TransactionStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.TransactionStatement#getBody()
	 * @see #getTransactionStatement()
	 * @generated
	 */
	EReference getTransactionStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchStatement#getExpression()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchStatement#getCases()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Cases();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchStatement#getDefault()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Default();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement <em>Switch Case Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement
	 * @generated
	 */
	EClass getSwitchCaseStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement#getBody()
	 * @see #getSwitchCaseStatement()
	 * @generated
	 */
	EReference getSwitchCaseStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseDefaultStatement <em>Switch Case Default Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case Default Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseDefaultStatement
	 * @generated
	 */
	EClass getSwitchCaseDefaultStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement <em>Switch Case Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case Expression Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement
	 * @generated
	 */
	EClass getSwitchCaseExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement#getExpression()
	 * @see #getSwitchCaseExpressionStatement()
	 * @generated
	 */
	EReference getSwitchCaseExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getIfBody <em>If Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Body</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IfStatement#getIfBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_IfBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getElseIfBodies <em>Else If Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If Bodies</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IfStatement#getElseIfBodies()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseIfBodies();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Body</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IfStatement#getElseBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ForStatement#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ForStatement#getIterator()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Iterator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ForStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ForStatement#getCondition()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ForStatement#getBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.WhileStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.WhileStatement#getBody()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ThrowStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ThrowStatement#getExpression()
	 * @see #getThrowStatement()
	 * @generated
	 */
	EReference getThrowStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.DeleteStatement <em>Delete Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.DeleteStatement
	 * @generated
	 */
	EClass getDeleteStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.DeleteStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.DeleteStatement#getExpression()
	 * @see #getDeleteStatement()
	 * @generated
	 */
	EReference getDeleteStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AssignmentStatement
	 * @generated
	 */
	EClass getAssignmentStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.AssignmentStatement#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AssignmentStatement#getLhs()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EReference getAssignmentStatement_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.AssignmentStatement#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AssignmentStatement#getRhs()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EReference getAssignmentStatement_Rhs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SpecialAssignmentStatement <em>Special Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Assignment Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SpecialAssignmentStatement
	 * @generated
	 */
	EClass getSpecialAssignmentStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.AbortStatement <em>Abort Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abort Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AbortStatement
	 * @generated
	 */
	EClass getAbortStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.BreakAllStatement <em>Break All Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break All Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BreakAllStatement
	 * @generated
	 */
	EClass getBreakAllStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.AnnotationStatement <em>Annotation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AnnotationStatement
	 * @generated
	 */
	EClass getAnnotationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.AnnotationStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AnnotationStatement#getName()
	 * @see #getAnnotationStatement()
	 * @generated
	 */
	EReference getAnnotationStatement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement <em>Simple Annotation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Annotation Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement
	 * @generated
	 */
	EClass getSimpleAnnotationStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement#getValues()
	 * @see #getSimpleAnnotationStatement()
	 * @generated
	 */
	EReference getSimpleAnnotationStatement_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ExecutableAnnotationStatement <em>Executable Annotation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Annotation Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExecutableAnnotationStatement
	 * @generated
	 */
	EClass getExecutableAnnotationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ExecutableAnnotationStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ExecutableAnnotationStatement#getExpression()
	 * @see #getExecutableAnnotationStatement()
	 * @generated
	 */
	EReference getExecutableAnnotationStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement <em>Model Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Declaration Statement</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement
	 * @generated
	 */
	EClass getModelDeclarationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getName()
	 * @see #getModelDeclarationStatement()
	 * @generated
	 */
	EReference getModelDeclarationStatement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Driver</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getDriver()
	 * @see #getModelDeclarationStatement()
	 * @generated
	 */
	EReference getModelDeclarationStatement_Driver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aliases</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getAliases()
	 * @see #getModelDeclarationStatement()
	 * @generated
	 */
	EReference getModelDeclarationStatement_Aliases();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getIMetamodel <em>IMetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IMetamodel</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getIMetamodel()
	 * @see #getModelDeclarationStatement()
	 * @generated
	 */
	EReference getModelDeclarationStatement_IMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement#getParameters()
	 * @see #getModelDeclarationStatement()
	 * @generated
	 */
	EReference getModelDeclarationStatement_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AnyType
	 * @generated
	 */
	EClass getAnyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.eol.metamodel.AnyType#getDynamicTypes <em>Dynamic Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Types</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AnyType#getDynamicTypes()
	 * @see #getAnyType()
	 * @generated
	 */
	EReference getAnyType_DynamicTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.AnyType#isDeclared <em>Declared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.AnyType#isDeclared()
	 * @see #getAnyType()
	 * @generated
	 */
	EAttribute getAnyType_Declared();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.ModelType#getResolvedIMetamodel <em>Resolved IMetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved IMetamodel</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelType#getResolvedIMetamodel()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_ResolvedIMetamodel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType <em>Model Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType
	 * @generated
	 */
	EClass getModelElementType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelName()
	 * @see #getModelElementType()
	 * @generated
	 */
	EAttribute getModelElementType_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType#getElementName()
	 * @see #getModelElementType()
	 * @generated
	 */
	EAttribute getModelElementType_ElementName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIMetamodel <em>Resolved IMetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved IMetamodel</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIMetamodel()
	 * @see #getModelElementType()
	 * @generated
	 */
	EReference getModelElementType_ResolvedIMetamodel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedModelDeclaration <em>Resolved Model Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Model Declaration</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedModelDeclaration()
	 * @see #getModelElementType()
	 * @generated
	 */
	EReference getModelElementType_ResolvedModelDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelType()
	 * @see #getModelElementType()
	 * @generated
	 */
	EAttribute getModelElementType_ModelType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIPackage <em>Resolved IPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved IPackage</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIPackage()
	 * @see #getModelElementType()
	 * @generated
	 */
	EReference getModelElementType_ResolvedIPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.PseudoType <em>Pseudo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.PseudoType
	 * @generated
	 */
	EClass getPseudoType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SelfType <em>Self Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SelfType
	 * @generated
	 */
	EClass getSelfType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.MapType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MapType#getKeyType()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_KeyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.MapType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.MapType#getValueType()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_ValueType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NativeType
	 * @generated
	 */
	EClass getNativeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.NativeType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.NativeType#getExpression()
	 * @see #getNativeType()
	 * @generated
	 */
	EReference getNativeType_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.InvalidType <em>Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.InvalidType
	 * @generated
	 */
	EClass getInvalidType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.epsilon.eol.metamodel.CollectionType#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.CollectionType#getContentType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_ContentType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BagType
	 * @generated
	 */
	EClass getBagType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.OrderedCollectionType <em>Ordered Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Collection Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedCollectionType
	 * @generated
	 */
	EClass getOrderedCollectionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.UniqueCollectionType <em>Unique Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Collection Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.UniqueCollectionType
	 * @generated
	 */
	EClass getUniqueCollectionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.OrderedSetType
	 * @generated
	 */
	EClass getOrderedSetType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.ComparablePrimitiveType <em>Comparable Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable Primitive Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.ComparablePrimitiveType
	 * @generated
	 */
	EClass getComparablePrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.SummablePrimitiveType <em>Summable Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summable Primitive Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.SummablePrimitiveType
	 * @generated
	 */
	EClass getSummablePrimitiveType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.eol.metamodel.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.eclipse.epsilon.eol.metamodel.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EolFactory getEolFactory();

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
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EOLElementImpl <em>EOL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EOLElementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEOLElement()
		 * @generated
		 */
		EClass EOL_ELEMENT = eINSTANCE.getEOLElement();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ELEMENT__CONTAINER = eINSTANCE.getEOLElement_Container();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_ELEMENT__URI = eINSTANCE.getEOLElement_Uri();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_ELEMENT__REGION = eINSTANCE.getEOLElement_Region();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl <em>IMetamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIMetamodel()
		 * @generated
		 */
		EClass IMETAMODEL = eINSTANCE.getIMetamodel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMETAMODEL__NAME = eINSTANCE.getIMetamodel_Name();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMETAMODEL__ALIASES = eINSTANCE.getIMetamodel_Aliases();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMETAMODEL__DRIVER = eINSTANCE.getIMetamodel_Driver();

		/**
		 * The meta object literal for the '<em><b>IMetamodel Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMETAMODEL__IMETAMODEL_DRIVER = eINSTANCE.getIMetamodel_IMetamodelDriver();

		/**
		 * The meta object literal for the '<em><b>IPackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMETAMODEL__IPACKAGES = eINSTANCE.getIMetamodel_IPackages();

		/**
		 * The meta object literal for the '<em><b>Ns UR Ior Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMETAMODEL__NS_UR_IOR_PATH = eINSTANCE.getIMetamodel_NsURIorPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl <em>IPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIPackage()
		 * @generated
		 */
		EClass IPACKAGE = eINSTANCE.getIPackage();

		/**
		 * The meta object literal for the '<em><b>IPackage Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPACKAGE__IPACKAGE_DRIVER = eINSTANCE.getIPackage_IPackageDriver();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPACKAGE__NAME = eINSTANCE.getIPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPACKAGE__NS_URI = eINSTANCE.getIPackage_NsURI();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPACKAGE__NS_PREFIX = eINSTANCE.getIPackage_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPACKAGE__SUB_PACKAGES = eINSTANCE.getIPackage_SubPackages();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TextRegionImpl <em>Text Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.TextRegionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getTextRegion()
		 * @generated
		 */
		EClass TEXT_REGION = eINSTANCE.getTextRegion();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_REGION__START = eINSTANCE.getTextRegion_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_REGION__END = eINSTANCE.getTextRegion_End();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TextPositionImpl <em>Text Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.TextPositionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getTextPosition()
		 * @generated
		 */
		EClass TEXT_POSITION = eINSTANCE.getTextPosition();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_POSITION__LINE = eINSTANCE.getTextPosition_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_POSITION__COLUMN = eINSTANCE.getTextPosition_Column();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl <em>EOL Library Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEOLLibraryModule()
		 * @generated
		 */
		EClass EOL_LIBRARY_MODULE = eINSTANCE.getEOLLibraryModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_LIBRARY_MODULE__NAME = eINSTANCE.getEOLLibraryModule_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_LIBRARY_MODULE__IMPORTS = eINSTANCE.getEOLLibraryModule_Imports();

		/**
		 * The meta object literal for the '<em><b>IModels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_LIBRARY_MODULE__IMODELS = eINSTANCE.getEOLLibraryModule_IModels();

		/**
		 * The meta object literal for the '<em><b>Model Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_LIBRARY_MODULE__MODEL_DECLARATIONS = eINSTANCE.getEOLLibraryModule_ModelDeclarations();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_LIBRARY_MODULE__OPERATIONS = eINSTANCE.getEOLLibraryModule_Operations();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl <em>EOL Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EOLModuleImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEOLModule()
		 * @generated
		 */
		EClass EOL_MODULE = eINSTANCE.getEOLModule();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_MODULE__BLOCK = eINSTANCE.getEOLModule_Block();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ImportImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORTED_MODULE = eINSTANCE.getImport_ImportedModule();

		/**
		 * The meta object literal for the '<em><b>Imported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED = eINSTANCE.getImport_Imported();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BlockImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AnnotationBlockImpl <em>Annotation Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.AnnotationBlockImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAnnotationBlock()
		 * @generated
		 */
		EClass ANNOTATION_BLOCK = eINSTANCE.getAnnotationBlock();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionOrStatementBlockImpl <em>Expression Or Statement Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionOrStatementBlockImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionOrStatementBlock()
		 * @generated
		 */
		EClass EXPRESSION_OR_STATEMENT_BLOCK = eINSTANCE.getExpressionOrStatementBlock();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OR_STATEMENT_BLOCK__BLOCK = eINSTANCE.getExpressionOrStatementBlock_Block();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OR_STATEMENT_BLOCK__EXPRESSION = eINSTANCE.getExpressionOrStatementBlock_Expression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OR_STATEMENT_BLOCK__CONDITION = eINSTANCE.getExpressionOrStatementBlock_Condition();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOperationDefinition()
		 * @generated
		 */
		EClass OPERATION_DEFINITION = eINSTANCE.getOperationDefinition();

		/**
		 * The meta object literal for the '<em><b>Context Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__CONTEXT_TYPE = eINSTANCE.getOperationDefinition_ContextType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__RETURN_TYPE = eINSTANCE.getOperationDefinition_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Annotation Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__ANNOTATION_BLOCK = eINSTANCE.getOperationDefinition_AnnotationBlock();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__BODY = eINSTANCE.getOperationDefinition_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__NAME = eINSTANCE.getOperationDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__PARAMETERS = eINSTANCE.getOperationDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Self</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__SELF = eINSTANCE.getOperationDefinition_Self();

		/**
		 * The meta object literal for the '<em><b>result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__RESULT = eINSTANCE.getOperationDefinition__result();

		/**
		 * The meta object literal for the '<em><b>Depending Operation Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__DEPENDING_OPERATION_DEFINITIONS = eINSTANCE.getOperationDefinition_DependingOperationDefinitions();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Resolved Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RESOLVED_TYPE = eINSTANCE.getExpression_ResolvedType();

		/**
		 * The meta object literal for the '<em><b>In Brackets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__IN_BRACKETS = eINSTANCE.getExpression_InBrackets();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OperatorExpressionImpl <em>Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.OperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOperatorExpression()
		 * @generated
		 */
		EClass OPERATOR_EXPRESSION = eINSTANCE.getOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.UnaryOperatorExpressionImpl <em>Unary Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.UnaryOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getUnaryOperatorExpression()
		 * @generated
		 */
		EClass UNARY_OPERATOR_EXPRESSION = eINSTANCE.getUnaryOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATOR_EXPRESSION__EXPRESSION = eINSTANCE.getUnaryOperatorExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NotOperatorExpressionImpl <em>Not Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.NotOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNotOperatorExpression()
		 * @generated
		 */
		EClass NOT_OPERATOR_EXPRESSION = eINSTANCE.getNotOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NegativeOperatorExpressionImpl <em>Negative Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.NegativeOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNegativeOperatorExpression()
		 * @generated
		 */
		EClass NEGATIVE_OPERATOR_EXPRESSION = eINSTANCE.getNegativeOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BinaryOperatorExpressionImpl <em>Binary Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BinaryOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBinaryOperatorExpression()
		 * @generated
		 */
		EClass BINARY_OPERATOR_EXPRESSION = eINSTANCE.getBinaryOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR_EXPRESSION__LHS = eINSTANCE.getBinaryOperatorExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR_EXPRESSION__RHS = eINSTANCE.getBinaryOperatorExpression_Rhs();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.LogicalOperatorExpressionImpl <em>Logical Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.LogicalOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getLogicalOperatorExpression()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR_EXPRESSION = eINSTANCE.getLogicalOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AndOperatorExpressionImpl <em>And Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.AndOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAndOperatorExpression()
		 * @generated
		 */
		EClass AND_OPERATOR_EXPRESSION = eINSTANCE.getAndOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.XorOperatorExpressionImpl <em>Xor Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.XorOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getXorOperatorExpression()
		 * @generated
		 */
		EClass XOR_OPERATOR_EXPRESSION = eINSTANCE.getXorOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrOperatorExpressionImpl <em>Or Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.OrOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrOperatorExpression()
		 * @generated
		 */
		EClass OR_OPERATOR_EXPRESSION = eINSTANCE.getOrOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ImpliesOperatorExpressionImpl <em>Implies Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ImpliesOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getImpliesOperatorExpression()
		 * @generated
		 */
		EClass IMPLIES_OPERATOR_EXPRESSION = eINSTANCE.getImpliesOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ArithmeticOperatorExpressionImpl <em>Arithmetic Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ArithmeticOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getArithmeticOperatorExpression()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATOR_EXPRESSION = eINSTANCE.getArithmeticOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.DivideOperatorExpressionImpl <em>Divide Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.DivideOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getDivideOperatorExpression()
		 * @generated
		 */
		EClass DIVIDE_OPERATOR_EXPRESSION = eINSTANCE.getDivideOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MultiplyOperatorExpressionImpl <em>Multiply Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.MultiplyOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMultiplyOperatorExpression()
		 * @generated
		 */
		EClass MULTIPLY_OPERATOR_EXPRESSION = eINSTANCE.getMultiplyOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MinusOperatorExpressionImpl <em>Minus Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.MinusOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMinusOperatorExpression()
		 * @generated
		 */
		EClass MINUS_OPERATOR_EXPRESSION = eINSTANCE.getMinusOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PlusOperatorExpressionImpl <em>Plus Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.PlusOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPlusOperatorExpression()
		 * @generated
		 */
		EClass PLUS_OPERATOR_EXPRESSION = eINSTANCE.getPlusOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ComparisonOperatorExpressionImpl <em>Comparison Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ComparisonOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getComparisonOperatorExpression()
		 * @generated
		 */
		EClass COMPARISON_OPERATOR_EXPRESSION = eINSTANCE.getComparisonOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOrEqualToOperatorExpressionImpl <em>Greater Than Or Equal To Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOrEqualToOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getGreaterThanOrEqualToOperatorExpression()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION = eINSTANCE.getGreaterThanOrEqualToOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOperatorExpressionImpl <em>Greater Than Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.GreaterThanOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getGreaterThanOperatorExpression()
		 * @generated
		 */
		EClass GREATER_THAN_OPERATOR_EXPRESSION = eINSTANCE.getGreaterThanOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.LessThanOrEqualToOperatorExpressionImpl <em>Less Than Or Equal To Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.LessThanOrEqualToOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getLessThanOrEqualToOperatorExpression()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL_TO_OPERATOR_EXPRESSION = eINSTANCE.getLessThanOrEqualToOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.LessThanOperatorExpressionImpl <em>Less Than Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.LessThanOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getLessThanOperatorExpression()
		 * @generated
		 */
		EClass LESS_THAN_OPERATOR_EXPRESSION = eINSTANCE.getLessThanOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NotEqualsOperatorExpressionImpl <em>Not Equals Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.NotEqualsOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNotEqualsOperatorExpression()
		 * @generated
		 */
		EClass NOT_EQUALS_OPERATOR_EXPRESSION = eINSTANCE.getNotEqualsOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EqualsOperatorExpressionImpl <em>Equals Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EqualsOperatorExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEqualsOperatorExpression()
		 * @generated
		 */
		EClass EQUALS_OPERATOR_EXPRESSION = eINSTANCE.getEqualsOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl <em>Variable Declaration Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.VariableDeclarationExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getVariableDeclarationExpression()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_EXPRESSION = eINSTANCE.getVariableDeclarationExpression();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION_EXPRESSION__CREATE = eINSTANCE.getVariableDeclarationExpression_Create();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_EXPRESSION__NAME = eINSTANCE.getVariableDeclarationExpression_Name();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_EXPRESSION__REFERENCES = eINSTANCE.getVariableDeclarationExpression_References();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.FormalParameterExpressionImpl <em>Formal Parameter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.FormalParameterExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getFormalParameterExpression()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_EXPRESSION = eINSTANCE.getFormalParameterExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl <em>Name Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNameExpression()
		 * @generated
		 */
		EClass NAME_EXPRESSION = eINSTANCE.getNameExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EXPRESSION__NAME = eINSTANCE.getNameExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Resolved Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EXPRESSION__RESOLVED_CONTENT = eINSTANCE.getNameExpression_ResolvedContent();

		/**
		 * The meta object literal for the '<em><b>Is Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EXPRESSION__IS_TYPE = eINSTANCE.getNameExpression_IsType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.FeatureCallExpressionImpl <em>Feature Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.FeatureCallExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getFeatureCallExpression()
		 * @generated
		 */
		EClass FEATURE_CALL_EXPRESSION = eINSTANCE.getFeatureCallExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL_EXPRESSION__TARGET = eINSTANCE.getFeatureCallExpression_Target();

		/**
		 * The meta object literal for the '<em><b>Arrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CALL_EXPRESSION__ARROW = eINSTANCE.getFeatureCallExpression_Arrow();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl <em>Method Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMethodCallExpression()
		 * @generated
		 */
		EClass METHOD_CALL_EXPRESSION = eINSTANCE.getMethodCallExpression();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL_EXPRESSION__ARGUMENTS = eINSTANCE.getMethodCallExpression_Arguments();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL_EXPRESSION__METHOD = eINSTANCE.getMethodCallExpression_Method();

		/**
		 * The meta object literal for the '<em><b>Resolved Operation Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION = eINSTANCE.getMethodCallExpression_ResolvedOperationDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PropertyCallExpressionImpl <em>Property Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.PropertyCallExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPropertyCallExpression()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXPRESSION = eINSTANCE.getPropertyCallExpression();

		/**
		 * The meta object literal for the '<em><b>Extended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CALL_EXPRESSION__EXTENDED = eINSTANCE.getPropertyCallExpression_Extended();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXPRESSION__PROPERTY = eINSTANCE.getPropertyCallExpression_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl <em>FOL Method Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getFOLMethodCallExpression()
		 * @generated
		 */
		EClass FOL_METHOD_CALL_EXPRESSION = eINSTANCE.getFOLMethodCallExpression();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOL_METHOD_CALL_EXPRESSION__ITERATOR = eINSTANCE.getFOLMethodCallExpression_Iterator();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOL_METHOD_CALL_EXPRESSION__CONDITIONS = eINSTANCE.getFOLMethodCallExpression_Conditions();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOL_METHOD_CALL_EXPRESSION__METHOD = eINSTANCE.getFOLMethodCallExpression_Method();

		/**
		 * The meta object literal for the '<em><b>Resolved FOL Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION = eINSTANCE.getFOLMethodCallExpression_ResolvedFOLDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.KeyValueExpressionImpl <em>Key Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.KeyValueExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getKeyValueExpression()
		 * @generated
		 */
		EClass KEY_VALUE_EXPRESSION = eINSTANCE.getKeyValueExpression();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_EXPRESSION__KEY = eINSTANCE.getKeyValueExpression_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_EXPRESSION__VALUE = eINSTANCE.getKeyValueExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationParameterImpl <em>Model Declaration Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationParameterImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelDeclarationParameter()
		 * @generated
		 */
		EClass MODEL_DECLARATION_PARAMETER = eINSTANCE.getModelDeclarationParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NewExpressionImpl <em>New Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.NewExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNewExpression()
		 * @generated
		 */
		EClass NEW_EXPRESSION = eINSTANCE.getNewExpression();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_EXPRESSION__TYPE_NAME = eINSTANCE.getNewExpression_TypeName();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_EXPRESSION__PARAMETERS = eINSTANCE.getNewExpression_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MapExpressionImpl <em>Map Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.MapExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMapExpression()
		 * @generated
		 */
		EClass MAP_EXPRESSION = eINSTANCE.getMapExpression();

		/**
		 * The meta object literal for the '<em><b>Key Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_EXPRESSION__KEY_VALUES = eINSTANCE.getMapExpression_KeyValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.CollectionExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getCollectionExpression()
		 * @generated
		 */
		EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION__CONTENTS = eINSTANCE.getCollectionExpression_Contents();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION__PARAMETER_LIST = eINSTANCE.getCollectionExpression_ParameterList();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PrimitiveExpressionImpl <em>Primitive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.PrimitiveExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPrimitiveExpression()
		 * @generated
		 */
		EClass PRIMITIVE_EXPRESSION = eINSTANCE.getPrimitiveExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ComparableExpressionImpl <em>Comparable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ComparableExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getComparableExpression()
		 * @generated
		 */
		EClass COMPARABLE_EXPRESSION = eINSTANCE.getComparableExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SummableExpressionImpl <em>Summable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SummableExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSummableExpression()
		 * @generated
		 */
		EClass SUMMABLE_EXPRESSION = eINSTANCE.getSummableExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.StringExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXPRESSION__VALUE = eINSTANCE.getStringExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BooleanExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__VALUE = eINSTANCE.getBooleanExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.RealExpressionImpl <em>Real Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.RealExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getRealExpression()
		 * @generated
		 */
		EClass REAL_EXPRESSION = eINSTANCE.getRealExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_EXPRESSION__VALUE = eINSTANCE.getRealExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.IntegerExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_EXPRESSION__VALUE = eINSTANCE.getIntegerExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BagExpressionImpl <em>Bag Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BagExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBagExpression()
		 * @generated
		 */
		EClass BAG_EXPRESSION = eINSTANCE.getBagExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SetExpressionImpl <em>Set Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SetExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSetExpression()
		 * @generated
		 */
		EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedSetExpressionImpl <em>Ordered Set Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedSetExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedSetExpression()
		 * @generated
		 */
		EClass ORDERED_SET_EXPRESSION = eINSTANCE.getOrderedSetExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SequenceExpressionImpl <em>Sequence Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SequenceExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSequenceExpression()
		 * @generated
		 */
		EClass SEQUENCE_EXPRESSION = eINSTANCE.getSequenceExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionImpl <em>Ordered Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedCollection()
		 * @generated
		 */
		EClass ORDERED_COLLECTION = eINSTANCE.getOrderedCollection();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionImpl <em>Unique Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getUniqueCollection()
		 * @generated
		 */
		EClass UNIQUE_COLLECTION = eINSTANCE.getUniqueCollection();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl <em>Enumeration Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getEnumerationLiteralExpression()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL_EXPRESSION = eINSTANCE.getEnumerationLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL_EXPRESSION__LITERAL = eINSTANCE.getEnumerationLiteralExpression_Literal();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL_EXPRESSION__ENUMERATION = eINSTANCE.getEnumerationLiteralExpression_Enumeration();

		/**
		 * The meta object literal for the '<em><b>IModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL_EXPRESSION__IMODEL = eINSTANCE.getEnumerationLiteralExpression_IModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL_EXPRESSION__MODEL = eINSTANCE.getEnumerationLiteralExpression_Model();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.CollectionInitialisationExpressionImpl <em>Collection Initialisation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.CollectionInitialisationExpressionImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getCollectionInitialisationExpression()
		 * @generated
		 */
		EClass COLLECTION_INITIALISATION_EXPRESSION = eINSTANCE.getCollectionInitialisationExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionRangeImpl <em>Expression Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionRangeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionRange()
		 * @generated
		 */
		EClass EXPRESSION_RANGE = eINSTANCE.getExpressionRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_RANGE__START = eINSTANCE.getExpressionRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_RANGE__END = eINSTANCE.getExpressionRange_End();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionListImpl <em>Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionListImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionList()
		 * @generated
		 */
		EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.StatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TransactionStatementImpl <em>Transaction Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.TransactionStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getTransactionStatement()
		 * @generated
		 */
		EClass TRANSACTION_STATEMENT = eINSTANCE.getTransactionStatement();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_STATEMENT__NAMES = eINSTANCE.getTransactionStatement_Names();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_STATEMENT__BODY = eINSTANCE.getTransactionStatement_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ExpressionStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchStatement()
		 * @generated
		 */
		EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitchStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__CASES = eINSTANCE.getSwitchStatement_Cases();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__DEFAULT = eINSTANCE.getSwitchStatement_Default();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseStatementImpl <em>Switch Case Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchCaseStatement()
		 * @generated
		 */
		EClass SWITCH_CASE_STATEMENT = eINSTANCE.getSwitchCaseStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE_STATEMENT__BODY = eINSTANCE.getSwitchCaseStatement_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseDefaultStatementImpl <em>Switch Case Default Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseDefaultStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchCaseDefaultStatement()
		 * @generated
		 */
		EClass SWITCH_CASE_DEFAULT_STATEMENT = eINSTANCE.getSwitchCaseDefaultStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseExpressionStatementImpl <em>Switch Case Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SwitchCaseExpressionStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSwitchCaseExpressionStatement()
		 * @generated
		 */
		EClass SWITCH_CASE_EXPRESSION_STATEMENT = eINSTANCE.getSwitchCaseExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE_EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getSwitchCaseExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>If Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__IF_BODY = eINSTANCE.getIfStatement_IfBody();

		/**
		 * The meta object literal for the '<em><b>Else If Bodies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_IF_BODIES = eINSTANCE.getIfStatement_ElseIfBodies();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_BODY = eINSTANCE.getIfStatement_ElseBody();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ForStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__ITERATOR = eINSTANCE.getForStatement_Iterator();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__CONDITION = eINSTANCE.getForStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__BODY = eINSTANCE.getForStatement_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.WhileStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__BODY = eINSTANCE.getWhileStatement_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ReturnStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ThrowStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getThrowStatement()
		 * @generated
		 */
		EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_STATEMENT__EXPRESSION = eINSTANCE.getThrowStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.DeleteStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getDeleteStatement()
		 * @generated
		 */
		EClass DELETE_STATEMENT = eINSTANCE.getDeleteStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_STATEMENT__EXPRESSION = eINSTANCE.getDeleteStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.AssignmentStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAssignmentStatement()
		 * @generated
		 */
		EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STATEMENT__LHS = eINSTANCE.getAssignmentStatement_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STATEMENT__RHS = eINSTANCE.getAssignmentStatement_Rhs();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SpecialAssignmentStatementImpl <em>Special Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SpecialAssignmentStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSpecialAssignmentStatement()
		 * @generated
		 */
		EClass SPECIAL_ASSIGNMENT_STATEMENT = eINSTANCE.getSpecialAssignmentStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ContinueStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getContinueStatement()
		 * @generated
		 */
		EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AbortStatementImpl <em>Abort Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.AbortStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAbortStatement()
		 * @generated
		 */
		EClass ABORT_STATEMENT = eINSTANCE.getAbortStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BreakStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BreakAllStatementImpl <em>Break All Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BreakAllStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBreakAllStatement()
		 * @generated
		 */
		EClass BREAK_ALL_STATEMENT = eINSTANCE.getBreakAllStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AnnotationStatementImpl <em>Annotation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.AnnotationStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAnnotationStatement()
		 * @generated
		 */
		EClass ANNOTATION_STATEMENT = eINSTANCE.getAnnotationStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_STATEMENT__NAME = eINSTANCE.getAnnotationStatement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SimpleAnnotationStatementImpl <em>Simple Annotation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SimpleAnnotationStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSimpleAnnotationStatement()
		 * @generated
		 */
		EClass SIMPLE_ANNOTATION_STATEMENT = eINSTANCE.getSimpleAnnotationStatement();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ANNOTATION_STATEMENT__VALUES = eINSTANCE.getSimpleAnnotationStatement_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ExecutableAnnotationStatementImpl <em>Executable Annotation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ExecutableAnnotationStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getExecutableAnnotationStatement()
		 * @generated
		 */
		EClass EXECUTABLE_ANNOTATION_STATEMENT = eINSTANCE.getExecutableAnnotationStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ANNOTATION_STATEMENT__EXPRESSION = eINSTANCE.getExecutableAnnotationStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl <em>Model Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelDeclarationStatement()
		 * @generated
		 */
		EClass MODEL_DECLARATION_STATEMENT = eINSTANCE.getModelDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DECLARATION_STATEMENT__NAME = eINSTANCE.getModelDeclarationStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DECLARATION_STATEMENT__DRIVER = eINSTANCE.getModelDeclarationStatement_Driver();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DECLARATION_STATEMENT__ALIASES = eINSTANCE.getModelDeclarationStatement_Aliases();

		/**
		 * The meta object literal for the '<em><b>IMetamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DECLARATION_STATEMENT__IMETAMODEL = eINSTANCE.getModelDeclarationStatement_IMetamodel();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DECLARATION_STATEMENT__PARAMETERS = eINSTANCE.getModelDeclarationStatement_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.TypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl <em>Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getAnyType()
		 * @generated
		 */
		EClass ANY_TYPE = eINSTANCE.getAnyType();

		/**
		 * The meta object literal for the '<em><b>Dynamic Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_TYPE__DYNAMIC_TYPES = eINSTANCE.getAnyType_DynamicTypes();

		/**
		 * The meta object literal for the '<em><b>Declared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_TYPE__DECLARED = eINSTANCE.getAnyType_Declared();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Resolved IMetamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__RESOLVED_IMETAMODEL = eINSTANCE.getModelType_ResolvedIMetamodel();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl <em>Model Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getModelElementType()
		 * @generated
		 */
		EClass MODEL_ELEMENT_TYPE = eINSTANCE.getModelElementType();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_TYPE__MODEL_NAME = eINSTANCE.getModelElementType_ModelName();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_TYPE__ELEMENT_NAME = eINSTANCE.getModelElementType_ElementName();

		/**
		 * The meta object literal for the '<em><b>Resolved IMetamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_TYPE__RESOLVED_IMETAMODEL = eINSTANCE.getModelElementType_ResolvedIMetamodel();

		/**
		 * The meta object literal for the '<em><b>Resolved Model Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION = eINSTANCE.getModelElementType_ResolvedModelDeclaration();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_TYPE__MODEL_TYPE = eINSTANCE.getModelElementType_ModelType();

		/**
		 * The meta object literal for the '<em><b>Resolved IPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_TYPE__RESOLVED_IPACKAGE = eINSTANCE.getModelElementType_ResolvedIPackage();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PseudoTypeImpl <em>Pseudo Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.PseudoTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPseudoType()
		 * @generated
		 */
		EClass PSEUDO_TYPE = eINSTANCE.getPseudoType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SelfTypeImpl <em>Self Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SelfTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSelfType()
		 * @generated
		 */
		EClass SELF_TYPE = eINSTANCE.getSelfType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.MapTypeImpl <em>Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.MapTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getMapType()
		 * @generated
		 */
		EClass MAP_TYPE = eINSTANCE.getMapType();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__KEY_TYPE = eINSTANCE.getMapType_KeyType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__VALUE_TYPE = eINSTANCE.getMapType_ValueType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.NativeTypeImpl <em>Native Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.NativeTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getNativeType()
		 * @generated
		 */
		EClass NATIVE_TYPE = eINSTANCE.getNativeType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATIVE_TYPE__EXPRESSION = eINSTANCE.getNativeType_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.VoidTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.InvalidTypeImpl <em>Invalid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.InvalidTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getInvalidType()
		 * @generated
		 */
		EClass INVALID_TYPE = eINSTANCE.getInvalidType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.CollectionTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__CONTENT_TYPE = eINSTANCE.getCollectionType_ContentType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BagTypeImpl <em>Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BagTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBagType()
		 * @generated
		 */
		EClass BAG_TYPE = eINSTANCE.getBagType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionTypeImpl <em>Ordered Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedCollectionTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedCollectionType()
		 * @generated
		 */
		EClass ORDERED_COLLECTION_TYPE = eINSTANCE.getOrderedCollectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionTypeImpl <em>Unique Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.UniqueCollectionTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getUniqueCollectionType()
		 * @generated
		 */
		EClass UNIQUE_COLLECTION_TYPE = eINSTANCE.getUniqueCollectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SetTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.OrderedSetTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getOrderedSetType()
		 * @generated
		 */
		EClass ORDERED_SET_TYPE = eINSTANCE.getOrderedSetType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SequenceTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.PrimitiveTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.ComparablePrimitiveTypeImpl <em>Comparable Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.ComparablePrimitiveTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getComparablePrimitiveType()
		 * @generated
		 */
		EClass COMPARABLE_PRIMITIVE_TYPE = eINSTANCE.getComparablePrimitiveType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.SummablePrimitiveTypeImpl <em>Summable Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.SummablePrimitiveTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getSummablePrimitiveType()
		 * @generated
		 */
		EClass SUMMABLE_PRIMITIVE_TYPE = eINSTANCE.getSummablePrimitiveType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.BooleanTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.RealTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.IntegerTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.eol.metamodel.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.eol.metamodel.impl.StringTypeImpl
		 * @see org.eclipse.epsilon.eol.metamodel.impl.EolPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

	}

} //EolPackage
