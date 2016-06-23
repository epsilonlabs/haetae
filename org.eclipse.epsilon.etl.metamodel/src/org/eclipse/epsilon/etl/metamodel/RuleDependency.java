/**
 */
package org.eclipse.epsilon.etl.metamodel;

import org.eclipse.epsilon.eol.metamodel.EOLElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.etl.metamodel.RuleDependency#getDependingRule <em>Depending Rule</em>}</li>
 *   <li>{@link org.eclipse.epsilon.etl.metamodel.RuleDependency#getSourceElement <em>Source Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.etl.metamodel.EtlPackage#getRuleDependency()
 * @model
 * @generated
 */
public interface RuleDependency extends ETLElement {
	/**
	 * Returns the value of the '<em><b>Depending Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depending Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depending Rule</em>' reference.
	 * @see #setDependingRule(TransformationRule)
	 * @see org.eclipse.epsilon.etl.metamodel.EtlPackage#getRuleDependency_DependingRule()
	 * @model
	 * @generated
	 */
	TransformationRule getDependingRule();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.etl.metamodel.RuleDependency#getDependingRule <em>Depending Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depending Rule</em>' reference.
	 * @see #getDependingRule()
	 * @generated
	 */
	void setDependingRule(TransformationRule value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(EOLElement)
	 * @see org.eclipse.epsilon.etl.metamodel.EtlPackage#getRuleDependency_SourceElement()
	 * @model
	 * @generated
	 */
	EOLElement getSourceElement();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.etl.metamodel.RuleDependency#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(EOLElement value);

} // RuleDependency
