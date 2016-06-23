/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.CollectionType#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends AnyType {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Type)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getCollectionType_ContentType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getContentType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.CollectionType#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Type value);

} // CollectionType
