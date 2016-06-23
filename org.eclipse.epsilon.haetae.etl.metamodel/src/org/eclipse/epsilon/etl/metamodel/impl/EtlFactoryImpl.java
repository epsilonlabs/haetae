/**
 */
package org.eclipse.epsilon.etl.metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.epsilon.etl.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtlFactoryImpl extends EFactoryImpl implements EtlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EtlFactory init() {
		try {
			EtlFactory theEtlFactory = (EtlFactory)EPackage.Registry.INSTANCE.getEFactory(EtlPackage.eNS_URI);
			if (theEtlFactory != null) {
				return theEtlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EtlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EtlPackage.ETL_ELEMENT: return createETLElement();
			case EtlPackage.NAMED_BLOCK: return createNamedBlock();
			case EtlPackage.ETL_MODULE: return createETLModule();
			case EtlPackage.TRANSFORMATION_RULE: return createTransformationRule();
			case EtlPackage.RULE_DEPENDENCY: return createRuleDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETLElement createETLElement() {
		ETLElementImpl etlElement = new ETLElementImpl();
		return etlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedBlock createNamedBlock() {
		NamedBlockImpl namedBlock = new NamedBlockImpl();
		return namedBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETLModule createETLModule() {
		ETLModuleImpl etlModule = new ETLModuleImpl();
		return etlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRule createTransformationRule() {
		TransformationRuleImpl transformationRule = new TransformationRuleImpl();
		return transformationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDependency createRuleDependency() {
		RuleDependencyImpl ruleDependency = new RuleDependencyImpl();
		return ruleDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlPackage getEtlPackage() {
		return (EtlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EtlPackage getPackage() {
		return EtlPackage.eINSTANCE;
	}

} //EtlFactoryImpl
