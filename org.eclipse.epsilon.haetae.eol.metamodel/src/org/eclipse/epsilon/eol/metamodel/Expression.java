/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.Expression#getResolvedType <em>Resolved Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.Expression#isInBrackets <em>In Brackets</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EOLElement {
	/**
	 * Returns the value of the '<em><b>Resolved Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Type</em>' containment reference.
	 * @see #setResolvedType(Type)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getExpression_ResolvedType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getResolvedType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.Expression#getResolvedType <em>Resolved Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Type</em>' containment reference.
	 * @see #getResolvedType()
	 * @generated
	 */
	void setResolvedType(Type value);

	/**
	 * Returns the value of the '<em><b>In Brackets</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Brackets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Brackets</em>' attribute.
	 * @see #setInBrackets(boolean)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getExpression_InBrackets()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInBrackets();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.Expression#isInBrackets <em>In Brackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Brackets</em>' attribute.
	 * @see #isInBrackets()
	 * @generated
	 */
	void setInBrackets(boolean value);

} // Expression
