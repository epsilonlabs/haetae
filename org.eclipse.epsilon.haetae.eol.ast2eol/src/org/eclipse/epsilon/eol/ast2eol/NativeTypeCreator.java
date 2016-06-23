package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;

public class NativeTypeCreator extends TypeCreator{

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		
		NativeType type = context.getEolFactory().createNativeType();
		this.setAssets(ast, type, container);
		
		
		AST parameterAst = ast.getFirstChild();
		if(parameterAst != null)
		{
			type.setExpression((StringExpression) context.getEolElementCreatorFactory().createEOLElement(parameterAst, type, context));
		}
		
		return type;
	}

	@Override
	public String getType() {
		return "Native";
	}

	@Override
	public Type create(Ast2EolContext context) {
		// TODO Auto-generated method stub
		return null;
	}
}
