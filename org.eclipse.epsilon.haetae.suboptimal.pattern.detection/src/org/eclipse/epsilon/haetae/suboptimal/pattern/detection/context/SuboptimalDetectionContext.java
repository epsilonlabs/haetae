package org.eclipse.epsilon.haetae.suboptimal.pattern.detection.context;

import org.eclipse.epsilon.eol.problem.LogBook;


public class SuboptimalDetectionContext {

	protected LogBook logBook = LogBook.getInstance();
	
	
	public LogBook getLogBook() {
		return logBook;
	}
	
}
