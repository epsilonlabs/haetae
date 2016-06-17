/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ModelType#getResolvedIMetamodel <em>Resolved IMetamodel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelType()
 * @model
 * @generated
 */
public interface ModelType extends AnyType {
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
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getModelType_ResolvedIMetamodel()
	 * @model required="true"
	 * @generated
	 */
	IMetamodel getResolvedIMetamodel();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ModelType#getResolvedIMetamodel <em>Resolved IMetamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved IMetamodel</em>' reference.
	 * @see #getResolvedIMetamodel()
	 * @generated
	 */
	void setResolvedIMetamodel(IMetamodel value);

} // ModelType
