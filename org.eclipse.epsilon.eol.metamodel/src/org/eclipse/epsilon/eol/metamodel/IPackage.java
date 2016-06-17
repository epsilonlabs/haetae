/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IPackage#getIPackageDriver <em>IPackage Driver</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IPackage#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IPackage#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IPackage#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IPackage#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIPackage()
 * @model
 * @generated
 */
public interface IPackage extends EOLElement {
	/**
	 * Returns the value of the '<em><b>IPackage Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPackage Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPackage Driver</em>' attribute.
	 * @see #setIPackageDriver(Object)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIPackage_IPackageDriver()
	 * @model
	 * @generated
	 */
	Object getIPackageDriver();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getIPackageDriver <em>IPackage Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPackage Driver</em>' attribute.
	 * @see #getIPackageDriver()
	 * @generated
	 */
	void setIPackageDriver(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' reference.
	 * @see #setNsURI(StringExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIPackage_NsURI()
	 * @model
	 * @generated
	 */
	StringExpression getNsURI();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getNsURI <em>Ns URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' reference.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIPackage_NsPrefix()
	 * @model
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IPackage#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.IPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<IPackage> getSubPackages();

} // IPackage
