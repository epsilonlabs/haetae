/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMetamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getIMetamodelDriver <em>IMetamodel Driver</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getIPackages <em>IPackages</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getNsURIorPath <em>Ns UR Ior Path</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIMetamodel()
 * @model
 * @generated
 */
public interface IMetamodel extends EOLElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(NameExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIMetamodel_Name()
	 * @model required="true"
	 * @generated
	 */
	NameExpression getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameExpression value);

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.NameExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIMetamodel_Aliases()
	 * @model
	 * @generated
	 */
	EList<NameExpression> getAliases();

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' reference.
	 * @see #setDriver(NameExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIMetamodel_Driver()
	 * @model required="true"
	 * @generated
	 */
	NameExpression getDriver();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getDriver <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' reference.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(NameExpression value);

	/**
	 * Returns the value of the '<em><b>IMetamodel Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IMetamodel Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IMetamodel Driver</em>' attribute.
	 * @see #setIMetamodelDriver(Object)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIMetamodel_IMetamodelDriver()
	 * @model
	 * @generated
	 */
	Object getIMetamodelDriver();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getIMetamodelDriver <em>IMetamodel Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IMetamodel Driver</em>' attribute.
	 * @see #getIMetamodelDriver()
	 * @generated
	 */
	void setIMetamodelDriver(Object value);

	/**
	 * Returns the value of the '<em><b>IPackages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.IPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPackages</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIMetamodel_IPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<IPackage> getIPackages();

	/**
	 * Returns the value of the '<em><b>Ns UR Ior Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns UR Ior Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns UR Ior Path</em>' containment reference.
	 * @see #setNsURIorPath(NameExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getIMetamodel_NsURIorPath()
	 * @model containment="true"
	 * @generated
	 */
	NameExpression getNsURIorPath();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.IMetamodel#getNsURIorPath <em>Ns UR Ior Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns UR Ior Path</em>' containment reference.
	 * @see #getNsURIorPath()
	 * @generated
	 */
	void setNsURIorPath(NameExpression value);

} // IMetamodel
