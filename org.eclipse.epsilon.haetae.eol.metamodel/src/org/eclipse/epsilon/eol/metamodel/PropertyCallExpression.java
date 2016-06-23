/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#isExtended <em>Extended</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getPropertyCallExpression()
 * @model
 * @generated
 */
public interface PropertyCallExpression extends FeatureCallExpression {
	/**
	 * Returns the value of the '<em><b>Extended</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' attribute.
	 * @see #setExtended(boolean)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getPropertyCallExpression_Extended()
	 * @model default="false"
	 * @generated
	 */
	boolean isExtended();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#isExtended <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' attribute.
	 * @see #isExtended()
	 * @generated
	 */
	void setExtended(boolean value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(NameExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getPropertyCallExpression_Property()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameExpression getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.PropertyCallExpression#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(NameExpression value);

} // PropertyCallExpression
