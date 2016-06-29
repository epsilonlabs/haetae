package org.eclipse.epsilon.haetae.ast2exl;


public class AST2EVLAction extends AbstractAST2ExLAction{

	@Override
	protected String getExtension() {
		return "evl";
	}

	@Override
	protected String getOperationType() {
		return "AST2EVL";
	}

	@Override
	protected String getExtensionPrefix() {
		return "";
	}
	
}
