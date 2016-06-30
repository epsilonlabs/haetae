package org.eclipse.epsilon.haetae.ast2exl;


public class AST2TRETLAction extends AbstractAST2ExLAction{

	@Override
	protected String getExtension() {
		return "etl";
	}

	@Override
	protected String getOperationType() {
		return "AST2trETL";
	}

	@Override
	protected String getExtensionPrefix() {
		return "_tr";
	}
	
}
