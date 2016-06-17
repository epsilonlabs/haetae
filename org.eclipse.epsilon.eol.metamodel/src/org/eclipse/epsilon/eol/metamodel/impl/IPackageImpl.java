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
import org.eclipse.epsilon.eol.metamodel.IPackage;
import org.eclipse.epsilon.eol.metamodel.StringExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl#getIPackageDriver <em>IPackage Driver</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.IPackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPackageImpl extends EOLElementImpl implements IPackage {
	/**
	 * The default value of the '{@link #getIPackageDriver() <em>IPackage Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPackageDriver()
	 * @generated
	 * @ordered
	 */
	protected static final Object IPACKAGE_DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPackageDriver() <em>IPackage Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPackageDriver()
	 * @generated
	 * @ordered
	 */
	protected Object iPackageDriver = IPACKAGE_DRIVER_EDEFAULT;

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
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected StringExpression nsURI;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<IPackage> subPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.IPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIPackageDriver() {
		return iPackageDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPackageDriver(Object newIPackageDriver) {
		Object oldIPackageDriver = iPackageDriver;
		iPackageDriver = newIPackageDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IPACKAGE__IPACKAGE_DRIVER, oldIPackageDriver, iPackageDriver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getNsURI() {
		if (nsURI != null && nsURI.eIsProxy()) {
			InternalEObject oldNsURI = (InternalEObject)nsURI;
			nsURI = (StringExpression)eResolveProxy(oldNsURI);
			if (nsURI != oldNsURI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.IPACKAGE__NS_URI, oldNsURI, nsURI));
			}
		}
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression basicGetNsURI() {
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsURI(StringExpression newNsURI) {
		StringExpression oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IPACKAGE__NS_URI, oldNsURI, nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IPACKAGE__NS_PREFIX, oldNsPrefix, nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPackage> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentEList<IPackage>(IPackage.class, this, EolPackage.IPACKAGE__SUB_PACKAGES);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.IPACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
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
			case EolPackage.IPACKAGE__IPACKAGE_DRIVER:
				return getIPackageDriver();
			case EolPackage.IPACKAGE__NAME:
				return getName();
			case EolPackage.IPACKAGE__NS_URI:
				if (resolve) return getNsURI();
				return basicGetNsURI();
			case EolPackage.IPACKAGE__NS_PREFIX:
				return getNsPrefix();
			case EolPackage.IPACKAGE__SUB_PACKAGES:
				return getSubPackages();
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
			case EolPackage.IPACKAGE__IPACKAGE_DRIVER:
				setIPackageDriver(newValue);
				return;
			case EolPackage.IPACKAGE__NAME:
				setName((String)newValue);
				return;
			case EolPackage.IPACKAGE__NS_URI:
				setNsURI((StringExpression)newValue);
				return;
			case EolPackage.IPACKAGE__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case EolPackage.IPACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends IPackage>)newValue);
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
			case EolPackage.IPACKAGE__IPACKAGE_DRIVER:
				setIPackageDriver(IPACKAGE_DRIVER_EDEFAULT);
				return;
			case EolPackage.IPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EolPackage.IPACKAGE__NS_URI:
				setNsURI((StringExpression)null);
				return;
			case EolPackage.IPACKAGE__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case EolPackage.IPACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
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
			case EolPackage.IPACKAGE__IPACKAGE_DRIVER:
				return IPACKAGE_DRIVER_EDEFAULT == null ? iPackageDriver != null : !IPACKAGE_DRIVER_EDEFAULT.equals(iPackageDriver);
			case EolPackage.IPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EolPackage.IPACKAGE__NS_URI:
				return nsURI != null;
			case EolPackage.IPACKAGE__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case EolPackage.IPACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
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
		result.append(" (iPackageDriver: ");
		result.append(iPackageDriver);
		result.append(", name: ");
		result.append(name);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(')');
		return result.toString();
	}

} //IPackageImpl
