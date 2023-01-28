package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartiPhoneAss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iPhone 14 pro max");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			driver.switchTo().window(wh);
		}
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411001");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		
		
		
	}

}
