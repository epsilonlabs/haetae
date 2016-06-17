/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.CollectionExpression#getContents <em>Contents</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.CollectionExpression#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getCollectionExpression()
 * @model abstract="true"
 * @generated
 */
public interface CollectionExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getCollectionExpression_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getContents();

	/**
	 * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter List</em>' containment reference.
	 * @see #setParameterList(CollectionInitialisationExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getCollectionExpression_ParameterList()
	 * @model containment="true"
	 * @generated
	 */
	CollectionInitialisationExpression getParameterList();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.CollectionExpression#getParameterList <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter List</em>' containment reference.
	 * @see #getParameterList()
	 * @generated
	 */
	void setParameterList(CollectionInitialisationExpression value);

} // CollectionExpression
