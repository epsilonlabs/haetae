package org.eclipse.epsilon.eol.visitor.resolution.variable.context;

public class FrameType {
	
	private String title = "";
	
	public static final FrameType UNPROTECTED = new FrameType("unprotected");
	public static final FrameType PROTECTED = new FrameType("protected");
	
	public FrameType(String title)
	{
		this.title = title;
	}
	
	public String toString()
	{
		return title;
	}

}
