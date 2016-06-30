/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl#getResolvedModelDeclaration <em>Resolved Model Declaration</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl#getResolvedIMetamodel <em>Resolved IMetamodel</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl#getResolvedIPackage <em>Resolved IPackage</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.ModelElementTypeImpl#getModelElementType <em>Model Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelElementTypeImpl extends AnyTypeImpl implements ModelElementType {
	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolvedModelDeclaration() <em>Resolved Model Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedModelDeclaration()
	 * @generated
	 * @ordered
	 */
	protected ModelDeclarationStatement resolvedModelDeclaration;

	/**
	 * The default value of the '{@link #getResolvedIMetamodel() <em>Resolved IMetamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedIMetamodel()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESOLVED_IMETAMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolvedIMetamodel() <em>Resolved IMetamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedIMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Object resolvedIMetamodel = RESOLVED_IMETAMODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolvedIPackage() <em>Resolved IPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedIPackage()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESOLVED_IPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolvedIPackage() <em>Resolved IPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedIPackage()
	 * @generated
	 * @ordered
	 */
	protected Object resolvedIPackage = RESOLVED_IPACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelElementType() <em>Model Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementType()
	 * @generated
	 * @ordered
	 */
	protected static final Object MODEL_ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelElementType() <em>Model Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementType()
	 * @generated
	 * @ordered
	 */
	protected Object modelElementType = MODEL_ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.MODEL_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_ELEMENT_TYPE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_ELEMENT_TYPE__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDeclarationStatement getResolvedModelDeclaration() {
		if (resolvedModelDeclaration != null && resolvedModelDeclaration.eIsProxy()) {
			InternalEObject oldResolvedModelDeclaration = (InternalEObject)resolvedModelDeclaration;
			resolvedModelDeclaration = (ModelDeclarationStatement)eResolveProxy(oldResolvedModelDeclaration);
			if (resolvedModelDeclaration != oldResolvedModelDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION, oldResolvedModelDeclaration, resolvedModelDeclaration));
			}
		}
		return resolvedModelDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDeclarationStatement basicGetResolvedModelDeclaration() {
		return resolvedModelDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedModelDeclaration(ModelDeclarationStatement newResolvedModelDeclaration) {
		ModelDeclarationStatement oldResolvedModelDeclaration = resolvedModelDeclaration;
		resolvedModelDeclaration = newResolvedModelDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION, oldResolvedModelDeclaration, resolvedModelDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getResolvedIMetamodel() {
		return resolvedIMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedIMetamodel(Object newResolvedIMetamodel) {
		Object oldResolvedIMetamodel = resolvedIMetamodel;
		resolvedIMetamodel = newResolvedIMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IMETAMODEL, oldResolvedIMetamodel, resolvedIMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getResolvedIPackage() {
		return resolvedIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedIPackage(Object newResolvedIPackage) {
		Object oldResolvedIPackage = resolvedIPackage;
		resolvedIPackage = newResolvedIPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IPACKAGE, oldResolvedIPackage, resolvedIPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getModelElementType() {
		return modelElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElementType(Object newModelElementType) {
		Object oldModelElementType = modelElementType;
		modelElementType = newModelElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.MODEL_ELEMENT_TYPE__MODEL_ELEMENT_TYPE, oldModelElementType, modelElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_NAME:
				return getModelName();
			case EolPackage.MODEL_ELEMENT_TYPE__ELEMENT_NAME:
				return getElementName();
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION:
				if (resolve) return getResolvedModelDeclaration();
				return basicGetResolvedModelDeclaration();
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IMETAMODEL:
				return getResolvedIMetamodel();
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IPACKAGE:
				return getResolvedIPackage();
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_ELEMENT_TYPE:
				return getModelElementType();
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
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION:
				setResolvedModelDeclaration((ModelDeclarationStatement)newValue);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IMETAMODEL:
				setResolvedIMetamodel(newValue);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IPACKAGE:
				setResolvedIPackage(newValue);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_ELEMENT_TYPE:
				setModelElementType(newValue);
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
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION:
				setResolvedModelDeclaration((ModelDeclarationStatement)null);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IMETAMODEL:
				setResolvedIMetamodel(RESOLVED_IMETAMODEL_EDEFAULT);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IPACKAGE:
				setResolvedIPackage(RESOLVED_IPACKAGE_EDEFAULT);
				return;
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_ELEMENT_TYPE:
				setModelElementType(MODEL_ELEMENT_TYPE_EDEFAULT);
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
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case EolPackage.MODEL_ELEMENT_TYPE__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_MODEL_DECLARATION:
				return resolvedModelDeclaration != null;
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IMETAMODEL:
				return RESOLVED_IMETAMODEL_EDEFAULT == null ? resolvedIMetamodel != null : !RESOLVED_IMETAMODEL_EDEFAULT.equals(resolvedIMetamodel);
			case EolPackage.MODEL_ELEMENT_TYPE__RESOLVED_IPACKAGE:
				return RESOLVED_IPACKAGE_EDEFAULT == null ? resolvedIPackage != null : !RESOLVED_IPACKAGE_EDEFAULT.equals(resolvedIPackage);
			case EolPackage.MODEL_ELEMENT_TYPE__MODEL_ELEMENT_TYPE:
				return MODEL_ELEMENT_TYPE_EDEFAULT == null ? modelElementType != null : !MODEL_ELEMENT_TYPE_EDEFAULT.equals(modelElementType);
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
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(", elementName: ");
		result.append(elementName);
		result.append(", resolvedIMetamodel: ");
		result.append(resolvedIMetamodel);
		result.append(", resolvedIPackage: ");
		result.append(resolvedIPackage);
		result.append(", modelElementType: ");
		result.append(modelElementType);
		result.append(')');
		return result.toString();
	}

} //ModelElementTypeImpl
