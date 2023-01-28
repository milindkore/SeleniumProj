package takeScreenshotDynamic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
  @Test
  public void initialization() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1/login.do");
	  
  }
  
  @Test
  public void fail() {
	  
	 try {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./ScreenShot/DySc.jpg");
	 }
	 catch(Exception n)
	 {
		 
	 }
	  
  }
}
