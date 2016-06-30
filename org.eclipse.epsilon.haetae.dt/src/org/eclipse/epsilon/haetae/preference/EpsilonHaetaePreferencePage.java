package org.eclipse.epsilon.haetae.preference;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.haetae.plugin.Activator;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class EpsilonHaetaePreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public static final String ENABLE_HAETAE = "EnableHaetae";
	protected List<FieldEditor> fieldEditors = new ArrayList<FieldEditor>();

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
		Composite composite = new Composite(parent, SWT.FILL);

		fieldEditors.add(new BooleanFieldEditor(ENABLE_HAETAE, "Enable Epsilon Haetae (experimental)", composite));

		for (FieldEditor fieldEditor : fieldEditors) {
			fieldEditor.setPreferenceStore(Activator.getDefault().getPreferenceStore());
			fieldEditor.load();
		}

		return composite;
	}
	
	@Override
	public boolean performOk() {
		for (FieldEditor fieldEditor : fieldEditors) {
			fieldEditor.store();
		}
		return true;
	}

}
