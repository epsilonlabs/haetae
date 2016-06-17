/**
 */
package org.eclipse.epsilon.evl.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.NameExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Invariant#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Invariant#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Invariant#getFixes <em>Fixes</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Invariant#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Invariant#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getInvariant()
 * @model abstract="true"
 * @generated
 */
public interface Invariant extends GuardedElement {
	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.evl.metamodel.Invariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfies</em>' reference list.
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getInvariant_Satisfies()
	 * @model
	 * @generated
	 */
	EList<Invariant> getSatisfies();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameExpression)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getInvariant_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameExpression getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameExpression value);

	/**
	 * Returns the value of the '<em><b>Fixes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.evl.metamodel.Fix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixes</em>' containment reference list.
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getInvariant_Fixes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fix> getFixes();

	/**
	 * Returns the value of the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' containment reference.
	 * @see #setCheck(ExpressionOrStatementBlock)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getInvariant_Check()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getCheck <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' containment reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(ExpressionOrStatementBlock value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(ExpressionOrStatementBlock)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getInvariant_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.Invariant#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(ExpressionOrStatementBlock value);

} // Invariant
