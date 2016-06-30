/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.eol.metamodel.AnyType;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl#getDynamicTypes <em>Dynamic Types</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.AnyTypeImpl#isDeclared <em>Declared</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyTypeImpl extends TypeImpl implements AnyType {
	/**
	 * The cached value of the '{@link #getDynamicTypes() <em>Dynamic Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> dynamicTypes;

	/**
	 * The default value of the '{@link #isDeclared() <em>Declared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeclared()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DECLARED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeclared() <em>Declared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeclared()
	 * @generated
	 * @ordered
	 */
	protected boolean declared = DECLARED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.ANY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getDynamicTypes() {
		if (dynamicTypes == null) {
			dynamicTypes = new EObjectContainmentEList<Type>(Type.class, this, EolPackage.ANY_TYPE__DYNAMIC_TYPES);
		}
		return dynamicTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeclared() {
		return declared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclared(boolean newDeclared) {
		boolean oldDeclared = declared;
		declared = newDeclared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.ANY_TYPE__DECLARED, oldDeclared, declared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.ANY_TYPE__DYNAMIC_TYPES:
				return ((InternalEList<?>)getDynamicTypes()).basicRemove(otherEnd, msgs);
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
			case EolPackage.ANY_TYPE__DYNAMIC_TYPES:
				return getDynamicTypes();
			case EolPackage.ANY_TYPE__DECLARED:
				return isDeclared();
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
			case EolPackage.ANY_TYPE__DYNAMIC_TYPES:
				getDynamicTypes().clear();
				getDynamicTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case EolPackage.ANY_TYPE__DECLARED:
				setDeclared((Boolean)newValue);
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
			case EolPackage.ANY_TYPE__DYNAMIC_TYPES:
				getDynamicTypes().clear();
				return;
			case EolPackage.ANY_TYPE__DECLARED:
				setDeclared(DECLARED_EDEFAULT);
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
			case EolPackage.ANY_TYPE__DYNAMIC_TYPES:
				return dynamicTypes != null && !dynamicTypes.isEmpty();
			case EolPackage.ANY_TYPE__DECLARED:
				return declared != DECLARED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (declared: ");
		result.append(declared);
		result.append(')');
		return result.toString();
	}

} //AnyTypeImpl
