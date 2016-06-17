/**
 */
package org.eclipse.epsilon.eol.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getAnnotationBlock <em>Annotation Block</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getSelf <em>Self</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#get_result <em>result</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getDependingOperationDefinitions <em>Depending Operation Definitions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition()
 * @model
 * @generated
 */
public interface OperationDefinition extends EOLElement {
	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' containment reference.
	 * @see #setContextType(Type)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_ContextType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getContextType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getContextType <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' containment reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(Type value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(Type)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Annotation Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Block</em>' containment reference.
	 * @see #setAnnotationBlock(AnnotationBlock)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_AnnotationBlock()
	 * @model containment="true"
	 * @generated
	 */
	AnnotationBlock getAnnotationBlock();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getAnnotationBlock <em>Annotation Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Block</em>' containment reference.
	 * @see #getAnnotationBlock()
	 * @generated
	 */
	void setAnnotationBlock(AnnotationBlock value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_Body()
	 * @model containment="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameExpression getName();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameExpression value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.FormalParameterExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameterExpression> getParameters();

	/**
	 * Returns the value of the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' containment reference.
	 * @see #setSelf(VariableDeclarationExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_Self()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableDeclarationExpression getSelf();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#getSelf <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' containment reference.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(VariableDeclarationExpression value);

	/**
	 * Returns the value of the '<em><b>result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>result</em>' containment reference.
	 * @see #set_result(VariableDeclarationExpression)
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition__result()
	 * @model containment="true"
	 * @generated
	 */
	VariableDeclarationExpression get_result();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.eol.metamodel.OperationDefinition#get_result <em>result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>result</em>' containment reference.
	 * @see #get_result()
	 * @generated
	 */
	void set_result(VariableDeclarationExpression value);

	/**
	 * Returns the value of the '<em><b>Depending Operation Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.eol.metamodel.OperationDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depending Operation Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depending Operation Definitions</em>' reference list.
	 * @see org.eclipse.epsilon.eol.metamodel.EolPackage#getOperationDefinition_DependingOperationDefinitions()
	 * @model
	 * @generated
	 */
	EList<OperationDefinition> getDependingOperationDefinitions();

} // OperationDefinition
