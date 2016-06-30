/**
 */
package org.eclipse.epsilon.evl.metamodel;

import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.GuardedElement#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getGuardedElement()
 * @model abstract="true"
 * @generated
 */
public interface GuardedElement extends EvlElement {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(ExpressionOrStatementBlock)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getGuardedElement_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.GuardedElement#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ExpressionOrStatementBlock value);

} // GuardedElement
