package org.eclipse.epsilon.haetae.ast2exl;


public class AST2TREOLAction extends AbstractAST2ExLAction{

	@Override
	protected String getExtension() {
		return "eol";
	}

	@Override
	protected String getOperationType() {
		return "AST2trEOL";
	}

	@Override
	protected String getExtensionPrefix() {
		return "_tr";
	}
	
}
