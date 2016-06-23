package org.eclipse.epsilon.evl.ast2evl;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLLibraryModule;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.evl.parse.EvlParser;

public class ImportCreator extends org.eclipse.epsilon.eol.ast2eol.ImportCreator{

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		Ast2EvlContext _context = (Ast2EvlContext) context;

		Import imp = context.getEolFactory().createImport(); //create an Import
		this.setAssets(ast, imp, container);
		
		AST importedStringAST = ast.getFirstChild(); //obtain the imported string AST
		if(importedStringAST != null)
		{
			for(org.eclipse.epsilon.eol.dom.Import leImport : _context.getModule().getImports())
			{
				if (leImport.equals(ast)) {
					EOLLibraryModule importedModule = (EOLLibraryModule) _context.getEvlElementCreatorFactory().createEOLElement(leImport.getModule().getAst(), imp, _context);
					if (importedModule != null) {
						imp.setImportedModule(importedModule);
					}
				}
			}
		}
		imp.setImported(importedStringAST.getText());
		return imp;
	}
	
	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EvlParser.IMPORT)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
