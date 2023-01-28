package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://laptop-egfv7cc0/login.jsp");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

}
