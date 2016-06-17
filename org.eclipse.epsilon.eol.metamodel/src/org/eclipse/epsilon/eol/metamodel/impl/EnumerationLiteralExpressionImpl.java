/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EnumerationLiteralExpression;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.IMetamodel;
import org.eclipse.epsilon.eol.metamodel.NameExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl#getIModel <em>IModel</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EnumerationLiteralExpressionImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationLiteralExpressionImpl extends ExpressionImpl implements EnumerationLiteralExpression {
	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected NameExpression literal;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected NameExpression enumeration;

	/**
	 * The cached value of the '{@link #getIModel() <em>IModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIModel()
	 * @generated
	 * @ordered
	 */
	protected IMetamodel iModel;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected NameExpression model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.ENUMERATION_LITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(NameExpression newLiteral, NotificationChain msgs) {
		NameExpression oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL, oldLiteral, newLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(NameExpression newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null)
				msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL, null, msgs);
			if (newLiteral != null)
				msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL, null, msgs);
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL, newLiteral, newLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getEnumeration() {
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(NameExpression newEnumeration, NotificationChain msgs) {
		NameExpression oldEnumeration = enumeration;
		enumeration = newEnumeration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION, oldEnumeration, newEnumeration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(NameExpression newEnumeration) {
		if (newEnumeration != enumeration) {
			NotificationChain msgs = null;
			if (enumeration != null)
				msgs = ((InternalEObject)enumeration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION, null, msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION, null, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION, newEnumeration, newEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodel getIModel() {
		if (iModel != null && iModel.eIsProxy()) {
			InternalEObject oldIModel = (InternalEObject)iModel;
			iModel = (IMetamodel)eResolveProxy(oldIModel);
			if (iModel != oldIModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.ENUMERATION_LITERAL_EXPRESSION__IMODEL, oldIModel, iModel));
			}
		}
		return iModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodel basicGetIModel() {
		return iModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIModel(IMetamodel newIModel) {
		IMetamodel oldIModel = iModel;
		iModel = newIModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.ENUMERATION_LITERAL_EXPRESSION__IMODEL, oldIModel, iModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(NameExpression newModel, NotificationChain msgs) {
		NameExpression oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(NameExpression newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
				return basicSetLiteral(null, msgs);
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
				return basicSetEnumeration(null, msgs);
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL:
				return basicSetModel(null, msgs);
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
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
				return getLiteral();
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
				return getEnumeration();
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__IMODEL:
				if (resolve) return getIModel();
				return basicGetIModel();
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL:
				return getModel();
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
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
				setLiteral((NameExpression)newValue);
				return;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
				setEnumeration((NameExpression)newValue);
				return;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__IMODEL:
				setIModel((IMetamodel)newValue);
				return;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL:
				setModel((NameExpression)newValue);
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
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
				setLiteral((NameExpression)null);
				return;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
				setEnumeration((NameExpression)null);
				return;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__IMODEL:
				setIModel((IMetamodel)null);
				return;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL:
				setModel((NameExpression)null);
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
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
				return literal != null;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
				return enumeration != null;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__IMODEL:
				return iModel != null;
			case EolPackage.ENUMERATION_LITERAL_EXPRESSION__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationLiteralExpressionImpl
