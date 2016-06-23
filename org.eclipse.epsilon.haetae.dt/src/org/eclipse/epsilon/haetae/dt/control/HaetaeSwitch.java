package org.eclipse.epsilon.haetae.dt.control;

public class HaetaeSwitch {

	private static HaetaeSwitch instance;
	
	private boolean leash = false;
	
	private HaetaeSwitch() {
		instance = new HaetaeSwitch();
	}
	
	public static HaetaeSwitch getInstance()
	{
		if (instance == null) {
			instance = new HaetaeSwitch();
		}
		return instance;
	}
	
	public boolean leash()
	{
		return leash;
	}
	
	public void toggle_leash()
	{
		leash = !leash;
	}
}
