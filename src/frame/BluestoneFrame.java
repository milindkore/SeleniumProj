package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.bluestone.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Not now']")).click();
	    Thread.sleep(2000);
	    //switch to active frame
	    
	    
	    
	    WebElement frameElement = driver.findElement(By.id("fc_widget"));
	    driver.switchTo().frame(frameElement);
	    Thread.sleep(2000);
	    driver.findElement(By.id("chat-icon")).click(); //clicking on chat box
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
	    
	    
	    
	}

}
