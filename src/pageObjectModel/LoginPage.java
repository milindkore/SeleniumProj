package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// to avoid StaleReferenceElementException
	
	@FindBy(name = "username") private WebElement UsernameTB;
	@FindBy(name="pwd") private WebElement PasswordTB;
	@FindBy(id="loginButton") private WebElement LoginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement LoggedInCheckBox;
	@FindBy(xpath="//a[.='Actimind Inc.']") private WebElement ActiMindLink;
	@FindBy(id="LicenseLink") private WebElement LicenseLink;

	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getLoggedInCheckBox() {
		return LoggedInCheckBox;
	}

	public WebElement getActiMindLink() {
		return ActiMindLink;
	}

	public WebElement getLicenseLink() {
		return LicenseLink;
	}
	
	//operational methods
	
	public void actitimeValidLogin(String validUsername, String validPassword) throws InterruptedException
	{
	  UsernameTB.sendKeys(validUsername);
	  Thread.sleep(2000);
	  PasswordTB.sendKeys(validPassword);
	  LoginButton.click();
	}
	
	public void actitimeInvalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
	  UsernameTB.sendKeys(invalidUsername);
	  Thread.sleep(2000);
	  PasswordTB.sendKeys(invalidPassword);
	  LoginButton.click();
	  UsernameTB.clear();
	}
	
	
	
	

	
	
	
	
	

}
