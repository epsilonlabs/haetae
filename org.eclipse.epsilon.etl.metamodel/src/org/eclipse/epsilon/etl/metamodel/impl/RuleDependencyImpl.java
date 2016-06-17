/**
 */
package org.eclipse.epsilon.etl.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EOLElement;

import org.eclipse.epsilon.etl.metamodel.EtlPackage;
import org.eclipse.epsilon.etl.metamodel.RuleDependency;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.epsilon.etl.metamodel.impl.RuleDependencyImpl#getDependingRule <em>Depending Rule</em>}</li>
 *   <li>{@link org.eclipse.epsilon.etl.metamodel.impl.RuleDependencyImpl#getSourceElement <em>Source Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleDependencyImpl extends ETLElementImpl implements RuleDependency {
	/**
	 * The cached value of the '{@link #getDependingRule() <em>Depending Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependingRule()
	 * @generated
	 * @ordered
	 */
	protected TransformationRule dependingRule;

	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EOLElement sourceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlPackage.Literals.RULE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRule getDependingRule() {
		if (dependingRule != null && dependingRule.eIsProxy()) {
			InternalEObject oldDependingRule = (InternalEObject)dependingRule;
			dependingRule = (TransformationRule)eResolveProxy(oldDependingRule);
			if (dependingRule != oldDependingRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlPackage.RULE_DEPENDENCY__DEPENDING_RULE, oldDependingRule, dependingRule));
			}
		}
		return dependingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRule basicGetDependingRule() {
		return dependingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependingRule(TransformationRule newDependingRule) {
		TransformationRule oldDependingRule = dependingRule;
		dependingRule = newDependingRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlPackage.RULE_DEPENDENCY__DEPENDING_RULE, oldDependingRule, dependingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOLElement getSourceElement() {
		if (sourceElement != null && sourceElement.eIsProxy()) {
			InternalEObject oldSourceElement = (InternalEObject)sourceElement;
			sourceElement = (EOLElement)eResolveProxy(oldSourceElement);
			if (sourceElement != oldSourceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlPackage.RULE_DEPENDENCY__SOURCE_ELEMENT, oldSourceElement, sourceElement));
			}
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOLElement basicGetSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(EOLElement newSourceElement) {
		EOLElement oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlPackage.RULE_DEPENDENCY__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlPackage.RULE_DEPENDENCY__DEPENDING_RULE:
				if (resolve) return getDependingRule();
				return basicGetDependingRule();
			case EtlPackage.RULE_DEPENDENCY__SOURCE_ELEMENT:
				if (resolve) return getSourceElement();
				return basicGetSourceElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EtlPackage.RULE_DEPENDENCY__DEPENDING_RULE:
				setDependingRule((TransformationRule)newValue);
				return;
			case EtlPackage.RULE_DEPENDENCY__SOURCE_ELEMENT:
				setSourceElement((EOLElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EtlPackage.RULE_DEPENDENCY__DEPENDING_RULE:
				setDependingRule((TransformationRule)null);
				return;
			case EtlPackage.RULE_DEPENDENCY__SOURCE_ELEMENT:
				setSourceElement((EOLElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EtlPackage.RULE_DEPENDENCY__DEPENDING_RULE:
				return dependingRule != null;
			case EtlPackage.RULE_DEPENDENCY__SOURCE_ELEMENT:
				return sourceElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleDependencyImpl
