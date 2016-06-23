/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getIfBody <em>If Body</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getElseIfBodies <em>Else If Bodies</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIfStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>If Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Body</em>' containment reference.
	 * @see #setIfBody(ExpressionOrStatementBlock)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIfStatement_IfBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getIfBody();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getIfBody <em>If Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Body</em>' containment reference.
	 * @see #getIfBody()
	 * @generated
	 */
	void setIfBody(ExpressionOrStatementBlock value);

	/**
	 * Returns the value of the '<em><b>Else If Bodies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else If Bodies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else If Bodies</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIfStatement_ElseIfBodies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionOrStatementBlock> getElseIfBodies();

	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference.
	 * @see #setElseBody(ExpressionOrStatementBlock)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIfStatement_ElseBody()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getElseBody();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IfStatement#getElseBody <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' containment reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(ExpressionOrStatementBlock value);

} // IfStatement
