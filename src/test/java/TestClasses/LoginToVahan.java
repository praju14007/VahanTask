package TestClasses;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Classes.LoginElement;
import UtitlityClass.BaseClass;
import UtitlityClass.crossBrowserTestingBaseClass;

public class LoginToVahan extends BaseClass {

	@Test(priority = 1)
	public void verifyLoginWithValidCredential() throws InterruptedException {
		LoginElement loginElement = new LoginElement(driver);
		loginElement.dashboard_link();
		loginElement.enterCredentials("keertha@gmail.com", "Keertha@123");
		loginElement.clickLoginButton();
		Thread.sleep(2000);
		Assert.assertEquals(loginElement.getTitle(), "DASHBOARD");

	}

	@Test(priority = 2)
	public void verifyLoginWithInvalidCredential() {
		LoginElement loginElement = new LoginElement(driver);
		loginElement.dashboard_link();
		loginElement.enterCredentials("keertha@gmail.com", "Keertha@1");
		loginElement.clickLoginButton();
		Assert.assertEquals(loginElement.getErrorMessage(), "Wrong Credentials");

		// Validate color of error message
        String color = driver.findElement(By.xpath("//*[text()='Wrong Credentials']")).getCssValue("color");
        String expectedColor = "rgba(220, 53, 69, 1)"; // Expected color value in RGB format
        Assert.assertEquals(color, expectedColor, "Error message color is incorrect.");
        System.out.println(expectedColor);
	}
}
