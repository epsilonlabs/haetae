/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.OrderedCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OrderedCollectionImpl extends CollectionExpressionImpl implements OrderedCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.ORDERED_COLLECTION;
	}

} //OrderedCollectionImpl
