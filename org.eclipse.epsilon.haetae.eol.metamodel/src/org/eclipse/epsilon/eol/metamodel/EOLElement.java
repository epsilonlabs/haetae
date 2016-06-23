/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOL Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getEOLElement()
 * @model
 * @generated
 */
public interface EOLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(EOLElement)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getEOLElement_Container()
	 * @model
	 * @generated
	 */
	EOLElement getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(EOLElement value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getEOLElement_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(TextRegion)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getEOLElement_Region()
	 * @model containment="true"
	 * @generated
	 */
	TextRegion getRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.EOLElement#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(TextRegion value);

} // EOLElement
