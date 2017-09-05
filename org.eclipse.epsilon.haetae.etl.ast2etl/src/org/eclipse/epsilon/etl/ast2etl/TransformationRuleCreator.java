package org.eclipse.epsilon.etl.ast2etl;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.ExpressionOrStatementBlockCreator;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.AnnotationBlock;
import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.FormalParameterExpression;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.parse.EtlParser;

public class TransformationRuleCreator extends EtlElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if (ast.getType() == EtlParser.TRANSFORM) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		Ast2EtlContext _context = (Ast2EtlContext) context;
		TransformationRule rule = _context.getEtlFactory().createTransformationRule();

		this.setAssets(ast, rule, container);

		
		AST previousAst = AstUtilities.getPreviousSibling(ast);
		if(previousAst != null && previousAst.getType() == EtlParser.ANNOTATIONBLOCK) //check if there is an annotation block
		{
			rule.setAnnotationBlock((AnnotationBlock) _context.getEtlElementCreatorFactory().createEOLElement(previousAst, rule, _context)); //process annotation block
		}
		
		AST nameAST = ast.getFirstChild();
		if (nameAST != null) {
			rule.setName((NameExpression) _context.getEtlElementCreatorFactory().createEOLElement(nameAST, rule, _context));
		}
		AST fromAst = nameAST.getNextSibling();
		if (fromAst.getType() == EtlParser.FORMAL) {
			rule.setSource((FormalParameterExpression) _context.getEtlElementCreatorFactory().createEOLElement(fromAst, rule, _context));
		}
		
		AST toAsts = fromAst.getNextSibling();
		if (toAsts!=null && toAsts.getType() == EtlParser.PARAMLIST) {
			for(AST toAst : toAsts.getChildren())
			{
				if (toAst != null) {
					rule.getTargets().add((FormalParameterExpression) _context.getEtlElementCreatorFactory().createEOLElement(toAst, rule, _context));
				}
			}
		}
		
		AST extendsAsts = AstUtilities.getChild(ast, EtlParser.EXTENDS);
		if (extendsAsts != null) {
			for(AST extendsAst : extendsAsts.getChildren())
			{
				rule.getExtends().add((NameExpression) _context.getEtlElementCreatorFactory().createEOLElement(extendsAst, rule, _context));
			}
		}
		
		AST blockAst = AstUtilities.getChild(ast, EtlParser.BLOCK);
		if (blockAst!=null) {
			rule.setBody((Block) _context.getEtlElementCreatorFactory().createEOLElement(blockAst, rule, _context));
		}
		
		AST guardAst = AstUtilities.getChild(ast, EtlParser.GUARD);
		if (guardAst != null && guardAst.getFirstChild() != null) {
			rule.setGuard((ExpressionOrStatementBlock) _context.getEtlElementCreatorFactory().createEOLElement(guardAst.getFirstChild(), rule, _context, ExpressionOrStatementBlockCreator.class));
		}
		
		return rule;
	}

}
