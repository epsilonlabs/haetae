/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOL Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getResolvedFOLDefinition <em>Resolved FOL Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFOLMethodCallExpression()
 * @model
 * @generated
 */
public interface FOLMethodCallExpression extends FeatureCallExpression {
	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference.
	 * @see #setIterator(FormalParameterExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFOLMethodCallExpression_Iterator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormalParameterExpression getIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getIterator <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' containment reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(FormalParameterExpression value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFOLMethodCallExpression_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getConditions();

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
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFOLMethodCallExpression_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameExpression getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NameExpression value);

	/**
	 * Returns the value of the '<em><b>Resolved FOL Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved FOL Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved FOL Definition</em>' reference.
	 * @see #setResolvedFOLDefinition(OperationDefinition)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getFOLMethodCallExpression_ResolvedFOLDefinition()
	 * @model
	 * @generated
	 */
	OperationDefinition getResolvedFOLDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression#getResolvedFOLDefinition <em>Resolved FOL Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved FOL Definition</em>' reference.
	 * @see #getResolvedFOLDefinition()
	 * @generated
	 */
	void setResolvedFOLDefinition(OperationDefinition value);

} // FOLMethodCallExpression
