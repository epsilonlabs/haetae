/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.IMetamodel;
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
	 * The cached value of the '{@link #getResolvedIMetamodel() <em>Resolved IMetamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedIMetamodel()
	 * @generated
	 * @ordered
	 */
	protected IMetamodel resolvedIMetamodel;

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
	public IMetamodel getResolvedIMetamodel() {
		if (resolvedIMetamodel != null && resolvedIMetamodel.eIsProxy()) {
			InternalEObject oldResolvedIMetamodel = (InternalEObject)resolvedIMetamodel;
			resolvedIMetamodel = (IMetamodel)eResolveProxy(oldResolvedIMetamodel);
			if (resolvedIMetamodel != oldResolvedIMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.MODEL_TYPE__RESOLVED_IMETAMODEL, oldResolvedIMetamodel, resolvedIMetamodel));
			}
		}
		return resolvedIMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodel basicGetResolvedIMetamodel() {
		return resolvedIMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedIMetamodel(IMetamodel newResolvedIMetamodel) {
		IMetamodel oldResolvedIMetamodel = resolvedIMetamodel;
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
				if (resolve) return getResolvedIMetamodel();
				return basicGetResolvedIMetamodel();
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
				setResolvedIMetamodel((IMetamodel)newValue);
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
				setResolvedIMetamodel((IMetamodel)null);
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
				return resolvedIMetamodel != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelTypeImpl
