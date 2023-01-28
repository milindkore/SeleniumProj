package testNG4;

import java.time.Duration;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestValidLogin2 extends BaseTest {
	static WebDriver driver;
  @Test
  @Parameters()
  public void method1(String browserValue, String url, String Username, String Password) {
	  if(browserValue.equals("chrome"));
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  //driver.get();
		  
		  
		  driver.findElement(By.name("username")).sendKeys("usn");
		  driver.findElement(By.name("pwd")).sendKeys();
		  driver.findElement(By.id("loginButton")).click();
	  }
	  
	  if(browserValue.equals("firefox"));
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("url");
		  
		  //driver.findElement(By.name("username")).sendKeys(usn);
		  //driver.findElement(By.name("pwd")).sendKeys(pass);
		  driver.findElement(By.id("loginButton")).click();
	  }
	  
	  
  }
}
