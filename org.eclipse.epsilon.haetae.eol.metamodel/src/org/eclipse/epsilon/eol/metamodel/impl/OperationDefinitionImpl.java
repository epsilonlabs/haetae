/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.epsilon.eol.metamodel.AnnotationBlock;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getAnnotationBlock <em>Annotation Block</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getSelf <em>Self</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#get_result <em>result</em>}</li>
 *   <li>{@link org.eclipse.epsilon.eol.metamodel.impl.OperationDefinitionImpl#getDependingOperationDefinitions <em>Depending Operation Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionImpl extends EOLElementImpl implements OperationDefinition {
	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected Type contextType;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * The cached value of the '{@link #getAnnotationBlock() <em>Annotation Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationBlock()
	 * @generated
	 * @ordered
	 */
	protected AnnotationBlock annotationBlock;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameExpression name;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameterExpression> parameters;

	/**
	 * The cached value of the '{@link #getSelf() <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelf()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationExpression self;

	/**
	 * The cached value of the '{@link #get_result() <em>result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_result()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationExpression _result;

	/**
	 * The cached value of the '{@link #getDependingOperationDefinitions() <em>Depending Operation Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependingOperationDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinition> dependingOperationDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.OPERATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextType(Type newContextType, NotificationChain msgs) {
		Type oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE, oldContextType, newContextType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(Type newContextType) {
		if (newContextType != contextType) {
			NotificationChain msgs = null;
			if (contextType != null)
				msgs = ((InternalEObject)contextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE, null, msgs);
			if (newContextType != null)
				msgs = ((InternalEObject)newContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE, null, msgs);
			msgs = basicSetContextType(newContextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE, newContextType, newContextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationBlock getAnnotationBlock() {
		return annotationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationBlock(AnnotationBlock newAnnotationBlock, NotificationChain msgs) {
		AnnotationBlock oldAnnotationBlock = annotationBlock;
		annotationBlock = newAnnotationBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK, oldAnnotationBlock, newAnnotationBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationBlock(AnnotationBlock newAnnotationBlock) {
		if (newAnnotationBlock != annotationBlock) {
			NotificationChain msgs = null;
			if (annotationBlock != null)
				msgs = ((InternalEObject)annotationBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK, null, msgs);
			if (newAnnotationBlock != null)
				msgs = ((InternalEObject)newAnnotationBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK, null, msgs);
			msgs = basicSetAnnotationBlock(newAnnotationBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK, newAnnotationBlock, newAnnotationBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameExpression newName, NotificationChain msgs) {
		NameExpression oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameExpression newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameterExpression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<FormalParameterExpression>(FormalParameterExpression.class, this, EolPackage.OPERATION_DEFINITION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression getSelf() {
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelf(VariableDeclarationExpression newSelf, NotificationChain msgs) {
		VariableDeclarationExpression oldSelf = self;
		self = newSelf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__SELF, oldSelf, newSelf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelf(VariableDeclarationExpression newSelf) {
		if (newSelf != self) {
			NotificationChain msgs = null;
			if (self != null)
				msgs = ((InternalEObject)self).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__SELF, null, msgs);
			if (newSelf != null)
				msgs = ((InternalEObject)newSelf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__SELF, null, msgs);
			msgs = basicSetSelf(newSelf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__SELF, newSelf, newSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression get_result() {
		return _result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_result(VariableDeclarationExpression new_result, NotificationChain msgs) {
		VariableDeclarationExpression old_result = _result;
		_result = new_result;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__RESULT, old_result, new_result);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_result(VariableDeclarationExpression new_result) {
		if (new_result != _result) {
			NotificationChain msgs = null;
			if (_result != null)
				msgs = ((InternalEObject)_result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__RESULT, null, msgs);
			if (new_result != null)
				msgs = ((InternalEObject)new_result).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EolPackage.OPERATION_DEFINITION__RESULT, null, msgs);
			msgs = basicSet_result(new_result, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EolPackage.OPERATION_DEFINITION__RESULT, new_result, new_result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinition> getDependingOperationDefinitions() {
		if (dependingOperationDefinitions == null) {
			dependingOperationDefinitions = new EObjectResolvingEList<OperationDefinition>(OperationDefinition.class, this, EolPackage.OPERATION_DEFINITION__DEPENDING_OPERATION_DEFINITIONS);
		}
		return dependingOperationDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE:
				return basicSetContextType(null, msgs);
			case EolPackage.OPERATION_DEFINITION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK:
				return basicSetAnnotationBlock(null, msgs);
			case EolPackage.OPERATION_DEFINITION__BODY:
				return basicSetBody(null, msgs);
			case EolPackage.OPERATION_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case EolPackage.OPERATION_DEFINITION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case EolPackage.OPERATION_DEFINITION__SELF:
				return basicSetSelf(null, msgs);
			case EolPackage.OPERATION_DEFINITION__RESULT:
				return basicSet_result(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE:
				return getContextType();
			case EolPackage.OPERATION_DEFINITION__RETURN_TYPE:
				return getReturnType();
			case EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK:
				return getAnnotationBlock();
			case EolPackage.OPERATION_DEFINITION__BODY:
				return getBody();
			case EolPackage.OPERATION_DEFINITION__NAME:
				return getName();
			case EolPackage.OPERATION_DEFINITION__PARAMETERS:
				return getParameters();
			case EolPackage.OPERATION_DEFINITION__SELF:
				return getSelf();
			case EolPackage.OPERATION_DEFINITION__RESULT:
				return get_result();
			case EolPackage.OPERATION_DEFINITION__DEPENDING_OPERATION_DEFINITIONS:
				return getDependingOperationDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE:
				setContextType((Type)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK:
				setAnnotationBlock((AnnotationBlock)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__BODY:
				setBody((Block)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__NAME:
				setName((NameExpression)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FormalParameterExpression>)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__SELF:
				setSelf((VariableDeclarationExpression)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__RESULT:
				set_result((VariableDeclarationExpression)newValue);
				return;
			case EolPackage.OPERATION_DEFINITION__DEPENDING_OPERATION_DEFINITIONS:
				getDependingOperationDefinitions().clear();
				getDependingOperationDefinitions().addAll((Collection<? extends OperationDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE:
				setContextType((Type)null);
				return;
			case EolPackage.OPERATION_DEFINITION__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK:
				setAnnotationBlock((AnnotationBlock)null);
				return;
			case EolPackage.OPERATION_DEFINITION__BODY:
				setBody((Block)null);
				return;
			case EolPackage.OPERATION_DEFINITION__NAME:
				setName((NameExpression)null);
				return;
			case EolPackage.OPERATION_DEFINITION__PARAMETERS:
				getParameters().clear();
				return;
			case EolPackage.OPERATION_DEFINITION__SELF:
				setSelf((VariableDeclarationExpression)null);
				return;
			case EolPackage.OPERATION_DEFINITION__RESULT:
				set_result((VariableDeclarationExpression)null);
				return;
			case EolPackage.OPERATION_DEFINITION__DEPENDING_OPERATION_DEFINITIONS:
				getDependingOperationDefinitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EolPackage.OPERATION_DEFINITION__CONTEXT_TYPE:
				return contextType != null;
			case EolPackage.OPERATION_DEFINITION__RETURN_TYPE:
				return returnType != null;
			case EolPackage.OPERATION_DEFINITION__ANNOTATION_BLOCK:
				return annotationBlock != null;
			case EolPackage.OPERATION_DEFINITION__BODY:
				return body != null;
			case EolPackage.OPERATION_DEFINITION__NAME:
				return name != null;
			case EolPackage.OPERATION_DEFINITION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case EolPackage.OPERATION_DEFINITION__SELF:
				return self != null;
			case EolPackage.OPERATION_DEFINITION__RESULT:
				return _result != null;
			case EolPackage.OPERATION_DEFINITION__DEPENDING_OPERATION_DEFINITIONS:
				return dependingOperationDefinitions != null && !dependingOperationDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionImpl
