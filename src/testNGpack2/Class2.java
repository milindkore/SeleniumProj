package testNGpack2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	  public void manualTesting() {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("Manual Testing");
			driver.quit();
	  }

}
