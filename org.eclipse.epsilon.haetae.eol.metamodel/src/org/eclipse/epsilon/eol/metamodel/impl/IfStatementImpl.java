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
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.IfStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl#getIfBody <em>If Body</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl#getElseIfBodies <em>Else If Bodies</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IfStatementImpl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getIfBody() <em>If Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBody()
	 * @generated
	 * @ordered
	 */
	protected ExpressionOrStatementBlock ifBody;

	/**
	 * The cached value of the '{@link #getElseIfBodies() <em>Else If Bodies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionOrStatementBlock> elseIfBodies;

	/**
	 * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBody()
	 * @generated
	 * @ordered
	 */
	protected ExpressionOrStatementBlock elseBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.IF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.IF_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.IF_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.IF_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IF_STATEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionOrStatementBlock getIfBody() {
		return ifBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfBody(ExpressionOrStatementBlock newIfBody, NotificationChain msgs) {
		ExpressionOrStatementBlock oldIfBody = ifBody;
		ifBody = newIfBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.IF_STATEMENT__IF_BODY, oldIfBody, newIfBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBody(ExpressionOrStatementBlock newIfBody) {
		if (newIfBody != ifBody) {
			NotificationChain msgs = null;
			if (ifBody != null)
				msgs = ((InternalEObject)ifBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.IF_STATEMENT__IF_BODY, null, msgs);
			if (newIfBody != null)
				msgs = ((InternalEObject)newIfBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.IF_STATEMENT__IF_BODY, null, msgs);
			msgs = basicSetIfBody(newIfBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IF_STATEMENT__IF_BODY, newIfBody, newIfBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionOrStatementBlock> getElseIfBodies() {
		if (elseIfBodies == null) {
			elseIfBodies = new EObjectContainmentEList<ExpressionOrStatementBlock>(ExpressionOrStatementBlock.class, this, EolPackage.IF_STATEMENT__ELSE_IF_BODIES);
		}
		return elseIfBodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionOrStatementBlock getElseBody() {
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBody(ExpressionOrStatementBlock newElseBody, NotificationChain msgs) {
		ExpressionOrStatementBlock oldElseBody = elseBody;
		elseBody = newElseBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.IF_STATEMENT__ELSE_BODY, oldElseBody, newElseBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBody(ExpressionOrStatementBlock newElseBody) {
		if (newElseBody != elseBody) {
			NotificationChain msgs = null;
			if (elseBody != null)
				msgs = ((InternalEObject)elseBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.IF_STATEMENT__ELSE_BODY, null, msgs);
			if (newElseBody != null)
				msgs = ((InternalEObject)newElseBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.IF_STATEMENT__ELSE_BODY, null, msgs);
			msgs = basicSetElseBody(newElseBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IF_STATEMENT__ELSE_BODY, newElseBody, newElseBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.IF_STATEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case EolPackage.IF_STATEMENT__IF_BODY:
				return basicSetIfBody(null, msgs);
			case EolPackage.IF_STATEMENT__ELSE_IF_BODIES:
				return ((InternalEList<?>)getElseIfBodies()).basicRemove(otherEnd, msgs);
			case EolPackage.IF_STATEMENT__ELSE_BODY:
				return basicSetElseBody(null, msgs);
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
			case EolPackage.IF_STATEMENT__CONDITION:
				return getCondition();
			case EolPackage.IF_STATEMENT__IF_BODY:
				return getIfBody();
			case EolPackage.IF_STATEMENT__ELSE_IF_BODIES:
				return getElseIfBodies();
			case EolPackage.IF_STATEMENT__ELSE_BODY:
				return getElseBody();
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
			case EolPackage.IF_STATEMENT__CONDITION:
				setCondition((Expression)newValue);
				return;
			case EolPackage.IF_STATEMENT__IF_BODY:
				setIfBody((ExpressionOrStatementBlock)newValue);
				return;
			case EolPackage.IF_STATEMENT__ELSE_IF_BODIES:
				getElseIfBodies().clear();
				getElseIfBodies().addAll((Collection<? extends ExpressionOrStatementBlock>)newValue);
				return;
			case EolPackage.IF_STATEMENT__ELSE_BODY:
				setElseBody((ExpressionOrStatementBlock)newValue);
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
			case EolPackage.IF_STATEMENT__CONDITION:
				setCondition((Expression)null);
				return;
			case EolPackage.IF_STATEMENT__IF_BODY:
				setIfBody((ExpressionOrStatementBlock)null);
				return;
			case EolPackage.IF_STATEMENT__ELSE_IF_BODIES:
				getElseIfBodies().clear();
				return;
			case EolPackage.IF_STATEMENT__ELSE_BODY:
				setElseBody((ExpressionOrStatementBlock)null);
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
			case EolPackage.IF_STATEMENT__CONDITION:
				return condition != null;
			case EolPackage.IF_STATEMENT__IF_BODY:
				return ifBody != null;
			case EolPackage.IF_STATEMENT__ELSE_IF_BODIES:
				return elseIfBodies != null && !elseIfBodies.isEmpty();
			case EolPackage.IF_STATEMENT__ELSE_BODY:
				return elseBody != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl
