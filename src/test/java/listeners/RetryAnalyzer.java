package listeners;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;
import listeners.RetryCountIfFailed;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	 
	 int counter = 1;
	 //int retryLimit = 3;
	 /*
	 * (non-Javadoc)
	 * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
	 * 
	 * This method decides how many times a test needs to be rerun.
	 * TestNg will call this method every time a test fails. So we 
	 * can put some code in here to decide when to rerun the test.
	 * 
	 * Note: This method will return true if a tests needs to be retried
	 * and false it not.
	 *
	 */
	 
	// @Override
	 public boolean retry(ITestResult result) {
	 
	 // check if the test method had RetryCountIfFailed annotation
	 RetryCountIfFailed annotation = result.getMethod().getConstructorOrMethod().getMethod()
	 .getAnnotation(RetryCountIfFailed.class);
	 // based on the value of annotation see if test needs to be rerun
	// result.getTestContext().getSkippedTests().removeResult(result.getMethod());
	 if((annotation != null) && (counter < annotation.value()))
	 {
	 counter++;
	 return true;
	 }
	 return false;
	 }
	}