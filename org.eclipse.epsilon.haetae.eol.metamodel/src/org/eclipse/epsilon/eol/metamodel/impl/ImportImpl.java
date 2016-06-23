/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EOLLibraryModule;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ImportImpl#getImportedModule <em>Imported Module</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ImportImpl#getImported <em>Imported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends EOLElementImpl implements Import {
	/**
	 * The cached value of the '{@link #getImportedModule() <em>Imported Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedModule()
	 * @generated
	 * @ordered
	 */
	protected EOLLibraryModule importedModule;

	/**
	 * The default value of the '{@link #getImported() <em>Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImported()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImported() <em>Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImported()
	 * @generated
	 * @ordered
	 */
	protected String imported = IMPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOLLibraryModule getImportedModule() {
		return importedModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedModule(EOLLibraryModule newImportedModule, NotificationChain msgs) {
		EOLLibraryModule oldImportedModule = importedModule;
		importedModule = newImportedModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.IMPORT__IMPORTED_MODULE, oldImportedModule, newImportedModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedModule(EOLLibraryModule newImportedModule) {
		if (newImportedModule != importedModule) {
			NotificationChain msgs = null;
			if (importedModule != null)
				msgs = ((InternalEObject)importedModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.IMPORT__IMPORTED_MODULE, null, msgs);
			if (newImportedModule != null)
				msgs = ((InternalEObject)newImportedModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.IMPORT__IMPORTED_MODULE, null, msgs);
			msgs = basicSetImportedModule(newImportedModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IMPORT__IMPORTED_MODULE, newImportedModule, newImportedModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImported() {
		return imported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImported(String newImported) {
		String oldImported = imported;
		imported = newImported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.IMPORT__IMPORTED, oldImported, imported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.IMPORT__IMPORTED_MODULE:
				return basicSetImportedModule(null, msgs);
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
			case EolPackage.IMPORT__IMPORTED_MODULE:
				return getImportedModule();
			case EolPackage.IMPORT__IMPORTED:
				return getImported();
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
			case EolPackage.IMPORT__IMPORTED_MODULE:
				setImportedModule((EOLLibraryModule)newValue);
				return;
			case EolPackage.IMPORT__IMPORTED:
				setImported((String)newValue);
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
			case EolPackage.IMPORT__IMPORTED_MODULE:
				setImportedModule((EOLLibraryModule)null);
				return;
			case EolPackage.IMPORT__IMPORTED:
				setImported(IMPORTED_EDEFAULT);
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
			case EolPackage.IMPORT__IMPORTED_MODULE:
				return importedModule != null;
			case EolPackage.IMPORT__IMPORTED:
				return IMPORTED_EDEFAULT == null ? imported != null : !IMPORTED_EDEFAULT.equals(imported);
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
		result.append(" (imported: ");
		result.append(imported);
		result.append(')');
		return result.toString();
	}

} //ImportImpl
