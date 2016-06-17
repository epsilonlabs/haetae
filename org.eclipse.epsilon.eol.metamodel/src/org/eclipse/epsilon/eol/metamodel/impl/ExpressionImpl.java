/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionImpl#getResolvedType <em>Resolved Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ExpressionImpl#isInBrackets <em>In Brackets</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends EOLElementImpl implements Expression {
	/**
	 * The cached value of the '{@link #getResolvedType() <em>Resolved Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedType()
	 * @generated
	 * @ordered
	 */
	protected Type resolvedType;

	/**
	 * The default value of the '{@link #isInBrackets() <em>In Brackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInBrackets()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_BRACKETS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInBrackets() <em>In Brackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInBrackets()
	 * @generated
	 * @ordered
	 */
	protected boolean inBrackets = IN_BRACKETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getResolvedType() {
		return resolvedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolvedType(Type newResolvedType, NotificationChain msgs) {
		Type oldResolvedType = resolvedType;
		resolvedType = newResolvedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.EXPRESSION__RESOLVED_TYPE, oldResolvedType, newResolvedType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedType(Type newResolvedType) {
		if (newResolvedType != resolvedType) {
			NotificationChain msgs = null;
			if (resolvedType != null)
				msgs = ((InternalEObject)resolvedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.EXPRESSION__RESOLVED_TYPE, null, msgs);
			if (newResolvedType != null)
				msgs = ((InternalEObject)newResolvedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.EXPRESSION__RESOLVED_TYPE, null, msgs);
			msgs = basicSetResolvedType(newResolvedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.EXPRESSION__RESOLVED_TYPE, newResolvedType, newResolvedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInBrackets() {
		return inBrackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBrackets(boolean newInBrackets) {
		boolean oldInBrackets = inBrackets;
		inBrackets = newInBrackets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.EXPRESSION__IN_BRACKETS, oldInBrackets, inBrackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.EXPRESSION__RESOLVED_TYPE:
				return basicSetResolvedType(null, msgs);
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
			case EolPackage.EXPRESSION__RESOLVED_TYPE:
				return getResolvedType();
			case EolPackage.EXPRESSION__IN_BRACKETS:
				return isInBrackets();
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
			case EolPackage.EXPRESSION__RESOLVED_TYPE:
				setResolvedType((Type)newValue);
				return;
			case EolPackage.EXPRESSION__IN_BRACKETS:
				setInBrackets((Boolean)newValue);
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
			case EolPackage.EXPRESSION__RESOLVED_TYPE:
				setResolvedType((Type)null);
				return;
			case EolPackage.EXPRESSION__IN_BRACKETS:
				setInBrackets(IN_BRACKETS_EDEFAULT);
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
			case EolPackage.EXPRESSION__RESOLVED_TYPE:
				return resolvedType != null;
			case EolPackage.EXPRESSION__IN_BRACKETS:
				return inBrackets != IN_BRACKETS_EDEFAULT;
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
		result.append(" (inBrackets: ");
		result.append(inBrackets);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl
