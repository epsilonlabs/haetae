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

import org.eclipse.epsilon.eol.metamodel.EOLLibraryModule;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOL Library Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl#getModelDeclarations <em>Model Declarations</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.EOLLibraryModuleImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOLLibraryModuleImpl extends EOLElementImpl implements EOLLibraryModule {
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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getModelDeclarations() <em>Model Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDeclarationStatement> modelDeclarations;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinition> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOLLibraryModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.EOL_LIBRARY_MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.EOL_LIBRARY_MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, EolPackage.EOL_LIBRARY_MODULE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDeclarationStatement> getModelDeclarations() {
		if (modelDeclarations == null) {
			modelDeclarations = new EObjectContainmentEList<ModelDeclarationStatement>(ModelDeclarationStatement.class, this, EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS);
		}
		return modelDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinition> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<OperationDefinition>(OperationDefinition.class, this, EolPackage.EOL_LIBRARY_MODULE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.EOL_LIBRARY_MODULE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS:
				return ((InternalEList<?>)getModelDeclarations()).basicRemove(otherEnd, msgs);
			case EolPackage.EOL_LIBRARY_MODULE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case EolPackage.EOL_LIBRARY_MODULE__NAME:
				return getName();
			case EolPackage.EOL_LIBRARY_MODULE__IMPORTS:
				return getImports();
			case EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS:
				return getModelDeclarations();
			case EolPackage.EOL_LIBRARY_MODULE__OPERATIONS:
				return getOperations();
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
			case EolPackage.EOL_LIBRARY_MODULE__NAME:
				setName((String)newValue);
				return;
			case EolPackage.EOL_LIBRARY_MODULE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS:
				getModelDeclarations().clear();
				getModelDeclarations().addAll((Collection<? extends ModelDeclarationStatement>)newValue);
				return;
			case EolPackage.EOL_LIBRARY_MODULE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OperationDefinition>)newValue);
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
			case EolPackage.EOL_LIBRARY_MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EolPackage.EOL_LIBRARY_MODULE__IMPORTS:
				getImports().clear();
				return;
			case EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS:
				getModelDeclarations().clear();
				return;
			case EolPackage.EOL_LIBRARY_MODULE__OPERATIONS:
				getOperations().clear();
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
			case EolPackage.EOL_LIBRARY_MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EolPackage.EOL_LIBRARY_MODULE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case EolPackage.EOL_LIBRARY_MODULE__MODEL_DECLARATIONS:
				return modelDeclarations != null && !modelDeclarations.isEmpty();
			case EolPackage.EOL_LIBRARY_MODULE__OPERATIONS:
				return operations != null && !operations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EOLLibraryModuleImpl
