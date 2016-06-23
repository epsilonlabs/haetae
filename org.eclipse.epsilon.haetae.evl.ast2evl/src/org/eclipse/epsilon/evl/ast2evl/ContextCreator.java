package org.eclipse.epsilon.evl.ast2evl;

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.ExpressionOrStatementBlockCreator;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.ast2eol.util.AstUtilities;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.ExpressionOrStatementBlock;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.VariableDeclarationExpression;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.parse.EvlParser;

public class ContextCreator extends EvlElementCreator{

	@Override
	public boolean appliesTo(AST ast) {
		// TODO Auto-generated method stub
		return ast.getType() == EvlParser.CONTEXT;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		// TODO Auto-generated method stub
		
		Ast2EvlContext _context = (Ast2EvlContext) context;
		Context _theContext = _context.getEvlFactory().createContext();
		this.setAssets(ast, _theContext, container);
		
		AST typeAST = AstUtilities.getChild(ast, EvlParser.TYPE);
		if (typeAST != null) {
			_theContext.setType((ModelElementType) _context.getEvlElementCreatorFactory().createEOLElement(typeAST, _theContext, _context));
		}
		
		AST guardAST = AstUtilities.getChild(ast, EvlParser.GUARD);
		if (guardAST != null) {
			AST childAst = guardAST.getFirstChild();
			ExpressionOrStatementBlock guard = (ExpressionOrStatementBlock) _context.getEvlElementCreatorFactory().createEOLElement(childAst, _theContext, _context, ExpressionOrStatementBlockCreator.class);

//			ExpressionOrStatementBlock guard = _context.getEolFactory().createExpressionOrStatementBlock();
//			this.setAssets(guardAST, guard, _theContext);
//			AST childAst = guardAST.getFirstChild();
//			if (childAst.getType() == EvlParser.BLOCK) {
//				guard.setBlock((Block)_context.getEvlElementCreatorFactory().createDomElement(childAst, guard, _context));
//			}
//			else {
//				guard.setExpression((Expression)_context.getEvlElementCreatorFactory().createDomElement(childAst, guard, _context));
//			}
			
			_theContext.setGuard(guard);
		}
		
		
		ArrayList<AST> constrainASTs = AstUtilities.getChildren(ast, EvlParser.CONSTRAINT);
		if (constrainASTs != null) {
			for(AST constraintAST : constrainASTs)
			{
				_theContext.getInvariants().add((Invariant) _context.getEvlElementCreatorFactory().createEOLElement(constraintAST, _theContext, _context));
			}
		}
		
		ArrayList<AST> critiqueASTs = AstUtilities.getChildren(ast, EvlParser.CRITIQUE);
		if (critiqueASTs != null) {
			for(AST critiqueAST : critiqueASTs)
			{
				_theContext.getInvariants().add((Invariant) _context.getEvlElementCreatorFactory().createEOLElement(critiqueAST, _theContext, _context));
			}
		}
		
		VariableDeclarationExpression self = context.getEolFactory().createVariableDeclarationExpression();
		NameExpression selfName = context.getEolFactory().createNameExpression();
		selfName.setName("self");
		self.setName(selfName);
		self.setResolvedType(EcoreUtil.copy(_theContext.getType()));
		
		_theContext.setSelf(self);
		
		return _theContext;

	}

}
