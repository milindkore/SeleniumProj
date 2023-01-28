package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 	 ChromeDriver driver = new ChromeDriver();
	 	 driver.manage().window().maximize();
	 	 driver.get("http://laptop-egfv7cc0/login.do");
	 	 WebElement textofusername = driver.findElement(By.name("username"));
	 	 textofusername.sendKeys("admin");
	 	 WebElement textofpassword = driver.findElement(By.name("pwd"));
	 	 textofpassword.sendKeys("manager");
	 	 WebElement textofloginbutton = driver.findElement(By.id("loginButton"));
	 	 textofloginbutton.click();
	 	 
	 	

	}

}
