package org.eclipse.epsilon.haetae.validator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.common.module.IModuleValidator;
import org.eclipse.epsilon.common.module.ModuleMarker;
import org.eclipse.epsilon.common.module.ModuleMarker.Severity;
import org.eclipse.epsilon.common.parse.Region;
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.problem.EOLError;
import org.eclipse.epsilon.eol.problem.EOLWarning;
import org.eclipse.epsilon.eol.problem.LogBook;
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
import org.eclipse.epsilon.haetae.plugin.Activator;
import org.eclipse.epsilon.haetae.preference.EpsilonHaetaePreferencePage;

public class Haetae_EOL implements IModuleValidator {

	public Haetae_EOL() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ModuleMarker> validate(IModule module) {
		
		ArrayList<ModuleMarker> result = new ArrayList<ModuleMarker>();
		if (Activator.getDefault().getPreferenceStore().getBoolean(EpsilonHaetaePreferencePage.ENABLE_HAETAE)) {
			LogBook.getInstance().clear();
			if (module instanceof EolModule) {
				Ast2EolContext context = new Ast2EolContext((EolLibraryModule) module);
				EOLElement eolElement = null;
				try {
					eolElement = (EOLElement) context.getEolElementCreatorFactory().createEOLElement(module.getAst(), null, context);
				} catch (Exception e) {
					
				}
				
				EOLVariableResolver eolVariableResolver = new EOLVariableResolver();
				eolVariableResolver.run(eolElement);
				
				EOLTypeResolver eolTypeResolver = new EOLTypeResolver();
				eolTypeResolver.run(eolElement);
			}
			
			else if (module instanceof EtlModule) {
				Ast2EtlContext context = new Ast2EtlContext((EolLibraryModule) module);
				EOLElement eolElement = null;
				try {
					eolElement = (EOLElement) context.getEtlElementCreatorFactory().createEOLElement(module.getAst(), null, context);
				} catch (Exception e) {
					
				}
				
				EtlVariableResolver etlVariableResolver = new EtlVariableResolver();
				etlVariableResolver.run(eolElement);
				
				EtlTypeResolver etlTypeResolver = new EtlTypeResolver();
				etlTypeResolver.run(eolElement);
			}
			
			else if (module instanceof EvlModule) {
				Ast2EvlContext context = new Ast2EvlContext((EolLibraryModule) module);
				EOLElement eolElement = null;
				try {
					eolElement = (EOLElement) context.getEvlElementCreatorFactory().createEOLElement(module.getAst(), null, context);
				} catch (Exception e) {
					
				}
				
				EvlVariableResolver evlVariableResolver = new EvlVariableResolver();
				evlVariableResolver.run(eolElement);
				
				EvlTypeResolver evlTypeResolver = new EvlTypeResolver();
				evlTypeResolver.run(eolElement);
			}
			
			for(EOLWarning warning: LogBook.getInstance().getAllWarnings())
			{
				result.add(new ModuleMarker(module.getAst().getFile(), new Region(warning.getEolElement().getRegion().getStart().getLine(), 
						warning.getEolElement().getRegion().getStart().getColumn(), 
						warning.getEolElement().getRegion().getEnd().getLine(), 
						warning.getEolElement().getRegion().getEnd().getColumn()), warning.getMessage(), Severity.Warning));
			}
			
			for(EOLError error: LogBook.getInstance().getAllErrors())
			{
				result.add(new ModuleMarker(module.getAst().getFile(), new Region(error.getEolElement().getRegion().getStart().getLine(), 
						error.getEolElement().getRegion().getStart().getColumn(), 
						error.getEolElement().getRegion().getEnd().getLine(), 
						error.getEolElement().getRegion().getEnd().getColumn()), error.getMessage(), Severity.Error));
			}
		}
			
		return result;
	}

	@Override
	public String getMarkerType() {
		return null;
	}

}
