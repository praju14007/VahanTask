package POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElement {
	
WebDriver driver;
	
	//Contructor
	public LoginElement(WebDriver d)
	{	
		driver = d;	
		PageFactory.initElements(driver, this);
	}
	

    @FindBy(xpath = "//*[text()='Go to Dashboard']")
    WebElement clickDashboardLink;
    
    @FindBy(name = "Email")
    WebElement Email_Input;
    
    @FindBy(name = "Password")
    WebElement Password_Input;
    
    @FindBy(xpath = "//*[text()='Login']")
    WebElement loginBtn;
    
    @FindBy(xpath = "//*[text()='Dashboard']")
    WebElement dashboard;
    
    @FindBy(xpath = "//*[text()='Wrong Credentials']")
    WebElement errorMsg;
    
    
    public void clickDashboardLink() {
    	clickDashboardLink.click();
    }
    
    public void enterCredentials(String email, String password) {
    	Email_Input.sendKeys(email);
    	Password_Input.sendKeys(password);
    }
    
    public void clickLoginButton() {
        loginBtn.click();
    }
    
    public String getTitle() {
        return dashboard.getText();
    }
    
    public String getErrorMessage() {
        return errorMsg.getText();
    }
}
	
	

