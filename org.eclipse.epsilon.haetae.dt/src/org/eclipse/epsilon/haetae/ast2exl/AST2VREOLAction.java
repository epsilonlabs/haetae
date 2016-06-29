package org.eclipse.epsilon.haetae.ast2exl;


public class AST2VREOLAction extends AbstractAST2ExLAction{

	@Override
	protected String getExtension() {
		return "eol";
	}

	@Override
	protected String getOperationType() {
		return "AST2vrEOL";
	}

	@Override
	protected String getExtensionPrefix() {
		return "_vr";
	}
	
}
