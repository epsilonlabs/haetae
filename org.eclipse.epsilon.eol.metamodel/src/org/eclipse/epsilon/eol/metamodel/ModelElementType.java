/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIMetamodel <em>Resolved IMetamodel</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedModelDeclaration <em>Resolved Model Declaration</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIPackage <em>Resolved IPackage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelElementType()
 * @model
 * @generated
 */
public interface ModelElementType extends AnyType {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelElementType_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelElementType_ElementName()
	 * @model required="true"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Resolved IMetamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved IMetamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved IMetamodel</em>' reference.
	 * @see #setResolvedIMetamodel(IMetamodel)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelElementType_ResolvedIMetamodel()
	 * @model required="true"
	 * @generated
	 */
	IMetamodel getResolvedIMetamodel();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIMetamodel <em>Resolved IMetamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved IMetamodel</em>' reference.
	 * @see #getResolvedIMetamodel()
	 * @generated
	 */
	void setResolvedIMetamodel(IMetamodel value);

	/**
	 * Returns the value of the '<em><b>Resolved Model Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Model Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Model Declaration</em>' reference.
	 * @see #setResolvedModelDeclaration(ModelDeclarationStatement)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelElementType_ResolvedModelDeclaration()
	 * @model required="true"
	 * @generated
	 */
	ModelDeclarationStatement getResolvedModelDeclaration();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedModelDeclaration <em>Resolved Model Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Model Declaration</em>' reference.
	 * @see #getResolvedModelDeclaration()
	 * @generated
	 */
	void setResolvedModelDeclaration(ModelDeclarationStatement value);

	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see #setModelType(Object)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelElementType_ModelType()
	 * @model required="true"
	 * @generated
	 */
	Object getModelType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(Object value);

	/**
	 * Returns the value of the '<em><b>Resolved IPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved IPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved IPackage</em>' reference.
	 * @see #setResolvedIPackage(IPackage)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelElementType_ResolvedIPackage()
	 * @model
	 * @generated
	 */
	IPackage getResolvedIPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ModelElementType#getResolvedIPackage <em>Resolved IPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved IPackage</em>' reference.
	 * @see #getResolvedIPackage()
	 * @generated
	 */
	void setResolvedIPackage(IPackage value);

} // ModelElementType
