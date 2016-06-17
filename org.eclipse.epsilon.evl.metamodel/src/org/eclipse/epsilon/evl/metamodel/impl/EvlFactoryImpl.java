/**
 */
package org.eclipse.epsilon.evl.metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.epsilon.evl.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvlFactoryImpl extends EFactoryImpl implements EvlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvlFactory init() {
		try {
			EvlFactory theEvlFactory = (EvlFactory)EPackage.Registry.INSTANCE.getEFactory(EvlPackage.eNS_URI);
			if (theEvlFactory != null) {
				return theEvlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvlFactoryImpl() {
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
			case EvlPackage.EVL_ELEMENT: return createEvlElement();
			case EvlPackage.EVL_MODULE: return createEVLModule();
			case EvlPackage.CONTEXT: return createContext();
			case EvlPackage.FIX: return createFix();
			case EvlPackage.CONSTRAINT: return createConstraint();
			case EvlPackage.CRITIQUE: return createCritique();
			case EvlPackage.NAMED_BLOCK: return createNamedBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvlElement createEvlElement() {
		EvlElementImpl evlElement = new EvlElementImpl();
		return evlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVLModule createEVLModule() {
		EVLModuleImpl evlModule = new EVLModuleImpl();
		return evlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fix createFix() {
		FixImpl fix = new FixImpl();
		return fix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Critique createCritique() {
		CritiqueImpl critique = new CritiqueImpl();
		return critique;
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
	public EvlPackage getEvlPackage() {
		return (EvlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvlPackage getPackage() {
		return EvlPackage.eINSTANCE;
	}

} //EvlFactoryImpl
