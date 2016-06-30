package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.Block;
import org.eclipse.epsilon.eol.metamodel.Statement;
import org.eclipse.epsilon.eol.metamodel.visitor.BlockVisitor;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class BlockTypeResolver extends BlockVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(Block block, TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		for(Statement statement: block.getStatements())
		{
			context.setCurrentStatement(statement);
			controller.visit(statement, context);
			context.clearPropertyCallStack();
		}
		return null;
	} 

}
