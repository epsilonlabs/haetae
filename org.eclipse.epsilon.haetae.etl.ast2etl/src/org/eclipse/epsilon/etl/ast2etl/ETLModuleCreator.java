package org.eclipse.epsilon.etl.ast2etl;

import java.util.ArrayList;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.etl.metamodel.ETLModule;
import org.eclipse.epsilon.etl.metamodel.NamedBlock;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.parse.EtlParser;

public class ETLModuleCreator extends EtlElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EtlParser.ETLMODULE)
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
			org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext context) {
		
		Ast2EtlContext _context = (Ast2EtlContext) context;
		
		ETLModule program = _context.getEtlFactory().createETLModule();
		this.setAssets(ast, program, null);
		
		
		ArrayList<AST> importAsts = AstUtilities.getChildren(ast, EtlParser.IMPORT); //get Import ASTs
		if(importAsts != null)
		{
			for (AST importAst : importAsts) {
				program.getImports().add((Import)_context.getEtlElementCreatorFactory().createEOLElement(importAst, program, _context)); //process import ASTs
			}
		}
		
		ArrayList<AST> modelDeclAsts = AstUtilities.getChildren(ast, EtlParser.MODELDECLARATION);
		if (modelDeclAsts != null) {
			for(AST modelDecl: modelDeclAsts)
			{
				program.getModelDeclarations().add((ModelDeclarationStatement) _context.getEtlElementCreatorFactory().createEOLElement(modelDecl, program, _context));
			}
		}
				
		ArrayList<AST> preAsts = AstUtilities.getChildren(ast, EtlParser.PRE); //get Pre AST
		if (preAsts != null) {
			for(AST preBlockAst: preAsts)
			{
				program.getPreBlocks().add((NamedBlock) _context.getEtlElementCreatorFactory().createEOLElement(preBlockAst, program, _context, NamedBlockCreator.class));
			}
		}
		
		ArrayList<AST> postAsts = AstUtilities.getChildren(ast, EtlParser.POST); //get Post AST
		if (postAsts != null) {
			for(AST postBlockAst: postAsts)
			{
				program.getPostBlocks().add((NamedBlock) _context.getEtlElementCreatorFactory().createEOLElement(postBlockAst, program, _context, NamedBlockCreator.class));
			}
		}
		
		ArrayList<AST> operations = AstUtilities.getChildren(ast, EtlParser.HELPERMETHOD); //obtain ASTs for operation defintions
		if(operations != null)
		{
			for (AST operation : operations) {
				program.getOperations().add((OperationDefinition)_context.getEtlElementCreatorFactory().createEOLElement(operation, program, _context)); //process operation ASTs
			}
		}
		
		ArrayList<AST> transformationRules = AstUtilities.getChildren(ast, EtlParser.TRANSFORM);
		if (transformationRules != null) {
			for(AST transformationRule: transformationRules)
			{
				program.getTransformationRules().add((TransformationRule) _context.getEtlElementCreatorFactory().createEOLElement(transformationRule, program, _context));
			}
		}
			
		return program;
	}

}
