package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;
import org.eclipse.epsilon.eol.parse.EolParser;

public class AnnotationBlockCreator extends BlockCreator{

	@Override
	public boolean appliesTo(AST ast) {
		if(ast.getType() == EolParser.ANNOTATIONBLOCK)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public EOLElement create(AST ast, EOLElement container,
			Ast2EolContext context) {
		AnnotationBlock block = context.getEolFactory().createAnnotationBlock(); //create a AnnotationBlock
		this.setAssets(ast, block, container);
		
		for(AST child: ast.getChildren())
		{
			addAnnotation(child, block, context); //process children
		}
		
		return block;
	}
	
	public void addAnnotation(AST ast, AnnotationBlock block, Ast2EolContext context)
	{
		if(ast.getType() == EolParser.Annotation) //if the ast is of simple annotation
		{
			block.getStatements().add((AnnotationStatement) context.getEolElementCreatorFactory().createEOLElement(ast, block, context)); //process simple annotation
		}
		else if(ast.getType() == EolParser.EXECUTABLEANNOTATION) //if the ast is of executable annotation
		{
			block.getStatements().add((AnnotationStatement) context.getEolElementCreatorFactory().createEOLElement(ast, block, context)); //process executable annotation
		}
	}


}
