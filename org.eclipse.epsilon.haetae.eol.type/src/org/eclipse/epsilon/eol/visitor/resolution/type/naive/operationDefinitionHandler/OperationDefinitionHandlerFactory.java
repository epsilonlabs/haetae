package org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionHandler;

import java.util.ArrayList;

import org.eclipse.epsilon.eol.metamodel.FeatureCallExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.metamodel.Type;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.AnalysisInterruptException;

public class OperationDefinitionHandlerFactory {

	protected ArrayList<OperationDefinitionHandler> handlers;
	
	public OperationDefinitionHandlerFactory()
	{
		handlers = new ArrayList<OperationDefinitionHandler>();
		initTypeHandlers();
	}
	
	public void initTypeHandlers()
	{
		handlers.add(new AppendChildHandler());
		//any
		handlers.add(new AnyAsBagHandler());
		handlers.add(new AnyAsOrderedSetHandler());
		handlers.add(new AnyAsSequenceHandler());
		handlers.add(new AnyAsSetHandler());
		handlers.add(new AnyAsBooleanHandler());
		handlers.add(new AnyErrHandler());
		handlers.add(new AnyFormatHandler());
		handlers.add(new AnyHasPropertyHandler());
		handlers.add(new AnyIfUndefinedHandler());
		handlers.add(new AnyIsDefinedHandler());
		handlers.add(new AnyIsKindOfHandler());
		handlers.add(new AnyOwningModelHandler());
		handlers.add(new AnyTypeHandler());
		
		//string
		handlers.add(new StringCharAtHandler());
		handlers.add(new StringConcatHandler());
		handlers.add(new StringEndsWithHandler());
		handlers.add(new StringUtilityHandler());
		handlers.add(new StringIsSubStringOfHandler());
		handlers.add(new StringPadHandler());
		handlers.add(new StringReplaceHandler());
		handlers.add(new StringSplitHandler());
		handlers.add(new StringStartsWithHandler());
		handlers.add(new StringSubstringHandler());
		handlers.add(new StringToCharSequenceHandler());
		
		//real
		handlers.add(new RealUtilityHandler());
		
		//integer
		handlers.add(new IntegerIotaHandler());
		handlers.add(new IntegerToHandler());
		handlers.add(new IntegerToBinaryHandler());
		
		//collection
		handlers.add(new CollectionAddHandler());
		handlers.add(new CollectionAddAllHandler());
		handlers.add(new CollectionClearHandler());
		handlers.add(new CollectionCloneHandler());
		handlers.add(new CollectionConcatHandler());
		handlers.add(new CollectionCountHandler());
		handlers.add(new CollectionIncludesHandler());
		handlers.add(new CollectionIncludesAllHandler());
		handlers.add(new CollectionExcludingHandler());
		handlers.add(new CollectionExcludingAllHandler());
		handlers.add(new CollectionFlattenHandler());
		handlers.add(new CollectionIncludingHandler());
		handlers.add(new CollectionIncludingAllHandler());

		handlers.add(new CollectionUtilityHandler());
		handlers.add(new CollectionRandomHandler());
		handlers.add(new CollectionRemoveHandler());
		handlers.add(new CollectionRemoveAllHandler());

		//ordered collection
		handlers.add(new OrderedCollectionAtHandler());
		handlers.add(new OrderedCollectionAccessorHandler());
		handlers.add(new OrderedCollectionInvertHandler());
		handlers.add(new OrderedCollectionIndexOfHandler());
		
		//map
		handlers.add(new MapClearHandler());
		handlers.add(new MapContainsKeyHandler());
		handlers.add(new MapGetHandler());
		handlers.add(new MapKeySetHandler());
		handlers.add(new MapValuesHandler());
		handlers.add(new MapPutHandler());
		handlers.add(new MapPutAllHandler());
		handlers.add(new MapRemoveHandler());
		handlers.add(new MapUtilityHandler());
		
		handlers.add(new ModelElementCreateInstanceHandler());
		handlers.add(new ModeElementisInstantiableHandler());
		handlers.add(new ModelElementAllHandler());
	}
	
	public void addHandler(OperationDefinitionHandler handler)
	{
		handlers.add(handler);
	}
	
	public OperationDefinition handle(FeatureCallExpression featureCallExpression, String name, Type contextType, ArrayList<Type> argTypes) throws AnalysisInterruptException
	{
		for(OperationDefinitionHandler handler: handlers)
		{
			if (handler.appliesTo(name, contextType, argTypes)) {
				return handler.handle(featureCallExpression, contextType, argTypes);
			}
		}
		return null;
	}
	
}
