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
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.visitor.resolution.type.naive.impl.nonImportant.EOLTypeResolver;
import org.eclipse.epsilon.eol.visitor.resolution.variable.impl.EOLVariableResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.ast2etl.Ast2EtlContext;
import org.eclipse.epsilon.etl.visitor.resolution.type.impl.EtlTypeResolver;
import org.eclipse.epsilon.etl.visitor.resolution.variable.impl.EtlVariableResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.ast2evl.Ast2EvlContext;
import org.eclipse.epsilon.evl.visitor.resolution.impl.EvlVariableResolver;
import org.eclipse.epsilon.evl.visitor.resolution.type.impl.EvlTypeResolver;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractAST2ExLAction implements IObjectActionDelegate {

	protected Shell shell;
	
	abstract protected String getExtension();
	abstract protected String getOperationType();
	abstract protected String getExtensionPrefix();
	
	@Override
	public void run(IAction action) {

		IWorkbenchWindow window =
			    PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			ISelection selection = window.getSelectionService().getSelection("org.eclipse.jdt.ui.PackageExplorer");

		
		IFile file = (IFile) ((IStructuredSelection) selection).getFirstElement();

		IPath path = file.getLocation();
		
		if (!path.getFileExtension().equals(getExtension())) {
			MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
				    getOperationType() + " converter only works for ." + getExtension() + " files", MessageDialog.ERROR, new String[] { "OK" }, 0);
				dialog.open();
		}
		else {
			EolLibraryModule module = null;
			if (getExtension().equals("eol")) {
				module = new EolModule();
			}
			else if (getExtension().equals("evl")) {
				module = new EvlModule();
			}
			else if (getExtension().equals("etl")) {
				module = new EtlModule();
			}
			
			try {
				module.parse(new File(path.toPortableString()));
			} catch (Exception e) {
				e.printStackTrace();
				MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
					    "Unable to parse file, please ensure the file does not contain syntax errors", MessageDialog.ERROR, new String[] { "OK" }, 0);
					dialog.open();
			}

			Ast2EolContext context = null;
			if (getExtension().equals("eol")) {
				context = new Ast2EolContext(module);
			}
			else if (getExtension().equals("evl")) {
				context = new Ast2EvlContext(module);
			}
			else if (getExtension().equals("etl")) {
				context = new Ast2EtlContext(module);
			}
			
			EOLElement eolElement = null;
			
			boolean success = true;
			
			try {
				if (getExtension().equals("eol")) {
					eolElement = (EOLElement) context.getEolElementCreatorFactory().createEOLElement(module.getAst(), null, context);
				}
				else if (getExtension().equals("evl")) {
					Ast2EvlContext leContext = (Ast2EvlContext) context;
					eolElement = leContext.getEvlElementCreatorFactory().createEOLElement(module.getAst(), null, leContext);
				}
				else if (getExtension().equals("etl")) {
					Ast2EtlContext leContext = (Ast2EtlContext) context;
					eolElement = leContext.getEtlElementCreatorFactory().createEOLElement(module.getAst(), null, leContext);
				}
			} catch (Exception e) {
				success = false;
				MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
					    "Unable to parse file, please ensure the file does not contain syntax errors", MessageDialog.ERROR, new String[] { "OK" }, 0);
					dialog.open();
			}
			
			if (success) {
				if (getOperationType().equals("AST2vrEOL")) {
					EOLVariableResolver eolVR = new EOLVariableResolver();
					eolVR.run(eolElement);
				}
				else if (getOperationType().equals("AST2trEOL")) {
					EOLVariableResolver eolVR = new EOLVariableResolver();
					eolVR.run(eolElement);
					EOLTypeResolver eolTR = new EOLTypeResolver();
					eolTR.run(eolElement);
				}
				
				else if (getOperationType().equals("AST2vrEVL")) {
					EvlVariableResolver evlVR = new EvlVariableResolver();
					evlVR.run(eolElement);
				}
				else if (getOperationType().equals("AST2trEVL")) {
					EvlVariableResolver evlVR = new EvlVariableResolver();
					evlVR.run(eolElement);
					EvlTypeResolver evlTR = new EvlTypeResolver();
					evlTR.run(eolElement);
				}
				
				else if (getOperationType().equals("AST2vrETL")) {
					EtlVariableResolver etlVR = new EtlVariableResolver();
					etlVR.run(eolElement);
				}
				else if (getOperationType().equals("AST2trETL")) {
					EtlVariableResolver etlVR = new EtlVariableResolver();
					etlVR.run(eolElement);
					EtlTypeResolver etlTR = new EtlTypeResolver();
					etlTR.run(eolElement);
				}
				
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
				Resource resource = resourceSet.createResource(URI.createFileURI(new File(path.toPortableString() + getExtensionPrefix() + ".model").getAbsolutePath()));
				resource.getContents().add(eolElement);
				boolean success2 = true;
				try {
					resource.save(null);
				} catch (IOException e) {
					success2 = false;
					MessageDialog dialog = new MessageDialog(shell, "Haetae goes woof", null,
						    "Unable to save file", MessageDialog.ERROR, new String[] { "OK" }, 0);
						dialog.open();
				}
				
				if (success2) {
					MessageDialog dialog = new MessageDialog(shell, "Haetae says:", null,
						    "Transformation completed, " + path.toFile().getName() + getExtensionPrefix() +".model saved to directory", MessageDialog.INFORMATION, new String[] { "OK" }, 0);
						dialog.open();
				}
			}
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}
}
