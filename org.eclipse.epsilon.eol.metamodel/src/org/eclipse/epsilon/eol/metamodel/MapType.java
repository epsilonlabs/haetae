/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.MapType#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.MapType#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends AnyType {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' containment reference.
	 * @see #setKeyType(AnyType)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getMapType_KeyType()
	 * @model containment="true"
	 * @generated
	 */
	AnyType getKeyType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.MapType#getKeyType <em>Key Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' containment reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(AnyType value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(AnyType)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getMapType_ValueType()
	 * @model containment="true"
	 * @generated
	 */
	AnyType getValueType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.MapType#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(AnyType value);

} // MapType
