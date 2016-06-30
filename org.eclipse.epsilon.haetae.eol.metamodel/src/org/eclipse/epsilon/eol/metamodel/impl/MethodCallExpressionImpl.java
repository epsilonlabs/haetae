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
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.MethodCallExpressionImpl#getResolvedOperationDefinition <em>Resolved Operation Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallExpressionImpl extends FeatureCallExpressionImpl implements MethodCallExpression {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

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
	 * The cached value of the '{@link #getResolvedOperationDefinition() <em>Resolved Operation Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedOperationDefinition()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinition resolvedOperationDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.METHOD_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, EolPackage.METHOD_CALL_EXPRESSION__ARGUMENTS);
		}
		return arguments;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.METHOD_CALL_EXPRESSION__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.METHOD_CALL_EXPRESSION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.METHOD_CALL_EXPRESSION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.METHOD_CALL_EXPRESSION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition getResolvedOperationDefinition() {
		if (resolvedOperationDefinition != null && resolvedOperationDefinition.eIsProxy()) {
			InternalEObject oldResolvedOperationDefinition = (InternalEObject)resolvedOperationDefinition;
			resolvedOperationDefinition = (OperationDefinition)eResolveProxy(oldResolvedOperationDefinition);
			if (resolvedOperationDefinition != oldResolvedOperationDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION, oldResolvedOperationDefinition, resolvedOperationDefinition));
			}
		}
		return resolvedOperationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition basicGetResolvedOperationDefinition() {
		return resolvedOperationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedOperationDefinition(OperationDefinition newResolvedOperationDefinition) {
		OperationDefinition oldResolvedOperationDefinition = resolvedOperationDefinition;
		resolvedOperationDefinition = newResolvedOperationDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION, oldResolvedOperationDefinition, resolvedOperationDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.METHOD_CALL_EXPRESSION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case EolPackage.METHOD_CALL_EXPRESSION__METHOD:
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
			case EolPackage.METHOD_CALL_EXPRESSION__ARGUMENTS:
				return getArguments();
			case EolPackage.METHOD_CALL_EXPRESSION__METHOD:
				return getMethod();
			case EolPackage.METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION:
				if (resolve) return getResolvedOperationDefinition();
				return basicGetResolvedOperationDefinition();
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
			case EolPackage.METHOD_CALL_EXPRESSION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case EolPackage.METHOD_CALL_EXPRESSION__METHOD:
				setMethod((NameExpression)newValue);
				return;
			case EolPackage.METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION:
				setResolvedOperationDefinition((OperationDefinition)newValue);
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
			case EolPackage.METHOD_CALL_EXPRESSION__ARGUMENTS:
				getArguments().clear();
				return;
			case EolPackage.METHOD_CALL_EXPRESSION__METHOD:
				setMethod((NameExpression)null);
				return;
			case EolPackage.METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION:
				setResolvedOperationDefinition((OperationDefinition)null);
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
			case EolPackage.METHOD_CALL_EXPRESSION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case EolPackage.METHOD_CALL_EXPRESSION__METHOD:
				return method != null;
			case EolPackage.METHOD_CALL_EXPRESSION__RESOLVED_OPERATION_DEFINITION:
				return resolvedOperationDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodCallExpressionImpl
