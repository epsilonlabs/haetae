package org.eclipse.epsilon.etl.visitor.resolution.variable.context;

import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.etl.metamodel.ETLModule;

public class _deprecated_EtlVariableResolutionContext extends VariableResolutionContext{

	protected ETLModule mainEtlProgram = null; //main program, which is the EOL program in question

	public ETLModule getMainEtlProgram() {
		return mainEtlProgram;
	}
	
	public void setMainEtlProgram(ETLModule mainEtlProgram) {
		this.mainEtlProgram = mainEtlProgram;
	}
}
