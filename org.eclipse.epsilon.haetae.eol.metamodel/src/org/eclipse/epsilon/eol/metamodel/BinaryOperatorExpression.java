/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getBinaryOperatorExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOperatorExpression extends OperatorExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Expression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getBinaryOperatorExpression_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Expression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getBinaryOperatorExpression_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

} // BinaryOperatorExpression
