package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele= new ElementFetch();
	public void verifyIfLoginPageIsLoaded()
	{
		
	Assert.assertTrue(ele.getWebElemnts("XPATH", LoginPageElements.loginText).size()>0, "Element not found");
	
	}
	public void enterCredentials()
	{
		
	ele.getWebElemnt("XPATH", LoginPageElements.emailAddress).sendKeys("sourav.pd97@gmail.com");
	ele.getWebElemnt("XPATH", LoginPageElements.passwordField).sendKeys("12345");
	
	
	}
}
