/**
 */
package org.eclipse.epsilon.evl.metamodel;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Fix#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.Fix#getDo <em>Do</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getFix()
 * @model
 * @generated
 */
public interface Fix extends EvlElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(ExpressionOrStatementBlock)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getFix_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionOrStatementBlock getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.Fix#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(ExpressionOrStatementBlock value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference.
	 * @see #setDo(Block)
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getFix_Do()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getDo();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.evl.metamodel.Fix#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Block value);

} // Fix
