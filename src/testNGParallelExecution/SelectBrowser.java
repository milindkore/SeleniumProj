package testNGParallelExecution;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;

  //@Parameters({"browserValue"})	
  @Test
  public void openBrowser(String browser)
  //if(browser.equals(chrome))
  {
	System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
  }
}
