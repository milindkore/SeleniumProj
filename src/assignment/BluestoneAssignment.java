package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssignment {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.bluestone.com/");
		 
		 WebElement src = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(src).perform();
		 driver.findElement(By.xpath("//a[@title='Band']")).click();
		
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
