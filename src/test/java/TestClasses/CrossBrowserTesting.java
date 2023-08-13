package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Classes.LoginElement;
import UtitlityClass.crossBrowserTestingBaseClass;

public class CrossBrowserTesting extends crossBrowserTestingBaseClass{
	
	
	@Test()
	public void verifyLoginWithValidCredential()  {
		LoginElement loginElement = new LoginElement(driver);
		loginElement.clickDashboardLink();
		loginElement.enterCredentials("keertha@gmail.com", "Keertha@123");
		loginElement.clickLoginButton();
		Assert.assertEquals(loginElement.getTitle(), "DASHBOARD");

	}

}
