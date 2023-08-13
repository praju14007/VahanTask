package POM.Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard {
	
	@FindBy(how = How.XPATH, using = "//*[text()='Dashboard']")
	private WebElement Dashboard_Tab;

	public WebElement Dashboard_Tab() {
		return Dashboard_Tab;
	}


	


}
