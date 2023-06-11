Read me file for a Framework:-
Create maven peoject.
Add folder drivers, reports, screenshots, logs, readme
On pom.xml add dependencey.
Note:- on page object model each page have there on page class.
On the src/main have to create a pakages.... pageEvents, pageObjects, utils, & base for now.
Here have to copy the drivers and extend reports from the exsiting project or internet
we are folowing simple mini UI freecrm.com. 
@BeforeTest
	// initialising the extend report for my test run
@BeforeMethod
   //@Parameters("browser")
   // initialising the driver.
@AfterMethod
    // capturing the reports   
Base Ready.

pacakage utils have to create constant class:- for url .
Suitelisteners Class:- retry, test case read and taking a screenshot done by suitelisteners & ITestListener:-  to read the test cases,IAnnotationTransformer:- to retry the test run.
RetrtAnalyzer class:- using if while condition to give command to retry count met.

Setting command for listners. 
copied the RetryAnalyzer for ITestAnnotation for retry. for that goto Suitlisners and open declaration of ITestAnnotation copy the method and start to give retryAnalyser annotation.

