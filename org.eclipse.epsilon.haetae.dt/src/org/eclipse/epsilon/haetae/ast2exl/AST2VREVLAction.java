package org.eclipse.epsilon.haetae.ast2exl;


public class AST2VREVLAction extends AbstractAST2ExLAction{

	@Override
	protected String getExtension() {
		return "evl";
	}

	@Override
	protected String getOperationType() {
		return "AST2vrEVL";
	}

	@Override
	protected String getExtensionPrefix() {
		return "_vr";
	}
	
}
