package qa.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

//@Listeners(qa.test.Listeners.class)
public class Testcase1 extends BaseTest {

    ElementFetch ele = new ElementFetch();
    HomePageEvents homePage = new HomePageEvents();
    LoginPageEvents loginPage = new LoginPageEvents();

    @Test
    public void LoginTestCase01() {
        homePage.signInButton();
        loginPage.verifyIfLoginPageIsLoaded();
        loginPage.enterCredentials();
    }
}
