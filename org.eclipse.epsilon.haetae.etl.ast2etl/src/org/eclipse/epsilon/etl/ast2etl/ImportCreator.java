package org.eclipse.epsilon.etl.ast2etl;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLLibraryModule;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.etl.parse.EtlParser;

public class ImportCreator extends org.eclipse.epsilon.eol.ast2eol.ImportCreator{
	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {

		Ast2EtlContext _context = (Ast2EtlContext) context;
		Import imp = _context.getEolFactory().createImport(); //create an Import
		this.setAssets(ast, imp, container);
		
		AST importedStringAST = ast.getFirstChild(); //obtain the imported string AST
		if(importedStringAST != null)
		{
			for(org.eclipse.epsilon.eol.dom.Import leImport: _context.getModule().getImports())
			{
				if (leImport.equals(ast)) {
					EOLLibraryModule importedProgram = (EOLLibraryModule) _context.getEtlElementCreatorFactory().createEOLElement(leImport.getModule().getAst(), imp, _context);
					if (importedProgram != null) {
						imp.setImportedModule(importedProgram);
					}
				}
			}
//			for(EolImport leImport: _context.getModule().getImports())
//			{
//				if (leImport.getAst().equals(ast)) {
//					EolLibraryModule importedProgram = (EolLibraryModule) _context.getEtlElementCreatorFactory().createDomElement(leImport.getModule().getAst(), imp, _context);
//					if (importedProgram != null) {
//						imp.setImportedProgram(importedProgram);
//					}
//				}
//			}
			imp.setImported(importedStringAST.getText()); //create an StringExpression for the imported string
		}

		return imp;
	}
	

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EtlParser.IMPORT)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
