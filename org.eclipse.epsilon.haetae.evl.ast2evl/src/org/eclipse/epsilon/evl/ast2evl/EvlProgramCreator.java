package org.eclipse.epsilon.evl.ast2evl;

import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.EVLModule;
import org.eclipse.epsilon.evl.metamodel.NamedBlock;
import org.eclipse.epsilon.evl.parse.EvlParser;

public class EvlProgramCreator extends EvlElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		// TODO Auto-generated method stub
		return ast.getType() == EvlParser.EVLMODULE;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		Ast2EvlContext _context = (Ast2EvlContext) context;
		
		EVLModule program = _context.getEvlFactory().createEVLModule();
		this.setAssets(ast, program, null);
		
		
		ArrayList<AST> importAsts = AstUtilities.getChildren(ast, EvlParser.IMPORT); //get Import ASTs
		if(importAsts != null)
		{
			for (AST importAst : importAsts) {
				program.getImports().add((Import)_context.getEvlElementCreatorFactory().createEOLElement(importAst, program, _context)); //process import ASTs
			}
		}
		
		ArrayList<AST> modelDeclAsts = AstUtilities.getChildren(ast, EvlParser.MODELDECLARATION);
		if (modelDeclAsts != null) {
			for(AST modelDecl: modelDeclAsts)
			{
				program.getModelDeclarations().add((ModelDeclarationStatement) _context.getEvlElementCreatorFactory().createEOLElement(modelDecl, program, _context));
			}
		}
				
		ArrayList<AST> contextAsts = AstUtilities.getChildren(ast, EvlParser.CONTEXT); //get Pre AST
		if (contextAsts != null) {
			for(AST contextAst: contextAsts)
			{
				program.getContexts().add((Context) _context.getEvlElementCreatorFactory().createEOLElement(contextAst, program, _context));
			}
		}
				
		ArrayList<AST> operations = AstUtilities.getChildren(ast, EvlParser.HELPERMETHOD); //obtain ASTs for operation defintions
		if(operations != null)
		{
			for (AST operation : operations) {
				program.getOperations().add((OperationDefinition)_context.getEvlElementCreatorFactory().createEOLElement(operation, program, _context)); //process operation ASTs
			}
		}
		
		ArrayList<AST> preAsts = AstUtilities.getChildren(ast, EvlParser.PRE); //get Pre AST
		if (preAsts != null) {
			for(AST preBlockAst: preAsts)
			{
				program.getPreBlocks().add( (NamedBlock) _context.getEvlElementCreatorFactory().createEOLElement(preBlockAst, program, _context));
			}
		}
		
		ArrayList<AST> postAsts = AstUtilities.getChildren(ast, EvlParser.POST); //get Post AST
		if (postAsts != null) {
			for(AST postBlockAst: postAsts)
			{
				program.getPostBlocks().add( (NamedBlock) _context.getEvlElementCreatorFactory().createEOLElement(postBlockAst, program, _context));
			}
		}

					
		return program;

	}

}
