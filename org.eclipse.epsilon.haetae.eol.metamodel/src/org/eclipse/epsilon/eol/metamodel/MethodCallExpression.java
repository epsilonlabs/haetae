/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getResolvedOperationDefinition <em>Resolved Operation Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getMethodCallExpression()
 * @model
 * @generated
 */
public interface MethodCallExpression extends FeatureCallExpression {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getMethodCallExpression_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(NameExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getMethodCallExpression_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameExpression getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NameExpression value);

	/**
	 * Returns the value of the '<em><b>Resolved Operation Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Operation Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Operation Definition</em>' reference.
	 * @see #setResolvedOperationDefinition(OperationDefinition)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getMethodCallExpression_ResolvedOperationDefinition()
	 * @model
	 * @generated
	 */
	OperationDefinition getResolvedOperationDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.MethodCallExpression#getResolvedOperationDefinition <em>Resolved Operation Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Operation Definition</em>' reference.
	 * @see #getResolvedOperationDefinition()
	 * @generated
	 */
	void setResolvedOperationDefinition(OperationDefinition value);

} // MethodCallExpression
