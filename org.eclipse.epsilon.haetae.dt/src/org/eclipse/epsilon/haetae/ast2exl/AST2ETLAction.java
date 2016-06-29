package org.eclipse.epsilon.haetae.ast2exl;


public class AST2ETLAction extends AbstractAST2ExLAction {

	@Override
	protected String getExtension() {
		return "etl";
	}

	@Override
	protected String getOperationType() {
		return "AST2ETL";
	}

	@Override
	protected String getExtensionPrefix() {
		return "";
	}
	
}
