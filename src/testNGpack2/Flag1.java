package testNGpack2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test (invocationCount = 5)
  public void flag1() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("SQL");
		Reporter.log("This is for class 1", true);
  }
}
