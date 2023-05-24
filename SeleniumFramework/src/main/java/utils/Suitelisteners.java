package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import base.BaseTest;

// Suitelisteners:- retry, test case read and taking a screenshot done by suitelisteners.
// ITestListener:-  to read the test cases,IAnnotationTransformer:- to retry the test run.

public class Suitelisteners implements ITestListener, IAnnotationTransformer {

	public void onTestFailure(ITestResult result) {

		//if test case gonna failed than it's taking screenshot of failed testcases.
		String filename=System.getProperty("user.dir")+File.separator+"screenshots"+File.separator+result.getMethod().getMethodName();
		File f1= ((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		
		// define file name and file type of screenshots
		
		try {
			FileUtils.copyFile(f1, new File(filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//retryAnnotation command
		public void transform(
			      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
			   annotation.setRetryAnalyzer(RetryAnalyzer.class);
			  }


}
