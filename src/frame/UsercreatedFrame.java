package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsercreatedFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Milind/Desktop/WCSA4/Iframe.html");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("admin");
		driver.switchTo().parentFrame();
		WebElement username = driver.findElement(By.id("id1"));
		username.sendKeys("current");
		
		
		
	}

}
