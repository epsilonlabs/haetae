/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.StringExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends ComparableExpression, SummableExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getStringExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.StringExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringExpression
