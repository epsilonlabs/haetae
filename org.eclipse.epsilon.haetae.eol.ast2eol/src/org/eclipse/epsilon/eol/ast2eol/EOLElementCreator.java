package org.eclipse.epsilon.eol.ast2eol;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.parse.Position;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.*;


public abstract class EOLElementCreator {
	
	public abstract boolean appliesTo(AST ast);
	
	public void setAssets(AST ast, EOLElement eolElement, EOLElement container)
	{
		eolElement.setContainer(container);
		
		if (ast.getRegion() != null) {
			TextRegion region = EolFactory.eINSTANCE.createTextRegion();
			TextPosition start = createTextPosition(ast.getRegion().getStart());
//			start.setContainer(region);
			region.setStart(start);
			
			TextPosition end = createTextPosition(ast.getRegion().getEnd());
//			end.setContainer(region);
			region.setEnd(end);
			
//			region.setContainer(eolElement);
			
			eolElement.setRegion(region);
		}
		
	}
	
	protected TextPosition createTextPosition(Position position) {
		TextPosition textPosition = EolFactory.eINSTANCE.createTextPosition();
		textPosition.setLine(position.getLine());
		textPosition.setColumn(position.getColumn());
		return textPosition;
	}
	
	protected TextPosition createTextPosition(int line, int column)
	{
		TextPosition textPosition = EolFactory.eINSTANCE.createTextPosition();
		textPosition.setLine(line);
		textPosition.setColumn(column);
		return textPosition;
	}
	
	protected TextRegion createTextRegion(int startLine, int startColumn, int endLine, int endColumn)
	{
		TextRegion textRegion = EolFactory.eINSTANCE.createTextRegion();
		TextPosition startPosition = createTextPosition(startLine, startColumn);
//		startPosition.setContainer(textRegion);
		TextPosition endPosition = createTextPosition(endLine, endColumn);
//		endPosition.setContainer(textRegion);
		textRegion.setStart(startPosition);
		textRegion.setEnd(endPosition);
		return textRegion;
	}
	
	public abstract EOLElement create(AST ast, EOLElement container, Ast2EolContext context);
}
