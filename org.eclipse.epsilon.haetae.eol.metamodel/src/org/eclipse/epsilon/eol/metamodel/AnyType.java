/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.AnyType#getDynamicTypes <em>Dynamic Types</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.AnyType#isDeclared <em>Declared</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getAnyType()
 * @model
 * @generated
 */
public interface AnyType extends Type {
	/**
	 * Returns the value of the '<em><b>Dynamic Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Types</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getAnyType_DynamicTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getDynamicTypes();

	/**
	 * Returns the value of the '<em><b>Declared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared</em>' attribute.
	 * @see #setDeclared(boolean)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getAnyType_Declared()
	 * @model required="true"
	 * @generated
	 */
	boolean isDeclared();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.AnyType#isDeclared <em>Declared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared</em>' attribute.
	 * @see #isDeclared()
	 * @generated
	 */
	void setDeclared(boolean value);

} // AnyType
