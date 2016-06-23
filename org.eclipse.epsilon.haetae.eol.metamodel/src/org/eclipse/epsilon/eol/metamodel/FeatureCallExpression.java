/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#isArrow <em>Arrow</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFeatureCallExpression()
 * @model abstract="true"
 * @generated
 */
public interface FeatureCallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFeatureCallExpression_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Arrow</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow</em>' attribute.
	 * @see #setArrow(boolean)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFeatureCallExpression_Arrow()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isArrow();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.FeatureCallExpression#isArrow <em>Arrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow</em>' attribute.
	 * @see #isArrow()
	 * @generated
	 */
	void setArrow(boolean value);

} // FeatureCallExpression
