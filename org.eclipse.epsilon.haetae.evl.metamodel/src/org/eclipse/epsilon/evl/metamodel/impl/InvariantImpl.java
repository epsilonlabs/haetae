/**
 */
package org.eclipse.epsilon.evl.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.NameExpression;

import org.eclipse.epsilon.evl.metamodel.EvlPackage;
import org.eclipse.epsilon.evl.metamodel.Fix;
import org.eclipse.epsilon.evl.metamodel.Invariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl#getFixes <em>Fixes</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.impl.InvariantImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InvariantImpl extends GuardedElementImpl implements Invariant {
	/**
	 * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfies()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariant> satisfies;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameExpression name;

	/**
	 * The cached value of the '{@link #getFixes() <em>Fixes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixes()
	 * @generated
	 * @ordered
	 */
	protected EList<Fix> fixes;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected ExpressionOrStatementBlock check;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected ExpressionOrStatementBlock message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvlPackage.Literals.INVARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariant> getSatisfies() {
		if (satisfies == null) {
			satisfies = new EObjectResolvingEList<Invariant>(Invariant.class, this, EvlPackage.INVARIANT__SATISFIES);
		}
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameExpression newName, NotificationChain msgs) {
		NameExpression oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvlPackage.INVARIANT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameExpression newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvlPackage.INVARIANT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvlPackage.INVARIANT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvlPackage.INVARIANT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fix> getFixes() {
		if (fixes == null) {
			fixes = new EObjectContainmentEList<Fix>(Fix.class, this, EvlPackage.INVARIANT__FIXES);
		}
		return fixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionOrStatementBlock getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheck(ExpressionOrStatementBlock newCheck, NotificationChain msgs) {
		ExpressionOrStatementBlock oldCheck = check;
		check = newCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvlPackage.INVARIANT__CHECK, oldCheck, newCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(ExpressionOrStatementBlock newCheck) {
		if (newCheck != check) {
			NotificationChain msgs = null;
			if (check != null)
				msgs = ((InternalEObject)check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvlPackage.INVARIANT__CHECK, null, msgs);
			if (newCheck != null)
				msgs = ((InternalEObject)newCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvlPackage.INVARIANT__CHECK, null, msgs);
			msgs = basicSetCheck(newCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvlPackage.INVARIANT__CHECK, newCheck, newCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionOrStatementBlock getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(ExpressionOrStatementBlock newMessage, NotificationChain msgs) {
		ExpressionOrStatementBlock oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvlPackage.INVARIANT__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(ExpressionOrStatementBlock newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvlPackage.INVARIANT__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvlPackage.INVARIANT__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvlPackage.INVARIANT__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvlPackage.INVARIANT__NAME:
				return basicSetName(null, msgs);
			case EvlPackage.INVARIANT__FIXES:
				return ((InternalEList<?>)getFixes()).basicRemove(otherEnd, msgs);
			case EvlPackage.INVARIANT__CHECK:
				return basicSetCheck(null, msgs);
			case EvlPackage.INVARIANT__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case EvlPackage.INVARIANT__SATISFIES:
				return getSatisfies();
			case EvlPackage.INVARIANT__NAME:
				return getName();
			case EvlPackage.INVARIANT__FIXES:
				return getFixes();
			case EvlPackage.INVARIANT__CHECK:
				return getCheck();
			case EvlPackage.INVARIANT__MESSAGE:
				return getMessage();
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
			case EvlPackage.INVARIANT__SATISFIES:
				getSatisfies().clear();
				getSatisfies().addAll((Collection<? extends Invariant>)newValue);
				return;
			case EvlPackage.INVARIANT__NAME:
				setName((NameExpression)newValue);
				return;
			case EvlPackage.INVARIANT__FIXES:
				getFixes().clear();
				getFixes().addAll((Collection<? extends Fix>)newValue);
				return;
			case EvlPackage.INVARIANT__CHECK:
				setCheck((ExpressionOrStatementBlock)newValue);
				return;
			case EvlPackage.INVARIANT__MESSAGE:
				setMessage((ExpressionOrStatementBlock)newValue);
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
			case EvlPackage.INVARIANT__SATISFIES:
				getSatisfies().clear();
				return;
			case EvlPackage.INVARIANT__NAME:
				setName((NameExpression)null);
				return;
			case EvlPackage.INVARIANT__FIXES:
				getFixes().clear();
				return;
			case EvlPackage.INVARIANT__CHECK:
				setCheck((ExpressionOrStatementBlock)null);
				return;
			case EvlPackage.INVARIANT__MESSAGE:
				setMessage((ExpressionOrStatementBlock)null);
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
			case EvlPackage.INVARIANT__SATISFIES:
				return satisfies != null && !satisfies.isEmpty();
			case EvlPackage.INVARIANT__NAME:
				return name != null;
			case EvlPackage.INVARIANT__FIXES:
				return fixes != null && !fixes.isEmpty();
			case EvlPackage.INVARIANT__CHECK:
				return check != null;
			case EvlPackage.INVARIANT__MESSAGE:
				return message != null;
		}
		return super.eIsSet(featureID);
	}

} //InvariantImpl
