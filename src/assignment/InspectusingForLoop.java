package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.KeyRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectusingForLoop {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://127.0.0.1/login.do");
		 WebElement click = driver.findElement(By.xpath("//a[.='Actimind Inc.']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(click);
		 Thread.sleep(2000);
		 act.contextClick().perform();
		 Robot robo = new Robot();
		 
		 for (int i=0; i<6; i++)
		 {
			 robo.keyPress(KeyEvent.VK_DOWN);
			 robo.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(2000);
		 }
		 robo.keyPress(KeyEvent.VK_ENTER);
		 robo.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 
	}

}
