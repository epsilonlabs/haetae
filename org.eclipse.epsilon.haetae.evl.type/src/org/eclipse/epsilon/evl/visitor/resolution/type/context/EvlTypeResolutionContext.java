package org.eclipse.epsilon.evl.visitor.resolution.type.context;

import java.util.HashMap;

import org.eclipse.epsilon.eol.visitor.resolution.type.naive.context.TypeResolutionContext;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.operationDefinitionUtil.OperationDefinitionManager;
import org.eclipse.epsilon.evl.metamodel.Context;
import org.eclipse.epsilon.evl.metamodel.Invariant;
import org.eclipse.epsilon.evl.visitor.resolution.type.hanlder.SatisfiesHandler;

public class EvlTypeResolutionContext extends TypeResolutionContext{

	private static EvlTypeResolutionContext instance = null;
	
	protected HashMap<Context, InvariantHolder> invHolderMap = new HashMap<Context, InvariantHolder>();
	protected Context currentContext = null;
	protected Invariant currentInvariant = null;
	
	public EvlTypeResolutionContext()
	{
		super();
		instance = this;
		OperationDefinitionManager.getInstance(true);
		OperationDefinitionManager.getInstance().getHandlerFactory().addHandler(new SatisfiesHandler());
	}
	
	public static EvlTypeResolutionContext getInstance()
	{
		return instance;
	}
	
	public void initialiseETLReservedKeywords()
	{
		super.initialiseEOLReservedKeywords();
		EOLReservedKeywords.add("context");
		EOLReservedKeywords.add("guard");
		EOLReservedKeywords.add("constraint");
		EOLReservedKeywords.add("critique");
		EOLReservedKeywords.add("check");
		EOLReservedKeywords.add("message");
		EOLReservedKeywords.add("title");
		EOLReservedKeywords.add("do");
		EOLReservedKeywords.add("pre");
		EOLReservedKeywords.add("post");
	}
	
	public void insertInv(Context context, String name, Invariant inv)
	{
		InvariantHolder holder = invHolderMap.get(context);
		if (holder != null) {
			if (holder.getInv(name) == null) {
				holder.insertInv(name, inv);
			}
		}
		else {
			InvariantHolder h = new InvariantHolder();
			h.insertInv(name, inv);
			invHolderMap.put(context, h);
		}
	}
	
	public Invariant getInv(Context context, String name)
	{
		InvariantHolder holder = invHolderMap.get(context);
		if (holder != null) {
			Invariant inv = holder.getInv(name);
			if (inv == null) {
				for(InvariantHolder invHolder: invHolderMap.values())
				{
					if (invHolder.getInv(name) != null) {
						return invHolder.getInv(name);
					}
				}
			}
			else {
				return inv;
			}
			return null;
		}
		else {
			return null;
		}
	}
	
	public void setCurrentContext(Context currentContext) {
		this.currentContext = currentContext;
	}
	
	public Context getCurrentContext() {
		return currentContext;
	}
	
	public void setCurrentInvariant(Invariant currentInvariant) {
		this.currentInvariant = currentInvariant;
	}
	
	public Invariant getCurrentInvariant() {
		return currentInvariant;
	}
	
}
