package org.eclipse.epsilon.evl.visitor.resolution.type.hanlder;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.Expression;
import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.StringExpression;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler.AnyOperationDefinitionHandler;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.StandardLibraryOperationDefinitionContainer;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.util.TypeUtil;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.visitor.resolution.type.context.EvlTypeResolutionContext;

public class SatisfiesHandler extends AnyOperationDefinitionHandler{


	@Override
	public OperationDefinition handle(
			FeatureCallExpression featureCallExpression, Type contextType,
			ArrayList<Type> argTypes) {
		
		//get the standard library operation definition contianer (quite a long name i know...)
		StandardLibraryOperationDefinitionContainer container = OperationDefinitionManager.getInstance().getStandardLibraryOperationDefinitionContainer();
		
		OperationDefinition result = null;
		
		result = container.getOperation(((MethodCallExpression) featureCallExpression).getMethod().getName(), argTypes);
		if (result != null) {
			OperationDefinitionManager.getInstance().registerHandledOperationDefinition(result);
			String satisfiesString = null;
			Expression arg = null;
			
			MethodCallExpression mce = (MethodCallExpression) featureCallExpression;
			arg = mce.getArguments().get(0);
			if (arg instanceof StringExpression) {
				satisfiesString = ((StringExpression)arg).getValue();
			}
			else {
				LogBook.getInstance().addWarning(arg, "use of String literal is recommended");
			}
			
			EvlTypeResolutionContext leContext = EvlTypeResolutionContext.getInstance();
			Invariant resolvedInvariant = leContext.getInv(leContext.getCurrentContext(), satisfiesString);
			if (resolvedInvariant != null) {
				Invariant currentInvariant = leContext.getCurrentInvariant();
				Context c1 = getContainingContext(resolvedInvariant);
				Context c2 = getContainingContext(currentInvariant);
				
				if (c1.equals(c2)) {
					
				}
				else {
					Type t1 = c1.getType();
					Type t2 = c2.getType();
					if (TypeUtil.getInstance().isTypeEqualOrGeneric(t2, t1)) {
						
					}
					else {
						LogBook.getInstance().addError(featureCallExpression, "resolved inv are not within the same context");
					}
				}
				
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
		
		
		return result;
	}

	@Override
	public boolean appliesTo(String name, Type contextType,
			ArrayList<Type> argTypes) {
		return name.equals("satisfies") && argTypes.size() == 1;
	}

	public Context getContainingContext(Invariant inv)
	{
		EOLElement container = inv.getContainer();
		while(container != null)
		{
			if (container instanceof Context) {
				return (Context) container;
			}
			else {
				container = container.getContainer();
			}
		}
		return null;
	}
}
