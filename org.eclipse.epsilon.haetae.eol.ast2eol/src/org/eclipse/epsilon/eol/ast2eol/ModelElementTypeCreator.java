package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class ModelElementTypeCreator extends TypeCreator{
	
	@Override
	public boolean appliesTo(AST ast) {
		return (ast.getType() == EolParser.TYPE && ast.getText().contains("!")) || 
				(ast.getType() == EolParser.TYPE 
				&& !ast.getText().equals("Integer")
				&& !ast.getText().equals("Boolean")
				&& !ast.getText().equals("Real")
				&& !ast.getText().equals("String")
				&& !ast.getText().equals("Map")
				&& !ast.getText().equals("Sequence")
				&& !ast.getText().equals("Set")
				&& !ast.getText().equals("OrderedSet")
				&& !ast.getText().equals("Bag")
				&& !ast.getText().equals("Native")
				&& !ast.getText().equals("SelfType")
				&& !ast.getText().equals("SelfContentType")||
				(ast.getType() == EolParser.TYPE && ast.getText().substring(2).equals("t_")));
	}
	
	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		ModelElementType type = context.getEolFactory().createModelElementType();
		String name = ast.getText();
		if(name.contains("!"))
		{
			String[] arr = name.split("!");
			String modelString = arr[0];
			String elementString = arr[1];
			
			this.setAssets(ast, type, container);
			type.setModelName(modelString);
			type.setElementName(elementString);
		}
		else {
			this.setAssets(ast, type, container);
			type.setElementName(name);
		}
		
		return type;
	}

	@Override
	public Type create(Ast2EolContext context) {
		return null;
	}

	@Override
	public String getType() {
		return "N/A";
	}

}
