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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.IMetamodel;
import org.eclipse.epsilon.eol.metamodel.IPackage;
import org.eclipse.epsilon.eol.metamodel.NameExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMetamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl#getIMetamodelDriver <em>IMetamodel Driver</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl#getIPackages <em>IPackages</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IMetamodelImpl#getNsURIorPath <em>Ns UR Ior Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMetamodelImpl extends EOLElementImpl implements IMetamodel {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameExpression name;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<NameExpression> aliases;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected NameExpression driver;

	/**
	 * The default value of the '{@link #getIMetamodelDriver() <em>IMetamodel Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIMetamodelDriver()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMETAMODEL_DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIMetamodelDriver() <em>IMetamodel Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIMetamodelDriver()
	 * @generated
	 * @ordered
	 */
	protected Object iMetamodelDriver = IMETAMODEL_DRIVER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIPackages() <em>IPackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<IPackage> iPackages;

	/**
	 * The cached value of the '{@link #getNsURIorPath() <em>Ns UR Ior Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURIorPath()
	 * @generated
	 * @ordered
	 */
	protected NameExpression nsURIorPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.IMETAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (NameExpression)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.IMETAMODEL__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameExpression newName) {
		NameExpression oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IMETAMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameExpression> getAliases() {
		if (aliases == null) {
			aliases = new EObjectResolvingEList<NameExpression>(NameExpression.class, this, EolPackage.IMETAMODEL__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getDriver() {
		if (driver != null && driver.eIsProxy()) {
			InternalEObject oldDriver = (InternalEObject)driver;
			driver = (NameExpression)eResolveProxy(oldDriver);
			if (driver != oldDriver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.IMETAMODEL__DRIVER, oldDriver, driver));
			}
		}
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression basicGetDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(NameExpression newDriver) {
		NameExpression oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IMETAMODEL__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIMetamodelDriver() {
		return iMetamodelDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIMetamodelDriver(Object newIMetamodelDriver) {
		Object oldIMetamodelDriver = iMetamodelDriver;
		iMetamodelDriver = newIMetamodelDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IMETAMODEL__IMETAMODEL_DRIVER, oldIMetamodelDriver, iMetamodelDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPackage> getIPackages() {
		if (iPackages == null) {
			iPackages = new EObjectContainmentEList<IPackage>(IPackage.class, this, EolPackage.IMETAMODEL__IPACKAGES);
		}
		return iPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getNsURIorPath() {
		return nsURIorPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNsURIorPath(NameExpression newNsURIorPath, NotificationChain msgs) {
		NameExpression oldNsURIorPath = nsURIorPath;
		nsURIorPath = newNsURIorPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.IMETAMODEL__NS_UR_IOR_PATH, oldNsURIorPath, newNsURIorPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsURIorPath(NameExpression newNsURIorPath) {
		if (newNsURIorPath != nsURIorPath) {
			NotificationChain msgs = null;
			if (nsURIorPath != null)
				msgs = ((InternalEObject)nsURIorPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.IMETAMODEL__NS_UR_IOR_PATH, null, msgs);
			if (newNsURIorPath != null)
				msgs = ((InternalEObject)newNsURIorPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.IMETAMODEL__NS_UR_IOR_PATH, null, msgs);
			msgs = basicSetNsURIorPath(newNsURIorPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IMETAMODEL__NS_UR_IOR_PATH, newNsURIorPath, newNsURIorPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.IMETAMODEL__IPACKAGES:
				return ((InternalEList<?>)getIPackages()).basicRemove(otherEnd, msgs);
			case EolPackage.IMETAMODEL__NS_UR_IOR_PATH:
				return basicSetNsURIorPath(null, msgs);
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
			case EolPackage.IMETAMODEL__NAME:
				if (resolve) return getName();
				return basicGetName();
			case EolPackage.IMETAMODEL__ALIASES:
				return getAliases();
			case EolPackage.IMETAMODEL__DRIVER:
				if (resolve) return getDriver();
				return basicGetDriver();
			case EolPackage.IMETAMODEL__IMETAMODEL_DRIVER:
				return getIMetamodelDriver();
			case EolPackage.IMETAMODEL__IPACKAGES:
				return getIPackages();
			case EolPackage.IMETAMODEL__NS_UR_IOR_PATH:
				return getNsURIorPath();
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
			case EolPackage.IMETAMODEL__NAME:
				setName((NameExpression)newValue);
				return;
			case EolPackage.IMETAMODEL__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends NameExpression>)newValue);
				return;
			case EolPackage.IMETAMODEL__DRIVER:
				setDriver((NameExpression)newValue);
				return;
			case EolPackage.IMETAMODEL__IMETAMODEL_DRIVER:
				setIMetamodelDriver(newValue);
				return;
			case EolPackage.IMETAMODEL__IPACKAGES:
				getIPackages().clear();
				getIPackages().addAll((Collection<? extends IPackage>)newValue);
				return;
			case EolPackage.IMETAMODEL__NS_UR_IOR_PATH:
				setNsURIorPath((NameExpression)newValue);
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
			case EolPackage.IMETAMODEL__NAME:
				setName((NameExpression)null);
				return;
			case EolPackage.IMETAMODEL__ALIASES:
				getAliases().clear();
				return;
			case EolPackage.IMETAMODEL__DRIVER:
				setDriver((NameExpression)null);
				return;
			case EolPackage.IMETAMODEL__IMETAMODEL_DRIVER:
				setIMetamodelDriver(IMETAMODEL_DRIVER_EDEFAULT);
				return;
			case EolPackage.IMETAMODEL__IPACKAGES:
				getIPackages().clear();
				return;
			case EolPackage.IMETAMODEL__NS_UR_IOR_PATH:
				setNsURIorPath((NameExpression)null);
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
			case EolPackage.IMETAMODEL__NAME:
				return name != null;
			case EolPackage.IMETAMODEL__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case EolPackage.IMETAMODEL__DRIVER:
				return driver != null;
			case EolPackage.IMETAMODEL__IMETAMODEL_DRIVER:
				return IMETAMODEL_DRIVER_EDEFAULT == null ? iMetamodelDriver != null : !IMETAMODEL_DRIVER_EDEFAULT.equals(iMetamodelDriver);
			case EolPackage.IMETAMODEL__IPACKAGES:
				return iPackages != null && !iPackages.isEmpty();
			case EolPackage.IMETAMODEL__NS_UR_IOR_PATH:
				return nsURIorPath != null;
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
		result.append(" (iMetamodelDriver: ");
		result.append(iMetamodelDriver);
		result.append(')');
		return result.toString();
	}

} //IMetamodelImpl
