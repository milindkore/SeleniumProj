package testNG4;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
  @Test
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  }
}
