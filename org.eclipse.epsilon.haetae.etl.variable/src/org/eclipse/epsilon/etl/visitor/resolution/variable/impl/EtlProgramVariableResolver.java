package org.eclipse.epsilon.etl.visitor.resolution.variable.impl;

import java.util.HashMap;

import org.eclipse.epsilon.eol.metamodel.Import;
import org.eclipse.epsilon.eol.metamodel.ModelDeclarationStatement;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.OperationDefinition;
import org.eclipse.epsilon.eol.problem.LogBook;
import org.eclipse.epsilon.eol.visitor.resolution.variable.context.VariableResolutionContext;
import org.eclipse.epsilon.etl.metamodel.ETLModule;
import org.eclipse.epsilon.etl.metamodel.NamedBlock;
import org.eclipse.epsilon.etl.metamodel.TransformationRule;
import org.eclipse.epsilon.etl.metamodel.visitor.ETLModuleVisitor;
import org.eclipse.epsilon.etl.metamodel.visitor.EtlVisitorController;

public class EtlProgramVariableResolver extends ETLModuleVisitor<VariableResolutionContext, Object>{
	
	public void resolveInheritance(ETLModule etlProgram, VariableResolutionContext context)
	{
		HashMap<String, TransformationRule> map = new HashMap<String, TransformationRule>();
		for(TransformationRule rule: etlProgram.getTransformationRules())
		{
			String name = rule.getName().getName();
			if (map.containsKey(name)) {
				LogBook.getInstance().addError(rule, "rule with name" + name + " already exists");
			}
			map.put(rule.getName().getName(), rule);
		}
		
		for(TransformationRule rule: etlProgram.getTransformationRules())
		{
			if (rule.getExtends().size()>0) {
				for(NameExpression name: rule.getExtends())
				{
					if (map.containsKey(name.getName())) {
						rule.getResolvedParentRules().add(map.get(name.getName()));
						name.setResolvedContent(map.get(name.getName()));
					}
					else {
						LogBook.getInstance().addError(name, "rule does not exist");
					}
				}
			}
		}
	}

	@Override
	public Object visit(ETLModule etlProgram,
			VariableResolutionContext context,
			EtlVisitorController<VariableResolutionContext, Object> controller) {
		
		if (context.getMainProgram() == null) { //if the program is the ETL in question (the main program)
			context.getStack().push(etlProgram, true); //insert a stack
			context.setMainProgram(etlProgram); //set the main program to be this one
			for(ModelDeclarationStatement mds: etlProgram.getModelDeclarations())
			{
				controller.visit(mds, context);
			}
			
			for(Import imported : etlProgram.getImports())
			{
				controller.visit(imported, context); //visit each import statement and resolve the imported programs
			}
			for(NamedBlock pre: etlProgram.getPreBlocks())
			{
				controller.visit(pre, context);
			}
			for(OperationDefinition op: etlProgram.getOperations())
			{
				controller.visit(op, context);
			}
			resolveInheritance(etlProgram, context);
			for(TransformationRule rule: etlProgram.getTransformationRules())
			{
				controller.visit(rule, context);
			}
			
			for(NamedBlock post: etlProgram.getPostBlocks())
			{
				controller.visit(post, context);
			}
			context.getStack().pop();

		}
		else {
			for(ModelDeclarationStatement mds: etlProgram.getModelDeclarations())
			{
				controller.visit(mds, context);
			}
			
			for(Import imported : etlProgram.getImports())
			{
				controller.visit(imported, context); //visit each import statement and resolve the imported programs
			}
			for(NamedBlock pre: etlProgram.getPreBlocks())
			{
				controller.visit(pre, context);
			}
			for(OperationDefinition op: etlProgram.getOperations())
			{
				controller.visit(op, context);
			}
			resolveInheritance(etlProgram, context);
			for(TransformationRule rule: etlProgram.getTransformationRules())
			{
				controller.visit(rule, context);
			}
			
			for(NamedBlock post: etlProgram.getPostBlocks())
			{
				controller.visit(post, context);
			}
		}
		
		return null;
	}

}
