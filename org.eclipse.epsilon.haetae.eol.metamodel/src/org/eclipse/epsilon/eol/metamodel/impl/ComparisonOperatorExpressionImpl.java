/**
 */
package org.eclipse.epsilon.eol.metamodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.epsilon.eol.metamodel.ComparisonOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.EolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ComparisonOperatorExpressionImpl extends BinaryOperatorExpressionImpl implements ComparisonOperatorExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonOperatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EolPackage.Literals.COMPARISON_OPERATOR_EXPRESSION;
	}

} //ComparisonOperatorExpressionImpl
