/**
 */
package org.eclipse.epsilon.eol.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.Import#getImportedModule <em>Imported Module</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.Import#getImported <em>Imported</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EOLElement {
	/**
	 * Returns the value of the '<em><b>Imported Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Module</em>' containment reference.
	 * @see #setImportedModule(EOLLibraryModule)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getImport_ImportedModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EOLLibraryModule getImportedModule();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.Import#getImportedModule <em>Imported Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Module</em>' containment reference.
	 * @see #getImportedModule()
	 * @generated
	 */
	void setImportedModule(EOLLibraryModule value);

	/**
	 * Returns the value of the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported</em>' attribute.
	 * @see #setImported(String)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getImport_Imported()
	 * @model required="true"
	 * @generated
	 */
	String getImported();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.Import#getImported <em>Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported</em>' attribute.
	 * @see #getImported()
	 * @generated
	 */
	void setImported(String value);

} // Import
