/**
 */
package org.eclipse.epsilon.evl.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.epsilon.eol.metamodel.EOLLibraryModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EVL Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.EVLModule#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.EVLModule#getPreBlocks <em>Pre Blocks</em>}</li>
 *   <li>{@link org.eclipse.epsilon.evl.metamodel.EVLModule#getPostBlocks <em>Post Blocks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getEVLModule()
 * @model
 * @generated
 */
public interface EVLModule extends EOLLibraryModule {
	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.evl.metamodel.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getEVLModule_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Pre Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.evl.metamodel.NamedBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Blocks</em>' containment reference list.
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getEVLModule_PreBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedBlock> getPreBlocks();

	/**
	 * Returns the value of the '<em><b>Post Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.evl.metamodel.NamedBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Blocks</em>' containment reference list.
	 * @see org.eclipse.epsilon.evl.metamodel.EvlPackage#getEVLModule_PostBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedBlock> getPostBlocks();

} // EVLModule
