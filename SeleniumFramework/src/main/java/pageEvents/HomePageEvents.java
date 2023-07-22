package pageEvents;
//import org.testng.annotations.Test;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	ElementFetch ele = new ElementFetch();
//	@Test()
	public void signInButton() 
	{
		ele.getWebElemnt("XPATH", HomePageElements.signInButtonText).click();
	}
}
