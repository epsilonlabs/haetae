/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.ModelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelTypeImpl#getResolvedIMetamodel <em>Resolved IMetamodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelTypeImpl extends AnyTypeImpl implements ModelType {
	/**
	 * The default value of the '{@link #getResolvedIMetamodel() <em>Resolved IMetamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedIMetamodel()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESOLVED_IMETAMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolvedIMetamodel() <em>Resolved IMetamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedIMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Object resolvedIMetamodel = RESOLVED_IMETAMODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getResolvedIMetamodel() {
		return resolvedIMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedIMetamodel(Object newResolvedIMetamodel) {
		Object oldResolvedIMetamodel = resolvedIMetamodel;
		resolvedIMetamodel = newResolvedIMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_TYPE__RESOLVED_IMETAMODEL, oldResolvedIMetamodel, resolvedIMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EolPackage.MODEL_TYPE__RESOLVED_IMETAMODEL:
				return getResolvedIMetamodel();
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
			case EolPackage.MODEL_TYPE__RESOLVED_IMETAMODEL:
				setResolvedIMetamodel(newValue);
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
			case EolPackage.MODEL_TYPE__RESOLVED_IMETAMODEL:
				setResolvedIMetamodel(RESOLVED_IMETAMODEL_EDEFAULT);
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
			case EolPackage.MODEL_TYPE__RESOLVED_IMETAMODEL:
				return RESOLVED_IMETAMODEL_EDEFAULT == null ? resolvedIMetamodel != null : !RESOLVED_IMETAMODEL_EDEFAULT.equals(resolvedIMetamodel);
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
		result.append(" (resolvedIMetamodel: ");
		result.append(resolvedIMetamodel);
		result.append(')');
		return result.toString();
	}

} //ModelTypeImpl
