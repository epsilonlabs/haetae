package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.dom.Import;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ImportCreator extends EOLElementCreator {

	@Override
	public EOLElement create(AST ast, EOLElement container, Ast2EolContext context) {

		org.eclipse.epsilon.eol.metamodel.Import imp = context.getEolFactory().createImport();
		this.setAssets(ast, imp, container);

		AST importedStringAST = ast.getFirstChild(); // obtain the imported
														// string AST
		if (importedStringAST != null) {
			for (Import leImport : context.getModule().getImports()) {
				if (leImport.equals(ast)) {
					EOLModule importedProgram = (EOLModule) context.getEolElementCreatorFactory()
							.createEOLElement(leImport.getModule().getAst(), imp, context);
					if (importedProgram != null) {
						imp.setImportedModule(importedProgram);
					}
				}
			}
			imp.setImported(importedStringAST.getText());
		}

		return imp;
	}

	// protected AST getAstForFile(String s, Ast2EolContext context) throws
	// Exception
	// {
	// String directoryPath =
	// context.getEolElementCreatorFactory().getDirectoryPathString();
	// if (directoryPath != null && s.endsWith(".eol")) {
	// /*String fullPath = directoryPath + s;
	// File file = new File(fullPath);
	// ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
	// EolLexer lexer = new EolLexer(input);
	// CommonTokenStream stream = new CommonTokenStream(lexer);
	// EolParser parser = new EolParser(stream);
	// EpsilonTreeAdaptor adaptor = new EpsilonTreeAdaptor(file);
	// parser.setDeepTreeAdaptor(adaptor);
	// AST ast = (AST) parser.eolModule().getTree();
	// return ast;*/
	// EolModule eolModule = new EolModule();
	// String fullPath = directoryPath + s;
	// File file = new File(fullPath);
	// eolModule.parse(file);
	// return eolModule.getAst();
	// }
	// else {
	// return null;
	// }
	// }

	@Override
	public boolean appliesTo(AST ast) {
		if (ast.getType() == EolParser.IMPORT) {
			return true;
		} else {
			return false;
		}
	}

}
