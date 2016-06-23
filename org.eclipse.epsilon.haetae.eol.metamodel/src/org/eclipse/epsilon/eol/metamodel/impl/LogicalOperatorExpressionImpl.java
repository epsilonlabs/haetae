/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.LogicalOperatorExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LogicalOperatorExpressionImpl extends BinaryOperatorExpressionImpl implements LogicalOperatorExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalOperatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.LOGICAL_OPERATOR_EXPRESSION;
	}

} //LogicalOperatorExpressionImpl
