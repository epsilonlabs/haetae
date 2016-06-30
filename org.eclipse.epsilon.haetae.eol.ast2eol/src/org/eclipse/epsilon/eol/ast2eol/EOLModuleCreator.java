package org.eclipse.epsilon.eol.ast2eol;

import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class EOLModuleCreator extends EOLElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.EOLMODULE)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		EOLModule program = context.getEolFactory().createEOLModule(); //create a program 
		this.setAssets(ast, program, null);
		
		ArrayList<AST> importAsts = AstUtilities.getChildren(ast, EolParser.IMPORT); //get Import ASTs
		if(importAsts != null)
		{
			for (AST importAst : importAsts) {
				program.getImports().add((Import)context.getEolElementCreatorFactory().createEOLElement(importAst, program, context)); //process import ASTs
			}
		}
		
		ArrayList<AST> modelDeclAsts = AstUtilities.getChildren(ast, EolParser.MODELDECLARATION);
		if (modelDeclAsts != null) {
			for(AST modelDecl: modelDeclAsts)
			{
				program.getModelDeclarations().add((ModelDeclarationStatement) context.getEolElementCreatorFactory().createEOLElement(modelDecl, program, context));
			}
		}
				
		AST blockAst = AstUtilities.getChild(ast, EolParser.BLOCK); //get Block AST
		if(blockAst != null)
		{
			program.setBlock((Block)context.getEolElementCreatorFactory().createEOLElement(blockAst, program, context)); //process block AST
		}
						
		ArrayList<AST> operations = AstUtilities.getChildren(ast, EolParser.HELPERMETHOD); //obtain ASTs for operation defintions
		if(operations != null)
		{
			for (AST operation : operations) {
				program.getOperations().add((OperationDefinition)context.getEolElementCreatorFactory().createEOLElement(operation, program, context)); //process operation ASTs
			}
		}
			
		return program;
	}

}
