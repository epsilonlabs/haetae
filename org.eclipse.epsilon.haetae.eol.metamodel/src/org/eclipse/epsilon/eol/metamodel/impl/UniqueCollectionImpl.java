/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.UniqueCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UniqueCollectionImpl extends CollectionExpressionImpl implements UniqueCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.UNIQUE_COLLECTION;
	}

} //UniqueCollectionImpl
