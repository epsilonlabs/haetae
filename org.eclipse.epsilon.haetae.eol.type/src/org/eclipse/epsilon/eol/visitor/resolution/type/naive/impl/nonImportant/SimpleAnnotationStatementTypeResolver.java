package org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant;

import org.eclipse.epsilon.eol.metamodel.SimpleAnnotationStatement;
import org.eclipse.epsilon.eol.metamodel.visitor.EolVisitorController;
import org.eclipse.epsilon.eol.metamodel.visitor.SimpleAnnotationStatementVisitor;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;

public class SimpleAnnotationStatementTypeResolver extends SimpleAnnotationStatementVisitor<TypeResolutionContext, Object>{

	@Override
	public Object visit(SimpleAnnotationStatement simpleAnnotationStatement,
			TypeResolutionContext context,
			EolVisitorController<TypeResolutionContext, Object> controller) {
		return null;
	}

}
