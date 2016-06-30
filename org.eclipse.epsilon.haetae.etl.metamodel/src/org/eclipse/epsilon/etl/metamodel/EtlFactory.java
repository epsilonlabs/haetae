/**
 */
package org.eclipse.epsilon.etl.metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.etl.metamodel.EtlPackage
 * @generated
 */
public interface EtlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EtlFactory eINSTANCE = org.eclipse.epsilon.etl.metamodel.impl.EtlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ETL Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETL Element</em>'.
	 * @generated
	 */
	ETLElement createETLElement();

	/**
	 * Returns a new object of class '<em>Named Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Block</em>'.
	 * @generated
	 */
	NamedBlock createNamedBlock();

	/**
	 * Returns a new object of class '<em>ETL Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETL Module</em>'.
	 * @generated
	 */
	ETLModule createETLModule();

	/**
	 * Returns a new object of class '<em>Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Rule</em>'.
	 * @generated
	 */
	TransformationRule createTransformationRule();

	/**
	 * Returns a new object of class '<em>Rule Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Dependency</em>'.
	 * @generated
	 */
	RuleDependency createRuleDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EtlPackage getEtlPackage();

} //EtlFactory
