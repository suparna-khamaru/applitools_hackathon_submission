package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	ModernTestsV1.class, 
	ModernTestsV2.class, 
	TraditionalTestsV1.class, 
	TraditionalTestsV2.class })

public class AllTestSuite {
	/**
	 * Run this class as Junit Test to run all test at once
	 * 
	 * This class is otherwise optional for any use
	 */
}
