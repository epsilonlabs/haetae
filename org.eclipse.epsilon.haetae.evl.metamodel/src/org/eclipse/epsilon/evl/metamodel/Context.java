/**
 */
package org.eclipse.epsilon.evl.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Context#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Context#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Context#getSelf <em>Self</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends GuardedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ModelElementType)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getContext_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelElementType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.Context#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelElementType value);

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.evl.metamodel.Invariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getContext_Invariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invariant> getInvariants();

	/**
	 * Returns the value of the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' containment reference.
	 * @see #setSelf(VariableDeclarationExpression)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getContext_Self()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableDeclarationExpression getSelf();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.Context#getSelf <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' containment reference.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(VariableDeclarationExpression value);

} // Context
