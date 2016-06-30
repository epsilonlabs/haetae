package org.eclipse.epsilon.evl.visitor.resolution.type.hanlder;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.ExpressionList;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.SequenceExpression;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler.AnyOperationDefinitionHandler;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.visitor.resolution.type.context.EvlTypeResolutionContext;

public class SatisfiesOneHandler extends AnyOperationDefinitionHandler{

	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) {
		
		//get the standard library operation definition contianer (quite a long name i know...)
		StandardLibraryOperationDefinitionContainer container = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		OperationDefinition result = null;
		
		result = container.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		
		EvlTypeResolutionContext leContext = EvlTypeResolutionContext.getInstance();
		
		Expression arg = null;
		
		MethodCallExpression mce = (MethodCallExpression) featureCallExpression;

		arg = mce.getArguments().get(0);
		if (arg instanceof SequenceExpression ) {
			SequenceExpression seq = (SequenceExpression) arg;
			if (seq.getParameterList() instanceof ExpressionList) {
				ExpressionList exprList = (ExpressionList) seq.getParameterList();
				for(Expression exp: exprList.getExpressions())
				{
					if (exp instanceof StringExpression) {
						String satisfiesString = ((StringExpression) exp).getValue();
						Invariant resolvedInvariant = leContext.getInv(leContext.getCurrentContext(), satisfiesString);
						if (resolvedInvariant != null) {
							Invariant currentInvariant = leContext.getCurrentInvariant();
							if (currentInvariant.getSatisfies() != null) {
								currentInvariant.getSatisfies().add(resolvedInvariant);
							}
							else {
								LogBook.getInstance().addError(currentInvariant, "resolved inv empty, please initialise first");
							}
						}
						else {
							LogBook.getInstance().addError(arg, "cannot resolve the depending invariant");
						}
					}
					else {
						LogBook.getInstance().addWarning(exp, "String Literal is recommended");
					}
				}
			}
			else {
				LogBook.getInstance().addError(seq.getParameterList(), "Parameter should be a collection of String values");
			}
			
		}
		else {
			LogBook.getInstance().addError(arg, "argument must be sequence");
		}
	
		return result;
	}

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		return name.equals("satisfiesOne") && argTypes.size() == 1;
	}

}
