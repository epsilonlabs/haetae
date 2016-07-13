package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ExpressionInBracketsCreator extends EOLElementCreator {

	@Override
	public boolean appliesTo(AST ast) {
		return ast.getType() == EolParser.EXPRESSIONINBRACKETS;
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		AST child = ast.getFirstChild();
		Expression expr = (Expression) context.getEolElementCreatorFactory().createEOLElement(child, container, context);
		expr.setInBrackets(true);
		
		return expr;
	}

}
