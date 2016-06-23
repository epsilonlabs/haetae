package org.eclipse.epsilon.eol.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.eol.metamodel.EOLLibraryModule;

public class LogBook {

	private static LogBook instance = null;
	
	protected HashMap<EOLLibraryModule, HashSet<EOLWarning>> warnings;
	protected HashMap<EOLLibraryModule, HashSet<EOLError>> errors;
	
	protected LogBook()
	{
		warnings = new HashMap<EOLLibraryModule, HashSet<EOLWarning>>();
		errors = new HashMap<EOLLibraryModule, HashSet<EOLError>>();
	}
	
	public static LogBook getInstance()
	{
		if (instance == null) {
			instance = new LogBook();
		}
		return instance;
	}
	
	public static LogBook getInstance(boolean initilise)
	{
		if (initilise) {
			instance = new LogBook();
			return instance;
		}
		else {
			return getInstance();
		}
	}
	
	public void removerError(EOLElement eolElement)
	{
		for(EOLLibraryModule module: errors.keySet())
		{
			HashSet<EOLError> temp = (HashSet<EOLError>) errors.get(module).clone();
			for(EOLError error: temp)
			{
				if (error.getEolElement().equals(eolElement)) {
					temp.remove(error);
					errors.put(module, temp);
				}
			}
		}
	}
	
	public HashSet<EOLWarning> getAllWarnings()
	{
		HashSet<EOLWarning> result = new HashSet<EOLWarning>();
		for(HashSet<EOLWarning> value: warnings.values())
		{
			result.addAll(value);
		}
		return result;
	}
	
	public HashSet<EOLError> getAllErrors()
	{
		HashSet<EOLError> result = new HashSet<EOLError>();
		for(HashSet<EOLError> value: errors.values())
		{
			result.addAll(value);
		}
		return result;
	}

	public HashSet<EOLWarning> getWarnings(EOLLibraryModule eolLibraryModule) {
		if (warnings.containsKey(eolLibraryModule)) {
			return warnings.get(eolLibraryModule);
		}
		else {
			HashSet<EOLWarning> newWarnings = new HashSet<EOLWarning>();
			warnings.put(eolLibraryModule, newWarnings);
			return newWarnings;
		}
	}
	
	public HashSet<EOLError> getErrors(EOLLibraryModule eolLibraryModule) {
		if (errors.containsKey(eolLibraryModule)) {
			return errors.get(eolLibraryModule);
		}
		else {
			HashSet<EOLError> newErrors = new HashSet<EOLError>();
			errors.put(eolLibraryModule, newErrors);
			return newErrors;
		}
	}
	
	public void addWarning(EOLElement eolElement, String message)
	{
		getWarnings(getEolLibraryModule(eolElement)).add(new EOLWarning(eolElement, message));
	}
	
	public void addError(EOLElement eolElement, String message)
	{
		getErrors(getEolLibraryModule(eolElement)).add(new EOLError(eolElement, message));
	}
	
	public HashSet<EOLProblem> getAllProblems()
	{
		HashSet<EOLProblem> problems = new HashSet<EOLProblem>();
		problems.addAll(getAllWarnings());
		problems.addAll(getAllErrors());
		return problems;
	}
	
	public ArrayList<EOLProblem> getProblems(EOLLibraryModule eolLibraryModule)
	{
		ArrayList<EOLProblem> result = new ArrayList<EOLProblem>();
		result.addAll(getWarnings(eolLibraryModule));
		result.addAll(getErrors(eolLibraryModule));
		return result;
	}
	
	protected EOLLibraryModule getEolLibraryModule(EOLElement eolElement)
	{
		EOLElement trace = eolElement;
		while(trace != null && !(trace instanceof EOLLibraryModule))
		{
			trace = trace.getContainer();
		}
		if (trace != null) {
			return (EOLLibraryModule) trace;
		}
		return null;
	}
	
}
