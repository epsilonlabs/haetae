/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getCases <em>Cases</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getSwitchStatement_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.SwitchCaseExpressionStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getSwitchStatement_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwitchCaseExpressionStatement> getCases();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(SwitchCaseDefaultStatement)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getSwitchStatement_Default()
	 * @model containment="true"
	 * @generated
	 */
	SwitchCaseDefaultStatement getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.SwitchStatement#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SwitchCaseDefaultStatement value);

} // SwitchStatement
