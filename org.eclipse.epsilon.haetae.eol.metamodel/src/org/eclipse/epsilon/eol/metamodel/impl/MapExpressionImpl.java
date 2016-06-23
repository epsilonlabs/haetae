/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.KeyValueExpression;
import org.eclipse.epsilon.eol.metamodel.MapExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.MapExpressionImpl#getKeyValues <em>Key Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapExpressionImpl extends ExpressionImpl implements MapExpression {
	/**
	 * The cached value of the '{@link #getKeyValues() <em>Key Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValueExpression> keyValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.MAP_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValueExpression> getKeyValues() {
		if (keyValues == null) {
			keyValues = new EObjectContainmentEList<KeyValueExpression>(KeyValueExpression.class, this, EolPackage.MAP_EXPRESSION__KEY_VALUES);
		}
		return keyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.MAP_EXPRESSION__KEY_VALUES:
				return ((InternalEList<?>)getKeyValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EolPackage.MAP_EXPRESSION__KEY_VALUES:
				return getKeyValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EolPackage.MAP_EXPRESSION__KEY_VALUES:
				getKeyValues().clear();
				getKeyValues().addAll((Collection<? extends KeyValueExpression>)newValue);
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
			case EolPackage.MAP_EXPRESSION__KEY_VALUES:
				getKeyValues().clear();
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
			case EolPackage.MAP_EXPRESSION__KEY_VALUES:
				return keyValues != null && !keyValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MapExpressionImpl
