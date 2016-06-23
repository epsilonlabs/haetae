package org.eclipse.epsilon.haetae.preference;

import java.awt.Checkbox;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class EpsilonHaetaePreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public EpsilonHaetaePreferencePage() {
		// TODO Auto-generated constructor stub
	}

	public EpsilonHaetaePreferencePage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public EpsilonHaetaePreferencePage(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Control createContents(Composite parent) {
		BooleanFieldEditor bfe = new BooleanFieldEditor("Haetae", "Enable Epsilon Haetae", parent);
		
		return new Composite(parent, NONE);
	}

}
