/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.TransactionStatement#getNames <em>Names</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.TransactionStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTransactionStatement()
 * @model
 * @generated
 */
public interface TransactionStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.NameExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTransactionStatement_Names()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameExpression> getNames();

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
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTransactionStatement_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.TransactionStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ExpressionOrStatementBlock value);

} // TransactionStatement
