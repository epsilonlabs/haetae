/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getExpressionRange()
 * @model
 * @generated
 */
public interface ExpressionRange extends CollectionInitialisationExpression {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Expression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getExpressionRange_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Expression value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Expression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getExpressionRange_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.ExpressionRange#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Expression value);

} // ExpressionRange
