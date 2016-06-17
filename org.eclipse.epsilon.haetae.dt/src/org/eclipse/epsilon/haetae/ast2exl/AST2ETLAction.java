package org.eclipse.epsilon.haetae.ast2exl;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.ast2etl.Ast2EtlContext;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class AST2ETLAction implements IObjectActionDelegate {

	private Shell shell;
	
	public AST2ETLAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {

		IWorkbenchWindow window =
			    PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			ISelection selection = window.getSelectionService().getSelection("org.eclipse.jdt.ui.PackageExplorer");

		
		IFile file = (IFile) ((IStructuredSelection) selection).getFirstElement();

		IPath path = file.getLocation();
		
		if (!path.getFileExtension().equals("etl")) {
			MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
				    "AST2EOL converter only works for .etl files", MessageDialog.ERROR, new String[] { "OK" }, 0);
				dialog.open();
		}
		else {
			EtlModule etlModulel = new EtlModule();
			
			try {
				etlModulel.parse(new File(path.toPortableString()));
			} catch (Exception e) {
				e.printStackTrace();
				MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
					    "Unable to parse file, please ensure the .etl file does not contain syntax errors", MessageDialog.ERROR, new String[] { "OK" }, 0);
					dialog.open();
			}

			Ast2EtlContext context = new Ast2EtlContext(etlModulel);
			EOLElement evlElement = null;
			try {
				evlElement = (EOLElement) context.getEtlElementCreatorFactory().createEOLElement(etlModulel.getAst(), null, context);
			} catch (Exception e) {
				e.printStackTrace();
				MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
					    "Unable to parse file, please ensure the .etl file does not contain syntax errors", MessageDialog.ERROR, new String[] { "OK" }, 0);
					dialog.open();
			}
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			Resource resource = resourceSet.createResource(URI.createFileURI(new File(path.toPortableString() + ".model").getAbsolutePath()));
			resource.getContents().add(evlElement);
			try {
				resource.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
					    "Unable to save file", MessageDialog.ERROR, new String[] { "OK" }, 0);
					dialog.open();
			}
			
			MessageDialog dialog = new MessageDialog(shell, "Haetae says:", null,
				    "Transformation completed, " + path.toFile().getName() + ".model saved to directory", MessageDialog.INFORMATION, new String[] { "OK" }, 0);
				dialog.open();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
