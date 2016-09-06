package org.eclipse.epsilon.haetae.suboptimal.pattern.detection.impl;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.metamodel.BinaryOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.EOLModule;
import org.eclipse.epsilon.eol.metamodel.EolPackage;
import org.eclipse.epsilon.eol.metamodel.EqualsOperatorExpression;
import org.eclipse.epsilon.eol.metamodel.FOLMethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.MethodCallExpression;
import org.eclipse.epsilon.eol.metamodel.ModelElementType;
import org.eclipse.epsilon.eol.metamodel.NameExpression;
import org.eclipse.epsilon.eol.metamodel.PropertyCallExpression;
import org.eclipse.epsilon.eol.visitor.printer.impl.EolPrinter;
import org.eclipse.epsilon.epl.EplModule;
import org.eclipse.epsilon.epl.execute.PatternMatch;
import org.eclipse.epsilon.epl.execute.PatternMatchModel;
import org.eclipse.epsilon.haetae.suboptimal.pattern.detection.context.SuboptimalDetectionContext;

public class ProgramPerformanceAnalyser {

	protected InMemoryEmfModel model;
	protected SuboptimalDetectionContext context;
	EolPrinter printer = new EolPrinter();

	
	public ProgramPerformanceAnalyser()
	{
		context = new SuboptimalDetectionContext();
	}
	
	public SuboptimalDetectionContext getContext() {
		return context;
	}
	
	public void visit(EOLModule program)
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI(new File("test.xmi").getAbsolutePath()));
		resource.getContents().add(program);

		model = new InMemoryEmfModel("EOL",	program.eResource(), EolPackage.eINSTANCE);
		try {
			matchSelectPatterOne(program);
			matchSelectPatterTwo(program);
			matchSelectPatterThree(program);
			matchSelectPatterFour(program);
			matchSelectPatterFive(program);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void matchSelectPatterOne(EOLModule program) throws Exception
	{
		EplModule module = new EplModule();
		
		URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
		
		String parent = url.getPath() + "src/patterns/patternOne.epl";
		
		module.parse(new File(parent));
		
		module.getContext().getModelRepository().addModel(model);
		
		PatternMatchModel patternMatchModel = (PatternMatchModel) module.execute();
		for(PatternMatch pm : patternMatchModel.getMatches())
		{
			String frn = pm.getPattern().getRoles().get(0).getNames().get(0);
			FOLMethodCallExpression fol = (FOLMethodCallExpression) pm.getRoleBinding(frn);
			NameExpression rhs = (NameExpression) ((EqualsOperatorExpression)fol.getConditions().get(0)).getRhs();
			PropertyCallExpression lhs = (PropertyCallExpression) pm.getRoleBinding("lhs");
			String propertyName = lhs.getProperty().getName();
			EClass lhsType = (EClass) ((ModelElementType)lhs.getTarget().getResolvedType()).getModelElementType();
			
			EReference eReference = (EReference) lhsType.getEStructuralFeature(propertyName);
			
			String opposite = eReference.getEOpposite().getName();
			
			if (fol.getMethod().getName().equals("select")) {
				context.getLogBook().addWarning(fol, "Expression should be read as: " + rhs.getName() + "." + opposite);
			}
			else if (fol.getMethod().getName().equals("selectOne")) {
				context.getLogBook().addWarning(fol, "Expression should be read as: " + rhs.getName() + "." + opposite + ".first");
			}	
		}
		System.out.println(patternMatchModel.getAllOfKind("PatternOne").size());
	}
	
	public void matchSelectPatterTwo(EOLModule program) throws Exception
	{
		EplModule module = new EplModule();
		
		URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
		
		String parent = url.getPath() + "src/patterns/patternTwo.epl";
		
		module.parse(new File(parent));
		
		module.getContext().getModelRepository().addModel(model);
		
		PatternMatchModel patternMatchModel = (PatternMatchModel) module.execute();		
		
		for(PatternMatch pm : patternMatchModel.getMatches())
		{
			FOLMethodCallExpression fol = (FOLMethodCallExpression) pm.getRoleBinding("folcall");
			FOLMethodCallExpression targetfol = (FOLMethodCallExpression) pm.getRoleBinding("targetFOLCall");
			
			context.getLogBook().addWarning(fol, "Sub-optimal expression, consider rewriting as: "+ printer.print(targetfol.getTarget()) + ".select("+ targetfol.getIterator().getName().getName() + "|" +  printer.print(targetfol.getConditions().get(0)) + "and" + printer.print(fol.getConditions().get(0)) + ")");
		}
		System.out.println(patternMatchModel.getAllOfKind("PatternTwo").size());
	}
	
	public void matchSelectPatterThree(EOLModule program) throws Exception
	{
		EplModule module = new EplModule();
		
		URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
		
		String parent = url.getPath() + "src/patterns/patternThree.epl";
		
		module.parse(new File(parent));
		
		module.getContext().getModelRepository().addModel(model);
		
		PatternMatchModel patternMatchModel = (PatternMatchModel) module.execute();
		
		for(PatternMatch pm : patternMatchModel.getMatches())
		{
			FOLMethodCallExpression fol = (FOLMethodCallExpression) pm.getRoleBinding("folcall");
			
			context.getLogBook().addWarning(fol, "Expression should be read as: "+ printer.print(fol.getTarget()) + ".selectOne("+ fol.getIterator().getName().getName() + "|" + printer.print(fol.getConditions().get(0)) + ")");
		}
		System.out.println(patternMatchModel.getAllOfKind("PatternThree").size());
	}
	
	public void matchSelectPatterFour(EOLModule program) throws Exception
	{
		EplModule module = new EplModule();
		
		URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
		
		String parent = url.getPath() + "src/patterns/patternFour.epl";
		
		module.parse(new File(parent));
		
		module.getContext().getModelRepository().addModel(model);
		
		PatternMatchModel patternMatchModel = (PatternMatchModel) module.execute();
		for(PatternMatch pm : patternMatchModel.getMatches())
		{
			FOLMethodCallExpression fol = (FOLMethodCallExpression) pm.getRoleBinding("folMethodCall");
			BinaryOperatorExpression binaryOperatorExpression = (BinaryOperatorExpression) pm.getRoleBinding("binaryOperatorExpression");
			
			context.getLogBook().addWarning(binaryOperatorExpression, "Expression should be read as: "+ printer.print(fol.getTarget()) + ".exists("+ fol.getIterator().getName().getName() + "|" + printer.print(fol.getConditions().get(0)) + ")");
		}
		System.out.println(patternMatchModel.getAllOfKind("PatternFour").size());
	}
	
	public void matchSelectPatterFive(EOLModule program) throws Exception
	{
		EplModule module = new EplModule();
		
		URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
		
		String parent = url.getPath() + "src/patterns/patternFive.epl";
		
		module.parse(new File(parent));
		
		module.getContext().getModelRepository().addModel(model);
		
		PatternMatchModel patternMatchModel = (PatternMatchModel) module.execute();
		for(PatternMatch pm : patternMatchModel.getMatches())
		{
			FOLMethodCallExpression fol = (FOLMethodCallExpression) pm.getRoleBinding("folcall");
			MethodCallExpression methodCallExpression = (MethodCallExpression) pm.getRoleBinding("methodCall");
			
			context.getLogBook().addWarning(methodCallExpression, "Expression should be read as: "+ printer.print(fol.getTarget()) + ".selectOne("+ fol.getIterator().getName().getName() + "|" + printer.print(fol.getConditions().get(0)) + ")");
		}
		System.out.println(patternMatchModel.getAllOfKind("PatternFive").size());
	}
	
}
