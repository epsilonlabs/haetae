/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.MapType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.MapTypeImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.MapTypeImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapTypeImpl extends AnyTypeImpl implements MapType {
	/**
	 * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyType()
	 * @generated
	 * @ordered
	 */
	protected AnyType keyType;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected AnyType valueType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.MAP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyType getKeyType() {
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyType(AnyType newKeyType, NotificationChain msgs) {
		AnyType oldKeyType = keyType;
		keyType = newKeyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.MAP_TYPE__KEY_TYPE, oldKeyType, newKeyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyType(AnyType newKeyType) {
		if (newKeyType != keyType) {
			NotificationChain msgs = null;
			if (keyType != null)
				msgs = ((InternalEObject)keyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.MAP_TYPE__KEY_TYPE, null, msgs);
			if (newKeyType != null)
				msgs = ((InternalEObject)newKeyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.MAP_TYPE__KEY_TYPE, null, msgs);
			msgs = basicSetKeyType(newKeyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MAP_TYPE__KEY_TYPE, newKeyType, newKeyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueType(AnyType newValueType, NotificationChain msgs) {
		AnyType oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.MAP_TYPE__VALUE_TYPE, oldValueType, newValueType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(AnyType newValueType) {
		if (newValueType != valueType) {
			NotificationChain msgs = null;
			if (valueType != null)
				msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.MAP_TYPE__VALUE_TYPE, null, msgs);
			if (newValueType != null)
				msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.MAP_TYPE__VALUE_TYPE, null, msgs);
			msgs = basicSetValueType(newValueType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MAP_TYPE__VALUE_TYPE, newValueType, newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.MAP_TYPE__KEY_TYPE:
				return basicSetKeyType(null, msgs);
			case EolPackage.MAP_TYPE__VALUE_TYPE:
				return basicSetValueType(null, msgs);
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
			case EolPackage.MAP_TYPE__KEY_TYPE:
				return getKeyType();
			case EolPackage.MAP_TYPE__VALUE_TYPE:
				return getValueType();
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
			case EolPackage.MAP_TYPE__KEY_TYPE:
				setKeyType((AnyType)newValue);
				return;
			case EolPackage.MAP_TYPE__VALUE_TYPE:
				setValueType((AnyType)newValue);
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
			case EolPackage.MAP_TYPE__KEY_TYPE:
				setKeyType((AnyType)null);
				return;
			case EolPackage.MAP_TYPE__VALUE_TYPE:
				setValueType((AnyType)null);
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
			case EolPackage.MAP_TYPE__KEY_TYPE:
				return keyType != null;
			case EolPackage.MAP_TYPE__VALUE_TYPE:
				return valueType != null;
		}
		return super.eIsSet(featureID);
	}

} //MapTypeImpl
