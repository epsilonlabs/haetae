/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.TextPosition#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.TextPosition#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTextPosition()
 * @model
 * @generated
 */
public interface TextPosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTextPosition_Line()
	 * @model required="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.TextPosition#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTextPosition_Column()
	 * @model required="true"
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.TextPosition#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

} // TextPosition
