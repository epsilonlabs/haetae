/**
 */
package org.eclipse.epsilon.evl.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;

import org.eclipse.epsilon.evl.metamodel.EvlPackage;
import org.eclipse.epsilon.evl.metamodel.Fix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.impl.FixImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.impl.FixImpl#getDo <em>Do</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixImpl extends EvlElementImpl implements Fix {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected ExpressionOrStatementBlock title;

	/**
	 * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected Block do_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvlPackage.Literals.FIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionOrStatementBlock getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(ExpressionOrStatementBlock newTitle, NotificationChain msgs) {
		ExpressionOrStatementBlock oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvlPackage.FIX__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(ExpressionOrStatementBlock newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvlPackage.FIX__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvlPackage.FIX__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvlPackage.FIX__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getDo() {
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDo(Block newDo, NotificationChain msgs) {
		Block oldDo = do_;
		do_ = newDo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvlPackage.FIX__DO, oldDo, newDo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDo(Block newDo) {
		if (newDo != do_) {
			NotificationChain msgs = null;
			if (do_ != null)
				msgs = ((InternalEObject)do_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvlPackage.FIX__DO, null, msgs);
			if (newDo != null)
				msgs = ((InternalEObject)newDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvlPackage.FIX__DO, null, msgs);
			msgs = basicSetDo(newDo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvlPackage.FIX__DO, newDo, newDo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvlPackage.FIX__TITLE:
				return basicSetTitle(null, msgs);
			case EvlPackage.FIX__DO:
				return basicSetDo(null, msgs);
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
			case EvlPackage.FIX__TITLE:
				return getTitle();
			case EvlPackage.FIX__DO:
				return getDo();
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
			case EvlPackage.FIX__TITLE:
				setTitle((ExpressionOrStatementBlock)newValue);
				return;
			case EvlPackage.FIX__DO:
				setDo((Block)newValue);
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
			case EvlPackage.FIX__TITLE:
				setTitle((ExpressionOrStatementBlock)null);
				return;
			case EvlPackage.FIX__DO:
				setDo((Block)null);
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
			case EvlPackage.FIX__TITLE:
				return title != null;
			case EvlPackage.FIX__DO:
				return do_ != null;
		}
		return super.eIsSet(featureID);
	}

} //FixImpl
