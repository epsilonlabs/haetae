package org.eclipse.epsilon.haetae.ast2exl;


public class AST2EOLAction extends AbstractAST2ExLAction{

	@Override
	protected String getExtension() {
		return "eol";
	}

	@Override
	protected String getOperationType() {
		return "AST2EOL";
	}

	@Override
	protected String getExtensionPrefix() {
		return "";
	}
	
}
