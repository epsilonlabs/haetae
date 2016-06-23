/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getSwitchCaseStatement()
 * @model abstract="true"
 * @generated
 */
public interface SwitchCaseStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ExpressionOrStatementBlock)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getSwitchCaseStatement_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.SwitchCaseStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ExpressionOrStatementBlock value);

} // SwitchCaseStatement
