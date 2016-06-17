/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.NameExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl#getResolvedContent <em>Resolved Content</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.NameExpressionImpl#isIsType <em>Is Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameExpressionImpl extends ExpressionImpl implements NameExpression {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolvedContent() <em>Resolved Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedContent()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESOLVED_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolvedContent() <em>Resolved Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedContent()
	 * @generated
	 * @ordered
	 */
	protected Object resolvedContent = RESOLVED_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsType() <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsType() <em>Is Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsType()
	 * @generated
	 * @ordered
	 */
	protected boolean isType = IS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.NAME_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.NAME_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getResolvedContent() {
		return resolvedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedContent(Object newResolvedContent) {
		Object oldResolvedContent = resolvedContent;
		resolvedContent = newResolvedContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.NAME_EXPRESSION__RESOLVED_CONTENT, oldResolvedContent, resolvedContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsType() {
		return isType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsType(boolean newIsType) {
		boolean oldIsType = isType;
		isType = newIsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.NAME_EXPRESSION__IS_TYPE, oldIsType, isType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EolPackage.NAME_EXPRESSION__NAME:
				return getName();
			case EolPackage.NAME_EXPRESSION__RESOLVED_CONTENT:
				return getResolvedContent();
			case EolPackage.NAME_EXPRESSION__IS_TYPE:
				return isIsType();
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
			case EolPackage.NAME_EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case EolPackage.NAME_EXPRESSION__RESOLVED_CONTENT:
				setResolvedContent(newValue);
				return;
			case EolPackage.NAME_EXPRESSION__IS_TYPE:
				setIsType((Boolean)newValue);
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
			case EolPackage.NAME_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EolPackage.NAME_EXPRESSION__RESOLVED_CONTENT:
				setResolvedContent(RESOLVED_CONTENT_EDEFAULT);
				return;
			case EolPackage.NAME_EXPRESSION__IS_TYPE:
				setIsType(IS_TYPE_EDEFAULT);
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
			case EolPackage.NAME_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EolPackage.NAME_EXPRESSION__RESOLVED_CONTENT:
				return RESOLVED_CONTENT_EDEFAULT == null ? resolvedContent != null : !RESOLVED_CONTENT_EDEFAULT.equals(resolvedContent);
			case EolPackage.NAME_EXPRESSION__IS_TYPE:
				return isType != IS_TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", resolvedContent: ");
		result.append(resolvedContent);
		result.append(", isType: ");
		result.append(isType);
		result.append(')');
		return result.toString();
	}

} //NameExpressionImpl
