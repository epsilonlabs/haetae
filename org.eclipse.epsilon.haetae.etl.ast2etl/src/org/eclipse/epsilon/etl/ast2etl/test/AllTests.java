package org.eclipse.epsilon.etl.ast2etl.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EtlProgramCreatorTest.class,
		ImportCreatorTest.class, PostBlockCreatorTest.class,
		PreBlockCreatorTest.class, TransformationRuleCreatorTest.class })
public class AllTests {

}
