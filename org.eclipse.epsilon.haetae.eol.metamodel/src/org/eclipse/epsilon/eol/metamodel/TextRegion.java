/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.TextRegion#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.TextRegion#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTextRegion()
 * @model
 * @generated
 */
public interface TextRegion extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(TextPosition)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTextRegion_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextPosition getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.TextRegion#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(TextPosition value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(TextPosition)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getTextRegion_End()
	 * @model containment="true"
	 * @generated
	 */
	TextPosition getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.TextRegion#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TextPosition value);

} // TextRegion
