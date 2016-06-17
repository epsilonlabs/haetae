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

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOL Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.FOLMethodCallExpressionImpl#getResolvedFOLDefinition <em>Resolved FOL Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FOLMethodCallExpressionImpl extends FeatureCallExpressionImpl implements FOLMethodCallExpression {
	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected FormalParameterExpression iterator;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> conditions;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected NameExpression method;

	/**
	 * The cached value of the '{@link #getResolvedFOLDefinition() <em>Resolved FOL Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedFOLDefinition()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinition resolvedFOLDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FOLMethodCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.FOL_METHOD_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameterExpression getIterator() {
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIterator(FormalParameterExpression newIterator, NotificationChain msgs) {
		FormalParameterExpression oldIterator = iterator;
		iterator = newIterator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR, oldIterator, newIterator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator(FormalParameterExpression newIterator) {
		if (newIterator != iterator) {
			NotificationChain msgs = null;
			if (iterator != null)
				msgs = ((InternalEObject)iterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR, null, msgs);
			if (newIterator != null)
				msgs = ((InternalEObject)newIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR, null, msgs);
			msgs = basicSetIterator(newIterator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR, newIterator, newIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Expression>(Expression.class, this, EolPackage.FOL_METHOD_CALL_EXPRESSION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(NameExpression newMethod, NotificationChain msgs) {
		NameExpression oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(NameExpression newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition getResolvedFOLDefinition() {
		if (resolvedFOLDefinition != null && resolvedFOLDefinition.eIsProxy()) {
			InternalEObject oldResolvedFOLDefinition = (InternalEObject)resolvedFOLDefinition;
			resolvedFOLDefinition = (OperationDefinition)eResolveProxy(oldResolvedFOLDefinition);
			if (resolvedFOLDefinition != oldResolvedFOLDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION, oldResolvedFOLDefinition, resolvedFOLDefinition));
			}
		}
		return resolvedFOLDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition basicGetResolvedFOLDefinition() {
		return resolvedFOLDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedFOLDefinition(OperationDefinition newResolvedFOLDefinition) {
		OperationDefinition oldResolvedFOLDefinition = resolvedFOLDefinition;
		resolvedFOLDefinition = newResolvedFOLDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION, oldResolvedFOLDefinition, resolvedFOLDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR:
				return basicSetIterator(null, msgs);
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD:
				return basicSetMethod(null, msgs);
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
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR:
				return getIterator();
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__CONDITIONS:
				return getConditions();
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD:
				return getMethod();
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION:
				if (resolve) return getResolvedFOLDefinition();
				return basicGetResolvedFOLDefinition();
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
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR:
				setIterator((FormalParameterExpression)newValue);
				return;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Expression>)newValue);
				return;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD:
				setMethod((NameExpression)newValue);
				return;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION:
				setResolvedFOLDefinition((OperationDefinition)newValue);
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
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR:
				setIterator((FormalParameterExpression)null);
				return;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__CONDITIONS:
				getConditions().clear();
				return;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD:
				setMethod((NameExpression)null);
				return;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION:
				setResolvedFOLDefinition((OperationDefinition)null);
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
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__ITERATOR:
				return iterator != null;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__METHOD:
				return method != null;
			case EolPackage.FOL_METHOD_CALL_EXPRESSION__RESOLVED_FOL_DEFINITION:
				return resolvedFOLDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //FOLMethodCallExpressionImpl
