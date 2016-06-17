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
import org.eclipse.epsilon.eol.metamodel.IMetamodel;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationParameter;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl#getIMetamodel <em>IMetamodel</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelDeclarationStatementImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelDeclarationStatementImpl extends StatementImpl implements ModelDeclarationStatement {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationExpression name;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected NameExpression driver;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationExpression> aliases;

	/**
	 * The cached value of the '{@link #getIMetamodel() <em>IMetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIMetamodel()
	 * @generated
	 * @ordered
	 */
	protected IMetamodel iMetamodel;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDeclarationParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelDeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.MODEL_DECLARATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(VariableDeclarationExpression newName, NotificationChain msgs) {
		VariableDeclarationExpression oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_DECLARATION_STATEMENT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(VariableDeclarationExpression newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.MODEL_DECLARATION_STATEMENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.MODEL_DECLARATION_STATEMENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_DECLARATION_STATEMENT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriver(NameExpression newDriver, NotificationChain msgs) {
		NameExpression oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER, oldDriver, newDriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(NameExpression newDriver) {
		if (newDriver != driver) {
			NotificationChain msgs = null;
			if (driver != null)
				msgs = ((InternalEObject)driver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER, null, msgs);
			if (newDriver != null)
				msgs = ((InternalEObject)newDriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER, null, msgs);
			msgs = basicSetDriver(newDriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER, newDriver, newDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclarationExpression> getAliases() {
		if (aliases == null) {
			aliases = new EObjectContainmentEList<VariableDeclarationExpression>(VariableDeclarationExpression.class, this, EolPackage.MODEL_DECLARATION_STATEMENT__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodel getIMetamodel() {
		return iMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIMetamodel(IMetamodel newIMetamodel, NotificationChain msgs) {
		IMetamodel oldIMetamodel = iMetamodel;
		iMetamodel = newIMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL, oldIMetamodel, newIMetamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIMetamodel(IMetamodel newIMetamodel) {
		if (newIMetamodel != iMetamodel) {
			NotificationChain msgs = null;
			if (iMetamodel != null)
				msgs = ((InternalEObject)iMetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL, null, msgs);
			if (newIMetamodel != null)
				msgs = ((InternalEObject)newIMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL, null, msgs);
			msgs = basicSetIMetamodel(newIMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL, newIMetamodel, newIMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDeclarationParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ModelDeclarationParameter>(ModelDeclarationParameter.class, this, EolPackage.MODEL_DECLARATION_STATEMENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.MODEL_DECLARATION_STATEMENT__NAME:
				return basicSetName(null, msgs);
			case EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER:
				return basicSetDriver(null, msgs);
			case EolPackage.MODEL_DECLARATION_STATEMENT__ALIASES:
				return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
			case EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL:
				return basicSetIMetamodel(null, msgs);
			case EolPackage.MODEL_DECLARATION_STATEMENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case EolPackage.MODEL_DECLARATION_STATEMENT__NAME:
				return getName();
			case EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER:
				return getDriver();
			case EolPackage.MODEL_DECLARATION_STATEMENT__ALIASES:
				return getAliases();
			case EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL:
				return getIMetamodel();
			case EolPackage.MODEL_DECLARATION_STATEMENT__PARAMETERS:
				return getParameters();
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
			case EolPackage.MODEL_DECLARATION_STATEMENT__NAME:
				setName((VariableDeclarationExpression)newValue);
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER:
				setDriver((NameExpression)newValue);
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends VariableDeclarationExpression>)newValue);
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL:
				setIMetamodel((IMetamodel)newValue);
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ModelDeclarationParameter>)newValue);
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
			case EolPackage.MODEL_DECLARATION_STATEMENT__NAME:
				setName((VariableDeclarationExpression)null);
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER:
				setDriver((NameExpression)null);
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__ALIASES:
				getAliases().clear();
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL:
				setIMetamodel((IMetamodel)null);
				return;
			case EolPackage.MODEL_DECLARATION_STATEMENT__PARAMETERS:
				getParameters().clear();
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
			case EolPackage.MODEL_DECLARATION_STATEMENT__NAME:
				return name != null;
			case EolPackage.MODEL_DECLARATION_STATEMENT__DRIVER:
				return driver != null;
			case EolPackage.MODEL_DECLARATION_STATEMENT__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case EolPackage.MODEL_DECLARATION_STATEMENT__IMETAMODEL:
				return iMetamodel != null;
			case EolPackage.MODEL_DECLARATION_STATEMENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelDeclarationStatementImpl
