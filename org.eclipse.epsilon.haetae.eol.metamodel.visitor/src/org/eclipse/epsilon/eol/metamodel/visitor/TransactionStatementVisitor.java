package org.eclipse.epsilon.eol.metamodel.visitor;

import org.eclipse.epsilon.eol.metamodel.*;

public abstract class TransactionStatementVisitor<T, R> {
	
	public boolean appliesTo(TransactionStatement transactionStatement, T context) {
		return true;
	}
	
	public abstract R visit (TransactionStatement transactionStatement, T context, EolVisitorController<T, R> controller);
	
}
